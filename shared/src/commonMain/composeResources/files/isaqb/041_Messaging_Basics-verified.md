## Question 1

What is the key concept of application integration using "Messaging"?

- [ ] Direct synchronous communication between cooperating applications.
- [x] Applications connect to a message bus and address partners abstractly, leading to loose coupling.
- [ ] Sharing common file systems for data exchange mechanisms.
- [ ] Relying exclusively on remote procedure calls for interactions.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Messaging uses abstract addressing via message buses for loose coupling. Direct synchronous communication, file systems, and RPC represent alternative integration patterns, not messaging characteristics.

</p>
</details>

---

## Question 2

What is a significant advantage of Messaging over Remote Procedure Invocation (RPI) concerning reliability?

- [ ] Messaging mandates both communication partners remain online simultaneously.
- [x] Messaging offers persistent queues or topics, ensuring data delivery even if a system goes down and comes back up.
- [ ] Messaging is inherently less reliable due to asynchronous nature.
- [ ] Messaging completely eliminates all error handling requirements.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Messaging provides persistent queues/topics enabling reliable delivery despite system failures. It doesn't require simultaneous availability, sacrifice reliability, or eliminate error handling—it enhances reliability.

</p>
</details>

---

## Question 3

What is the main disadvantage of using Messaging for application integration?

- [ ] It proves too simplistic lacking necessary enterprise features.
- [ ] It exclusively supports synchronous communication patterns.
- [x] Its inherent complexity, requiring handling of the technology and semantic differences.
- [ ] It creates tight coupling between integrated applications.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Messaging's primary disadvantage is complexity—technology and semantic differences require careful handling. It's not too simple, supports asynchronicity, and promotes loose (not tight) coupling.

</p>
</details>

---

## Question 4

What does the concept of "send and forget" or "store and forward" imply in messaging?

- [ ] The sender must await immediate acknowledgment from receivers.
- [x] The sender sends a message and does not need to worry about when or if it will be read, as the system handles delivery.
- [ ] The message undergoes immediate deletion after transmission.
- [ ] The sender bears responsibility for ensuring receiver availability.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** "Send and forget" means senders don't worry about delivery timing—the messaging system handles it (like email). Immediate acknowledgment, deletion, and sender-managed availability contradict this fire-and-forget model.

</p>
</details>

---

## Question 5 (more than 1 might be correct)

Which of the following are advantages of Messaging, as described in the text?

- [x] No location dependencies, as concrete recipient addresses are not known.
- [x] No temporal dependencies, allowing asynchronous communication.
- [ ] It mandates all data use fixed non-descriptive formats for consistency.
- [x] It removes data from dependencies by allowing self-describing data formats.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Messaging advantages: no location dependencies (abstract addressing), no temporal dependencies (asynchronous), and reduced data dependencies (self-describing formats). Fixed formats would increase dependencies, not reduce them.

</p>
</details>

---

## Question 6

How does messaging eliminate location dependencies?

- [ ] By requiring precise IP addresses for all communications.
- [x] By using abstract addressing so concrete recipient addresses are not known.
- [ ] By centralizing all data in a single storage location.
- [ ] By mandating all applications colocate on identical servers.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Messaging uses abstract addressing eliminating location dependencies—concrete addresses aren't required. IP addresses, centralized storage, and colocation all create location dependencies.

</p>
</details>

---

## Question 7

What does "no temporal dependencies" mean in messaging?

- [ ] All messages must transmit at specifically scheduled times.
- [x] Applications can communicate asynchronously without both being online simultaneously.
- [ ] Messages undergo immediate deletion after transmission completion.
- [ ] Applications must process messages in strict chronological sequence.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** No temporal dependencies means asynchronous communication without simultaneous availability requirements. Scheduled transmission, immediate deletion, and strict ordering all create temporal dependencies.

</p>
</details>

---

## Question 8

How does messaging remove data dependencies?

- [ ] By mandating all data adopt identical formatting standards.
- [x] By allowing self-describing data formats instead of Byzantine data structures.
- [ ] By completely eliminating the need for data exchange.
- [ ] By forcing all applications to share common databases.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Messaging reduces data dependencies through self-describing formats (vs. opaque Byzantine structures). Identical formats, no exchange, and shared databases increase dependencies, not reduce them.

</p>
</details>

---

## Question 9

What is the role of a "message bus" in messaging integration?

- [ ] It persistently stores all application business data.
- [x] It acts as a central point where applications connect and exchange messages.
- [ ] It executes complex business logic and transformations.
- [ ] It automatically translates between programming language dialects.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Message buses provide central connection points for message exchange. They don't store business data, execute business logic, or handle language translation—those are separate concerns.

</p>
</details>

---

## Question 10

What is the primary benefit of "persistent queues or topics" in messaging?

- [ ] They systematically reduce the total message volume sent.
- [x] They ensure data delivery even if a system goes down and comes back up, improving reliability.
- [ ] They mandate synchronous communication patterns exclusively.
- [ ] They completely eliminate all network infrastructure requirements.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Persistent queues/topics ensure reliable delivery despite system failures by preserving messages. They don't reduce message volume, mandate synchronicity, or eliminate network needs.

</p>
</details>

---
