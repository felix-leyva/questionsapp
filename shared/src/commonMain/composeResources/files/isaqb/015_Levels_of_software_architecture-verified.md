## Question 1

What are the four levels of software architecture that structure the chapter described in the text?

- [ ] Presentation, Business Logic, Data Access, and Infrastructure layers.
- [x] Business Architecture, Architecture Style, Technical Architecture, and Cross-cutting Concerns.
- [ ] Strategic, Tactical, Operational, and Implementation levels.
- [ ] Frontend, Backend, Database, and Integration tiers.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The four levels are Business Architecture, Architecture Style, Technical Architecture, and Cross-cutting Concerns. Presentation/Business/Data layers describe layered architecture, Strategic/Tactical/Operational are planning levels, and Frontend/Backend/Database/Integration are deployment tiers—all different categorizations.

</p>
</details>

---

## Question 2

Which level of architecture is described as the "core" and is derived from business requirements to create domain models?

- [ ] The Technical Architecture defining deployment topology
- [ ] The Architecture Style establishing structural patterns
- [x] The Business Architecture
- [ ] The Cross-cutting Concerns addressing system-wide aspects

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Business Architecture forms the core, derived from business requirements to create domain models with domain classes. Technical Architecture handles deployment, Architecture Style defines patterns, and Cross-cutting Concerns address system-wide aspects like logging.

</p>
</details>

---

## Question 3

From what are the two more technical architecture levels (Technical Architecture and Cross-cutting Concerns) primarily derived?

- [ ] The business domain model and domain classes.
- [ ] The stakeholder requirements and user stories.
- [x] The non-functional requirements.
- [ ] The user experience design specifications.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Technical Architecture and Cross-cutting Concerns derive from non-functional requirements (performance, security, scalability). Domain models, stakeholder requirements, and UX specifications drive functional architecture levels, not technical ones.

</p>
</details>

---

## Question 4

What does the "Technical Architecture" level define?

- [ ] The domain model classes and their business relationships.
- [ ] The overarching structural pattern like layered or microservices architecture.
- [x] The network parts and how the software is divided into deployment units.
- [ ] Cross-system concerns like persistence and communication protocols.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Technical Architecture defines network topology and deployment unit division. Domain models belong to Business Architecture, structural patterns to Architecture Style, and persistence/communication to Cross-cutting Concerns.

</p>
</details>

---

## Question 5

Although the overall process is iterative, what is suggested as a sensible starting point within an iteration?

- [ ] Identifying cross-cutting concerns like logging and security.
- [ ] Designing the deployment topology and infrastructure.
- [ ] Selecting an architectural style like microservices or layers.
- [x] Starting with the business architecture.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Start with business architecture even in iterative processes, as it forms the foundation. Cross-cutting concerns, deployment design, and architectural style selection typically follow after establishing the business core.

</p>
</details>

---

## Question 6

What is the primary goal when designing the business architecture?

- [ ] To define the network infrastructure and deployment strategy.
- [x] To design domain models that consist of domain classes.
- [ ] To select the programming language and development framework.
- [ ] To establish integration patterns and communication protocols.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Business architecture aims to design domain models consisting of domain classes from business requirements. Network infrastructure, programming languages, and integration patterns are technical concerns addressed at different levels.

</p>
</details>

---

## Question 7

What is the role of the "Architecture Style" level in software architecture?

- [ ] It specifies the database technology and persistence framework used.
- [x] It determines how business architecture is organized as central metaphor.
- [ ] It defines the detailed implementation approach for each component.
- [ ] It addresses user interface design patterns and interaction models.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Architecture Style determines how business architecture is organized with other building blocks, serving as the central metaphor (layered, microservices, etc.). Database technology, implementation details, and UI patterns are separate concerns.

</p>
</details>

---

## Question 8

Which two levels of software architecture are described as being more "business-driven" and based on functional requirements?

- [ ] Technical Architecture and Cross-cutting Concerns addressing runtime qualities.
- [x] Business Architecture and Architecture Style.
- [ ] Technical Architecture and Architecture Style spanning both domains.
- [ ] Business Architecture and Cross-cutting Concerns forming the foundation.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Business Architecture and Architecture Style are functional/business-driven levels derived from functional requirements. Technical Architecture and Cross-cutting Concerns derive from non-functional requirements.

</p>
</details>

---

## Question 9

What is the relationship between the different levels of software architecture in the iterative process?

- [ ] They are independent layers with strict boundaries and no interdependencies.
- [ ] Only Business Architecture cascades down to influence lower levels.
- [x] All levels influence each other in the iterative process.
- [ ] Technical levels must be finalized before business levels can begin.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** All levels influence each other iteratively—there's bidirectional feedback, not unidirectional cascading. They're interdependent, not independent, and no strict sequencing is required despite having a sensible starting point.

</p>
</details>

---
