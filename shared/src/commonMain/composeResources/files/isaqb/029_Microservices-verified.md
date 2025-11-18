## Question 1

According to the text, what is the core definition of microservices?

- [ ] An application developed by a single small, cross-functional team.
- [x] An application split into multiple independently deployed technical services that cooperate to
  deliver overall functionality.
- [ ] A system architecture where all components share a centralized database.
- [ ] A rapid prototyping methodology for agile software development.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Microservices means splitting applications into multiple independently deployed
services cooperating for overall functionality. Single teams, shared databases, and rapid
prototyping describe different concepts, not microservices architecture.

</p>
</details>

---

## Question 2

What is considered the most important trait of microservices, according to the text?

- [ ] Their capacity for independent horizontal scaling.
- [x] Their autonomy, meaning individual services are deployed independently and are decoupled in
  various aspects.
- [ ] Their utilization of a single consistent technology stack.
- [ ] Their strict conformance to a unified architectural style.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Microservices are primarily about autonomy—independent deployment and decoupling.
Independent scaling is possible but not the most important trait; consistent technology and unified
style contradict microservice flexibility principles.

</p>
</details>

---

## Question 6

Which aspects demonstrate microservice autonomy? (Select all that apply)

- [x] Independent deployment capability
- [x] Decoupling in various technical aspects
- [x] Freedom from direct coupling to other services
- [ ] Shared database usage
- [ ] Synchronized deployment schedules
- [ ] Identical technology stacks

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Microservice autonomy manifests through independent deployment, technical decoupling,
and freedom from service coupling. Shared databases, synchronized deployments, and identical stacks
all violate autonomy principles.

</p>
</details>

---

## Question 3

How do microservices relate to the concept of two-dimensionally layered architecture?

- [ ] Microservices completely obsolete layered architecture principles.
- [ ] Microservices focus exclusively on technical layers, ignoring domains.
- [x] With microservices, domain modules become the leading dimension, forming the top-level
  hierarchy of independently deployed services, while technical layers are secondary within each
  service.
- [ ] Each microservice must strictly maintain identical technical layering.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** In microservices, domain modules become the primary dimension (top-level
independently deployed), with technical layers secondary within services (potentially varying).
Layered architecture isn't obsolete, domains aren't ignored, and layering needn't be identical.

</p>
</details>

---

## Question 7

In microservice architecture, which architectural dimensions have the following characteristics?

- [x] Domain modules form the top-level hierarchy
- [x] Domain modules constitute independently deployed services
- [x] Technical layers are secondary within each service
- [x] Technical layers may vary between different services
- [ ] Technical layers must be identical across all services
- [ ] Domain modules are secondary to technical organization

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Microservices prioritize domain modules as top-level independently deployed
hierarchies, with secondary technical layers that may vary per service. Identical technical layers
and secondary domains contradict microservice architectural principles.

</p>
</details>

---

## Question 4

What principle, also relevant in non-distributed architectures, applies to dependencies between
microservices?

- [ ] The principle of maximizing coupling for integration.
- [ ] The principle of mandatory shared database access.
- [x] The acyclic dependency principle.
- [ ] The principle of hierarchical centralized control.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The acyclic dependency principle applies equally to microservices and non-distributed
architectures, preventing dependency cycles. Strong coupling, shared databases, and centralized
control contradict microservice decoupling principles.

</p>
</details>

---

## Question 5

What is a common pitfall for organizations regarding dependencies in microservice architectures?

- [ ] They make dependencies overly visible, causing analysis paralysis.
- [ ] They assume microservice frameworks automatically manage all dependencies.
- [x] They underestimate the impact of dependencies, which, though less visible than in monoliths,
  still affect change propagation and coupling.
- [ ] They over-invest in organizing dependencies into hierarchical structures.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Organizations often underestimate dependencies in microservices—though less visible
than monoliths, they still impact change propagation and coupling. Over-visibility, automatic
management assumptions, and over-organization aren't the typical pitfalls.

</p>
</details>

---

## Question 8

Which statements about dependencies in microservice architectures are true? (Select all that apply)

- [x] Dependencies are less visible than in monolithic systems
- [x] Dependencies still impact change propagation
- [x] Dependencies continue to affect system coupling
- [x] Organizations often underestimate dependency management complexity
- [ ] Dependencies are automatically managed by microservice frameworks
- [ ] Dependencies become irrelevant in distributed systems

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Microservice dependencies are less visible but still impact change propagation and
coupling, often underestimated by organizations. Frameworks don't automatically manage them, and
they remain highly relevant, not irrelevant.

</p>
</details>

---

## Question 9

What is the primary benefit of microservices regarding independent scaling?

- [ ] It constitutes their most critical defining characteristic.
- [x] While possible, it is not their most important trait; autonomy is.
- [ ] It only functions when all microservices use identical technology.
- [ ] It represents a theoretical feature rarely utilized in practice.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Independent scaling is possible but autonomy is the most important microservice
trait. It's not the defining characteristic, doesn't require identical technology, and is frequently
used in practice.

</p>
</details>

---

## Question 10

What is the relationship between microservices and the "single responsibility principle"?

- [ ] Microservices architectures explicitly violate single responsibility.
- [x] Each microservice should ideally adhere to the single responsibility principle, focusing on a
  single business capability.
- [ ] The single responsibility principle doesn't apply to microservices.
- [ ] Microservices intentionally combine multiple diverse responsibilities.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Microservices ideally follow single responsibility, focusing on single business
capabilities through domain module organization. They don't violate it, remain subject to it, and
shouldn't combine diverse responsibilities.

</p>
</details>

---
