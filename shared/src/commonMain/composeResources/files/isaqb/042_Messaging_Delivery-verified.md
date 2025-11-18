## Question 1

What is a key difference in resource utilization between a synchronous and an asynchronous order
processing system, as illustrated by the bakery and Starbucks models?

- [ ] Synchronous systems achieve superior efficiency through sequential processing.
- [x] Asynchronous systems are more efficient because they allow parallel processing and avoid idle
  periods, serving multiple customers concurrently.
- [ ] Synchronous systems demand more re-synchronization coordination efforts.
- [ ] Asynchronous systems only scale for minimal order volumes.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Asynchronous systems (Starbucks model) enable parallel processing eliminating idle
periods, increasing efficiency. Synchronous systems (bakery model) create idle periods during
sequential processing, reducing efficiency.

</p>
</details>

---

## Question 2

What is a crucial aspect that needs to be managed in an asynchronous messaging system, as
exemplified by the Starbucks model?

- [ ] Ensuring all orders process in exact reception sequence.
- [ ] Avoiding any form of customer re-synchronization.
- [x] Reconnecting to the customer and bringing the results and requests back together once
  everything is ready.
- [ ] Limiting producers and consumers to prevent chaos.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Asynchronous systems require re-synchronization—reconnecting results with original
requests/customers when ready. Strict ordering, avoiding re-sync, and limiting participants
contradict asynchronous parallel processing benefits.

</p>
</details>

---

## Question 3

What are two important rules or characteristics of messaging systems that help manage potential
chaos from asynchronous operations?

- [ ] Messages must process in send order, and consumers can read messages repeatedly.
- [x] Queues can be configured to be persistent (data is not lost if the system goes down), and
  every message can only be read once by a consumer.
- [ ] All messages require immediate consumer acknowledgment, and producers wait for confirmation.
- [ ] Messaging systems automatically handle all semantic message differences.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Key characteristics: persistence (no data loss on failure) and single-read per
message. Strict ordering isn't guaranteed, immediate acknowledgment isn't required, and semantic
differences need manual handling.

</p>
</details>

---

## Question 4

When multiple producers and consumers share the same queue, what is a key challenge that arises?

- [ ] Ensuring only one producer can write simultaneously.
- [ ] Guaranteeing simultaneous delivery to all consumers.
- [x] Dealing with the uncertainty of the order in which messages will be executed by consumers.
- [ ] Preventing multiple consumers from reading identical messages.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Multiple producers/consumers create execution order uncertainty—systems must handle
unpredictable message processing sequences. Single-writer restrictions, simultaneous delivery, and
duplicate prevention are managed by the messaging system.

</p>
</details>

---

## Question 6

What is the rule regarding message consumption by consumers in a messaging system?

- [ ] Every message can be read multiple times by any consumer.
- [x] Every message can only be read once by a consumer.
- [ ] Messages automatically delete after first consumer read.
- [ ] Only the first consumer to read can process messages.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Messages can only be read once per consumer, preventing duplicate processing.
Multiple reads, automatic deletion, and first-reader-only processing aren't standard messaging queue
behaviors.

</p>
</details>

---

## Question 7

What is the implication of multiple producers and consumers sharing the same queue regarding message
execution order?

- [ ] Messages always execute in exact transmission order.
- [x] The order in which messages will be executed by consumers is uncertain, and the system must be
  able to deal with this.
- [ ] Each consumer processes messages in independent arbitrary order.
- [ ] The message bus guarantees strict execution sequencing.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Shared queues with multiple participants create uncertain execution order—systems
must tolerate this unpredictability. Guaranteed ordering, independent consumer ordering, and
bus-enforced sequencing aren't provided.

</p>
</details>

---
