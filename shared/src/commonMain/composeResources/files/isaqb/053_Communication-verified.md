## Question 1

What are the three different styles of communication discussed in the text?

- [ ] Email, Phone Call, and Text Message.
- [x] Remote Procedure Call, Publish/Subscribe, and Broadcast.
- [ ] Synchronous, Asynchronous, and Batch.
- [ ] Client-Server, Peer-to-Peer, and Centralized.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The three communication styles are Remote Procedure Call, Publish/Subscribe, and
Broadcast. Email/phone/text are real-world examples, sync/async are timing characteristics, and
client-server/P2P are architectural patterns, not communication styles.

</p>
</details>

---

## Question 2

What is the primary characteristic of a "Remote Procedure Call" (RPC) communication style?

- [ ] It is an asynchronous, fire-and-forget mechanism.
- [x] It involves making a call to a different entity and expecting a direct reply back, similar to
  a local function call.
- [ ] It notifies all interested parties about an event without knowing who they are.
- [ ] It is primarily used for one-way data transfer.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** RPC involves synchronous calls with expected replies, mimicking local function calls
across process boundaries. Fire-and-forget is messaging, notifying unknown parties is broadcast, and
one-way transfer contradicts RPC's request-response nature.

</p>
</details>

---

## Question 3

What is the core concept of the "Publish/Subscribe" communication style?

- [ ] A direct, one-to-one communication between two known entities.
- [x] Entities express interest in specific events or topics and are notified only when those events
  occur.
- [ ] Sending a message to a single, predefined recipient.
- [ ] Continuously polling a server for updates.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Publish/Subscribe involves pre-defining interest in events/topics and receiving
notifications only when those occur. Direct one-to-one is RPC, single recipients contradict
pub/sub's one-to-many nature, and polling is an anti-pattern pub/sub eliminates.

</p>
</details>

---

## Question 4

What is the main characteristic of the "Broadcast" communication style?

- [ ] It requires prior registration of all recipients.
- [ ] It is a highly targeted, point-to-point communication.
- [x] It involves notifying anyone who is listening about your presence or an event, without knowing
  who the recipients are or if they will react.
- [ ] It is primarily used for secure, encrypted data exchange.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Broadcast notifies anyone listening without knowing recipients or requiring
registration (like ice cream truck bells). Prior registration is pub/sub, point-to-point is RPC, and
security isn't a broadcast characteristic—it's inherently open.

</p>
</details>

---

## Question 5

Which communication style is best suited for an unplanned, spontaneous interaction where the sender
doesn't know the recipients?

- [ ] Remote Procedure Call
- [ ] Publish/Subscribe
- [x] Broadcast
- [ ] Point-to-Point Messaging

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Broadcast handles unplanned spontaneous interactions with unknown recipients. RPC
requires known endpoints, pub/sub requires subscription setup, and point-to-point requires known
recipients—all incompatible with spontaneous unknown-recipient scenarios.

</p>
</details>

---

## Question 6

What is the primary difference between Publish/Subscribe and Broadcast communication styles?

- [ ] Publish/Subscribe is synchronous, while Broadcast is asynchronous.
- [x] Publish/Subscribe involves explicit registration of interest (subscribers), while Broadcast
  notifies anyone listening without prior knowledge of recipients.
- [ ] Broadcast is a more secure communication method.
- [ ] Publish/Subscribe is only used for internal system communication.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Pub/sub requires explicit interest registration (subscriptions), while broadcast
notifies without registration or recipient knowledge. Both can be async, security isn't broadcast's
strength, and pub/sub isn't limited to internal communication.

</p>
</details>

---
