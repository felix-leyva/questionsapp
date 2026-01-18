## Question 1

What is a general challenge associated with distributed systems, regardless of the integration method used?

- [ ] Reduced complexity due to separation of concerns in design.
- [x] Increased complexity, extra overhead, and more error sources.
- [ ] Simplified debugging across system boundaries for developers.
- [ ] Elimination of all concurrency problems in the system.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Distributed systems increase complexity through remote call overhead, debugging challenges, and additional error sources. They don't reduce complexity, simplify debugging, or eliminate concurrency issues.

</p>
</details>

---

## Question 2 (more than 1 might be correct)

Which of the following are common challenges when dealing specifically with legacy systems?

- [x] They are often monolithic, making it hard to extract parts.
- [ ] They always provide comprehensive source code and docs.
- [x] Suboptimal error handling and potentially bad data quality.
- [ ] They are always optimized for modern user interfaces.
- [x] Difficulties with transaction monitoring across systems.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Legacy system challenges: monolithic architecture, suboptimal error handling, poor data quality, and transaction monitoring difficulties. They rarely have comprehensive documentation or modern UI optimization.

</p>
</details>

---

## Question 3

What is the first question an architect should ask when considering distribution in a system?

- [ ] Which messaging middleware should be selected first?
- [ ] How many servers will be required for this?
- [x] Can distribution be avoided altogether here?
- [ ] What is the fastest network protocol available?

<details>
<summary>Rationale</summary>
<p>

**Rationale:** First question: can distribution be avoided entirely, eliminating distribution problems? Middleware selection, server count, and protocol speed are secondary considerations after justifying distribution necessity.

</p>
</details>

---

## Question 4

When dealing with legacy software, what is a crucial piece of advice regarding changes?

- [ ] Refactor the entire legacy system to modern standards immediately.
- [ ] Make maximally invasive changes to improve performance quickly.
- [x] Identify valuable parts and make changes as minimally invasive as possible.
- [ ] Discard the legacy system without extracting valuable parts first.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** With legacy systems, identify valuable components and make minimally invasive changes, especially without source/docs. Wholesale refactoring, invasive changes, and complete discarding risk destroying value.

</p>
</details>

---

## Question 5

Under what circumstances should a legacy system be shut down after migrating valuable parts?

- [ ] Only if it is completely unusable by all users now.
- [ ] If it is too expensive to upgrade to latest technology.
- [x] If maintenance risks or costs outweigh the business value.
- [ ] If a new system is available, regardless of legacy value.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Shut down legacy systems when maintenance risks/costs exceed business value. Complete unusability, upgrade costs, and new system availability alone don't justify shutdown—business value is key.

</p>
</details>

---

## Question 6 (more than 1 might be correct)

What are some of the increased complexities and overheads associated with distributed systems?

- [x] Extra overhead induced by remote calls.
- [x] Increased complexity in general.
- [x] Challenges with debugging across system boundaries.
- [x] Increased number of error sources.
- [ ] Simplified error handling across services.
- [ ] Reduced need for communication between teams.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Distributed systems increase: remote call overhead, general complexity, debugging challenges, and error sources. They don't simplify error handling or reduce team communication needs.

</p>
</details>

---

## Question 7

What is a common characteristic of legacy systems that makes integration challenging?

- [ ] They are always well-documented with clean code available.
- [x] They are often monolithic, making it difficult to extract parts.
- [ ] They are designed with modern APIs for easy communication.
- [ ] They always maintain perfect data quality throughout.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Legacy systems are often monolithic, complicating component extraction for integration. They rarely have good documentation, modern APIs, or perfect data quality.

</p>
</details>

---

## Question 8

What is the primary advice for dealing with legacy systems when source code or documentation is missing?

- [ ] Rewrite the entire system from scratch immediately now.
- [x] Make minimally invasive changes, extracting valuable data.
- [ ] Assume the system is perfect and make no changes at all.
- [ ] Hire large teams to reverse engineer everything fully.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Without source/docs, make minimally invasive changes focusing on valuable components. Rewrites, assuming perfection, and extensive reverse engineering are risky without understanding the system.

</p>
</details>

---
