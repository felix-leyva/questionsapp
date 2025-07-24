#!/bin/bash

# Build WasmJS distribution and deploy automatically.

set -e  # Exit on any error

# Configuration using your SSH host and user
SERVER_HOST="$SSH_SERVER_HOST"
SERVER_USER="$SSH_SERVER_USERNAME"
# Script assumes, you have setup a paswordless ssh access to the server
SSH_KEY="$HOME/.ssh/id_ed25519"

# Specify where in the server the container will be located
SERVER_PATH="/srv/docker/questionsapp"

# Colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

log() {
    echo -e "${BLUE}[$(date +'%Y-%m-%d %H:%M:%S')] $1${NC}"
}

success() {
    echo -e "${GREEN}✓ $1${NC}"
}

error() {
    echo -e "${RED}✗ $1${NC}"
    exit 1
}

log "Building WasmJS distribution..."
./gradlew :composeApp:wasmJsBrowserDistribution --no-daemon

if [ $? -ne 0 ]; then
    error "Build failed. Please check your Gradle configuration."
fi

# Distribution output location
DIST_DIR="composeApp/build/dist/wasmJs/productionExecutable"

# Create deployment directory
DEPLOY_DIR="docker/wasmjs-app"
mkdir -p "$DEPLOY_DIR"

# Copy distribution files
log "Copying distribution files to $DEPLOY_DIR..."
cp -r "$DIST_DIR"/* "$DEPLOY_DIR/"

success "Build completed successfully!"

# Transfer files to server
log "Transferring files to server..."
rsync -avz --delete docker/ "$SERVER_USER@$SERVER_HOST:$SERVER_PATH/"

if [ $? -ne 0 ]; then
    error "Failed to transfer files to server"
fi

success "Files transferred to server"

# Deploy on server
log "Deploying application on server..."
ssh -i "$SSH_KEY" "$SERVER_USER@$SERVER_HOST" "cd $SERVER_PATH && docker compose down && docker compose up -d --build"

if [ $? -ne 0 ]; then
    error "Deployment failed"
fi

success "Application deployed successfully!"

echo -e "${GREEN}"
echo "=================================="
echo "   Deployment completed!"
echo "   Your app should be running at:"
echo "   http://$SERVER_HOST"
echo "=================================="
echo -e "${NC}"