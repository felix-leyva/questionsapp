## Question 1

What is a common problem teams encounter with the standard four technical layers in a layered architecture?

- [ ] The presentation layer accumulates excessive complexity.
- [x] The infrastructure layer becomes a pool of various utilities used from everywhere.
- [ ] The business logic layer shrinks to insignificant size.
- [ ] The application layer assumes too many disparate responsibilities.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The infrastructure layer commonly becomes a catch-all utility pool accessed from everywhere. While other layers may have issues, the text specifically identifies infrastructure as the typical problem area.

</p>
</details>

---

## Question 2

What is a proposed solution to the problem of the infrastructure layer becoming a catch-all?

- [ ] Remove the infrastructure layer and distribute its concerns elsewhere.
- [ ] Extract all infrastructure code into separate microservices always.
- [x] Move infrastructure to the second dimension at the bottom.
- [ ] Limit infrastructure layer access to a single designated layer only.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The solution is moving infrastructure to the second (domain) dimension at the bottom. Removing it, extracting to microservices, or single-layer access don't address the structural organization issue.

</p>
</details>

---

## Question 3

What was the consequence for a team that adopted Maven and had subsystems with cyclic dependencies?

- [ ] They successfully split all subsystems into independent Maven modules.
- [x] Cyclic subsystems were lumped together in one special module.
- [ ] Maven's dependency resolution automatically eliminated all cycles.
- [ ] The team reverted to their previous build system due to conflicts.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Subsystems with cyclic dependencies couldn't be properly split and were lumped into one module. Maven doesn't automatically resolve cycles, successful splitting didn't occur, and the team didn't abandon Maven.

</p>
</details>

---

## Question 4

What is a crucial factor for the layers of a layered architecture to be truly helpful?

- [ ] The selection of a specific programming language ecosystem.
- [ ] The use of exactly four layers, no more and no less.
- [x] The code must be distributed somewhat evenly over the layers.
- [ ] All layer access must follow strict layering without exceptions.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Code must be distributed somewhat evenly across layers for them to be helpful. Language choice, exact layer count, and strict vs. bridged layering don't determine whether layers are truly useful.

</p>
</details>

---

## Question 5

What does the example of the Maven team illustrate about build systems that forbid cycles?

- [ ] They automatically guarantee well-structured, maintainable systems.
- [ ] They alone are sufficient to ensure architectural quality always.
- [x] They don't guarantee structure without even code distribution.
- [ ] They constrain developers to write minimal code volumes only.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Cycle-forbidding build systems don't guarantee good structure without even code distribution across modules. They're necessary but not sufficient—distribution matters as much as acyclicity.

</p>
</details>

---

## Question 6

What are the four common technical layers typically found in a layered architecture, as mentioned in the text?

- [x] Presentation
- [x] Application Logic
- [x] Business Logic
- [x] Infrastructure
- [ ] Persistence
- [ ] Integration

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The four standard technical layers are Presentation, Application Logic, Business Logic, and Infrastructure. Persistence and Integration are concerns typically handled within Infrastructure or as cross-cutting aspects.

</p>
</details>

---

## Question 7

When combining technical layering (vertical) and domain layering (horizontal), what is the general rule for dependencies?

- [ ] Any layer may depend on any other without directional constraints.
- [ ] Technical layers only depend on other technical layers in same stack.
- [x] Dependencies flow upper to lower (vertical) and left to right.
- [ ] Domain layers exclusively depend on other domain layers only.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Combined layering maintains directional rules: upper to lower (vertical) and left to right (horizontal). Unconstrained dependencies, same-stack-only, and domain-only dependencies all violate these directional principles.

</p>
</details>

---

## Question 8

What is meant by the "blast radius" of design erosion in a layered architecture?

- [ ] The total codebase size measured in lines of code written.
- [x] The contained area where design problems remain localized.
- [ ] The velocity at which architectural changes propagate through.
- [ ] The count of developers impacted by a design defect.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** "Blast radius" refers to the contained area (e.g., single matrix cell) where design problems remain localized. It's not about codebase size, propagation velocity, or developer impact.

</p>
</details>

---

## Question 9

Is the propagation of a use case through multiple layers (e.g., adding a field to a form requiring changes in presentation, application, business, and infrastructure layers) considered a definite disadvantage of layered architecture?

- [ ] Yes, it invariably causes significant performance degradation issues.
- [ ] Yes, it demonstrates that the architecture is overly complex.
- [x] It's arguable; layers allow independent, order-agnostic changes.
- [ ] No, because layering simplifies initial development significantly.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Multi-layer propagation is arguable as a disadvantage—layers enable independent, order-agnostic implementation of the required changes. It's not definitely a performance issue, complexity indicator, or simplification of initial development.

</p>
</details>

---
