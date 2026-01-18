## Question 1

What is the primary focus of the "Context View" in software architecture documentation?

- [ ] The internal static structure of the system, its components, and their dependencies.
- [x] The system as a black box and its relationships with external context.
- [ ] How building blocks interact at runtime, their synchronization, and performance.
- [ ] On which computers building blocks are deployed, executed, and interconnected.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Context View shows the system as a black box with external relationships via interfaces (bird's eye view). Internal structure (Building Block View), runtime interaction (Runtime View), and deployment (Deployment View) are separate architectural views.

</p>
</details>

---

## Question 2

Which view typically shows the static structure of the architecture, including components, interfaces, layers, and their relationships?

- [ ] The Context View showing external relationships and interfaces
- [x] The Building Block View
- [ ] The Runtime View showing dynamic behavior and interactions
- [ ] The Deployment View showing physical infrastructure and networks

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Building Block View shows static structure—components, interfaces, layers, relationships. Context (external view), Runtime (dynamic behavior), and Deployment (physical infrastructure) views address different architectural aspects.

</p>
</details>

---

## Question 3

What does the "Runtime View" describe?

- [ ] The physical location of servers, network infrastructure, and data centers.
- [ ] The historical evolution of the system over time and version history.
- [x] A live view of building blocks, detailing how they interact at runtime.
- [ ] The security vulnerabilities of the system, mitigation strategies, and threats.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Runtime View shows live building block interactions—synchronization, performance. Physical location (Deployment View), historical evolution, and security vulnerabilities are different concerns, not runtime behavior.

</p>
</details>

---

## Question 4

What information is conveyed by the "Deployment View"?

- [ ] The logical dependencies between software modules, their interfaces, and contracts.
- [ ] The business processes supported by the system, their workflows, and actors.
- [x] On which computers building blocks are deployed, and via which networks.
- [ ] The user interface design, interaction flows with end users, and accessibility.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Deployment View shows physical infrastructure—computers, networks for building blocks. Logical dependencies (Building Block View), business processes, and UI design are separate architectural concerns.

</p>
</details>

---

## Question 5

Besides the four specific views mentioned, what other aspects can established views highlight?

- [ ] Only functional requirements derived from user stories.
- [x] Data flow, data structures, security, or user interaction with the system.
- [ ] Project management timelines and milestone tracking.
- [ ] Team communication strategies and collaboration tools.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Additional views can highlight data flow, structures, security, user interaction. Functional-requirements-only, timelines, and communication strategies are project management concerns, not architectural view subjects.

</p>
</details>

---

## Question 6

What is the primary purpose of the "Building Block View"?

- [ ] To show the system's external dependencies, context, and boundary interfaces.
- [x] To illustrate the static structure of the architecture, including components.
- [ ] To describe how building blocks interact at runtime dynamically and concurrently.
- [ ] To show the physical deployment of building blocks on infrastructure and networks.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Building Block View illustrates static structure—the "what we think of" when discussing architecture documentation. External dependencies (Context), runtime (Runtime View), and deployment (Deployment View) are separate views.

</p>
</details>

---

## Question 7

What kind of information is typically included in the "Runtime View"?

- [ ] The source code of the building blocks, implementation details, and algorithms.
- [x] Details on how building blocks interact at runtime, including synchronization.
- [ ] The deployment environment, network topology of the infrastructure, and nodes.
- [ ] The business processes supported by the system, their steps, and stakeholders.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Runtime View includes interaction details—synchronization, performance. Source code (implementation detail), deployment environment (Deployment View), and business processes (domain concern) aren't runtime behavior focus.

</p>
</details>

---

## Question 8

What is the primary purpose of the "Deployment View"?

- [ ] To show the logical structure of the system, its layers, and component relationships.
- [x] To describe on which computers building blocks are deployed and via which networks.
- [ ] To illustrate the internal design of individual components, classes, and algorithms.
- [ ] To document the business requirements, user stories, and acceptance criteria.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Deployment View describes physical infrastructure—computers, execution, networks. Logical structure (Building Block View), component design (detailed Building Block), and business requirements (separate documentation) aren't deployment concerns.

</p>
</details>

---
