## Question 1

What are the fundamental questions an architect should answer to develop an initial solution idea,
as outlined in the text?

- [ ] What is the project budget and resource allocation plan?
- [x] What is the core task of the system and who uses it?
- [ ] What development methodology and toolchain will be employed?
- [x] What interfaces are there and how does the system manage data?
- [x] How is the system controlled?
- [ ] How will the team structure align with the architecture?

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Key questions focus on core task, users, interfaces, data management, and control
mechanisms—architectural fundamentals. Budget, methodology, and team structure are project
management concerns addressed separately from initial solution ideation.

</p>
</details>

---

## Question 2

When identifying the users of a system, which of the following groups should an architect consider
in addition to the users of the core functionality?

- [ ] The executive sponsors and budget holders.
- [x] Administrators and operators.
- [ ] The marketing and sales departments.
- [x] Stakeholders who may have a negative attitude towards the new system.
- [x] Users of special functions like approvers or reviewers.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Beyond core users, consider administrators, operators, special function users (
approvers/reviewers), and those resistant to change. Executives, marketing, and sales are
stakeholders but not direct system users with architectural implications.

</p>
</details>

---

## Question 3

Which of the following are described in the text as distinct types of system usage?

- [ ] A system providing analytics dashboards for business intelligence.
- [x] An interactive online system that supports normal business processes.
- [x] A background, offline, or batch system used for data manipulation.
- [ ] A microservices architecture distributed across cloud infrastructure.
- [x] An embedded system that works closely with specialized hardware.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The text identifies interactive online, background/batch, and embedded systems as
distinct usage types. Analytics dashboards and microservices describe architectural patterns, not
fundamental system usage classifications.

</p>
</details>

---

## Question 4

When an architect is considering how a system will manage its data, which of the following are
influential aspects mentioned in the text?

- [ ] The geographic distribution of data centers for disaster recovery.
- [x] Data volume and license costs.
- [ ] The database vendor's market share and community support.
- [x] Performance, parallel access, and data integrity.
- [x] Recoverability after system failures.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Data management considerations include volume, costs, performance, parallel access,
integrity, and recoverability. Geographic distribution and vendor market share are infrastructure
and procurement concerns, not core data management architectural aspects.

</p>
</details>

---

## Question 5

What type of system control is described as being located *outside* the system, for example, at a
module that receives keystrokes or mouse clicks?

- [ ] Asynchronous message-driven control
- [ ] Hierarchical layered control
- [x] Event-driven control
- [ ] Service-oriented control

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Event-driven control is located outside the system (e.g., keyboard/mouse handlers).
Asynchronous messaging, hierarchical layers, and service orientation describe different
architectural patterns for organizing system structure and communication.

</p>
</details>

---

## Question 6

When describing the core task of a system, what is recommended?

- [ ] To enumerate all functional requirements from the specification.
- [x] To describe it in two or three sentences, formulated positively, using core terms of the
  domain.
- [ ] To detail the technical architecture and component interactions.
- [ ] To catalog all planned features across all development phases.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Core task should be concise (2-3 sentences), positive, using domain terminology.
Enumerating requirements, detailing architecture, or cataloging features are different documentation
activities that miss the point of a succinct core task statement.

</p>
</details>

---

## Question 7

What are some questions an architect should ask regarding user interfaces?

- [x] What type of user interfaces must the system provide?
- [x] Should the system be operated via console or command line, or special hardware?
- [x] Does the user interface need to be customizable for different user groups?
- [ ] What CSS framework should be used for styling?
- [ ] How many frontend developers are available for UI development?

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Architectural questions address interface types, interaction modes (
console/CLI/hardware), and customization needs for different users. CSS frameworks and developer
availability are implementation and resource concerns, not architectural interface questions.

</p>
</details>

---

## Question 8

What is the difference between procedural control and parallel control in a system?

- [ ] Procedural control uses multiple concurrent threads, while parallel control is
  single-threaded.
- [x] Procedural control originates from a function block sequentially calling others, while
  parallel control involves several independent blocks reacting to events or requests.
- [ ] Procedural control is managed by external orchestrators, while parallel control is internal.
- [ ] There is no significant difference; they are implementation variations of the same concept.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Procedural control means sequential calls from a central function block, while
parallel control means independent blocks reacting to events/requests. The distinction is about
control flow organization, not threading, external orchestration, or implementation details.

</p>
</details>

---
