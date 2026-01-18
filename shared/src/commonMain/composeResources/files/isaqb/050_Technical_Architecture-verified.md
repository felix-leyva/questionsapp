## Question 1

What is a common fallacy or mistake that the speaker warns against when dealing with cross-cutting concerns?

- [ ] Assuming all cross-cutting concerns are independent, handled by isolated teams.
- [x] Working on cross-cutting concerns in isolation, assuming they don't interleave.
- [ ] Prioritizing security over logging in all circumstances without exceptions.
- [ ] Believing cross-cutting concerns are unimportant for software architecture.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Common fallacy: treating cross-cutting concerns (persistence, communication, GUI) in isolation when they interleave. Assuming independence, priority rules, and irrelevance all miss cross-cutting concerns' interconnected nature.

</p>
</details>

---

## Question 2

What example is used to illustrate the danger of treating cross-cutting concerns in isolation?

- [ ] A system where GUI is unresponsive due to poor concurrency design.
- [x] A banking system with strong security but unencrypted data in log files.
- [ ] A communication system failing due to incorrect persistence configuration.
- [ ] A system difficult to maintain because of complex GUI implementation.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Example: banking system with strong security but unencrypted sensitive data in log files (security and logging handled separately). GUI responsiveness, communication failures, and maintenance complexity are different issues.

</p>
</details>

---

## Question 3

What is the recommended approach when dealing with cross-cutting concerns that interleave with each other?

- [ ] Ignore the interleaving and hope for the best outcome later.
- [ ] Deal with them later in development; it's always cheaper to defer.
- [x] Figure out the touching points first and deal with them early on.
- [ ] Assign them to different teams to promote specialization efforts.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Recommended approach: identify touching points first, address early (later is more expensive and problematic). Ignoring, delaying, and separate teams all exacerbate interleaving problems.

</p>
</details>

---

## Question 4

What is a potential benefit of finding good solutions for technical concepts like logging or error handling?

- [ ] They are always unique to each system, cannot be reused elsewhere.
- [x] They can often be reused across different systems effectively.
- [ ] They eliminate the need for any further architectural design work.
- [ ] They only apply to the specific programming language written in.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Good technical solutions (logging, error handling) can often be reused across systems. They're not always unique, don't eliminate design needs, and can transcend specific languages.

</p>
</details>

---

## Question 5

What is the primary characteristic of "cross-cutting concerns"?

- [ ] They are isolated functionalities affecting only single parts of systems.
- [x] They are concerns that affect multiple parts and often interleave.
- [ ] They are only relevant for very small projects with limited scope.
- [ ] They are always handled by single dedicated teams in isolation.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Cross-cutting concerns affect multiple system parts and interleave. They're not isolated, aren't small-project-only, and shouldn't be handled by isolated single teams.

</p>
</details>

---

## Question 6

What is the consequence of ignoring the interleaving nature of cross-cutting concerns?

- [ ] It leads to more modular and maintainable systems overall.
- [x] It can lead to significant problems and increased costs later.
- [ ] It simplifies the overall architectural design process for teams.
- [ ] It has no impact on the system's quality or performance.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Ignoring interleaving leads to significant problems and increased costs later. It doesn't improve modularity, simplify design, or have zero impact—it creates technical debt.

</p>
</details>

---
