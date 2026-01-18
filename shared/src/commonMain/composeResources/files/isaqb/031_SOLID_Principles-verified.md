## Question 1

What is the primary purpose of the SOLID principles, despite debates about their classification as "principles"?

- [ ] To provide inflexible formal rules for development that cannot be violated.
- [ ] To prescribe exact programming languages and frameworks for use.
- [x] To serve as heuristics improving maintainability and design quality.
- [ ] To mandate that all software must be developed by large teams.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** SOLID principles serve as design heuristics and thought-provoking challenges improving maintainability and quality. They're not inflexible rules, language prescriptions, or team organization mandates—they're guidelines for better design.

</p>
</details>

---

## Question 2

What is a practical interpretation of the Single Responsibility Principle (SRP) suggested in the text?

- [ ] A class must contain exactly one method, no more than that.
- [ ] A class should remain completely immutable once created.
- [x] Purpose explainable in one sentence without using "and."
- [ ] A building block should encompass all aspects of a feature.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Practical SRP: explain purpose in one sentence without "and"—if possible, single responsibility likely achieved. One method, immutability, and feature completeness are different concerns not defining single responsibility.

</p>
</details>

---

## Question 3

What does the Open-Closed Principle (OCP) propose for designing building blocks?

- [ ] They should be open for modification and closed for extension.
- [ ] They should be simultaneously open for both modification and extension.
- [x] They should be closed for modification but open for extension from the outside.
- [ ] They should be permanently closed to any changes post-implementation.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** OCP: closed for modification but open for extension—extend behavior externally without modifying existing code. Reversed (open/closed), both open, or permanently closed all miss the principle's careful balance.

</p>
</details>

---

## Question 4

What is the core requirement of the Liskov Substitution Principle (LSP)?

- [ ] Subclasses must always occupy less memory than superclasses do.
- [ ] Subclasses must override every single method from superclasses.
- [x] Subclasses must be valid replacements usable interchangeably.
- [ ] Subclasses should introduce behavior unrelated to superclasses.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** LSP requires subclasses to be valid superclass replacements, usable interchangeably without breaking code. Memory size, overriding all methods, and unrelated behavior aren't LSP requirements—behavioral substitutability is.

</p>
</details>

---

## Question 5

What is the main idea behind the Interface Segregation Principle (ISP)?

- [ ] Interfaces should be maximally broad to serve all possible clients.
- [ ] Interfaces should contain only methods implemented by all clients.
- [x] Expose smaller client-specific interfaces rather than broad ones.
- [ ] Interfaces should be completely hidden from clients to decouple.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** ISP advocates smaller client-specific interfaces over single broad interfaces, reducing friction from changes. Broad interfaces, universal implementation, and hiding interfaces all contradict ISP's client-tailored approach.

</p>
</details>

---

## Question 6

What does the "S" in SOLID stand for?

- [ ] Scalability
- [x] Single Responsibility Principle
- [ ] Security
- [ ] Simplicity

<details>
<summary>Rationale</summary>
<p>

**Rationale:** "S" stands for Single Responsibility Principle. Scalability, Security, and Simplicity are valuable software qualities but don't represent "S" in SOLID.

</p>
</details>

---

## Question 7

What does the "O" in SOLID stand for?

- [ ] Object-Oriented
- [x] Open-Closed Principle
- [ ] Optimization
- [ ] Operations

<details>
<summary>Rationale</summary>
<p>

**Rationale:** "O" stands for Open-Closed Principle. Object-Oriented, Optimization, and Operations relate to software development but don't represent "O" in SOLID.

</p>
</details>

---

## Question 8

What does the "L" in SOLID stand for?

- [ ] Layering
- [x] Liskov Substitution Principle
- [ ] Logging
- [ ] Loose Coupling

<details>
<summary>Rationale</summary>
<p>

**Rationale:** "L" stands for Liskov Substitution Principle. Layering, Logging, and Loose Coupling are architectural concepts but don't represent "L" in SOLID.

</p>
</details>

---

## Question 9

What does the "I" in SOLID stand for?

- [ ] Inheritance
- [x] Interface Segregation Principle
- [ ] Integration
- [ ] Immutability

<details>
<summary>Rationale</summary>
<p>

**Rationale:** "I" stands for Interface Segregation Principle. Inheritance, Integration, and Immutability are programming concepts but don't represent "I" in SOLID.

</p>
</details>

---

## Question 10

What does the "D" in SOLID stand for?

- [ ] Delegation
- [x] Dependency Inversion Principle
- [ ] Documentation
- [ ] Data Modeling

<details>
<summary>Rationale</summary>
<p>

**Rationale:** "D" stands for Dependency Inversion Principle. Delegation, Documentation, and Data Modeling are development practices but don't represent "D" in SOLID.

</p>
</details>

---
