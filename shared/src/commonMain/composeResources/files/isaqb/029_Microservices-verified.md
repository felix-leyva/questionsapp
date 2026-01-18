## Question 1

According to the text, what is the core definition of microservices?

- [ ] An application developed by a single small, cross-functional team only.
- [x] An application split into multiple independently deployed services.
- [ ] A system architecture where all components share a centralized database.
- [ ] A rapid prototyping methodology for agile software development teams.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Microservices means splitting applications into multiple independently deployed services cooperating for overall functionality. Single teams, shared databases, and rapid prototyping describe different concepts, not microservices architecture.

</p>
</details>

---

## Question 2

What is considered the most important trait of microservices, according to the text?

- [ ] Their capacity for independent horizontal scaling primarily.
- [x] Their autonomy, meaning services are deployed independently.
- [ ] Their utilization of a single consistent technology stack.
- [ ] Their strict conformance to a unified architectural style.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Microservices are primarily about autonomy—independent deployment and decoupling. Independent scaling is possible but not the most important trait; consistent technology and unified style contradict microservice flexibility principles.

</p>
</details>

---

## Question 6 (more than 1 might be correct)

Which aspects demonstrate microservice autonomy?

- [x] Independent deployment capability for each service
- [x] Decoupling in various technical aspects defined
- [x] Freedom from direct coupling to other services
- [ ] Shared database usage across all the services
- [ ] Synchronized deployment schedules for teams
- [ ] Identical technology stacks across all services

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Microservice autonomy manifests through independent deployment, technical decoupling, and freedom from service coupling. Shared databases, synchronized deployments, and identical stacks all violate autonomy principles.

</p>
</details>

---

## Question 3

How do microservices relate to the concept of two-dimensionally layered architecture?

- [ ] Microservices completely obsolete layered architecture principles.
- [ ] Microservices focus exclusively on technical layers, ignoring domains.
- [x] Domain modules become the leading dimension with secondary tech layers.
- [ ] Each microservice must strictly maintain identical technical layering.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** In microservices, domain modules become the primary dimension (top-level independently deployed), with technical layers secondary within services (potentially varying). Layered architecture isn't obsolete, domains aren't ignored, and layering needn't be identical.

</p>
</details>

---

## Question 7 (more than 1 might be correct)

In microservice architecture, which architectural dimensions have the following characteristics?

- [x] Domain modules form the top-level hierarchy
- [x] Domain modules are independently deployed services
- [x] Technical layers are secondary within each service
- [x] Technical layers may vary between services
- [ ] Technical layers must be identical across all
- [ ] Domain modules are secondary to technical org

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Microservices prioritize domain modules as top-level independently deployed hierarchies, with secondary technical layers that may vary per service. Identical technical layers and secondary domains contradict microservice architectural principles.

</p>
</details>

---

## Question 4

What principle, also relevant in non-distributed architectures, applies to dependencies between microservices?

- [ ] The principle of maximizing coupling for integration.
- [ ] The principle of mandatory shared database access.
- [x] The acyclic dependency principle applies here.
- [ ] The principle of hierarchical centralized control.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The acyclic dependency principle applies equally to microservices and non-distributed architectures, preventing dependency cycles. Strong coupling, shared databases, and centralized control contradict microservice decoupling principles.

</p>
</details>

---

## Question 5

What is a common pitfall for organizations regarding dependencies in microservice architectures?

- [ ] They make dependencies overly visible, causing analysis paralysis.
- [ ] They assume frameworks automatically manage all dependencies now.
- [x] They underestimate dependency impact, still affecting coupling.
- [ ] They over-invest in organizing dependencies into hierarchical form.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Organizations often underestimate dependencies in microservices—though less visible than monoliths, they still impact change propagation and coupling. Over-visibility, automatic management assumptions, and over-organization aren't the typical pitfalls.

</p>
</details>

---

## Question 8 (more than 1 might be correct)

Which statements about dependencies in microservice architectures are true?

- [x] Dependencies are less visible than in monolithic systems
- [x] Dependencies still impact change propagation directly
- [x] Dependencies continue to affect system coupling overall
- [x] Organizations often underestimate dependency complexity
- [ ] Dependencies are automatically managed by frameworks
- [ ] Dependencies become irrelevant in distributed systems

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Microservice dependencies are less visible but still impact change propagation and coupling, often underestimated by organizations. Frameworks don't automatically manage them, and they remain highly relevant, not irrelevant.

</p>
</details>

---

## Question 9

What is the primary benefit of microservices regarding independent scaling?

- [ ] It constitutes their most critical defining characteristic.
- [x] While possible, autonomy is more important than scaling.
- [ ] It only functions when all microservices use identical tech.
- [ ] It represents a theoretical feature rarely utilized at all.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Independent scaling is possible but autonomy is the most important microservice trait. It's not the defining characteristic, doesn't require identical technology, and is frequently used in practice.

</p>
</details>

---

## Question 10

What is the relationship between microservices and the "single responsibility principle"?

- [ ] Microservices architectures explicitly violate single responsibility.
- [x] Each microservice should focus on a single business capability.
- [ ] The single responsibility principle doesn't apply to microservices.
- [ ] Microservices intentionally combine multiple diverse responsibilities.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Microservices ideally follow single responsibility, focusing on single business capabilities through domain module organization. They don't violate it, remain subject to it, and shouldn't combine diverse responsibilities.

</p>
</details>

---
