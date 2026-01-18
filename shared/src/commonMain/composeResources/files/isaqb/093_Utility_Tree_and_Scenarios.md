## Question 1

What is the primary purpose of "Utility Trees" in the context of quality characteristics?

- [ ] To replace the need for any other documentation by providing a comprehensive single source of truth for all project artifacts.
- [x] To structure and summarize scenarios, and to guide the process of finding relevant scenarios.
- [ ] To automatically generate code from quality requirements using model-driven development approaches and code generators.
- [ ] To define the programming language and technology stack to be used throughout the entire software development lifecycle.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 093_Utility_Tree_and_Scenarios.txt
**Rationale:** The text states: "These scenarios can easily be structured with the help of utility trees which summarize scenarios. Quality trees also offer a good opportunity to derive the scenarios based on the specific quality characteristics. They guide the process of finding relevant scenarios and they help ensure that no scenarios are overlooked."

</p>
</details>

---

## Question 2

How are utility trees typically identified?

- [ ] Through automated analysis of the codebase using static analysis tools and dependency scanners.
- [x] In brainstorming workshops with stakeholders and domain experts.
- [ ] By reviewing existing documentation including requirements specifications and design documents.
- [ ] By interviewing individual developers about their understanding of system quality attributes.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 093_Utility_Tree_and_Scenarios.txt
**Rationale:** The text states: "Usually, the trees are identified in brainstorming workshops."

</p>
</details>

---

## Question 3

What is the structure of a utility tree, from left to right?

- [ ] Concrete scenarios first, then specific requirements, and finally general attributes.
- [x] General attributes/characteristics, then more specific requirements, then concrete scenarios.
- [ ] Specific requirements first, then general attributes, and finally concrete scenarios.
- [ ] Concrete scenarios first, then general attributes, and finally specific requirements.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 093_Utility_Tree_and_Scenarios.txt
**Rationale:** The text states: "We start with general attributes or characteristics, respectively on the left. ... We derive more specific requirements in the example latency and throughput for the characteristic performance. In the last step, we then determine the concrete scenarios for each requirement."

</p>
</details>

---

## Question 4

What is the advice for making a scenario measurable?

- [ ] Keep it as general as possible to allow flexibility in implementation and interpretation by different teams.
- [x] Be as precise as possible, including limit values (e.g., "The system must perform X within time epsilon").
- [ ] Focus only on qualitative descriptions that capture the intent without constraining implementation choices.
- [ ] Avoid any numerical values since they may become outdated as technology and requirements evolve over time.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 093_Utility_Tree_and_Scenarios.txt
**Rationale:** The text states: "Be as precise as possible in a scenario to make it measurable. An example for a bad scenario is the performance should be high. It is better to describe a limit value here i.e. The system must perform a functionality X under normal conditions within time epsilon."

</p>
</details>

---

## Question 5

What are the three types of scenarios distinguished in the text?

- [ ] Functional scenarios, Non-functional scenarios, and Performance scenarios.
- [x] Use case scenarios, Change scenarios, and Stress scenarios (borderline/boundary).
- [ ] Input scenarios, Process scenarios, and Output scenarios.
- [ ] Design scenarios, Implementation scenarios, and Testing scenarios.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 093_Utility_Tree_and_Scenarios.txt
**Rationale:** The text states: "We distinguish three types of scenarios. ... First, we have use case scenarios, also called application or usage scenarios. ... The second type is change scenarios. ... Main for safety critical system, we also consider the third type of scenarios, the stress scenarios, also called borderline or boundary scenarios."

</p>
</details>

---

## Question 6

What is the structure of a scenario?

- [ ] Problem statement, Solution description, Expected Outcome.
- [x] Stimulus, Origin, Surrounding (system state), Affected part, Response, and Response metric.
- [ ] Input specification, Processing steps, Output validation.
- [ ] Actor identification, Action description, Result verification.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 093_Utility_Tree_and_Scenarios.txt
**Rationale:** The text states: "Scenarios are structured as follows. We have a stimulus, meaning the cooperation of the crossing state holder with the system. We specify the origin of the course. ... The surrounding, meaning the state of the system, is as well part of the scenario. The scenario includes which part of the system is affected and also how it responds to the stimulus. Finally, we have to specify how the response can be measured."

</p>
</details>

---

## Question 7

Why is it important to provide a "response metric" in a scenario?

- [ ] To make the scenario longer and more comprehensive in its description of system behavior and expectations.
- [x] Because it's the only way to evaluate the system's behavior and make a fact-based, impartial judgment.
- [ ] To make the scenario more complex and demonstrate thorough analysis of system requirements and constraints.
- [ ] To ensure that the scenario is always positive and shows the system meeting or exceeding all defined requirements.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 093_Utility_Tree_and_Scenarios.txt
**Rationale:** The text states: "It is important to provide this response metric because it's the only way to evaluate the system's behavior in the scenario, e.g. through testing. A good scenario names the metric and threshold explicitly. This allows to make a fact-based impartial judgment and devoid subjective opinions."

</p>
</details>

---

## Question 8

What is the advice regarding average times versus quantile statements when specifying response times in scenarios?

- [ ] Average times are always sufficient for measuring and specifying response time requirements.
- [x] Average times are not interesting; quantile statements are preferred for precise measurement.
- [ ] Quantile statements are too complex to be useful in practical software development contexts.
- [ ] Response times should not be measured as they vary too much depending on system load.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 093_Utility_Tree_and_Scenarios.txt
**Rationale:** The text states: "Average times are not interesting, but quantile statements. A quantile defines a specific part of a data set."

</p>
</details>

---

## Question 9

What is the implication of an availability of "99%" in terms of downtime?

- [ ] It means the system is almost always available with no significant downtime worth considering in planning.
- [x] It means around 15 minutes downtime a day and more than 3.5 days per year, normally not acceptable.
- [ ] It means the system is available 99% of the time, which is sufficient for most enterprise applications.
- [ ] It means the system is highly available and meets the requirements of most critical business systems.

<details>
<summary>Rationale</summary>
<p>

**File Name:** 093_Utility_Tree_and_Scenarios.txt
**Rationale:** The text states: "If we calculate the availability, 99% means around 15 minutes downtime a day and more than 3.5 days per year. Normally, this is not within the acceptable range."

</p>
</details>

---