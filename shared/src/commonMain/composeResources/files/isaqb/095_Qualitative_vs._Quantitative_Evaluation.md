## Question 1

What is the primary difference between quantitative and qualitative evaluation of software architectures?

- [ ] Quantitative evaluation focuses on gathering user feedback and satisfaction surveys, while qualitative evaluation concentrates on analyzing code metrics and static analysis results.
- [x] Quantitative evaluation involves determining numbers (metrics) from existing artifacts, while qualitative evaluation checks if requirements are sufficiently met.
- [ ] Quantitative evaluation requires manual inspection by expert reviewers, while qualitative evaluation relies on automated tooling and continuous integration pipelines.
- [ ] Quantitative evaluation addresses functional requirements through testing, while qualitative evaluation exclusively handles non-functional requirements through reviews.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 095_Qualitative_vs._Quantitative_Evaluation.txt
**Rationale:** The text states: "We can measure quantitatively by determining numbers. ... On the other hand, software can evaluate it qualitatively. For example, its architecture. Qualitative means that it is checked whether the functional and non-functional requirements have been sufficiently taken into account by the software architecture."

</p>
</details>

---

## Question 2 (more than 1 might be correct)

Which of the following are examples of metrics used in quantitative evaluation?

- [x] Number of methods per class.
- [x] Lines of code per class.
- [x] Number of dependencies between classes.
- [ ] User satisfaction scores derived from stakeholder interviews and feedback sessions.
- [ ] Maintainability assessment conducted by an expert reviewer using professional judgment.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 095_Qualitative_vs._Quantitative_Evaluation.txt
**Rationale:** The text states: "Examples of metrics are the number of methods or lines of code per class, or the number of dependencies between classes."

</p>
</details>

---

## Question 3

What is a key characteristic of metrics derived from qualitative characteristics (e.g., for maintainability)?

- [ ] They are always meaningful on their own and provide objective insights without requiring additional context or domain knowledge.
- [x] They are never meaningful on their own, require evaluator interpretation, and are not comparable between applications.
- [ ] They are always directly comparable across different projects regardless of technology stack, team size, or development methodology.
- [ ] They eliminate the need for any human interpretation by providing fully automated and objective quality assessments.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 095_Qualitative_vs._Quantitative_Evaluation.txt
**Rationale:** The text states: "Although it is possible to make qualitative characteristics quantifiable, but such metrics are never meaningful on their own, but are always subject to the interpretation of the evaluator. Therefore, they are not comparable between multiple applications."

</p>
</details>

---

## Question 4

What is a "measure" or "metric" in the context of quantitative evaluation?

- [ ] A subjective opinion about software quality based on expert judgment and professional experience in the domain.
- [x] A mapping that allocates a measured value to an object to characterize a certain attribute.
- [ ] A specialized tool for automated code generation that produces standardized output based on templates.
- [ ] A structured method for qualitative assessment that relies on stakeholder interviews and expert reviews.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 095_Qualitative_vs._Quantitative_Evaluation.txt
**Rationale:** The text states: "A measure or metric is a mapping. It allocates a measured value to an object to characterize a certain attribute."

</p>
</details>

---

## Question 5

What are two problems encountered when trying to make a metric meaningful, using lines of code as an example?

- [ ] It is too difficult to count lines of code accurately due to the complexity of modern integrated development environments.
- [x] Different and imprecise definitions (e.g., including blank lines) and influence by surrounding variables (e.g., programming styles).
- [ ] Metrics are always either too high or too low because static analysis tools cannot properly parse modern programming languages.
- [ ] Metrics cannot be collected automatically because they require manual code review and expert interpretation of results.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 095_Qualitative_vs._Quantitative_Evaluation.txt
**Rationale:** The text states: "First, we often find different definitions, and they are mostly imprecise. In case of lines of code, do we include blank lines? And it is possible to reduce lines by writing particularly long lines. Second, the measured values are influenced by surrounding variables. Therefore, we cannot simply transfer metrics if the environment is different."

</p>
</details>

---

## Question 6

What is the role of "prototyping" in the architectural design process?

- [ ] To replace the need for any formal design activities by allowing developers to directly implement features without planning.
- [x] To evaluate implementation strategies, experiment with solutions, and provide early feedback to reduce risk.
- [ ] To generate the final production code that will be deployed to end users after minimal additional testing.
- [ ] To only confirm existing design decisions that have already been made by the architecture team during planning.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 095_Qualitative_vs._Quantitative_Evaluation.txt
**Rationale:** The text states: "Prototypes enable us to evaluate different implementation strategies. Thus, we can experiment and try out possible solutions. They give early and fast feedback on our architectural decisions and thus reduce risk."

</p>
</details>

---

## Question 7

What is the difference between a "prototype" and a "technical cut"?

- [ ] Prototypes are always discarded after evaluation, while technical cuts are always reused in the final production system.
- [x] Prototypes already contain domain implementation, while technical cuts concentrate on pure technology.
- [ ] Prototypes are used only for validating functional requirements, while technical cuts validate non-functional requirements.
- [ ] There is no meaningful difference between the two concepts; the terms are completely interchangeable in practice.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 095_Qualitative_vs._Quantitative_Evaluation.txt
**Rationale:** The text states: "Prototypes differ from technical cuts because they already contain domain implementation. Technical cuts, on the other hand, concentrate on pure technology."

</p>
</details>

---

## Question 8

What is the general advice regarding reusing a prototype or parts of it for a real product?

- [ ] It is always recommended to reuse prototypes to save development time and reduce overall project costs and effort.
- [x] Prototypes should generally be disposed of (throwaway prototypes) because they often lack production quality.
- [ ] Only the core of a prototype (pilot) can be reused while peripheral components must always be completely rewritten.
- [ ] Prototypes should be systematically refactored into production code through a series of incremental improvement cycles.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 095_Qualitative_vs._Quantitative_Evaluation.txt
**Rationale:** The text states: "Note that you should not reuse a prototype or parts of it for a real product to implement. Prototypes often contain a lot of code that is only programmed down quickly and usually does not met the quality requirements of productive code. EG tests are often missing. So the prototype should be disposed. It is a so-called throwaway prototype."

</p>
</details>

---

## Question 9

What does a high value for "average component dependency" indicate, and why?

- [ ] It indicates a well-structured software architecture with clear separation of concerns and proper layering of components.
- [x] It indicates a bad software architecture because cycles worsen the value, increasing coupling and complexity.
- [ ] It indicates that the system is highly modular with well-defined boundaries between independent subsystems.
- [ ] It indicates that the system is easy to maintain because dependencies are explicitly documented and tracked.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 095_Qualitative_vs._Quantitative_Evaluation.txt
**Rationale:** The text states: "As cycles worsens the measured value, a high value for average component dependency is an indication for a bad software architecture. But you have to look at it in context."

</p>
</details>

---