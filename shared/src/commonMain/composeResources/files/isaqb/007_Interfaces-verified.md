## Question 1

What is the fundamental purpose of an interface for a building block in software architecture?

- [ ] To encapsulate internal state and prevent direct access to attributes.
- [x] To represent a well-defined access point to the system or its elements.
- [ ] To define the internal implementation details and algorithms of the building block.
- [ ] To establish relationships between building blocks at the white box level.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** An interface represents a well-defined access point for communication between
building blocks or system elements. Encapsulation of state, implementation details, and white box
relationships are separate architectural concerns.

</p>
</details>

---

## Question 2

Which of the following aspects are necessary to make an interface "well-defined" according to the
text?

- [x] The syntax, data structures, and functional behavior.
- [ ] The name of the lead developer who created it.
- [x] The behavior in the event of an error and non-functional properties.
- [ ] The cost of using the interface.
- [x] The usage protocol, technology used, and semantics of the interface.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** A well-defined interface requires technical specifications: syntax, data structures,
functional and error behavior, non-functional properties, usage protocol, technology, and semantics.
Developer names and costs are project metadata, not interface specifications.

</p>
</details>

---

## Question 6

Which of the following properties are necessary to make an interface "well-defined" according to the
text?

- [x] The syntax and data structures
- [x] The functional behavior
- [x] The behavior in the event of an error
- [x] The non-functional properties
- [x] The usage protocol for the interface
- [x] The technology used
- [ ] The development cost
- [ ] The lead developer's name

<details>
<summary>Rationale</summary>
<p>

**Rationale:** A well-defined interface requires comprehensive technical specifications including
syntax, data structures, behaviors, non-functional properties, protocols, and technology.
Development cost and developer attribution are project management concerns, not interface
definitions.

</p>
</details>

---

## Question 3

In which scenario is the interface specified by the importer, and the exporter must adapt to it?

- [ ] In service-oriented architectures with contract-first design.
- [ ] When implementing dependency injection patterns.
- [x] In the case of frameworks or plugins.
- [ ] When applying the adapter pattern to legacy systems.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Frameworks and plugins reverse the typical dependency, where the importer (framework)
specifies the interface and exporters (plugins) must adapt to it. SOA contracts, dependency
injection, and adapter patterns involve different interface ownership models.

</p>
</details>

---

## Question 4

What is the core principle of Postel's Law as it applies to interface development?

- [ ] Be strict in validation on both input and output to ensure contract compliance.
- [ ] Only accept data that perfectly matches the specification to prevent corruption.
- [ ] Provide extensive output data regardless of what was requested for flexibility.
- [x] Be precise and correct in what your interface provides, but be flexible and tolerant in what
  it accepts from others.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Postel's Law advocates being conservative in output (precise and correct) but liberal
in input (flexible and tolerant). Strict validation on both sides, perfect-match requirements, and
excessive output all contradict this robustness principle.

</p>
</details>

---

## Question 5

What is the role of a tool like Swagger in interface development?

- [ ] It automatically generates complete implementation code from interface specifications.
- [ ] It provides runtime adapters for connecting incompatible interface versions.
- [x] It helps describe interfaces in a structured way and can automatically generate and maintain
  API documentation.
- [ ] It is a framework for building reactive user interfaces with real-time updates.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Swagger describes interfaces in a structured format and generates/maintains API
documentation. It doesn't generate full implementations, provide runtime adapters, or build user
interfaces—those are separate tools and concerns.

</p>
</details>

---

## Question 7

According to the text, which parties can implement interfaces?

- [x] The importer
- [x] The exporter
- [x] A third party
- [ ] Only the exporter
- [ ] Only the importer

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Interfaces can be implemented by the importer, exporter, or a third party depending
on the architectural scenario. No single party has exclusive responsibility for interface
implementation.

</p>
</details>

---

## Question 8

In the context of old systems where the importer and exporter have fixed but diverged ideas about an
interface, what is needed to connect these interfaces?

- [ ] A facade to simplify the complex legacy interface.
- [x] An adapter.
- [ ] A proxy to control access to the legacy system.
- [ ] A mediator to coordinate communication between multiple systems.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** An adapter bridges incompatible interfaces that have diverged over time. Facades
simplify complexity, proxies control access, and mediators coordinate multiple parties—different
patterns for different problems.

</p>
</details>

---
