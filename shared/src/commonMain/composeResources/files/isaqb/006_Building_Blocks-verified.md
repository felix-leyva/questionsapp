## Question 1

Which of the following are considered "building blocks" in software architecture, according to the
text?

- [x] A package or a namespace.
- [x] Programming constructs like classes, modules, or functions.
- [ ] The development team's communication strategy.
- [x] Libraries and frameworks.
- [x] Configurations and data structures.
- [ ] The project management methodology.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Building blocks include packages, namespaces, programming constructs (classes,
modules, functions), libraries, frameworks, and description elements like configurations and data
structures. Development team strategies and project management methodologies are organizational
concerns, not architectural building blocks.

</p>
</details>

---

## Question 2

What are the three fundamental aspects of building blocks discussed in the text?

- [ ] Naming conventions, versioning schemes, and comprehensive documentation.
- [x] Export/import interfaces, encapsulation of implementation, and hierarchical composition.
- [ ] Performance optimization, security controls, and scalability patterns.
- [ ] Programming language selection, author attribution, and creation timestamp.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The three fundamental aspects are: export/import interfaces (how building blocks
communicate), encapsulation (hiding implementation details), and hierarchical composition (how
building blocks are structured and configured). The other options describe development practices or
metadata, not core architectural aspects.

</p>
</details>

---

## Question 6

Which of the following are the three fundamental aspects of building blocks discussed in the text?

- [x] All building blocks have export and import interfaces
- [x] Building blocks encapsulate and hide their implementation
- [x] Building blocks have hierarchical composition and configuration
- [ ] Building blocks must be written in object-oriented languages
- [ ] Building blocks require extensive documentation
- [ ] Building blocks must follow specific naming conventions

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The three fundamental aspects are: interfaces for communication, encapsulation of
implementation, and hierarchical composition. Building blocks are language-agnostic and don't
require specific documentation or naming conventions as fundamental aspects.

</p>
</details>

---

## Question 3

Which view of a building block is intended for an architect designing the overall system structure,
showing only export and import interfaces without revealing the internal structure?

- [ ] The White Box View
- [x] The Black Box View
- [ ] The Component View
- [ ] The Deployment View

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The Black Box View shows only external interfaces without internal structure, ideal
for system-level design. White Box View reveals internals, while Component and Deployment Views are
different architectural perspectives focusing on component relationships and runtime deployment
respectively.

</p>
</details>

---

## Question 4

What is the primary purpose of the "White Box View" of a building block?

- [ ] To show integration points with external systems and third-party services.
- [ ] To provide stakeholder-facing documentation for business requirements.
- [x] To reveal the internal structure and decomposition into sub-building blocks for the
  implementer.
- [ ] To display runtime configuration parameters and deployment settings.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The White Box View reveals internal structure and sub-building blocks for
implementers who need to understand the decomposition. External integrations, business
documentation, and runtime configurations are separate concerns addressed by other views.

</p>
</details>

---

## Question 5

According to the text, what does the architect influence when designing the white box decomposition
of a building block?

- [ ] The overall project timeline and resource allocation.
- [ ] The user experience design and interface workflows.
- [x] The coupling between and the testability of the embodied building blocks.
- [ ] The choice of deployment infrastructure and cloud providers.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** White box decomposition directly influences coupling (how tightly sub-building blocks
are connected) and testability (how easily they can be tested). Project timelines, UX design, and
infrastructure choices are separate concerns not directly determined by structural decomposition.

</p>
</details>

---

## Question 7

What is the primary purpose of the "Gray Box View" of a building block, and for whom is it primarily
intended?

- [ ] To show the complete internal implementation details for developers.
- [ ] To hide all internal details for external stakeholders and clients.
- [x] To reveal some parts of the internal structure that describe the connection of sub-building
  blocks' interfaces, making it important for configurators.
- [ ] To display only the external API documentation for third-party integrators.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The Gray Box View is a middle ground showing interface connections between
sub-building blocks, essential for configurators who need to wire components together. It's neither
fully transparent (White Box) nor fully opaque (Black Box), and serves a different purpose than API
documentation.

</p>
</details>

---

## Question 8

When designing the black box view of a building block, what aspects does the architect influence?

- [x] The implementation of functional requirements.
- [x] The implementation of non-functional requirements.
- [x] The properties of the export interface.
- [x] The amount of coupling with other building blocks.
- [ ] The specific programming language used for internal implementation.
- [ ] The daily tasks of the development team.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Black box design influences functional/non-functional requirements, export interface
properties, and coupling with other blocks. Programming language and team tasks are implementation
details not determined by the black box view itself.

</p>
</details>

---

## Question 9

What can the export interface of a building block consist of?

- [x] Functions
- [x] Methods
- [ ] Internal variables
- [x] Procedures
- [x] Types
- [x] Constancies
- [ ] Private classes

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Export interfaces consist of publicly accessible elements: functions, methods,
procedures, types, and constants. Internal variables and private classes are implementation details
that violate encapsulation when exposed.

</p>
</details>

---
