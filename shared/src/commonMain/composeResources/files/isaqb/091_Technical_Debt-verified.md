## Question 1

What is "Technical Debt"?

- [ ] The cost of fixing bugs in the future after they are discovered in production environments.
- [x] The implied cost of future rework when not choosing the optimal solution.
- [ ] The amount of money owed to software developers for completed work and overtime.
- [ ] The time spent on writing documentation and maintaining project artifacts.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Technical debt is implied future rework cost from non-optimal solution choices. Bug-fixing costs, developer salaries, and documentation time are project costs, not technical debt from suboptimal architectural decisions.

</p>
</details>

---

## Question 2

When does technical debt become a problem?

- [ ] Always, regardless of how it's managed or what mitigation strategies are applied.
- [x] Only if you don't care for it and it grows unchecked.
- [ ] Only when the system is very small and lacks proper architectural foundations.
- [ ] Only when new features are added that require changes to existing components.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Technical debt becomes problematic only when uncared-for and unchecked (inherent part of development). Always-problematic, size-based, and feature-based beliefs all miss management's role in keeping debt manageable.

</p>
</details>

---

## Question 3

What is the goal when managing technical debt, as shown in the diagram?

- [ ] To eliminate all technical debt immediately through intensive refactoring sprints.
- [x] To stay within the corridor of low technical debt, eliminable with little effort.
- [ ] To allow technical debt to grow indefinitely as long as features are delivered.
- [ ] To ignore technical debt until it causes a system crash or major failure.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Goal is staying within low technical debt corridor (eliminable with little effort). Immediate elimination, indefinite growth, and crash-waiting all miss sustainable low-debt maintenance strategy.

</p>
</details>

---

## Question 4

What happens if no "architectural renewal" is carried out regularly?

- [ ] The system remains perfectly maintainable as long as coding standards are followed.
- [x] The system will erode, and higher technical debt accelerates erosion toward unmaintainability.
- [ ] The cost of extensions will decrease over time as developers become more familiar.
- [ ] New features can be added with linear expense proportional to feature complexity.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Without architectural renewal, systems erode (higher debt accelerates erosion) toward unmaintainability with exponentially increasing change costs. Perfect maintainability, decreasing costs, and linear expenses all contradict erosion dynamics.

</p>
</details>

---

## Question 5 (more than 1 might be correct)

Which of the following are reasons for software erosion?

- [x] Architecture-violating dependencies arising unnoticed.
- [x] Coupling and complexity growing faster than expected.
- [x] Time pressure leading to shortcuts that are never replaced.
- [x] Internal software quality not being important to project management.
- [x] Reusing existing applications for new purposes without optimization.
- [x] No time to discuss and renew software architecture.
- [x] Inability to manually identify all architecture violations.
- [x] Unequal understanding and knowledge within the team, exacerbated by outsourcing.
- [ ] Regular architectural renewal activities and proactive technical debt management.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Erosion reasons include unnoticed violations, faster-than-expected coupling/complexity growth, time pressure shortcuts, management quality disregard, unoptimized reuse, no architectural discussion time, manual detection limits, knowledge gaps/outsourcing. Regular renewal prevents erosion, not causes it.

</p>
</details>

---

## Question 5a (more than 1 might be correct)

Which of the following management and process-related factors contribute to software erosion?

- [x] Time pressure leading to shortcuts that are never replaced.
- [x] Internal software quality not being important to project management.
- [x] No time to discuss and renew software architecture.
- [x] Unequal understanding and knowledge within the team, exacerbated by outsourcing.
- [ ] Regular code reviews and architectural discussions with stakeholder involvement.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Management/process erosion factors include time pressure shortcuts, quality disregard, no architectural discussion time, knowledge gaps/outsourcing. Regular reviews and discussions prevent erosion through proactive management.

</p>
</details>

---

## Question 5b (more than 1 might be correct)

Which technical and architectural factors contribute to software erosion?

- [x] Architecture-violating dependencies arising unnoticed.
- [x] Coupling and complexity growing faster than expected.
- [x] Inability to manually identify all architecture violations.
- [x] Reusing existing applications for new purposes without optimization.
- [ ] Implementing proper separation of concerns and modular design principles.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Technical erosion factors include unnoticed violations, faster-than-expected coupling/complexity growth, manual detection limits, unoptimized reuse. Proper separation of concerns prevents erosion through good architectural practices.

</p>
</details>

---

## Question 5c (more than 1 might be correct)

What are the main categories of factors that lead to software erosion?

- [x] Management and process issues (time pressure, lack of discussions, knowledge gaps).
- [x] Technical and architectural challenges (unnoticed violations, growing complexity).
- [x] Project reuse and adaptation problems (using applications for new purposes without optimization).
- [ ] Regular refactoring and architectural renewal activities with dedicated time allocation.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Erosion factor categories are management/process issues, technical/architectural challenges, and reuse/adaptation problems. Regular refactoring and renewal activities prevent erosion through proactive maintenance, not cause it.

</p>
</details>

---
