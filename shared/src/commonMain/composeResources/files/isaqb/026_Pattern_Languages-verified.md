## Question 1

What is the primary purpose of a "pattern language" in software architecture?

- [ ] To establish user interface design standards and conventions.
- [ ] To specify which programming language should be used.
- [x] To provide guidance on the detail level of code structure, even within architectural layers,
  to avoid chaos and cycles.
- [ ] To fully automate software development processes.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Pattern languages guide detailed code structure within layers to prevent chaos and
cycles. They don't define UI standards, specify programming languages, or automate development.

</p>
</details>

---

## Question 2

In Domain-Driven Design (DDD), what is the key characteristic of an "Entity"?

- [ ] It maintains strict immutability with no identity.
- [x] It has an identity, can change (modifiable state), and is usually persistent.
- [ ] It performs procedures unsuitable as methods on other objects.
- [ ] It manages loading and storing objects from databases.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Entities have identity, modifiable state, and are usually persistent. Immutability
characterizes Value Objects, procedures define Services, and persistence is Repository
responsibility.

</p>
</details>

---

## Question 3

What is the main difference between an "Entity" and a "Value Object" in DDD?

- [ ] Entities are stateless while Value Objects maintain state.
- [x] Entities have an identity and can change, while Value Objects have no identity and are
  strictly immutable.
- [ ] Value Objects require persistence while Entities don't.
- [ ] Entities handle technical concerns while Value Objects handle business logic.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Entities have identity and mutability; Value Objects lack identity and are immutable.
Entities hold state (not stateless), both can be persistent, and both are domain concepts, not
technical ones.

</p>
</details>

---

## Question 4

What is the role of a "Service" in DDD tactical design building blocks?

- [ ] To persist and retrieve entities from storage systems.
- [x] To perform procedures that cannot be implemented as methods of entities or value objects, and
  they are strictly stateless.
- [ ] To encapsulate complex object instantiation processes.
- [ ] To represent the immutable identity of entities.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Services perform procedures (often involving multiple entities) that don't belong to
entities/value objects, and are stateless. Persistence is Repositories, instantiation is Factories,
identity is Entity characteristic.

</p>
</details>

---

## Question 5

What is an "Aggregate" in DDD, and what is its purpose?

- [ ] A collection of unrelated entities grouped for convenience.
- [ ] A specialized service handling complex business rules.
- [x] The smallest unit for storing and loading entities through a repository, always based on a
  root entity.
- [ ] A creational pattern for manufacturing new object instances.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Aggregates are the smallest persistence unit accessed through repositories, based on
a root entity. They're not unrelated collections, services, or generic creational patterns.

</p>
</details>

---

## Question 6

What is the primary characteristic of a "Value Object" in Domain-Driven Design (DDD)?

- [ ] It possesses unique identity and supports modification.
- [x] It has no identity, purely represents values, and is strictly immutable.
- [ ] It executes complex business logic involving multiple entities.
- [ ] It handles persistence operations for entity storage.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Value Objects lack identity, represent pure values, and are immutable.
Identity/modification characterize Entities, complex logic defines Services, and persistence is
Repository responsibility.

</p>
</details>

---

## Question 7

What is the rule regarding state for "Services" in DDD?

- [ ] Services may maintain any amount of internal state.
- [x] Services are strictly stateless.
- [ ] State is exclusively privileged to services alone.
- [ ] Services hold state only for single-entity operations.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Services are strictly stateless—state is privileged only to Entities and Value
Objects, not Services. Services coordinate but don't hold state.

</p>
</details>

---

## Question 8

What is the role of "Factories" in DDD tactical design building blocks?

- [ ] To implement business logic unsuitable for other components.
- [x] To encapsulate the potentially complex instantiation process of entities or value objects.
- [ ] To manage entity persistence to database systems.
- [ ] To represent the fixed immutable identity of entities.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Factories encapsulate complex instantiation for entities/value objects. Business
logic belongs in Services/Entities, persistence in Repositories, and identity is an Entity
attribute.

</p>
</details>

---

## Question 9

What is the responsibility of "Repositories" in DDD?

- [ ] To define and enforce business domain rules.
- [x] To persist entities, responsible for loading and storing an entity for use across
  transactions, and performing transformations for database storage.
- [ ] To manage user interface interactions and presentation.
- [ ] To control the lifecycle of value objects.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Repositories handle entity persistence, loading/storing across transactions, and
database transformations. Business rules are in Entities/Services, UI is separate, and Value Objects
don't have managed lifecycles.

</p>
</details>

---

## Question 10

How does the pattern language of Domain-Driven Design (DDD) apply to a typical technical layered
architecture?

- [ ] It completely replaces layered architecture with domain-centric organization.
- [ ] It applies exclusively to the presentation layer components.
- [x] It applies mostly to the domain layer of the layered architecture, helping to avoid cycles
  even within a layer.
- [ ] It prescribes specific technology choices for all layers.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** DDD pattern language applies primarily to the domain layer, helping avoid intra-layer
cycles. It doesn't replace layered architecture, apply only to presentation, or dictate technology
choices.

</p>
</details>

---
