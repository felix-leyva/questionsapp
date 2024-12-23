plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}
gradlePlugin {
    plugins {
        register("libs-catalog-access") {
            id = "libs-catalog-access"
            implementationClass = "CatalogHelperPlugin"
        }
        register("catalog-accessor") {
            id = "catalog-accessor"
            implementationClass = "CatalogAccessorPlugin"
        }
    }
}
dependencies {
    implementation("com.squareup:kotlinpoet:1.18.1")
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}
