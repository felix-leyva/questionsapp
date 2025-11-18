## Question 1

What is the primary purpose of "Utility Trees" in the context of quality characteristics?

- [ ] To replace the need for any other documentation.
- [x] To structure and summarize scenarios, and to guide the process of finding relevant scenarios.
- [ ] To automatically generate code from quality requirements.
- [ ] To define the programming language to be used.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Utility trees structure/summarize scenarios and guide scenario discovery, ensuring
comprehensive coverage. Documentation replacement, code generation, and language definition are
separate concerns outside scenario organization.

</p>
</details>

---

## Question 2

How are utility trees typically identified?

- [ ] Through automated analysis of the codebase.
- [x] In brainstorming workshops.
- [ ] By reviewing existing documentation.
- [ ] By interviewing individual developers.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Utility trees are identified in brainstorming workshops (collaborative scenario
discovery). Automated analysis, documentation review, and individual interviews lack the
collaborative scenario generation workshops provide.

</p>
</details>

---

## Question 3

What is the structure of a utility tree, from left to right?

- [ ] Concrete scenarios, specific requirements, general attributes.
- [x] General attributes/characteristics, more specific requirements, concrete scenarios.
- [ ] Specific requirements, general attributes, concrete scenarios.
- [ ] Concrete scenarios, general attributes, specific requirements.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Utility tree structure: general attributes/characteristics → specific requirements →
concrete scenarios (top-down refinement). Other orderings reverse the refinement direction from
abstract to concrete.

</p>
</details>

---

## Question 4

What is the advice for making a scenario measurable?

- [ ] Keep it as general as possible.
- [x] Be as precise as possible, including limit values (e.g., "The system must perform
  functionality X under normal conditions within time epsilon").
- [ ] Focus only on qualitative descriptions.
- [ ] Avoid any numerical values.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Measurable scenarios require precision with limit values (specific thresholds).
General descriptions, qualitative-only focus, and numerical value avoidance all prevent objective
measurement and evaluation.

</p>
</details>

---

## Question 5

What are the three types of scenarios distinguished in the text?

- [ ] Functional, Non-functional, and Performance.
- [x] Use case scenarios (application/usage), Change scenarios, and Stress scenarios (
  borderline/boundary).
- [ ] Input, Process, and Output.
- [ ] Design, Implementation, and Testing.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Three scenario types are Use case (application/usage), Change, and Stress (
borderline/boundary). Functional/non-functional/performance, input/process/output, and
design/implementation/testing are different categorization schemes.

</p>
</details>

---

## Question 6

What is the structure of a scenario?

- [ ] Problem, Solution, Outcome.
- [x] Stimulus, Origin, Surrounding (state of the system), Affected part, Response, and Response
  metric.
- [ ] Input, Processing, Output.
- [ ] Actor, Action, Result.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Scenario structure: Stimulus, Origin, Surrounding (system state), Affected part,
Response, Response metric. Problem/solution/outcome, input/processing/output, and
actor/action/result are simpler structures missing scenario detail.

</p>
</details>

---

## Question 7

Why is it important to provide a "response metric" in a scenario?

- [ ] To make the scenario longer.
- [x] Because it's the only way to evaluate the system's behavior in the scenario (e.g., through
  testing) and make a fact-based, impartial judgment.
- [ ] To make the scenario more complex.
- [ ] To ensure that the scenario is always positive.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Response metrics enable fact-based impartial evaluation through testing (objective
judgment vs. subjective opinions). Length, complexity, and positivity all miss metrics' objective
evaluation purpose.

</p>
</details>

---

## Question 8

What is the advice regarding average times versus quantile statements when specifying response times
in scenarios?

- [ ] Average times are always sufficient.
- [x] Average times are not interesting; quantile statements are preferred for precise measurement.
- [ ] Quantile statements are too complex to be useful.
- [ ] Response times should not be measured.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Quantile statements (specific data set portions) are preferred over averages for
precise measurement. Average sufficiency, quantile complexity, and measurement avoidance all miss
statistical precision requirements.

</p>
</details>

---

## Question 9

What is the implication of an availability of "99%" in terms of downtime?

- [ ] It means the system is almost always available with no significant downtime.
- [x] It means around 15 minutes downtime a day and more than 3.5 days per year, which is normally
  not within the acceptable range.
- [ ] It means the system is available 99% of the time, with no specific downtime implications.
- [ ] It means the system is highly available.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** 99% availability equals ~15 min/day, >3.5 days/year downtime (normally unacceptable).
Almost-always-available, no-specific-implications, and highly-available all miss 99%'s significant
downtime calculation revealing inadequacy.

</p>
</details>

---
