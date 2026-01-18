## Question 1

What is a major challenge of the messaging programming model, as described in the text?

- [ ] It proves too simplistic lacking necessary enterprise features.
- [ ] It exclusively supports synchronous communication creating bottlenecks.
- [x] Complex event-driven distributed logic complicates debugging.
- [ ] It completely eliminates all data synchronization requirements.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Messaging's major challenge is complexity—event-driven distributed logic complicates debugging across process boundaries. It's not too simple, supports asynchronicity, and still requires synchronization handling.

</p>
</details>

---

## Question 2

What does the text identify as a challenge related to message sequence in messaging systems?

- [ ] Messages are never delivered in any deterministic order ever.
- [ ] Messages always deliver in send order, causing performance issues.
- [x] Messages deliver but order isn't guaranteed, requiring reordering.
- [ ] Messages are frequently lost if sequence isn't strictly maintained.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Messaging guarantees delivery but not order—applications may need to reorder messages. Messages aren't completely unordered, strictly ordered, or lost due to sequencing—they're just unordered upon delivery.

</p>
</details>

---

## Question 3

How does the asynchronous nature of messaging impact user expectations, and what must be done to address it?

- [ ] Users naturally expect immediate synchronous responses always.
- [ ] Users require delay training but no explicit communication.
- [x] Users adapt to async; apps confirm receipt with later updates.
- [ ] Asynchronous messaging has zero impact on user expectations.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Users must adapt to asynchronous models—applications should confirm receipt and promise later updates. Messaging doesn't provide immediate responses, training alone isn't sufficient, and impact is significant.

</p>
</details>

---

## Question 4

What is "initialization data" in the context of messaging challenges, and how can its impact on performance be mitigated?

- [ ] It refers to core business data exchange always slowing systems.
- [x] Setup data can be offloaded (e.g., file transfer) to avoid traffic.
- [ ] It is single-use data immediately discarded after consumption.
- [ ] It is data that must always transmit synchronously over buses.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Initialization data sets up applications and can be offloaded (e.g., file transfer) to avoid impacting message traffic. It's not core business data, isn't single-use, and doesn't require synchronous bus transmission.

</p>
</details>

---

## Question 5

What challenges arise when dealing with specific vendors or platforms in messaging?

- [ ] All vendors provide identical functionality adhering to standards.
- [x] Vendors differ in limits, non-standard features, requiring brokering.
- [ ] Vendor-specific features universally simplify integration efforts.
- [ ] Messaging is fully standardized eliminating all challenges today.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Vendors differ in limitations, non-standard features, and standards requiring brokering. Vendors aren't identical, features complicate more than simplify, and messaging lacks complete standardization.

</p>
</details>

---

## Question 6

What is a key challenge related to debugging in a messaging system?

- [ ] Debugging becomes impossible due to asynchronous operation.
- [x] Cross-process debugging is challenging due to distributed logic.
- [ ] Debugging is simplified through complete component isolation.
- [ ] Debugging requires examining only a single consolidated log.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Debugging across process boundaries is challenging due to distributed event-driven logic. It's not impossible, isolation doesn't simplify it, and single logs don't capture distributed behavior.

</p>
</details>

---

## Question 7

What is the "at least once" delivery guarantee in messaging?

- [ ] Messages are guaranteed to deliver exactly once without duplicates.
- [x] Messages deliver at least once; receivers must handle duplicates.
- [ ] Messages deliver only if receivers are currently online always.
- [ ] Messages deliver only if senders receive acknowledgments first.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** "At least once" delivery permits duplicates—receivers must handle them. It's not "exactly once," doesn't require receiver availability, and doesn't depend on sender acknowledgments.

</p>
</details>

---

## Question 8

What is the "exactly once" delivery guarantee, and why is it difficult to achieve?

- [ ] It's easily achieved by all contemporary messaging systems.
- [x] It requires complex mechanisms like two-phase commit.
- [ ] It means messages deliver once but don't necessarily process.
- [ ] It's a theoretical concept without practical application now.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** "Exactly once" guarantees single delivery and processing but requires complex mechanisms (two-phase commit). It's not easy, not just about delivery (also processing), and has practical applications.

</p>
</details>

---

## Question 9

What is the challenge of "semantic differences" in messaging?

- [ ] It refers to different programming languages used by applications.
- [x] Different apps interpret the same syntactically correct message differently.
- [ ] It refers to physical message broker locations globally.
- [ ] It refers to message processing speed variations across systems.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Semantic differences mean applications interpret identical (syntactically correct) messages differently. It's not about programming languages, physical location, or processing speed—it's about meaning interpretation.

</p>
</details>

---
