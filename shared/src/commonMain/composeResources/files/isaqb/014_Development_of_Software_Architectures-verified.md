## Question 1

What are the two general approaches for developing software architectures discussed in the text?

- [ ] Iterative and Incremental
- [ ] Centralized and Distributed
- [x] Top-down and Bottom-up
- [ ] Domain-Driven and Data-Driven

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The text discusses Top-down and Bottom-up as general architectural development
approaches. Iterative/Incremental describes process, Centralized/Distributed describes deployment,
and Domain/Data-Driven describes design philosophy—different categorizations.

</p>
</details>

---

## Question 2

Which of the following is described as an advantage of the top-down approach?

- [ ] It ensures seamless technical integration through early prototyping.
- [x] It leads to a better overall problem understanding because the problem is analyzed step by
  step.
- [ ] It provides immediate validation that the design will work in practice.
- [ ] It maximizes reuse of existing components from the beginning.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Top-down provides better overall problem understanding through step-by-step analysis.
Early prototyping, immediate validation, and maximum reuse are actually bottom-up advantages or
hybrid approaches.

</p>
</details>

---

## Question 3

What is a significant disadvantage of the top-down approach?

- [ ] It prevents achieving high degrees of component reusability.
- [ ] The abstract design lacks traceability to concrete implementation.
- [x] Difficult technical integration at the end, as it's unknown if sub-problem solutions will fit
  together.
- [ ] It requires premature commitment to specific technologies.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Top-down's key disadvantage is difficult integration at the end because sub-problem
solutions may not fit together. It actually avoids premature technology commitment, though it may
reduce reusability and create traceability challenges.

</p>
</details>

---

## Question 4

What is a key advantage of the bottom-up approach?

- [ ] It ensures requirements always drive architectural decisions.
- [ ] It minimizes unnecessary abstraction layers in the solution.
- [ ] It reduces the risk of over-engineering through premature design.
- [x] It achieves a high degree of reusability by starting with existing partial solutions.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Bottom-up achieves high reusability by starting with existing partial solutions.
However, it may not keep requirements central, can introduce unnecessary abstractions from existing
components, and may include premature solutions.

</p>
</details>

---

## Question 5

How are the top-down and bottom-up approaches typically used in practice?

- [ ] They are mutually exclusive; selecting one precludes using the other.
- [ ] The bottom-up approach is standard for all project components.
- [x] They are usually combined; starting with a top-down approach but using a bottom-up solution
  for high-risk parts like interfaces.
- [ ] The top-down approach guides development while bottom-up validates testing.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Practice typically combines both approaches: top-down overall with bottom-up for
high-risk areas (like external interfaces). They're complementary, not mutually exclusive or
role-specific (development vs. testing).

</p>
</details>

---

## Question 6

What is a key characteristic of the top-down approach regarding its independence from specific
technologies?

- [ ] It requires early selection of specific frameworks for validation.
- [x] The analysis is independent of hardware and programming languages, especially at the
  beginning.
- [ ] It mandates platform-specific design from the initial phase.
- [ ] It only functions effectively with cloud-native infrastructure.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Top-down analysis is independent of hardware and programming languages, especially
initially. This technology independence is an advantage, not a requirement for specific frameworks,
platforms, or cloud infrastructure.

</p>
</details>

---

## Question 7

What is a potential pitfall of the top-down approach related to partial solutions?

- [ ] It mandates integration of all available partial solutions regardless of fit.
- [x] It is possible that partial solutions are ignored because they are already covered by other
  partial solutions.
- [ ] It requires creating new solutions even when proven ones exist.
- [ ] It guarantees perfect alignment of all partial solutions from inception.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Top-down may ignore partial solutions already covered by others during decomposition.
It doesn't mandate integration of all solutions, require creating new ones unnecessarily, or
guarantee perfect alignment.

</p>
</details>

---

## Question 8

What is an advantage of the bottom-up approach concerning user satisfaction?

- [ ] It guarantees complete user requirement fulfillment from the start.
- [x] Incremental testing and step-by-step integration of partial solutions can achieve a high level
  of user satisfaction.
- [ ] It empowers users to directly specify the system architecture.
- [ ] It removes the dependency on iterative user feedback cycles.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Bottom-up enables incremental testing and integration, achieving high user
satisfaction through visible progress. It doesn't guarantee complete fulfillment, give users
architectural control, or eliminate feedback needs.

</p>
</details>

---

## Question 9

What is a disadvantage of the bottom-up approach related to the focus on technical conditions?

- [ ] It ensures requirements remain the primary driver of all decisions.
- [x] The focus on technical conditions means that the user's requirements are no longer at the
  center of attention.
- [ ] It maintains perfect balance between technical feasibility and user needs.
- [ ] It systematically prioritizes user experience above technical constraints.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Bottom-up's focus on technical conditions can shift attention away from user
requirements. It doesn't ensure requirement-driven decisions, maintain perfect balance, or
systematically prioritize user experience.

</p>
</details>

---
