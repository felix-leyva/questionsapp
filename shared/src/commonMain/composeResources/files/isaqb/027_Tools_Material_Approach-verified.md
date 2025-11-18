## Question 1

For which part of a system are the tactical design building blocks of Domain-Driven Design (DDD)
primarily suitable?

- [ ] The presentation and user interface layer.
- [ ] The technical infrastructure and persistence layer.
- [x] The domain layer or domain core.
- [ ] All architectural layers uniformly and equally.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** DDD tactical building blocks are primarily suitable for the domain layer/core where
business logic resides. They're not optimized for presentation, infrastructure, or universal
application across all layers.

</p>
</details>

---

## Question 2

What are the two key metaphors in the "Tools and Materials" approach to pattern languages?

- [ ] Inputs and Outputs for data flow.
- [ ] Clients and Servers for distribution.
- [x] Tools and Materials.
- [ ] Processes and Data for decomposition.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The approach uses Tools and Materials as key metaphors. Input/Output, Client/Server,
and Process/Data are different architectural concerns or metaphors.

</p>
</details>

---

## Question 3

In the Tools and Materials approach, what does a "Tool" encapsulate?

- [ ] All persistent data structures and schemas.
- [ ] The database access and persistence logic.
- [x] All artifacts that provide a specific capability to the user, recognized as such by the user.
- [ ] The batch processing and background tasks.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Tools encapsulate artifacts providing specific user-recognizable capabilities. Data
structures, persistence logic, and background tasks are materials or infrastructure, not user-facing
tools.

</p>
</details>

---

## Question 4

What is the distinction between "Tools" and "Automatons" in the Tools and Materials approach?

- [ ] Tools serve developers while Automatons serve end users.
- [ ] Tools handle interactive tasks while Automatons handle data processing.
- [x] Tools provide specific capabilities to the user interactively, while Automatons perform
  non-interactively for the user.
- [ ] Tools are frontend components while Automatons are backend services.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Tools operate interactively while Automatons operate non-interactively, both serving
users but with different interaction models. Developer/user roles, data processing, and
frontend/backend don't define the distinction.

</p>
</details>

---

## Question 5

What are the three structural dimensions that an architectural style should ideally address,
according to the rule of thumb provided?

- [ ] Performance, Security, and Scalability qualities.
- [ ] Frontend, Backend, and Database tiers.
- [x] Domain modules, Technical hierarchy, and Pattern language.
- [ ] Requirements, Design, and Implementation phases.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Architectural style should address Domain modules (business structure), Technical
hierarchy (layers), and Pattern language (detail-level guidance). Performance/Security/Scalability
are quality attributes, Frontend/Backend/Database are deployment tiers,
Requirements/Design/Implementation are process phases.

</p>
</details>

---
