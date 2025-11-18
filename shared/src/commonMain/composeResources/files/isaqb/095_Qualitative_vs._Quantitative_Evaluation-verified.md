## Question 1

What is the primary difference between quantitative and qualitative evaluation of software
architectures?

- [ ] Quantitative evaluation focuses on user feedback, while qualitative focuses on code metrics.
- [x] Quantitative evaluation involves determining numbers (metrics) from existing artifacts, while
  qualitative evaluation checks if functional and non-functional requirements are sufficiently met.
- [ ] Quantitative evaluation is always manual, while qualitative is automated.
- [ ] Quantitative evaluation is for functional requirements, while qualitative is for
  non-functional requirements.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Quantitative evaluation determines numbers/metrics from artifacts; qualitative checks
requirement fulfillment sufficiency. User feedback vs. code metrics, manual vs. automated, and
functional vs. non-functional all mischaracterize the numeric vs. judgment-based distinction.

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

**Rationale:** Quantitative metrics include method counts, code lines, and dependency counts (
objective measurements). User satisfaction scores and expert assessments are qualitative
evaluations, not quantitative metrics.

</p>
</details>

---

## Question 3

What is a key characteristic of metrics derived from qualitative characteristics (e.g., for
maintainability)?

- [ ] They are always meaningful on their own.
- [x] They are never meaningful on their own, are subject to evaluator interpretation, and are not
  comparable between multiple applications.
- [ ] They are always directly comparable across different projects.
- [ ] They eliminate the need for any human interpretation.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Qualitative-derived metrics require evaluator interpretation and aren't comparable
between applications (context-dependent). Standalone meaningfulness, cross-project comparability,
and interpretation elimination all miss qualitative metrics' interpretive nature.

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

**Rationale:** Metrics are mappings allocating measured values to objects characterizing attributes.
Subjective opinions, code generation tools, and qualitative methods all contradict metrics'
objective measurement mapping definition.

</p>
</details>

---

## Question 5

What are two problems encountered when trying to make a metric meaningful, using lines of code as an
example?

- [ ] It is too difficult to count lines of code.
- [x] Different and imprecise definitions (e.g., including blank lines) and influence by surrounding
  variables (e.g., programming styles).
- [ ] Metrics are always too high or too low.
- [ ] Metrics cannot be collected automatically.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Metric problems include definition differences/imprecision (blank lines?) and
surrounding variable influence (programming styles). Counting difficulty, value extremes, and
automation impossibility all miss definitional and contextual interpretation challenges.

</p>
</details>

---

## Question 6

What is the role of "prototyping" in the architectural design process?

- [ ] To replace the need for any design.
- [x] To evaluate different implementation strategies, experiment with solutions, and provide early,
  fast feedback to reduce risk.
- [ ] To generate the final production code.
- [ ] To only confirm existing design decisions.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Prototyping evaluates implementation strategies, experiments with solutions, and
provides early fast feedback reducing risk. Design replacement, production code generation, and
confirmation-only all miss prototyping's exploratory risk-reduction purpose.

</p>
</details>

---

## Question 7

What is the difference between a "prototype" and a "technical cut"?

- [ ] Prototypes are always discarded, while technical cuts are always reused.
- [x] Prototypes already contain domain implementation, while technical cuts concentrate on pure
  technology.
- [ ] Prototypes are only for functional requirements, while technical cuts are for non-functional.
- [ ] There is no difference; the terms are interchangeable.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Prototypes contain domain implementation; technical cuts concentrate on pure
technology (technology validation). Disposal vs. reuse, functional vs. non-functional, and
interchangeability all miss the domain vs. technology focus distinction.

</p>
</details>

---

## Question 8

What is the general advice regarding reusing a prototype or parts of it for a real product?

- [ ] It is always recommended to reuse prototypes to save time.
- [x] Prototypes should generally be disposed of (throwaway prototypes) because they often contain
  code that does not meet production quality requirements.
- [ ] Only the core of a prototype (pilot) can be reused.
- [ ] Prototypes should be refactored into production code.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Prototypes should be disposed (throwaway) because they contain quickly-programmed
code not meeting production quality (missing tests). Reuse recommendations, pilot extraction, and
refactoring all risk introducing low-quality code into production.

</p>
</details>

---

## Question 9

What does a high value for "average component dependency" indicate, and why?

- [ ] It indicates a well-structured software architecture.
- [x] It indicates a bad software architecture because cycles worsen the measured value, leading to
  increased coupling and complexity.
- [ ] It indicates that the system is highly modular.
- [ ] It indicates that the system is easy to maintain.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** High average component dependency indicates bad architecture (cycles worsen the
value, increasing coupling/complexity). Well-structured, modular, and maintainable all contradict
high dependency's negative coupling/complexity implications.

</p>
</details>

---
