## Question 1

What is the primary characteristic of the "Pipes and Filters" architectural style?

- [ ] All functionality resides within a single monolithic component.
- [x] Functionality is encapsulated in independent "filters" connected by "pipes" that only handle
  data flow.
- [ ] It optimizes specifically for graphical user interface design.
- [ ] Filters share internal state and maintain tight coupling.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Pipes and Filters encapsulates functionality in independent filters connected by
pipes that handle only data flow. Monolithic components, GUI optimization, and tight coupling all
contradict this decomposition pattern.

</p>
</details>

---

## Question 2

What is a key benefit of the Pipes and Filters architectural style, assuming compatible input/output
formats?

- [ ] It eliminates all need for data format specifications.
- [ ] It creates dependencies on each filter's internal implementation.
- [x] Filters can be combined arbitrarily without needing to change a single filter.
- [ ] It only functions for systems lacking graphical interfaces.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** With compatible formats, filters can be recombined arbitrarily without modification,
enabling flexibility. Format specifications are still needed, implementation dependencies would
defeat the pattern, and it's not GUI-specific.

</p>
</details>

---

## Question 3

What is a common best practice emphasized for information systems with user interfaces, regarding
component separation?

- [ ] To integrate business rules and technical tasks for cohesion.
- [ ] To consolidate all logic within user interface components.
- [x] To separate components that reflect business requirements (domain) from those that perform
  purely technical tasks.
- [ ] To eliminate component separation for development simplicity.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Best practice separates domain components (business requirements) from technical
components (infrastructure tasks). Integration, UI consolidation, and elimination of separation all
create problematic coupling.

</p>
</details>

---

## Question 4

What is the core idea behind Hexagonal Architecture (Ports and Adapters)?

- [ ] To consolidate all system logic into a single tightly coupled component.
- [ ] To mandate a specific database technology for persistence uniformity.
- [x] A core implements business rules independent of technical infrastructure, with "adapters"
  added from the outside for technical integration.
- [ ] To ensure dependencies flow from technical layers inward to business logic.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Hexagonal Architecture has a business-rule core independent of infrastructure, with
adapters providing technical integration from outside. Single components, mandated technologies, and
inward technical dependencies contradict this pattern.

</p>
</details>

---

## Question 5

How does Hexagonal Architecture relate to Layered Architecture, according to the text?

- [ ] They are completely unrelated patterns serving different domains.
- [ ] Hexagonal architecture adds complexity beyond strict layering benefits.
- [x] If unfolded, Hexagonal Architecture can be seen as having two layers: a domain core with no
  dependencies, and adapters that use this core, similar to a two-dimensional layered architecture
  for different integration concerns.
- [ ] Hexagonal architecture universally replaces all layered architecture forms.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Unfolded, Hexagonal Architecture reveals two layers (dependency-free core, adapters
using it) resembling two-dimensional layered architecture. They're related patterns, not unrelated,
more complex, or universal replacements.

</p>
</details>

---

## Question 6

What is a potential drawback of the Pipes and Filters architectural style, despite its benefits?

- [ ] It mandates tight coupling between all filter components.
- [x] Compatibility of input/output formats does not come for free and requires definition, implying
  a shared understanding or format.
- [ ] It only scales for systems with a single simple function.
- [ ] It actively prevents filter reuse across different contexts.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Format compatibility requires explicit definition—not free. The style encourages
loose coupling, supports complex multi-filter systems, and enables filter reuse, not the opposites.

</p>
</details>

---

## Question 7

What is the misleading aspect of the naming convention for "pipes" in frameworks like AngularJS,
compared to the architectural style?

- [ ] In AngularJS, "pipes" and "filters" have reversed meanings.
- [x] In the architectural style, the filter is the component performing actions and the pipe is
  infrastructure for data flow, whereas in AngularJS, the component holding processing logic is
  called a pipe.
- [ ] AngularJS pipes handle only data transformation, never data flow.
- [ ] Architectural pipes are always synchronous while AngularJS pipes are asynchronous.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** In the architectural style, filters perform actions and pipes provide infrastructure;
AngularJS confusingly calls processing components "pipes." The meanings aren't fully reversed, and
synchrony isn't the distinguishing factor.

</p>
</details>

---

## Question 8

What is a key aspect of the architectural style called Quasar, regarding component classification?

- [ ] It classifies all components into binary categories: business or technical.
- [x] It classified all components into three categories: A (pure business logic), T (technical
  components), and R (converting from A to T and vice versa), with AT (mixed concerns) considered
  problematic.
- [ ] It exclusively focuses on user interface component taxonomy.
- [ ] It avoids component classification entirely for flexibility.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Quasar classifies components into A (business), T (technical), and R (conversion),
with AT (mixed) considered problematic. It's not binary, UI-only, or classification-avoiding.

</p>
</details>

---

## Question 9

What was Alistair Cockburn's primary motivation for describing Hexagonal Architecture?

- [ ] To simplify database configuration across all application types.
- [x] To be able to test the primary business logic of applications without having to set up a
  database.
- [ ] To introduce novel visualization techniques for layered architectures.
- [ ] To eliminate adapter requirements in distributed systems.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Cockburn wanted to test business logic without database setup, enabled by
infrastructure independence. Database simplification, visualization innovation, and adapter
elimination weren't the primary motivations.

</p>
</details>

---

## Question 10

What are Onion Architecture and Clean Architecture considered to be, in relation to Hexagonal
Architecture?

- [ ] Simplified, less comprehensive variants with reduced guidance.
- [x] Much more elaborate hexagonal architectures, providing more guidance on structuring the domain
  core.
- [ ] Entirely different patterns with no shared principles.
- [ ] Deprecated alternatives no longer recommended for use.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Onion and Clean Architectures are more elaborate versions of Hexagonal Architecture
with enhanced domain core guidance (book-length vs. article-length). They're neither simpler,
unrelated, nor deprecated.

</p>
</details>

---
