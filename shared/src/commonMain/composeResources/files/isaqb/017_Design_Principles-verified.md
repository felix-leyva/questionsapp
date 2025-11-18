## Question 1

What is the fundamental goal of "responsibility-driven design"?

- [ ] To assign each developer ownership of specific code modules.
- [x] To divide software into building blocks where each is assigned a single, clear responsibility.
- [ ] To create comprehensive documentation tracking feature accountability.
- [ ] To maximize building block size for comprehensive functionality coverage.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Responsibility-driven design assigns each building block a single, clear
responsibility for clarity and maintainability. Developer ownership, documentation tracking, and
maximizing size are organizational or anti-patterns, not design principles.

</p>
</details>

---

## Question 2

Which principle, introduced by David Parnas, states that modules should be as independent as
possible and should not know how other modules are implemented?

- [ ] The Principle of Least Knowledge (Law of Demeter)
- [ ] The Single Responsibility Principle from SOLID
- [x] The Information-Hiding Principle
- [ ] The Interface Segregation Principle

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Parnas introduced the Information-Hiding Principle for module independence. Law of
Demeter limits object communication, Single Responsibility concerns reasons for change, and
Interface Segregation avoids fat interfaces—related but distinct principles.

</p>
</details>

---

## Question 3

What is the defining characteristic of a "God class," which violates the principle of single
responsibility?

- [ ] A class with minimal dependencies and highly cohesive functionality.
- [ ] A class containing only abstract methods delegating to strategies.
- [x] A class that contains a vast majority of the source code and is responsible for almost
  everything.
- [ ] A class marked as final that cannot be extended or modified.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** A God class contains most source code and handles nearly everything, violating single
responsibility. Minimal dependencies, abstract delegation, and immutability describe good design
patterns, not this anti-pattern.

</p>
</details>

---

## Question 4

What is the primary benefit of the DRY (Don't Repeat Yourself) principle?

- [ ] It accelerates initial development by enabling code reuse through copying.
- [ ] It maximizes total lines of code to demonstrate development effort.
- [ ] It ensures diverse implementation approaches across the codebase.
- [x] It creates a single point of truth and maintenance, which simplifies changes and corrections.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** DRY creates a single point of truth and maintenance, simplifying changes. Code
copying, maximizing LOC, and diverse approaches all violate DRY and create maintenance burdens
through duplication.

</p>
</details>

---

## Question 5

What is the core message of the YAGNI (You Ain't Gonna Need It) principle?

- [ ] Always implement comprehensive solutions anticipating all future scenarios.
- [x] You should not implement functionality based on speculation about future needs; only implement
  what is currently required.
- [ ] Minimize third-party dependencies by building all functionality internally.
- [ ] Continuously refactor code immediately after writing it.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** YAGNI says implement only current requirements, not speculative future needs.
Comprehensive solutions, avoiding dependencies, and continuous refactoring address different
concerns and may violate YAGNI's focus on necessity.

</p>
</details>

---

## Question 6

What does Parnas's Modularity Principle emphasize regarding building blocks?

- [ ] They should be tightly coupled for coordinated behavior.
- [x] They should be processed as independently of each other as possible.
- [ ] They should expose all internal implementations for transparency.
- [ ] They are only applicable in modular monolithic architectures.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Parnas's Modularity Principle emphasizes maximum independence between building
blocks. Tight coupling, exposed implementations, and architecture-specific applicability all
contradict this principle of independence and information hiding.

</p>
</details>

---

## Question 7

What is the main idea behind the "Separation of Concerns" principle?

- [ ] All cross-cutting concerns should be centralized in a single module.
- [x] Different concerns, like user interaction or database handling, should be implemented in
  different building blocks.
- [ ] Concerns should be separated only at the architectural level, not in code.
- [ ] It applies exclusively to hardware-software interface design.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Separation of Concerns means implementing different concerns (UI, database) in
different building blocks. Centralizing everything, limiting to architecture level, or hardware-only
application all misunderstand this fundamental modularization principle.

</p>
</details>

---

## Question 8

What does the Cohesion Principle of Miles, Code, and Jordan state about a module?

- [ ] It should minimize cohesion to maximize flexibility and reusability.
- [x] It should have as much cohesion as possible between the elements of a building block.
- [ ] It should distribute responsibilities across multiple unrelated concerns.
- [ ] It should prioritize external interactions over internal consistency.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The Cohesion Principle advocates maximum internal cohesion within building blocks.
Low cohesion, distributed unrelated responsibilities, and prioritizing external interactions all
violate high cohesion principles.

</p>
</details>

---

## Question 9

According to Robert Martin's Single Responsibility Principle, what should be the characteristic of
each building block?

- [ ] It should aggregate multiple related functionalities for efficiency.
- [x] It should only cover one responsibility, so that there can only ever be one reason why it
  needs to be changed.
- [ ] It should be designed to evolve frequently based on multiple factors.
- [ ] It should be immutable and unchangeable after initial design.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Single Responsibility Principle means one responsibility, one reason to change.
Multiple functionalities, frequent evolution from multiple factors, and immutability all miss the
point of focused, single-purpose design.

</p>
</details>

---

## Question 10

What is the core advice of the KISS (Keep It Simple, Stupid) principle?

- [ ] Always select the most elaborate solution to handle edge cases.
- [x] To keep things simple with appropriate complexity.
- [ ] To eliminate all abstraction layers for direct implementation.
- [ ] To prioritize clever algorithms over readable code.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** KISS advises keeping things simple with appropriate (not excessive) complexity.
Elaborate solutions, eliminating useful abstractions, and prioritizing cleverness over clarity all
violate simplicity principles.

</p>
</details>

---

## Question 11

What is Kent Beck's advice for software development, as mentioned in the text?

- [ ] Make it perfect, make it scalable, make it distributed.
- [x] Make it work, make it right, make it fast.
- [ ] Make it simple, make it cheap, make it quickly deployable.
- [ ] Make it beautiful, make it maintainable, make it secure.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Kent Beck's advice: make it work (functional), make it right (clean), make it fast (
optimized)—in that order. Other combinations mix valid concerns but miss the specific sequence and
priorities Beck advocates.

</p>
</details>

---
