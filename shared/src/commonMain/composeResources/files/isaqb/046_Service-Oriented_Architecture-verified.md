## Question 1

What is the primary reason for the existence of Service-Oriented Architecture (SOA), according to the text?

- [ ] To solve purely technical problems related to system performance.
- [x] To address business needs for flexible reuse of monolithic systems.
- [ ] To enable greenfield development without any legacy constraints.
- [ ] To reduce IT budgets by eliminating new feature development.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** SOA exists to address business problems—flexible reuse of existing monolithic systems for market responsiveness. It's not purely technical, greenfield-focused, or budget reduction through feature elimination.

</p>
</details>

---

## Question 2

Which of the following are key characteristics of services in a Service-Oriented Architecture?

- [ ] They are tightly coupled and centrally managed always.
- [x] They are integral units, loosely coupled, independently managed.
- [ ] They expose internal implementation details to all consumers.
- [ ] They are accessed exclusively through proprietary protocols.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** SOA services are integral units: loosely coupled, independently operated/managed/maintained, and encapsulated. They aren't tightly coupled, don't expose internals, and use open standards, not proprietary protocols.

</p>
</details>

---

## Question 6

Which of the following are key characteristics of services in SOA? (Select all that apply)

- [x] Designed as integral units
- [x] Loosely coupled
- [x] Independently operated
- [x] Independently managed and maintained
- [x] Encapsulated
- [ ] Tightly coupled
- [ ] Centrally managed

<details>
<summary>Rationale</summary>
<p>

**Rationale:** SOA services are integral units, loosely coupled, independently operated/managed/maintained, and encapsulated. Tight coupling and central management contradict SOA's distributed, autonomous service principles.

</p>
</details>

---

## Question 3

How do services in SOA typically expose their functionality to consumers?

- [ ] By allowing direct database access to internal data stores.
- [ ] Through legacy host-specific integration methods exclusively.
- [x] Using open standards (JSON, XML, SOAP, HTTP) with contracts.
- [ ] By providing graphical user interfaces for direct interaction.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** SOA services use modern open standards (JSON, XML, SOAP, HTTP) with service contracts describing functionality. Direct database access, legacy methods, and GUIs contradict SOA encapsulation and standardization principles.

</p>
</details>

---

## Question 4

What is the role of a "Service Directory" in SOA?

- [ ] It acts as a central broker mediating all service calls directly.
- [x] It's a repository where providers publish metadata for discovery.
- [ ] It directly implements business logic of services within.
- [ ] It monitors real-time performance of all services continuously.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Service Directories are repositories for service metadata enabling discovery (like yellow pages). They don't broker calls (SOA is direct after discovery), implement logic, or monitor performance.

</p>
</details>

---

## Question 5

How does the interaction between a service consumer and a service provider differ in SOA compared to the Broker pattern?

- [ ] In SOA, the service directory always mediates every call made.
- [ ] In the Broker pattern, there is no direct communication allowed.
- [x] SOA directory connects initially; then communication is direct.
- [ ] The Broker pattern is more modern than SOA for discovery.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** SOA directories only facilitate initial connection; subsequent communication is direct. Broker pattern keeps the broker in the middle for all calls—fundamentally different interaction models.

</p>
</details>

---

## Question 7

What is the primary purpose of the "service contract" in SOA?

- [ ] To define internal implementation details of services.
- [x] To precisely describe the functionality offered by the service's interface.
- [ ] To specify programming languages used by services.
- [ ] To manage service deployment procedures.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Service contracts precisely describe interface functionality, not internal details. Language specification and deployment management are separate concerns from contract definition.

</p>
</details>

---

## Question 8

What is the relationship between SOA and monolithic systems?

- [ ] SOA completely replaces monolithic systems.
- [x] SOA aims to reuse existing monolithic systems in a flexible way.
- [ ] SOA is a type of monolithic system.
- [ ] Monolithic systems cannot be integrated with SOA.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** SOA enables flexible reuse of existing monolithic systems, not replacement. SOA isn't monolithic, and monolithic systems can integrate with SOA through service wrapping.

</p>
</details>

---

## Question 9

What is the role of "encapsulation" in SOA services?

- [ ] Services expose all internal details.
- [x] Services hide their internal implementation details from consumers.
- [ ] Encapsulation is not a characteristic of SOA.
- [ ] Services only encapsulate data, not behavior.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** SOA services encapsulate (hide) internal implementation details from consumers. Exposing details, lacking encapsulation, or data-only encapsulation contradict SOA principles.

</p>
</details>

---
