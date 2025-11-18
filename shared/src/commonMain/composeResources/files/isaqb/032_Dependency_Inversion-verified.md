## Question 1

What is the Dependency Inversion Principle (DIP) primarily described as?

- [ ] A mandatory rule that must be followed in all software designs.
- [x] A technique or tool to be known and applied when needed, enabling other design patterns and
  principles.
- [ ] A method for eliminating classes from system design.
- [ ] A way to remove all dependencies between software components completely.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** DIP is a technique applied when needed to enable patterns and principles, not a
universal rule. It doesn't eliminate classes or remove all dependencies—it inverts dependency
direction through abstraction.

</p>
</details>

---

## Question 2

In the context of DIP, what is being "inverted"?

- [ ] The sequential order of function execution.
- [ ] The directional flow of data within the system.
- [x] The dependency arrow between a high-level policy and a detail function, by introducing an
  abstraction that both depend on.
- [ ] The assignment of error handling responsibility.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** DIP inverts dependency arrows by introducing abstractions: both high-level and
low-level depend on the abstraction, reversing the dependency direction against control flow.
Execution order, data flow, and error handling aren't what's inverted.

</p>
</details>

---

## Question 3

What is one of the two practical incarnations of the Dependency Inversion Principle mentioned in the
text?

- [ ] Aspect-Oriented Programming (AOP)
- [x] Inversion of Control (IoC), also known as the Hollywood principle.
- [ ] Test-Driven Development (TDD)
- [ ] Domain-Driven Design (DDD)

<details>
<summary>Rationale</summary>
<p>

**Rationale:** DIP incarnations include Inversion of Control (IoC/"Hollywood principle") and
Dependency Injection. AOP, TDD, and DDD are valuable practices but not DIP incarnations.

</p>
</details>

---

## Question 4

What is the primary benefit of using "Constructor Injection" for dependency injection?

- [ ] It permits dependencies to be modified anytime after construction.
- [ ] It exclusively supports field-level dependency injection.
- [x] It guarantees that components will have their dependencies set at the moment of construction,
  making it harder to accidentally not provide them.
- [ ] It completely eliminates the requirement for external frameworks.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Constructor injection guarantees dependencies at construction time, preventing
accidental omission. Post-construction modification, field injection exclusivity, and framework
elimination aren't constructor injection benefits.

</p>
</details>

---

## Question 5

For which Domain-Driven Design (DDD) building blocks is dependency injection typically used?

- [ ] Exclusively for Entities and Value Objects.
- [ ] For all building blocks including Entities and Value Objects.
- [x] For Services, Factories, and Repositories, but not for Entities and Value Objects.
- [ ] It's not applicable to any DDD building blocks.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Dependency injection applies to Services, Factories, and Repositories (
infrastructure), not Entities and Value Objects (domain model objects). Entities/Value Objects don't
receive dependency injection.

</p>
</details>

---

## Question 6

What is the core idea behind the Dependency Inversion Principle (DIP)?

- [ ] High-level modules should depend directly on low-level modules.
- [x] High-level modules should not depend on low-level modules. Both should depend on abstractions.
- [ ] Abstractions should depend on implementation details.
- [ ] All modules must be completely independent of each other.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** DIP: high-level and low-level modules both depend on abstractions, not each other.
Direct high-to-low dependencies, abstractions depending on details, and complete independence all
violate DIP principles.

</p>
</details>

---

## Question 7

What is the "Hollywood principle" and how does it relate to Inversion of Control?

- [ ] A principle advocating glamorous software aesthetics.
- [x] It's a common way to explain Inversion of Control: "Don't call us, we'll call you."
- [ ] A principle encouraging tight coupling between components.
- [ ] A principle promoting direct sequential control flow.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Hollywood principle ("Don't call us, we'll call you") explains IoC—framework calls
your code, not vice versa. Software glamor, tight coupling, and direct control flow don't relate to
IoC.

</p>
</details>

---

## Question 8

What are the three common ways to implement Dependency Injection?

- [x] Constructor Injection
- [x] Setter Injection
- [x] Field Injection
- [ ] Manual Injection
- [ ] Interface Injection

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Three common DI implementations: Constructor, Setter, and Field injection. Manual and
Interface injection aren't standard DI implementation categories.

</p>
</details>

---

## Question 9

What is a disadvantage of "Setter Injection" compared to "Constructor Injection"?

- [ ] It significantly improves code readability and clarity.
- [x] It allows for objects to be created without their dependencies, potentially leading to null
  pointer exceptions if not handled carefully.
- [ ] It provides less flexibility in dependency management.
- [ ] It demands significantly more boilerplate code.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Setter injection allows object creation without dependencies, risking null pointer
exceptions. Constructor injection prevents this by requiring dependencies at construction, though
setter injection provides more flexibility, not less.

</p>
</details>

---
