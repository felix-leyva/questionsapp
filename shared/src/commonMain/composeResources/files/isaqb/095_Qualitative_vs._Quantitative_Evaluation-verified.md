## Question 1

What is the primary difference between quantitative and qualitative evaluation of software architectures?

- [ ] Quantitative focuses on feedback, qualitative on metrics.
- [x] Quantitative determines metrics; qualitative checks needs.
- [ ] Quantitative is manual, qualitative is automated.
- [ ] Quantitative for functional, qualitative for non-functional.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Quantitative evaluation determines numbers/metrics from artifacts; qualitative checks requirement fulfillment sufficiency. User feedback vs. code metrics, manual vs. automated, and functional vs. non-functional all mischaracterize the numeric vs. judgment-based distinction.

</p>
</details>

---

## Question 2

Which of the following are examples of metrics used in quantitative evaluation?

- [x] Number of methods per class.
- [x] Lines of code per class.
- [x] Number of dependencies between classes.
- [ ] User satisfaction scores.
- [ ] Maintainability assessment by an expert.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Quantitative metrics include method counts, code lines, and dependency counts (objective measurements). User satisfaction scores and expert assessments are qualitative evaluations, not quantitative metrics.

</p>
</details>

---

## Question 3

What is a key characteristic of metrics derived from qualitative characteristics (e.g., for maintainability)?

- [ ] They are always meaningful on their own.
- [x] They require interpretation, not comparable.
- [ ] They are directly comparable across projects.
- [ ] They eliminate need for interpretation.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Qualitative-derived metrics require evaluator interpretation and aren't comparable between applications (context-dependent). Standalone meaningfulness, cross-project comparability, and interpretation elimination all miss qualitative metrics' interpretive nature.

</p>
</details>

---

## Question 4

What is a "measure" or "metric" in the context of quantitative evaluation?

- [ ] A subjective opinion about software quality.
- [x] A mapping that allocates a measured value to an object to characterize a certain attribute.
- [ ] A tool for automated code generation.
- [ ] A method for qualitative assessment.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Metrics are mappings allocating measured values to objects characterizing attributes. Subjective opinions, code generation tools, and qualitative methods all contradict metrics' objective measurement mapping definition.

</p>
</details>

---

## Question 5

What are two problems encountered when trying to make a metric meaningful, using lines of code as an example?

- [ ] It is too difficult to count lines of code.
- [x] Imprecise definitions and style influences.
- [ ] Metrics are always too high or too low.
- [ ] Metrics cannot be collected automatically.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Metric problems include definition differences/imprecision (blank lines?) and surrounding variable influence (programming styles). Counting difficulty, value extremes, and automation impossibility all miss definitional and contextual interpretation challenges.

</p>
</details>

---

## Question 6

What is the role of "prototyping" in the architectural design process?

- [ ] To replace the need for any design.
- [x] To evaluate strategies and reduce risk.
- [ ] To generate the final production code.
- [ ] To only confirm existing design decisions.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Prototyping evaluates implementation strategies, experiments with solutions, and provides early fast feedback reducing risk. Design replacement, production code generation, and confirmation-only all miss prototyping's exploratory risk-reduction purpose.

</p>
</details>

---

## Question 7

What is the difference between a "prototype" and a "technical cut"?

- [ ] Prototypes discarded, technical cuts reused.
- [x] Prototypes have domain; cuts are pure tech.
- [ ] Prototypes for functional, cuts for non-functional.
- [ ] No difference; terms are interchangeable.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Prototypes contain domain implementation; technical cuts concentrate on pure technology (technology validation). Disposal vs. reuse, functional vs. non-functional, and interchangeability all miss the domain vs. technology focus distinction.

</p>
</details>

---

## Question 8

What is the general advice regarding reusing a prototype or parts of it for a real product?

- [ ] Always recommended to reuse prototypes.
- [x] Prototypes should be disposed (throwaway).
- [ ] Only the core (pilot) can be reused.
- [ ] Prototypes should be refactored for production.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Prototypes should be disposed (throwaway) because they contain quickly-programmed code not meeting production quality (missing tests). Reuse recommendations, pilot extraction, and refactoring all risk introducing low-quality code into production.

</p>
</details>

---

## Question 9

What does a high value for "average component dependency" indicate, and why?

- [ ] It indicates a well-structured architecture.
- [x] It indicates bad architecture with cycles.
- [ ] It indicates the system is highly modular.
- [ ] It indicates the system is easy to maintain.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** High average component dependency indicates bad architecture (cycles worsen the value, increasing coupling/complexity). Well-structured, modular, and maintainable all contradict high dependency's negative coupling/complexity implications.

</p>
</details>

---
