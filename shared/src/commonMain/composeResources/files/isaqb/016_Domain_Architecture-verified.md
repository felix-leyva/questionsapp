## Question 1

What is the typical starting point for creating a domain-specific model in software architecture?

- [ ] The non-functional requirements and quality attributes.
- [x] The domain artifacts from the real world, like documents or folders.
- [ ] The database schema and entity-relationship diagrams.
- [ ] The technical infrastructure and deployment constraints.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Domain modeling starts with real-world domain artifacts (documents, folders, contracts) following object-oriented analysis principles. Non-functional requirements, database schemas, and infrastructure are technical concerns addressed after establishing the domain model.

</p>
</details>

---

## Question 2

In the implementation of a domain model, what does the behavior associated with a domain object (e.g., "add a contract to a folder") typically become?

- [ ] A separate service layer component handling business rules.
- [ ] A database trigger or stored procedure for data integrity.
- [x] A method within the corresponding class (e.g., a method in the `CustomerFolder` class).
- [ ] An external configuration file defining workflow rules.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Domain object behavior becomes methods within the corresponding class (e.g., CustomerFolder.addContract()). Service layers, database triggers, and configuration files are alternative architectural patterns, not domain object implementation approaches.

</p>
</details>

---

## Question 3

What is the principle of "Command Query Separation"?

- [ ] Separating user interface components from backend business logic.
- [ ] Isolating synchronous operations from asynchronous message processing.
- [ ] Partitioning database schemas into read-only and write-only tables.
- [x] Distinguishing between read-only queries and state-changing commands.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Command Query Separation distinguishes read-only queries from state-changing commands at the method level. UI/backend separation is layering, sync/async is concurrency, and database partitioning is a persistence pattern—different architectural concerns.

</p>
</details>

---

## Question 4

What is a primary benefit of applying Command Query Separation?

- [ ] It automatically optimizes database query performance through caching.
- [x] Queries can be called in any order without changing system state.
- [ ] It reduces overall code complexity by eliminating method parameters.
- [ ] It guarantees thread safety in concurrent execution environments.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Command Query Separation makes queries convenient—they can be called in any order without side effects. It doesn't automatically optimize performance, reduce code complexity, or guarantee thread safety—those require additional techniques.

</p>
</details>

---

## Question 5

What is the key advice given for creating functional classes from the real world?

- [ ] To model only data structures (nouns) using data transfer objects.
- [ ] To create a single aggregate root class containing all domain logic.
- [x] To model interactions (verbs) along with related objects (nouns).
- [ ] To ensure direct one-to-one mapping between classes and tables.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Model interactions (verbs) from requirements along with related objects (nouns), not pure data. DTOs, single aggregate roots, and class-table mappings are implementation patterns that miss the point of behavior-rich domain modeling.

</p>
</details>

---

## Question 6

What is the relationship between domain objects and subject-specific classes in an object-oriented model?

- [ ] Domain objects exist only in documentation, separate from implementation classes.
- [x] Domain objects later represent subject-specific classes.
- [ ] Classes are facades that hide domain object complexity from clients.
- [ ] There is no direct relationship between the two concepts.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Domain objects from analysis represent subject-specific classes in implementation—they're the same entities at different abstraction levels. They're not separate documentation artifacts, facades, or unrelated concepts.

</p>
</details>

---

## Question 7

What is the key takeaway regarding modeling when creating functional classes from the real world?

- [ ] Focus exclusively on data modeling with normalized data structures.
- [x] Model interactions (verbs) with related objects (nouns) from requirements.
- [ ] Design classes as pure data holders with getters and setters only.
- [ ] The domain model should contain only abstract interfaces for clients.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Model interactions (verbs) with related objects (nouns) from requirements, avoiding anemic domain models. Pure data holders, normalized structures, and interface-only designs miss the behavior-rich nature of true domain models.

</p>
</details>

---
