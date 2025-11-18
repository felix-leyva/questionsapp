## Question 1

What is the primary focus of the "Context View" in software architecture documentation?

- [ ] The internal static structure of the system.
- [x] The system as a black box and its relationships with its external context via interfaces.
- [ ] How building blocks interact at runtime.
- [ ] On which computers building blocks are deployed.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Context View shows the system as a black box with external relationships via
interfaces (bird's eye view). Internal structure (Building Block View), runtime interaction (Runtime
View), and deployment (Deployment View) are separate architectural views.

</p>
</details>

---

## Question 2

Which view typically shows the static structure of the architecture, including components,
interfaces, layers, and their relationships?

- [ ] The Context View
- [x] The Building Block View
- [ ] The Runtime View
- [ ] The Deployment View

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Building Block View shows static structure—components, interfaces, layers,
relationships. Context (external view), Runtime (dynamic behavior), and Deployment (physical
infrastructure) views address different architectural aspects.

</p>
</details>

---

## Question 3

What does the "Runtime View" describe?

- [ ] The physical location of servers.
- [ ] The historical evolution of the system.
- [x] A live view of building blocks, detailing how they interact at runtime, including
  synchronization and performance.
- [ ] The security vulnerabilities of the system.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Runtime View shows live building block interactions—synchronization, performance.
Physical location (Deployment View), historical evolution, and security vulnerabilities are
different concerns, not runtime behavior.

</p>
</details>

---

## Question 4

What information is conveyed by the "Deployment View"?

- [ ] The logical dependencies between software modules.
- [ ] The business processes supported by the system.
- [x] On which computers building blocks are deployed and executed, and via which networks they
  interact.
- [ ] The user interface design and interaction flows.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Deployment View shows physical infrastructure—computers, networks for building
blocks. Logical dependencies (Building Block View), business processes, and UI design are separate
architectural concerns.

</p>
</details>

---

## Question 5

Besides the four specific views mentioned, what other aspects can established views highlight?

- [ ] Only functional requirements.
- [x] Data flow, data structures, security, or user interaction with the system.
- [ ] Project management timelines.
- [ ] Team communication strategies.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Additional views can highlight data flow, structures, security, user interaction.
Functional-requirements-only, timelines, and communication strategies are project management
concerns, not architectural view subjects.

</p>
</details>

---

## Question 6

What is the primary purpose of the "Building Block View"?

- [ ] To show the system's external dependencies.
- [x] To illustrate the static structure of the architecture, including components, interfaces,
  layers, and their relationships.
- [ ] To describe how building blocks interact at runtime.
- [ ] To show the physical deployment of building blocks.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Building Block View illustrates static structure—the "what we think of" when
discussing architecture documentation. External dependencies (Context), runtime (Runtime View), and
deployment (Deployment View) are separate views.

</p>
</details>

---

## Question 7

What kind of information is typically included in the "Runtime View"?

- [ ] The source code of the building blocks.
- [x] Details on how building blocks interact at runtime, including synchronization and performance.
- [ ] The deployment environment and network topology.
- [ ] The business processes supported by the system.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Runtime View includes interaction details—synchronization, performance. Source code (
implementation detail), deployment environment (Deployment View), and business processes (domain
concern) aren't runtime behavior focus.

</p>
</details>

---

## Question 8

What is the primary purpose of the "Deployment View"?

- [ ] To show the logical structure of the system.
- [x] To describe on which computers building blocks are deployed and executed, and via which
  networks they interact.
- [ ] To illustrate the internal design of individual components.
- [ ] To document the business requirements.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Deployment View describes physical infrastructure—computers, execution, networks.
Logical structure (Building Block View), component design (detailed Building Block), and business
requirements (separate documentation) aren't deployment concerns.

</p>
</details>

---
