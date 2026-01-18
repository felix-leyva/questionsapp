## Question 1

What are the three essential components of a CRC Card?

- [ ] Class name, Attributes, and Method signatures.
- [x] Class name, Responsibilities, and Collaborators.
- [ ] Component type, Requirements, and Code patterns.
- [ ] Category, Relations, and Constraints.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** CRC cards consist of Class name, Responsibilities, and Collaborators. Attributes/Methods, Requirements/Code, and Categories/Relations address different aspects of design documentation, not the CRC card structure.

</p>
</details>

---

## Question 2

In the context of CRC cards, what are "Collaborators"?

- [ ] The software developers assigned to implement the class.
- [ ] The external stakeholders who review the system design.
- [x] Other classes needed to help fulfill responsibilities.
- [ ] Third-party APIs and external services integrated with.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Collaborators are other classes to which the current class delegates partial responsibilities. They're not developers, stakeholders, or external systems—they're service-providing classes within the design.

</p>
</details>

---

## Question 3

According to the method described, how should a team identify initial candidates for classes?

- [ ] By extracting verbs from requirements as action-oriented classes.
- [x] By looking for nouns representing business objects in requirements.
- [ ] By analyzing the technical infrastructure and deployment topology.
- [ ] By enumerating all possible system functions and capabilities.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Initial class candidates come from nouns in domain descriptions representing business objects. Verbs become responsibilities, infrastructure analysis is technical not domain-focused, and functions don't directly map to classes.

</p>
</details>

---

## Question 4

What is the recommended group activity to validate and refine a CRC card model?

- [ ] To begin implementing code for each card without any delay.
- [ ] To conduct a silent vote on the optimal card design pattern.
- [x] To distribute cards and role-play use cases, adding responsibilities.
- [ ] To transform the cards into formal UML diagrams first.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Validation involves distributing cards and role-playing through use cases, adding responsibilities as needed. Immediate coding, silent voting, and UML transformation skip the crucial validation and refinement step.

</p>
</details>

---

## Question 5

Which of the following is considered a bad practice or "smell" to avoid when modeling with CRC cards?

- [ ] A class that delegates to collaborators.
- [x] A class that has no responsibilities.
- [ ] A responsibility that aligns with the class's domain concept.
- [x] A class that has too many responsibilities.
- [ ] A class name derived from domain terminology.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Avoid classes with no responsibilities (useless) or too many (violates single responsibility). Collaborators, aligned responsibilities, and domain names are all good practices, not smells.

</p>
</details>

---

## Question 6

What is the primary purpose of the "Responsibilities" section on a CRC card?

- [ ] To enumerate the private methods and implementation details.
- [x] To characterize services provided, forming an offer to clients.
- [ ] To document the internal data structures and state management.
- [ ] To specify compile-time and runtime dependencies on frameworks.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Responsibilities characterize services offered to clients/customers. Private methods, data structures, and framework dependencies are implementation details not captured in responsibilities.

</p>
</details>

---

## Question 7

How are "Collaborators" on a CRC card related to the responsibilities of a class?

- [ ] Collaborators are passive data classes without their own responsibilities.
- [x] Collaborators are classes to which partial responsibilities are delegated.
- [ ] Collaborators are external systems that directly invoke class methods.
- [ ] Collaborators are the developers who maintain the class implementation.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Collaborators are classes that help fulfill responsibilities through delegation. They're not passive data, external systems, or developers—they're active service-providing classes.

</p>
</details>

---

## Question 8

What is the recommended approach for identifying responsibilities for CRC cards?

- [ ] Randomly distributing responsibilities to balance class sizes evenly.
- [x] Examine actor-domain interactions and write them as responsibilities.
- [ ] Replicating responsibilities from similar existing projects directly.
- [ ] Prioritizing responsibilities based on implementation difficulty.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Identify responsibilities by examining actor-domain interactions from requirements. Random distribution, copying from other projects, and difficulty-based prioritization don't reflect actual domain behavior.

</p>
</details>

---

## Question 9

What is the general advice regarding censoring or refining CRC card models during the initial idea generation phase?

- [ ] Censor immediately to maintain high quality standards throughout.
- [x] Don't censor your work too early; first generate ideas, then verify and refine later.
- [ ] Only document ideas that are already complete and validated.
- [ ] Refine each card to perfection before moving to the next.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Generate ideas freely first, then verify and refine later—premature censoring stifles creativity. Immediate censoring, requiring completeness, and perfecting each card sequentially all inhibit effective brainstorming.

</p>
</details>

---
