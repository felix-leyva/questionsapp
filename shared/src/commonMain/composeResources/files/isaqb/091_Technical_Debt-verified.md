## Question 1

What is "Technical Debt"?

- [ ] The cost of fixing bugs in the future.
- [x] The implied cost of future rework when not choosing the optimal solution for current and
  future needs.
- [ ] The amount of money owed to software developers.
- [ ] The time spent on writing documentation.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Technical debt is implied future rework cost from non-optimal solution choices.
Bug-fixing costs, developer salaries, and documentation time are project costs, not technical debt
from suboptimal architectural decisions.

</p>
</details>

---

## Question 2

When does technical debt become a problem?

- [ ] Always, regardless of how it's managed.
- [x] Only if you don't care for it and it grows unchecked.
- [ ] Only when the system is very small.
- [ ] Only when new features are added.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Technical debt becomes problematic only when uncared-for and unchecked (inherent part
of development). Always-problematic, size-based, and feature-based beliefs all miss management's
role in keeping debt manageable.

</p>
</details>

---

## Question 3

What is the goal when managing technical debt, as shown in the diagram?

- [ ] To eliminate all technical debt immediately.
- [x] To always stay within the corridor of low technical debt, where it can be eliminated with
  little effort.
- [ ] To allow technical debt to grow indefinitely.
- [ ] To ignore technical debt until it causes a system crash.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Goal is staying within low technical debt corridor (eliminable with little effort).
Immediate elimination, indefinite growth, and crash-waiting all miss sustainable low-debt
maintenance strategy.

</p>
</details>

---

## Question 4

What happens if no "architectural renewal" is carried out regularly?

- [ ] The system remains perfectly maintainable.
- [x] The system will erode, and the higher the technical debt, the faster the erosion will
  progress, leading to unmaintainable software.
- [ ] The cost of extensions will decrease over time.
- [ ] New features can be added with linear expense.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Without architectural renewal, systems erode (higher debt accelerates erosion) toward
unmaintainability with exponentially increasing change costs. Perfect maintainability, decreasing
costs, and linear expenses all contradict erosion dynamics.

</p>
</details>

---

## Question 5

Which of the following are reasons for software erosion?

- [x] Architecture-violating dependencies arising unnoticed.
- [x] Coupling and complexity growing faster than expected.
- [x] Time pressure leading to shortcuts that are never replaced.
- [x] Internal software quality not being important to project management.
- [x] Reusing existing applications for new purposes without optimization.
- [x] No time to discuss and renew software architecture.
- [x] Inability to manually identify all architecture violations.
- [x] Unequal understanding and knowledge within the team, exacerbated by outsourcing.
- [ ] Regular architectural renewal.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Erosion reasons include unnoticed violations, faster-than-expected
coupling/complexity growth, time pressure shortcuts, management quality disregard, unoptimized
reuse, no architectural discussion time, manual detection limits, knowledge gaps/outsourcing.
Regular renewal prevents erosion, not causes it.

</p>
</details>

---

## Question 5a

Which of the following management and process-related factors contribute to software erosion?

- [x] Time pressure leading to shortcuts that are never replaced.
- [x] Internal software quality not being important to project management.
- [x] No time to discuss and renew software architecture.
- [x] Unequal understanding and knowledge within the team, exacerbated by outsourcing.
- [ ] Regular code reviews and architectural discussions.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Management/process erosion factors include time pressure shortcuts, quality
disregard, no architectural discussion time, knowledge gaps/outsourcing. Regular reviews and
discussions prevent erosion through proactive management.

</p>
</details>

---

## Question 5b

Which technical and architectural factors contribute to software erosion?

- [x] Architecture-violating dependencies arising unnoticed.
- [x] Coupling and complexity growing faster than expected.
- [x] Inability to manually identify all architecture violations.
- [x] Reusing existing applications for new purposes without optimization.
- [ ] Implementing proper separation of concerns.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Technical erosion factors include unnoticed violations, faster-than-expected
coupling/complexity growth, manual detection limits, unoptimized reuse. Proper separation of
concerns prevents erosion through good architectural practices.

</p>
</details>

---

## Question 5c

What are the main categories of factors that lead to software erosion?

- [x] Management and process issues (time pressure, lack of architectural discussions, team
  knowledge gaps).
- [x] Technical and architectural challenges (unnoticed violations, growing complexity, manual
  detection limitations).
- [x] Project reuse and adaptation problems (using existing applications for new purposes without
  proper optimization).
- [ ] Regular refactoring and architectural renewal activities.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Erosion factor categories are management/process issues, technical/architectural
challenges, and reuse/adaptation problems. Regular refactoring and renewal activities prevent
erosion through proactive maintenance, not cause it.

</p>
</details>

---
