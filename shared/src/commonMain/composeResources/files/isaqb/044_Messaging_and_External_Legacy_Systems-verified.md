## Question 1

What is a primary benefit of using messaging software for integrating legacy or external systems?

- [ ] It forces all systems to adopt single unified technology stacks.
- [ ] It completely eliminates all data transformation requirements.
- [x] It allows systems with different technical fits and levels of abstraction to communicate effectively.
- [ ] It automatically resolves all semantic interpretation differences.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Messaging middleware bridges independently developed systems with different technical fits and abstraction levels. It doesn't enforce technology uniformity, eliminate transformations, or auto-resolve semantic differences.

</p>
</details>

---

## Question 2

What is the purpose of "Enrichment" in the context of message processing for integration?

- [ ] To compress messages for faster transfer speeds overall.
- [ ] To encrypt messages for enhanced security protection always.
- [x] To add missing information (e.g., full customer details).
- [ ] To remove sensitive data before transmission occurs.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Enrichment adds missing information (e.g., expanding customer ID to full details) providing complete context for receivers. Compression, encryption, and data removal serve different purposes.

</p>
</details>

---

## Question 3

What is the role of "Conversion" in the message processing example?

- [ ] To convert messages into human-readable text formats only.
- [x] To transform messages into receiver-compatible formats.
- [ ] To convert from asynchronous to synchronous message formats.
- [ ] To convert messages into different human languages always.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Conversion transforms messages into receiver-compatible formats (e.g., converting to Sparks format for Vessel Planning System). Human readability, sync/async conversion, and language translation are separate concerns.

</p>
</details>

---

## Question 5

Into which six different groups do these message integration patterns primarily fall?

- [ ] Security, Performance, Scalability, Reliability, Usability, and Maintainability.
- [x] Message construction, Routing, Message transformation, System management, Messaging channels, and Endpoints.
- [ ] Data transfer, Remote procedure calls, Shared databases, File transfer, APIs, and Webhooks.
- [ ] Front-end, Back-end, Database, Network, Cloud, and On-premise.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Message integration patterns fall into six groups: construction, routing, transformation, system management, messaging channels, and endpoints. Quality attributes, integration methods, and deployment tiers represent different categorizations.

</p>
</details>

---

## Question 6

What is the purpose of a "Message Router" in the context of message integration?

- [ ] To convert and transform message formats.
- [x] To direct messages to the correct recipient based on certain criteria.
- [ ] To add missing information to messages.
- [ ] To store messages persistently in queues.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Message Routers direct messages to correct recipients based on criteria (content, headers). Format conversion, information enrichment, and persistent storage are separate pattern responsibilities.

</p>
</details>

---

## Question 7

What is the role of a "Message Filter" in message integration?

- [ ] To change and modify message content.
- [x] To select messages based on certain criteria, allowing only relevant messages to pass through.
- [ ] To combine multiple messages into single messages.
- [ ] To ensure message delivery in specific sequences.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Message Filters select messages based on criteria, allowing only relevant ones through. Content modification, message aggregation, and sequence guarantees are different pattern concerns.

</p>
</details>

---

## Question 8

What is the primary challenge when integrating systems that have different technical fits and levels of abstraction?

- [ ] They cannot be integrated under any circumstances.
- [x] They require a robust integration mechanism like message-oriented middleware to bridge these differences.
- [ ] They can only integrate using file transfer methods.
- [ ] They must be completely rewritten to match.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Different technical fits and abstraction levels require robust middleware (like message-oriented) to bridge differences. Integration is possible (not impossible), not limited to file transfer, and doesn't require rewrites.

</p>
</details>

---
