## Question 1

What is the primary purpose of using "views" when documenting software architecture?

- [ ] To make the documentation longer and more detailed.
- [ ] To hide information from certain stakeholders.
- [x] To provide stakeholder-specific abstractions of the system, focusing only on relevant aspects
  for each stakeholder.
- [ ] To create a single, monolithic document that covers everything.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Views provide stakeholder-specific abstractions focusing on relevant aspects (
property owner sees rooms, structural engineer sees bearing walls). Length, hiding information, and
monolithic documents all contradict views' targeted clarity purpose.

</p>
</details>

---

## Question 2

Using the analogy of building a house, what would be the focus of the property owner's view?

- [ ] The strength of the bearing walls.
- [x] The functional aspects, such as room layout and ensuring spaces are suitable for their
  purpose (e.g., living room size for a sofa).
- [ ] The type of electrical wiring used.
- [ ] The material used for the roof.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Property owners focus on functional aspects—room layout, sizes for furniture. Bearing
walls (structural engineer), wiring (electrician), and roofing (roofer) are other stakeholders'
concerns, not the owner's functional view.

</p>
</details>

---

## Question 3

What is the main concern of a structural engineer's view of a house?

- [ ] The color of the paint on the walls.
- [x] The stability of the house, specifically the bearing walls.
- [ ] The placement of electrical outlets.
- [ ] The type of flooring in each room.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Structural engineers focus on stability—bearing wall strength. Paint colors (
decorator), outlet placement (electrician), and flooring (installer) are irrelevant to structural
stability concerns.

</p>
</details>

---

## Question 4

Why are interdisciplinary overlaps and references between different views essential?

- [ ] To make the documentation more complex and difficult to understand.
- [ ] To ensure that each stakeholder works in complete isolation.
- [x] To enable effective collaboration and avoid issues like thermal bridges (in the house analogy)
  or other inconsistencies.
- [ ] To reduce the total number of views required.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Overlaps enable collaboration to avoid issues like thermal bridges (facade/insulation
coordination). Complexity, isolation, and view reduction all contradict overlaps' integration and
consistency purposes.

</p>
</details>

---

## Question 5

What is a fundamental requirement for all views of an architecture?

- [ ] They must all be identical in content.
- [ ] They must contradict each other to show different perspectives.
- [x] They must be overall consistent and not contradict each other, as they represent different
  aspects of the same reality.
- [ ] They must be generated automatically from the source code.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Views must be consistent, representing different aspects of one reality (same house,
different stakeholder perspectives). Identical content, contradictions, and automatic generation all
miss views' complementary consistency requirement.

</p>
</details>

---

## Question 6

What is the primary purpose of architecture documentation, as illustrated by the house analogy?

- [ ] To provide a single, all-encompassing blueprint for construction.
- [x] To provide different, stakeholder-specific abstractions of the system, each focusing on
  relevant aspects.
- [ ] To replace the need for communication between different trades.
- [ ] To ensure that only one person understands the entire project.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Documentation provides stakeholder-specific abstractions (owner's functional,
engineer's structural). Single blueprints, communication replacement, and single-person
understanding all contradict multi-stakeholder collaboration needs.

</p>
</details>

---
