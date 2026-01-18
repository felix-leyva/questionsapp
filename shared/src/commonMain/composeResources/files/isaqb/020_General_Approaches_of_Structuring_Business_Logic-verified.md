## Question 1

What are the three approaches for structuring business logic as defined by Martin Fowler in the text?

- [ ] Layered Architecture, Event-Driven Architecture, and Hexagonal Architecture.
- [x] Transaction Script, Table Module, and Domain Model.
- [ ] Imperative, Declarative, and Reactive programming paradigms.
- [ ] Repository Pattern, Service Layer, and Data Mapper.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Fowler identifies Transaction Script, Table Module, and Domain Model for structuring business logic. Layered/Event-Driven/Hexagonal are architectural styles, Imperative/Declarative/Reactive are paradigms, and Repository/Service/Mapper are implementation patterns.

</p>
</details>

---

## Question 2

What is the central organizing principle of the "Transaction Script" approach?

- [ ] Business logic is organized into classes mirroring domain entities.
- [ ] Business logic follows the database schema table structure strictly.
- [x] Each transaction uses a procedure with all logic including DB and UI.
- [ ] Business logic is completely decoupled from infrastructure concerns.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Transaction Script organizes around user transactions, with each handled by a procedure containing all logic (database, business, UI). Domain entities, table structure, and decoupling describe other approaches.

</p>
</details>

---

## Question 3

Which of the following is a major disadvantage of the "Table Module" approach?

- [ ] It applies pure object-oriented modeling unsuitable for simple problems.
- [x] Business logic is fused with database code; DB changes impact it.
- [ ] It only scales for highly complex business domains typically.
- [ ] It requires separate user interfaces for each database table.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Table Module's key weakness is business logic tightly coupled with database handling code. It's not purely object-oriented, works better for simple problems, and doesn't require separate UIs per table.

</p>
</details>

---

## Question 4

What is the key characteristic of the "Domain Model" approach?

- [ ] It uses procedural programming focused on transaction efficiency.
- [ ] It creates one class per database table for direct mapping.
- [ ] It combines business logic with presentation code for cohesion.
- [x] Domain logic is modeled independently of technical aspects.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Domain Model uses proper object-oriented design with domain logic independent of technical concerns (database, UI). Procedural programming, table-per-class, and mixing with presentation all describe other approaches.

</p>
</details>

---

## Question 5

According to the comparison graph described in the text, how does the "Domain Model" approach compare to "Transaction Script" as business logic complexity increases?

- [ ] Domain Model maintains constant cost regardless of complexity level.
- [ ] Transaction Script becomes more cost-effective as complexity grows.
- [x] Domain Model costs more initially but scales better for complexity.
- [ ] Both approaches scale identically across all complexity levels.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Domain Model has higher initial cost but slower cost growth, making it superior for complex logic. Transaction Script doesn't improve with complexity, Domain Model cost isn't constant, and their scaling differs significantly.

</p>
</details>

---

## Question 6

What is a key characteristic of the "Transaction Script" approach regarding the implementation of business logic?

- [ ] Business logic is always implemented exactly once per concept.
- [x] Parts of the business logic may be implemented multiple times in different procedures.
- [ ] Business logic is strictly isolated from all data access.
- [ ] Business logic uses inheritance hierarchies and polymorphism.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Transaction Script often duplicates business logic across procedures. It doesn't guarantee single implementation, strict isolation from data access, or object-oriented features like inheritance/polymorphism.

</p>
</details>

---

## Question 7

For what type of problems is the "Transaction Script" approach considered suitable?

- [ ] Complex enterprise applications with rich business domains.
- [x] Small programs or simple business logic.
- [ ] Systems requiring extensive domain-driven design techniques.
- [ ] Applications prioritizing long-term maintainability and evolution.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Transaction Script suits small programs or simple business logic. Complex enterprises, domain-driven design, and long-term maintainability require more sophisticated approaches like Domain Model.

</p>
</details>

---

## Question 8

How does a "Table Module" organize domain logic?

- [ ] With one class per business domain entity.
- [x] With one class per table in the database.
- [ ] With one procedure per user interaction.
- [ ] With separate modules for each business capability.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Table Module organizes with one class per database table. Domain entities, user interactions, and business capabilities represent different organizational strategies used by other approaches.

</p>
</details>

---

## Question 9

What is a key difference between a "Table Module" and a true object-oriented model?

- [ ] Table Modules are fully object-oriented while Domain Models are procedural.
- [x] Table Module has one instance for all entries; OO has one per record.
- [ ] Table Modules completely separate business and data concerns.
- [ ] Table Modules handle complex domains better than object-oriented models.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Table Module uses one class instance managing all table entries, while true OO has one instance per record (business object). Table Module isn't fully OO, doesn't completely separate concerns, and handles simple domains better.

</p>
</details>

---

## Question 10

What object-oriented concepts are found in the "Domain Model" approach?

- [x] Encapsulation
- [x] Locality
- [x] Delegation
- [ ] Direct database access
- [ ] Procedural programming

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Domain Model employs encapsulation, locality, and delegation—core OO concepts. Direct database access and procedural programming characterize Transaction Script and Table Module, not Domain Model.

</p>
</details>

---

## Question 11

Why is it difficult to refactor a "Transaction Script" to a "Domain Model"?

- [ ] Because transaction scripts are inherently too small to refactor.
- [x] Due to data source complexity and fundamental structural differences.
- [ ] Because domain models reject object-oriented principles entirely.
- [ ] Because automated refactoring tools cannot handle this transformation.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Refactoring Transaction Script to Domain Model is difficult due to data source complexity and fundamental structural differences. Scripts aren't too small, Domain Models embrace OO, and tooling isn't the primary barrier.

</p>
</details>

---
