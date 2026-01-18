## Question 1

What is the primary advantage of using a "Shared Database" for application integration compared to file transfer, especially for frequent updates?

- [ ] It completely eliminates all data format negotiation requirements.
- [x] It provides immediate data consistency, as changes are visible to all applications the moment they are committed.
- [ ] It demands significantly less technical expertise to implement.
- [ ] It enables completely independent parallel application development.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Shared Databases provide immediate data consistency—committed changes are instantly visible to all applications. Format agreements are still needed, technical skills remain required, and development coordination increases.

</p>
</details>

---

## Question 2 (more than 1 might be correct)

Which of the following are advantages of using a Shared Database for integration?

- [x] Immediate data consistency.
- [ ] Reduced dependency on SQL drivers or ORM tools.
- [x] Ubiquitous access due to common SQL drivers and OR mappers.
- [x] Can encourage data cleanup and better modeling within the shared schema.
- [ ] Eliminates all semantic interpretation disagreements between applications.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Shared Database advantages: immediate consistency, ubiquitous SQL/ORM access, and encouraged data cleanup. It increases (not reduces) reliance on SQL tools and doesn't eliminate semantic dissonance.

</p>
</details>

---

## Question 3

What is a significant disadvantage of the Shared Database approach concerning encapsulation?

- [ ] It complicates cross-language database access significantly.
- [x] It breaks encapsulation because other applications see more of the internal data and schema than they actually need.
- [ ] It mandates each application maintain separate isolated databases.
- [ ] It inevitably creates disorganized database schema designs.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Shared Databases break encapsulation by exposing unnecessary internal data and schema details to consuming applications. Cross-language access is actually easier, not harder, and schemas can be organized.

</p>
</details>

---

## Question 4

What is the primary issue related to "coupling" when using a Shared Database for integration?

- [ ] It creates loose coupling facilitating easier independent changes.
- [x] It results in strong coupling, as changes to the shared schema in one application require changes everywhere else.
- [ ] It exclusively affects database-level coupling, not applications.
- [ ] It enables completely independent schema evolution per application.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Shared Databases create strong coupling—schema changes propagate to all consuming applications requiring coordinated updates. Coupling is tight, not loose, and affects applications directly.

</p>
</details>

---

## Question 5

In what scenario would a Shared Database integration NOT be feasible?

- [ ] When applications are developed by geographically distributed teams.
- [ ] When applications are co-located on identical server hardware.
- [x] When integrating with an external database system that is not accessible to your applications.
- [ ] When data consistency requirements are extremely high.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Shared Database integration requires database access—impossible with inaccessible external systems. Team distribution, server location, and consistency needs don't preclude shared database approaches.

</p>
</details>

---

## Question 6

What is a potential advantage of a Shared Database approach regarding data quality and modeling?

- [ ] It permits completely independent divergent data models per application.
- [x] It can encourage data cleanup and better modeling within the shared schema.
- [ ] It completely eliminates all data validation requirements.
- [ ] It actively promotes intentional data duplication across applications.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Shared schemas can drive data cleanup and improved modeling through visibility and shared responsibility. Models can't diverge, validation remains necessary, and duplication contradicts sharing.

</p>
</details>

---

## Question 7

What is "semantic dissonance" in the context of Shared Database integration?

- [ ] When database query response times exceed acceptable thresholds.
- [x] When different applications interpret the same data in the shared database differently, leading to misunderstandings.
- [ ] When the database schema complexity exceeds maintainability limits.
- [ ] When database accessibility constraints prevent universal application access.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Semantic dissonance occurs when applications interpret shared data differently despite identical schemas. Performance, complexity, and accessibility are separate concerns, not semantic interpretation issues.

</p>
</details>

---

## Question 8

What is a key challenge when using a Shared Database for integration, particularly when dealing with legacy systems?

- [ ] Legacy systems invariably maintain perfectly clean consistent data.
- [x] Legacy systems often have dirty data, and cleaning it up for a shared database can be a significant effort.
- [ ] Legacy systems seamlessly integrate with modern database platforms.
- [ ] Legacy systems universally operate without any database dependencies.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Legacy systems often contain dirty data requiring substantial cleanup for shared database integration. They don't have perfect data, easy integration, or database independence.

</p>
</details>

---
