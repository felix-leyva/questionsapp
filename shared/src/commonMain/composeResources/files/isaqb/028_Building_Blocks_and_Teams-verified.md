## Question 1

What is Conway's Law, as described in the text?

- [ ] A law mandating layered architecture for all software systems.
- [x] Organizational communication structure is visible in produced systems.
- [ ] A principle determining optimal development team sizes overall.
- [ ] A rule prescribing specific programming languages for tasks.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Conway's Law (1967) states organizational communication structure becomes visible in the products created. It doesn't mandate architectures, team sizes, or languages—it describes organizational impact on structure.

</p>
</details>

---

## Question 2

If development teams are assigned to build specific layers (e.g., UI team, business logic team), what does Conway's Law predict will happen to the building blocks?

- [ ] Building blocks achieve complete independence from each other fully.
- [x] Intra-team coupling increases; inter-team separation becomes stricter.
- [ ] All interlayer interfaces become perfectly clear and well-tested.
- [ ] The system naturally evolves toward microservices architecture.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Conway's Law predicts increased coupling within teams and stricter, coarser separation across teams. Complete independence, perfect interfaces, and automatic microservices evolution don't follow from team-based layer assignment.

</p>
</details>

---

## Question 3

What is the effect of assigning teams to features or specific parts of the domain, according to Conway's Law?

- [ ] Teams become isolated and collaboration becomes impossible overall.
- [x] Intra-team boundaries fade; inter-team boundaries strengthen significantly.
- [ ] This approach guarantees the system structure perfectly matches design.
- [ ] It reduces the overall number of building blocks in the system.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Feature/domain team assignment causes intra-team boundaries to fade and inter-team boundaries to strengthen, possibly splitting building blocks for independence. It doesn't isolate teams, guarantee design fidelity, or reduce building blocks.

</p>
</details>

---

## Question 4

What is the ultimate implication of Conway's Law for system design, regardless of the initial design?

- [ ] The initial theoretical design always dictates final system structure.
- [ ] System structure remains entirely independent of team organization.
- [x] Team structure will always be stronger than any theoretical design.
- [ ] Software architecture becomes irrelevant with well-defined teams.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Conway's Law implies team structure ultimately dominates theoretical design. Initial designs don't always prevail, structure isn't independent of teams, and architecture remains relevant—but team organization is the stronger force.

</p>
</details>

---

## Question 5

What is a characteristic of "highly standardized teams" (component teams)?

- [ ] They exhibit high agility delivering valuable features at speed.
- [x] They specialize on skills but depend on other teams for value.
- [ ] They must master comprehensive technical skills across domains.
- [ ] They focus primarily on delivering end-to-end features alone.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Component teams specialize and build efficient solutions but depend on other teams for end-user value. High agility, comprehensive skills, and end-to-end feature delivery characterize feature teams, not component teams.

</p>
</details>

---

## Question 6

In what year was Conway's Law formulated?

- [ ] 1985
- [ ] 2001
- [x] 1967
- [ ] 1992

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Conway's Law was formulated in 1967 by Melvin Conway. The years 1985, 2001, and 1992 correspond to other significant software engineering milestones but not Conway's Law.

</p>
</details>

---

## Question 7

What is the advice derived from Conway's Law for building a system with a certain structure?

- [ ] Team structure should be ignored; only technical design matters.
- [x] Organize teams to reflect the desired system structure directly.
- [ ] The system structure emerges automatically regardless of teams.
- [ ] Only very small teams can achieve specific system structures.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** To achieve a desired system structure, organize teams to reflect that structure (Conway's Law in reverse). Ignoring teams, automatic emergence, and size constraints all miss this strategic organizational principle.

</p>
</details>

---

## Question 8 (more than 1 might be correct)

What are the characteristics of "feature teams" (as opposed to component teams)?

- [ ] They specialize in specific technical skills for solutions.
- [x] They must master all technical skills for their domain.
- [x] They can deliver valuable features at high speed.
- [ ] They excel at building very clever and efficient code.
- [ ] They focus primarily on building reusable components.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Feature teams master all domain technical skills and deliver features rapidly, though not always with maximum efficiency. Technical specialization, clever solutions, and component focus characterize component teams, not feature teams.

</p>
</details>

---
