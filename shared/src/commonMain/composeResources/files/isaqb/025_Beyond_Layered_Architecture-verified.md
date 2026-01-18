## Question 1

What is the primary characteristic of the "Pipes and Filters" architectural style?

- [ ] All functionality resides within a single monolithic component.
- [x] Independent filters are connected by pipes handling data flow.
- [ ] It optimizes specifically for graphical user interface design.
- [ ] Filters share internal state and maintain tight coupling.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Pipes and Filters encapsulates functionality in independent filters connected by pipes that handle only data flow. Monolithic components, GUI optimization, and tight coupling all contradict this decomposition pattern.

</p>
</details>

---

## Question 2

What is a key benefit of the Pipes and Filters architectural style, assuming compatible input/output formats?

- [ ] It eliminates all need for data format specifications.
- [ ] It creates dependencies on each filter's internal implementation.
- [x] Filters can be combined arbitrarily without needing to change a single filter.
- [ ] It only functions for systems lacking graphical interfaces.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** With compatible formats, filters can be recombined arbitrarily without modification, enabling flexibility. Format specifications are still needed, implementation dependencies would defeat the pattern, and it's not GUI-specific.

</p>
</details>

---

## Question 3

What is a common best practice emphasized for information systems with user interfaces, regarding component separation?

- [ ] To integrate business rules and technical tasks for cohesion.
- [ ] To consolidate all logic within user interface components only.
- [x] To separate domain components from purely technical ones.
- [ ] To eliminate component separation for development simplicity.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Best practice separates domain components (business requirements) from technical components (infrastructure tasks). Integration, UI consolidation, and elimination of separation all create problematic coupling.

</p>
</details>

---

## Question 4

What is the core idea behind Hexagonal Architecture (Ports and Adapters)?

- [ ] To consolidate all system logic into a single tightly coupled component.
- [ ] To mandate a specific database technology for persistence uniformity.
- [x] A core implements business rules; adapters provide technical integration.
- [ ] To ensure dependencies flow from technical layers inward to core.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Hexagonal Architecture has a business-rule core independent of infrastructure, with adapters providing technical integration from outside. Single components, mandated technologies, and inward technical dependencies contradict this pattern.

</p>
</details>

---

## Question 5

How does Hexagonal Architecture relate to Layered Architecture, according to the text?

- [ ] They are completely unrelated patterns serving different domains.
- [ ] Hexagonal architecture adds complexity beyond strict layering benefits.
- [x] Unfolded, it reveals two layers: dependency-free core and adapters.
- [ ] Hexagonal architecture universally replaces all layered architecture.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Unfolded, Hexagonal Architecture reveals two layers (dependency-free core, adapters using it) resembling two-dimensional layered architecture. They're related patterns, not unrelated, more complex, or universal replacements.

</p>
</details>

---

## Question 6

What is a potential drawback of the Pipes and Filters architectural style, despite its benefits?

- [ ] It mandates tight coupling between all filter components always.
- [x] Format compatibility requires explicit definition, not free.
- [ ] It only scales for systems with a single simple function.
- [ ] It actively prevents filter reuse across different contexts.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Format compatibility requires explicit definition—not free. The style encourages loose coupling, supports complex multi-filter systems, and enables filter reuse, not the opposites.

</p>
</details>

---

## Question 7

What is the misleading aspect of the naming convention for "pipes" in frameworks like AngularJS, compared to the architectural style?

- [ ] In AngularJS, "pipes" and "filters" have reversed meanings entirely.
- [x] Architectural filters perform actions; AngularJS calls them pipes.
- [ ] AngularJS pipes handle only data transformation, never data flow.
- [ ] Architectural pipes are synchronous while AngularJS pipes are async.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** In the architectural style, filters perform actions and pipes provide infrastructure; AngularJS confusingly calls processing components "pipes." The meanings aren't fully reversed, and synchrony isn't the distinguishing factor.

</p>
</details>

---

## Question 8

What is a key aspect of the architectural style called Quasar, regarding component classification?

- [ ] It classifies all components into binary categories: business or technical.
- [x] Three categories: A (business), T (technical), R (conversion); AT is bad.
- [ ] It exclusively focuses on user interface component taxonomy only.
- [ ] It avoids component classification entirely for maximum flexibility.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Quasar classifies components into A (business), T (technical), and R (conversion), with AT (mixed) considered problematic. It's not binary, UI-only, or classification-avoiding.

</p>
</details>

---

## Question 9

What was Alistair Cockburn's primary motivation for describing Hexagonal Architecture?

- [ ] To simplify database configuration across all application types.
- [x] To test business logic without database setup requirements.
- [ ] To introduce novel visualization techniques for layered architectures.
- [ ] To eliminate adapter requirements in distributed systems always.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Cockburn wanted to test business logic without database setup, enabled by infrastructure independence. Database simplification, visualization innovation, and adapter elimination weren't the primary motivations.

</p>
</details>

---

## Question 10

What are Onion Architecture and Clean Architecture considered to be, in relation to Hexagonal Architecture?

- [ ] Simplified, less comprehensive variants with reduced guidance.
- [x] More elaborate hexagonal variants with enhanced domain guidance.
- [ ] Entirely different patterns with no shared principles at all.
- [ ] Deprecated alternatives no longer recommended for use today.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Onion and Clean Architectures are more elaborate versions of Hexagonal Architecture with enhanced domain core guidance (book-length vs. article-length). They're neither simpler, unrelated, nor deprecated.

</p>
</details>

---
