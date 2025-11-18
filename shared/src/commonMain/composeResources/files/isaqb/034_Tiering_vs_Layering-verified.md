## Question 1

What is the primary distinction between "layering" and "tiering" in software architecture?

- [ ] Layering refers to physical deployment while tiering refers to logical structure.
- [x] Layering refers to the purely logical structure of a system, while tiering refers to how the
  system is physically deployed and distributed.
- [ ] Layering concerns horizontal separation while tiering concerns vertical separation.
- [ ] There is no distinction; the terms are completely interchangeable.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Layering is purely logical structure; tiering is physical deployment distribution.
The distinction isn't reversed, about horizontal/vertical, or non-existent—it's about logical vs.
physical architecture.

</p>
</details>

---

## Question 2

In a typical three-tier architecture, where might a "cut" occur that goes through a logical layer,
rather than between them?

- [ ] Between the business logic and infrastructure layers cleanly.
- [x] Right through the presentation layer, separating, for example, the servlet/controller from the
  view.
- [ ] Between the application logic and business logic layers.
- [ ] Exclusively at the very top, above all logical layers.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Tiering cuts can slice through layers, e.g., presentation layer split between
server-side controller and client-side view. Cuts aren't restricted to layer boundaries—they serve
deployment needs.

</p>
</details>

---

## Question 3

What are the two main perspectives that influence decisions about tiering, as discussed in the text?

- [ ] Financial and legal compliance perspectives.
- [ ] Marketing and sales strategy perspectives.
- [x] The developer's perspective (e.g., accessibility, minimal overhead, ease of development) and
  the user's perspective (e.g., functionality, usability, performance).
- [ ] The hardware and software vendor perspectives.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Tiering balances developer perspective (accessibility, overhead, development ease)
with user perspective (functionality, usability, performance). Financial, marketing, and vendor
perspectives are secondary considerations.

</p>
</details>

---

## Question 4

What is the primary concern when making tiering decisions from the developer's perspective?

- [ ] How aesthetically appealing the user interface appears.
- [x] Accessibility, minimal overhead, and ease of development.
- [ ] The comprehensive marketing strategy for the software product.
- [ ] The long-term maintainability of core business logic.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Developer perspective prioritizes accessibility, minimal overhead, and development
ease for efficient implementation. UI aesthetics, marketing strategy, and business logic
maintainability are separate concerns.

</p>
</details>

---

## Question 5

What is the primary concern when making tiering decisions from the user's perspective?

- [ ] The internal code structure and modular organization.
- [x] Functionality, usability, and performance.
- [ ] The selection of programming languages and frameworks.
- [ ] The cost of underlying hardware infrastructure.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** User perspective focuses on functionality, usability, and performance—the experienced
system qualities. Code structure, language choices, and hardware costs are technical concerns
invisible to users.

</p>
</details>

---
