## Question 1

What is an architectural style, as defined in the text?

- [ ] A specific technology stack chosen for system implementation.
- [x] A general solution structure that is uniformly applied to the entire system with almost no
  exceptions, acting as a set of global rules.
- [ ] A design pattern applied locally to solve specific component problems.
- [ ] The aesthetic appearance and branding of the user interface.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Architectural style is a general solution structure applied globally across the
entire system with uniform rules. Technology stack, local patterns, and UI aesthetics are separate
concerns not defining architectural style.

</p>
</details>

---

## Question 2

What is the central rule of a layered architecture?

- [ ] Layers may depend on any other layer bidirectionally for flexibility.
- [ ] Dependencies flow only from lower technical layers toward upper layers.
- [x] Only dependencies from upper layers towards lower layers are allowed.
- [ ] Layers should always be bypassed for performance optimization.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Layered architecture's central rule: dependencies flow from upper to lower layers
only. Bidirectional dependencies, upward flows, and bypassing all violate this fundamental
organizing principle.

</p>
</details>

---

## Question 3

What does "strict layering" imply in a layered architecture?

- [ ] Layers may be bypassed when performance requirements demand it.
- [x] Layers must not be bypassed or skipped; every layer may only access the layer directly beneath
  it.
- [ ] All layers must use identical technologies and frameworks.
- [ ] The total number of layers is fixed and immutable.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Strict layering prohibits bypassing—each layer accesses only the layer directly
beneath it. Performance-based bypassing, technology uniformity, and fixed layer counts are separate
concepts not defining strict layering.

</p>
</details>

---

## Question 4

What is a significant advantage of layered architecture, particularly concerning design erosion and
cyclic dependencies?

- [ ] It eliminates all documentation requirements through self-evident structure.
- [ ] It guarantees optimal runtime performance across all scenarios.
- [x] It dramatically reduces the risk of building huge dependency cycles and limits the "blast
  radius" of design erosion to a single cell.
- [ ] It permits unconstrained component interaction for maximum flexibility.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Layered architecture reduces dependency cycles and contains design erosion to limited
areas (single cells in a matrix). It doesn't eliminate documentation, guarantee performance, or
permit unconstrained interaction.

</p>
</details>

---

## Question 5

What is "layer bridging" in the context of layered architecture?

- [ ] A technique to merge multiple layers into a consolidated super-layer.
- [ ] A code generation mechanism for automating interlayer communication.
- [x] A countermeasure to deficiencies of strict layering that explicitly allows layers to be
  skipped.
- [ ] A process to ensure all layers have identical size and complexity.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Layer bridging explicitly allows skipping layers, countering strict layering's
deficiencies. It's not about merging layers, code generation, or ensuring layer uniformity.

</p>
</details>

---

## Question 6

What is the primary characteristic of an architectural style regarding its application within a
system?

- [ ] It applies selectively to components requiring specific patterns.
- [x] It is a general solution structure uniformly applied to the entire system with almost no
  exceptions, acting as a set of global rules.
- [ ] It serves as optional guidance that teams may override when convenient.
- [ ] It focuses primarily on visual presentation and interface aesthetics.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Architectural style applies uniformly and globally across the entire system as a set
of mandatory rules. Selective application, optional guidance, and visual focus all mischaracterize
its comprehensive, structural nature.

</p>
</details>

---

## Question 7

What design heuristics and principles apply to layers in a layered architecture?

- [x] High cohesion.
- [x] Loose coupling.
- [x] Information hiding principle.
- [ ] Mandatory layer bypassing.
- [ ] Unrestricted bidirectional dependencies.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Layers should have high cohesion, loose coupling, and information hiding with clear
responsibilities and explicit interfaces. Layer bypassing and unrestricted dependencies violate
layered architecture principles.

</p>
</details>

---

## Question 8

What is the purpose of a "second dimension" of layering in a layered architecture, and how is it
typically arranged?

- [ ] To organize technical concerns like presentation and data, arranged vertically.
- [x] To separate concerns from the business domain, arranged from left to right.
- [ ] To enable layer bypassing through alternative routing paths.
- [ ] To consolidate all layers into a unified monolithic structure.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The second dimension separates business domain concerns, arranged left to right (in
left-to-right languages). Technical concerns form the first (vertical) dimension, not the second,
and it doesn't enable bypassing or monolithic consolidation.

</p>
</details>

---

## Question 9

What is a common disadvantage of layered architecture related to use cases and changes?

- [ ] It makes adding new features architecturally impossible.
- [x] The propagation of almost every use case through multiple layers, and some requirements
  causing changes in multiple places (e.g., adding a field to a form).
- [ ] It invariably creates severe runtime performance bottlenecks.
- [ ] It mandates that all layers be developed by a single team.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Layered architecture requires use cases to propagate through multiple layers, and
changes (like adding a field) affect multiple layers. It doesn't prevent features, invariably cause
bottlenecks, or dictate team structure.

</p>
</details>

---
