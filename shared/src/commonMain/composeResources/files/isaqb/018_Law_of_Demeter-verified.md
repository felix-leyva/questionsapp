## Question 1

What is the core idea behind the Law of Demeter, also known as the principle of discretion?

- [ ] A service should expose its implementation details for transparency.
- [ ] A client should understand all internal dependencies to optimize.
- [x] A service hides how it works; clients delegate without sub-calls.
- [ ] A service should allow clients to navigate deep object hierarchies.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Law of Demeter says services hide their implementation; clients delegate completely without orchestrating sub-calls ("don't talk to strangers"). Exposing details, understanding internals, and navigating hierarchies all violate this encapsulation principle.

</p>
</details>

---

## Question 2

Why is the following code example considered a violation of the Law of Demeter?
`get_student_record().get_exam_entry(semester)`

- [ ] Because the method names don't follow standard naming conventions.
- [x] Because the client traverses internal object structure, creating coupling.
- [ ] Because passing parameters through chained calls reduces performance.
- [ ] Because fluent interfaces always indicate poor design quality overall.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** This violates Law of Demeter by exposing and traversing internal object structure, creating tight coupling to implementation details. Method names, performance, and fluent interface quality are separate concerns.

</p>
</details>

---

## Question 3

How does the improved implementation, which follows the Law of Demeter, differ from the violating one?

- [ ] It merges all related objects into a single aggregate root class.
- [ ] It eliminates all methods, using only public properties for access.
- [x] The client delegates to a single Student method orchestrating calls.
- [ ] It exposes internal objects as public fields for direct access.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The proper approach delegates the complete operation to a single Student method that orchestrates internal calls. Merging classes, eliminating methods, and exposing internals all fail to address the encapsulation issue.

</p>
</details>

---

## Question 4

In which situation is a fluent interface considered a good idea, according to the text?

- [ ] When creating tight coupling is desirable for performance optimization.
- [ ] For all method chains regardless of their purpose or domain used.
- [x] For methods with many parameters where semantics need clarity.
- [ ] When exposing the complete internal state of domain objects.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Fluent interfaces are acceptable for multi-parameter methods where they clarify semantics (e.g., date construction) without exposing internals. Universal application, tight coupling, and exposing state all misuse the pattern.

</p>
</details>

---

## Question 5

What is the key difference between a good fluent interface (like the date constructor example) and one that violates the Law of Demeter?

- [ ] The good fluent interface uses descriptive method names for clarity.
- [x] Good fluent interfaces don't expose internals; violating ones do.
- [ ] Good fluent interfaces return immutable objects; violating mutate.
- [ ] There is no fundamental difference; all fluent interfaces violate it.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Good fluent interfaces don't expose internal implementation; violating ones do. Method naming, immutability, and blanket prohibition are not the distinguishing factors—implementation hiding is.

</p>
</details>

---

## Question 6

What is the relationship between a service provider and a client when delegation occurs?

- [ ] The service provider must expose all sub-services to enable optimization.
- [x] Providers use other services internally while appearing unified to clients.
- [ ] The client orchestrates all downstream service calls for maximum control.
- [ ] Delegation creates circular dependencies that should always be avoided.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** In delegation, service providers internally use other services while presenting a unified interface to clients. Exposing sub-services, client orchestration, and avoiding delegation all contradict proper delegation patterns.

</p>
</details>

---

## Question 7

What is the primary consequence of violating the Law of Demeter, as illustrated by the `get_student_record().get_exam_entry(semester)` example?

- [ ] It improves code readability through explicit dependency chains.
- [x] It creates tight coupling to internal structures, hindering maintenance.
- [ ] It optimizes performance by reducing method call overhead significantly.
- [ ] It simplifies unit testing by exposing all dependencies directly.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Violating Law of Demeter creates tight coupling to internal structures, hindering change and maintenance. It doesn't improve readability, performance, or testability—it complicates all three.

</p>
</details>

---

## Question 8

What is the general rule for clients and service providers to follow the Law of Demeter?

- [ ] Clients should understand all implementation details for informed usage.
- [x] Clients don't delegate to sub-objects; providers hide internal structure.
- [ ] Service providers should document and expose their internal architecture.
- [ ] Clients should traverse object graphs for maximum flexibility always.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Law of Demeter rule: clients don't delegate to sub-objects, providers don't expose internal structure. Understanding details, exposing architecture, and traversing graphs all violate this encapsulation principle.

</p>
</details>

---
