## Question 1

What are the three different styles of communication discussed in the text?

- [ ] Email, Phone Call, and Text Message.
- [x] Remote Procedure Call, Publish/Subscribe, and Broadcast.
- [ ] Synchronous, Asynchronous, and Batch.
- [ ] Client-Server, Peer-to-Peer, and Centralized.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The three communication styles are Remote Procedure Call, Publish/Subscribe, and Broadcast. Email/phone/text are real-world examples, sync/async are timing characteristics, and client-server/P2P are architectural patterns, not communication styles.

</p>
</details>

---

## Question 2

What is the primary characteristic of a "Remote Procedure Call" (RPC) communication style?

- [ ] It is an asynchronous, fire-and-forget mechanism always.
- [x] It makes a call expecting a direct reply, like a local function call.
- [ ] It notifies all interested parties about an event without knowledge.
- [ ] It is primarily used for one-way data transfer operations.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** RPC involves synchronous calls with expected replies, mimicking local function calls across process boundaries. Fire-and-forget is messaging, notifying unknown parties is broadcast, and one-way transfer contradicts RPC's request-response nature.

</p>
</details>

---

## Question 3

What is the core concept of the "Publish/Subscribe" communication style?

- [ ] A direct, one-to-one communication between two known entities.
- [x] Entities register interest in topics and are notified on events.
- [ ] Sending a message to a single, predefined recipient directly.
- [ ] Continuously polling a server for updates periodically.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Publish/Subscribe involves pre-defining interest in events/topics and receiving notifications only when those occur. Direct one-to-one is RPC, single recipients contradict pub/sub's one-to-many nature, and polling is an anti-pattern pub/sub eliminates.

</p>
</details>

---

## Question 4

What is the main characteristic of the "Broadcast" communication style?

- [ ] It requires prior registration of all recipients first.
- [ ] It is a highly targeted, point-to-point communication.
- [x] It notifies anyone listening without knowing recipients.
- [ ] It is primarily used for secure, encrypted data exchange.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Broadcast notifies anyone listening without knowing recipients or requiring registration (like ice cream truck bells). Prior registration is pub/sub, point-to-point is RPC, and security isn't a broadcast characteristic—it's inherently open.

</p>
</details>

---

## Question 5

Which communication style is best suited for an unplanned, spontaneous interaction where the sender doesn't know the recipients?

- [ ] Remote Procedure Call
- [ ] Publish/Subscribe
- [x] Broadcast
- [ ] Point-to-Point Messaging

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Broadcast handles unplanned spontaneous interactions with unknown recipients. RPC requires known endpoints, pub/sub requires subscription setup, and point-to-point requires known recipients—all incompatible with spontaneous unknown-recipient scenarios.

</p>
</details>

---

## Question 6

What is the primary difference between Publish/Subscribe and Broadcast communication styles?

- [ ] Publish/Subscribe is synchronous, while Broadcast is asynchronous.
- [x] Pub/Sub requires registration; Broadcast notifies without knowing.
- [ ] Broadcast is a more secure communication method overall.
- [ ] Publish/Subscribe is only used for internal system communication.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Pub/sub requires explicit interest registration (subscriptions), while broadcast notifies without registration or recipient knowledge. Both can be async, security isn't broadcast's strength, and pub/sub isn't limited to internal communication.

</p>
</details>

---
