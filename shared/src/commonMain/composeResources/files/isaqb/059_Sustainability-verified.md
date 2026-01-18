## Question 1

What is the fundamental problem that the cross-cutting concern of "sustainability" boils down to?

- [ ] Reducing the number of developers needed for a project significantly.
- [x] Energy efficiency, specifically not using more energy than necessary.
- [ ] Minimizing the amount of code written across all components.
- [ ] Maximizing the number of features in an application for users.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Sustainability boils down to energy efficiency—not using more than necessary. Developer count, code minimization, and feature maximization are separate concerns that may or may not contribute to energy efficiency.

</p>
</details>

---

## Question 2 (more than 1 might be correct)

Which of the following are recommended approaches for improving sustainability at the architectural level?

- [ ] Always choosing a monolithic architecture for simplicity and ease of deployment.
- [x] Fixing the scope of the application to avoid unnecessary features.
- [ ] Using the most complex algorithms available for maximum precision.
- [x] Picking an appropriate architecture based on usage patterns and trade-offs.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Sustainability requires fixed scope (avoiding unnecessary features) and appropriate architecture (balancing scaling vs overhead). Always-monolith ignores scaling needs, and complex algorithms waste energy—simplicity and appropriateness matter.

</p>
</details>

---

## Question 3

What is a key recommendation for sustainable coding practices?

- [ ] Always write custom algorithms to ensure maximum control over behavior.
- [x] Use efficient algorithms and standard libraries instead of custom code.
- [ ] Poll frequently for changes to ensure data freshness at all times.
- [ ] Avoid caching data to reduce memory usage and storage overhead.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Use efficient algorithms and standard libraries (optimized by experts). Custom algorithms, frequent polling, and avoiding caching all waste energy through inefficiency and unnecessary computation/network usage.

</p>
</details>

---

## Question 4

When dealing with network resources for sustainability, what is advised?

- [ ] Transferring all data, regardless of size, over the main network connection.
- [ ] Locating resources as far as possible from where they are displayed.
- [x] Having resources as close as possible to display points, using CDNs.
- [ ] Ignoring trade-offs between memory, drive space, and network volume.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Resources should be close to display points (CDNs reduce network transfer energy). Transferring everything, distant resources, and ignoring trade-offs all waste network energy through unnecessary data transfer.

</p>
</details>

---

## Question 5 (more than 1 might be correct)

Which of the following are strategies for improving sustainability in operations and deployment?

- [ ] Always running servers at maximum capacity for best performance.
- [x] Using burstable instances that can scale up and down based on load.
- [ ] Avoiding cloud deployment in favor of on-premise solutions always.
- [x] Employing adaptive load distribution to shut down unused servers.
- [x] Right-sizing instances to match actual needs of the application.
- [ ] Ignoring load monitoring once the system is deployed to production.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Sustainable operations use burstable instances, adaptive load distribution (shutdown unused), and right-sizing. Maximum capacity, cloud avoidance (cloud can be efficient), and ignoring monitoring all prevent optimization and waste energy.

</p>
</details>

---

## Question 6

What is the primary goal of "sustainability" in software architecture?

- [ ] To make software last forever without requiring any updates.
- [x] To ensure energy efficiency by not using more energy than needed.
- [ ] To reduce the number of features in an application for users.
- [ ] To increase the speed of software development for the team.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Sustainability's primary goal is energy efficiency. Software longevity, feature reduction, and development speed are separate concerns—sustainability focuses on minimizing energy waste during operation.

</p>
</details>

---

## Question 7

How can "fixing the scope" of an application contribute to sustainability?

- [ ] By allowing for more features to be added later in the development cycle.
- [x] By avoiding implementation of unnecessary features that would waste energy.
- [ ] By making the application more complex to handle additional use cases.
- [ ] By increasing the development time to ensure complete coverage.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Fixed scope avoids implementing unnecessary features that waste energy. Future features, complexity, and development time don't directly address energy waste from unused functionality running in production.

</p>
</details>

---

## Question 8

What is the trade-off between monolithic and microservices architectures in terms of sustainability?

- [ ] Monoliths are always more sustainable than microservices architectures.
- [x] Monoliths are hard to scale; microservices have communication overhead.
- [ ] Microservices are always more sustainable than monolithic architectures.
- [ ] There is no trade-off; both architectures are equally sustainable.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Monoliths struggle with fluctuation scaling (idle overhead); microservices have communication overhead. Neither is always better—sustainability depends on usage patterns requiring appropriate architecture choice.

</p>
</details>

---

## Question 9

What is the advice regarding "polling" for changes in a sustainable system?

- [ ] Always poll as frequently as possible to ensure data freshness.
- [x] Avoid polling and use push mechanisms instead to save energy.
- [ ] Polling is only acceptable for real-time applications in production.
- [ ] Polling has no impact on energy consumption in modern systems.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Avoid polling—use push mechanisms to eliminate wasteful repeated checks. Frequent polling, real-time justification, and no-impact beliefs all ignore polling's energy waste through unnecessary network/CPU cycles.

</p>
</details>

---

## Question 10

What is the importance of "load monitoring" for sustainability in operations?

- [ ] It is only necessary during the initial deployment phase of the project.
- [x] It is crucial for making adjustments and optimizing resource usage.
- [ ] It has no impact on energy consumption in cloud-based environments.
- [ ] It is only relevant for very small systems with limited traffic.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Load monitoring enables ongoing optimization based on actual usage patterns. Deployment-only, no-impact, and small-system-only beliefs all miss continuous monitoring's role in identifying and eliminating energy waste.

</p>
</details>

---
