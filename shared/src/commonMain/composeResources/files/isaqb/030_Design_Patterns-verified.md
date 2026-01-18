## Question 1

What is the key distinction between a "design pattern" and a "pattern language"?

- [ ] Design patterns apply exclusively to object-oriented paradigms only.
- [ ] A design pattern establishes system-wide rules; pattern languages are local.
- [x] Design patterns are local solutions; pattern languages are system-wide rules.
- [ ] Design patterns are theoretical while pattern languages are implementations.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Design patterns are local, applied when needed; pattern languages are broad, uniform architectural style rules. The scope (local vs. system-wide) and application (as-needed vs. uniform) distinguish them, not paradigms or theory vs. practice.

</p>
</details>

---

## Question 2

What happens if a certain design pattern is consistently used for a specific problem class within a system?

- [ ] It becomes obsolete and requires replacement with newer patterns.
- [ ] It loses effectiveness and should be avoided going forward.
- [x] It becomes part of the system's pattern language and therefore its architectural style.
- [ ] It indicates insufficient creativity in the design process.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Consistently mandated use of a design pattern for a problem class elevates it to pattern language status, becoming part of architectural style. It doesn't become obsolete, lose effectiveness, or indicate creativity deficiency.

</p>
</details>

---

## Question 3

What is the primary purpose of the "Strategy Pattern"?

- [ ] To abstract and hide details of remote procedure calls entirely.
- [ ] To extend object functionality elegantly through composition.
- [x] To allow dynamic exchange of algorithms used for computations.
- [ ] To facilitate communication between distributed system components.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Strategy Pattern enables dynamic algorithm selection and exchange through encapsulation and abstraction. Remote call hiding is Broker/Proxy patterns, functionality extension is Decorator pattern, and distributed communication is Broker pattern.

</p>
</details>

---

## Question 4

What is a key characteristic of a good design pattern, as exemplified by the Strategy Pattern?

- [ ] It must always require complex inheritance hierarchies to work.
- [ ] It should only apply to a single programming language always.
- [x] It should include standardized arrangements and abstract interfaces.
- [ ] It should make the context dependent on specific implementations.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Good design patterns include standardized arrangements (UML diagrams) and abstract interfaces decoupling context from implementations. Complexity, language-specificity, and implementation dependency are anti-patterns, not characteristics of good patterns.

</p>
</details>

---

## Question 5

What is the main goal of the "Broker Pattern"?

- [ ] To ensure all components are co-located on the same physical server.
- [ ] To replace direct communication entirely with centralized message queuing.
- [x] To streamline communication, abstracting component location concerns.
- [ ] To provide graphical administration interfaces for distributed systems.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Broker Pattern streamlines distributed component communication, abstracting location concerns (co-located vs. distributed). It doesn't enforce co-location, mandate message queues exclusively, or provide admin GUIs.

</p>
</details>

---

## Question 6

What is the primary purpose of design patterns?

- [ ] To create entirely new programming language constructs.
- [x] To describe a recurring problem and a proven local solution.
- [ ] To enforce a specific architectural style globally.
- [ ] To automate source code generation processes.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Design patterns document recurring problems with proven local solutions, capturing design wisdom. They don't create language constructs, enforce global styles, or automate code generation—those are different tools and techniques.

</p>
</details>

---

## Question 7

What is the key benefit of the Strategy Pattern regarding the client (context)?

- [ ] The client must maintain awareness of all algorithm implementations.
- [x] The client only needs to know the abstract interface, not details.
- [ ] The client assumes responsibility for creating implementations.
- [ ] The client directly accesses and modifies algorithm internal logic.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Strategy Pattern decouples clients from specific implementations through abstract interfaces—clients know only the abstraction. Implementation awareness, creation responsibility, and direct internal access all violate the pattern's encapsulation purpose.

</p>
</details>

---

## Question 8

What is the main advantage of using the Broker Pattern in distributed systems?

- [ ] It completely eliminates all network communication overhead.
- [x] It makes the location of components irrelevant to their communication.
- [ ] It mandates all components use identical programming languages.
- [ ] It consolidates all business logic into centralized brokers.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Broker Pattern abstracts component location, making communication location-independent. It doesn't eliminate network overhead, mandate language uniformity, or centralize business logic—it provides distribution transparency.

</p>
</details>

---
