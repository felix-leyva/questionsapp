## Question 1

What are the primary benefits of achieving low coupling in a software design?

- [ ] It optimizes runtime performance and reduces memory consumption.
- [x] It makes the software easier to modify, analyze, test, and reuse.
- [ ] It minimizes the number of architectural layers required.
- [ ] It guarantees faster project delivery and reduced costs.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Low coupling improves modifiability, analyzability, testability, and reusability of building blocks. Performance, layer count, and delivery guarantees are separate concerns not directly achieved through coupling reduction alone.

</p>
</details>

---

## Question 2

What is the relationship between the size of a class (in lines of code) and its degree of coupling?

- [ ] Class size and coupling are completely independent metrics overall.
- [ ] Smaller classes consistently exhibit higher coupling degrees.
- [x] Larger classes tend to have more relationships and higher coupling.
- [ ] Classes of identical size always have equivalent coupling levels.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Studies show larger classes tend to have more relationships and higher coupling. Size and coupling aren't independent, smaller classes don't have higher coupling, and identical sizes don't guarantee equivalent coupling.

</p>
</details>

---

## Question 3

What is a major drawback of having cyclic dependencies in a software architecture?

- [ ] They significantly improve system performance through optimization.
- [ ] They indicate a well-factored, modular design structure always.
- [x] They hinder code analysis, block replacement, and isolated testing.
- [ ] They only manifest in large enterprise-scale projects typically.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Cyclic dependencies hinder analysis, replacement, and isolated testing because components must be understood/tested as a whole. They don't improve performance, indicate good design, or only occur in large projects.

</p>
</details>

---

## Question 4

What is the recommended architectural structure to avoid the problems associated with cycles?

- [ ] A mesh topology where components can interact bidirectionally.
- [ ] A fully connected dependency graph for maximum flexibility.
- [ ] A centralized architecture with large coordinator classes.
- [x] A hierarchical structure.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Hierarchical structures avoid cycles by establishing clear dependency directions. Mesh topologies, fully connected graphs, and centralized architectures all enable or encourage cyclic dependencies.

</p>
</details>

---

## Question 5

What tends to happen to cyclic dependency groups over time if they are not fixed?

- [ ] They naturally decompose as codebases mature and stabilize.
- [ ] They remain constant in size and coupling strength over time.
- [x] They grow and become more tightly coupled as classes are added.
- [ ] They automatically refactor into loosely coupled components.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Unfixed cyclic dependencies tend to grow and tighten as more classes join the cycle. They don't decompose naturally, remain constant, or self-refactor—active intervention is required.

</p>
</details>

---

## Question 6

What is the definition of coupling in software design?

- [ ] The count of lines of code within a component.
- [x] The degree to which a block depends on the blocks around it.
- [ ] The number of developers assigned to a module.
- [ ] The execution speed of a software component.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Coupling measures dependency degree between building blocks. Lines of code, developer count, and execution speed are separate metrics measuring size, resourcing, and performance respectively.

</p>
</details>

---

## Question 7

What is a "God class" and what design principle does it violate?

- [ ] A highly cohesive class with single responsibility; violates Open/Closed.
- [x] A class with most source code and too many responsibilities.
- [ ] A database access layer class; violates Dependency Inversion.
- [ ] A logging utility class; it violates Liskov Substitution Principle.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** A God class contains most source code with too many responsibilities, violating Single Responsibility Principle. Database layers, logging utilities, and highly cohesive classes are different patterns not related to this anti-pattern.

</p>
</details>

---

## Question 8

What is the principle of acyclic dependencies, and why is it important?

- [ ] It requires all dependencies to form cycles for strong integration.
- [x] Dependencies should not form cycles as they cause strong coupling.
- [ ] It advocates for monolithic applications with centralized control.
- [ ] It applies exclusively to microservices architectures only.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Acyclic dependencies principle prohibits cycles because they create strong coupling and hinder analysis, replacement, and testing. Requiring cycles, monoliths, and microservices-only application all misstate the principle.

</p>
</details>

---

## Question 9

What is the recommended solution for resolving a difficult cycle group with many direct and indirect interdependencies, as described in the text?

- [ ] Removing any single dependency to break the cycle.
- [x] A complete refactoring.
- [ ] Incorporating additional classes to balance the cycle.
- [ ] Postponing resolution until the cycle resolves naturally.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Complex cycle groups with many interdependencies require complete refactoring. Removing single dependencies, adding classes, or waiting won't address deep structural problems—comprehensive restructuring is needed.

</p>
</details>

---
