## Question 1

What is the most widely used type of database for most applications, despite the emergence of newer paradigms?

- [ ] Hierarchical databases.
- [ ] Network databases.
- [x] Relational databases.
- [ ] Object-oriented databases.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Relational databases remain the workhorse for most applications despite newer paradigms. Hierarchical/network databases are legacy models, while object-oriented databases address specific OO integration needs but haven't replaced relational databases as the mainstream choice.

</p>
</details>

---

## Question 2

What is the main challenge when using relational databases with object-oriented programming languages?

- [ ] Relational databases are too slow for object-oriented applications.
- [ ] Relational databases do not support SQL queries properly.
- [x] Impedance mismatch requires mapping between objects and tables.
- [ ] Object-oriented languages cannot connect to relational databases.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Impedance mismatch between object structures and relational tables requires mapping software (ORMs). Performance, SQL support, and connectivity aren't the issues—the structural paradigm difference is the fundamental challenge.

</p>
</details>

---

## Question 3

What is the primary goal of object-oriented databases?

- [ ] To replace all relational databases with a new efficient model.
- [x] To seamlessly integrate with OO languages via transparent persistence.
- [ ] To store data in a hierarchical structure like legacy systems.
- [ ] To provide a key-value store for unstructured data storage.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Object-oriented databases make persistence transparent, creating seamless integration with OO languages. They're not about replacement, hierarchies (legacy model), or key-value storage (different NoSQL paradigm).

</p>
</details>

---

## Question 4

For what type of data structure are "Graph Databases" particularly well-suited?

- [ ] Simple key-value pairs.
- [ ] Highly structured tabular data.
- [x] Networks, such as power grids, social networks, or navigation data.
- [ ] Unstructured documents like tweets or articles.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Graph databases excel at network structures (power grids, social networks, navigation) with complex relationships. Key-value stores handle simple lookups, relational databases handle tabular data, and document databases handle semi-structured documents.

</p>
</details>

---

## Question 5

What is a key characteristic of "Document-Oriented Databases" that makes them suitable for data like tweets?

- [ ] They enforce strict relational integrity between all stored documents.
- [ ] They require all data to be stored in a flat, non-nested structure.
- [x] They allow semi-structured data with flexible references (hashtags).
- [ ] They are primarily designed for high-performance transactional work.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Document databases allow semi-structured data with flexible references (hashtags can reference non-existent items). They don't enforce relational integrity, support nested structures (not flat), and prioritize flexibility over strict ACID transactions.

</p>
</details>

---

## Question 6

What is the primary purpose of "mapping software" when using relational databases with object-oriented languages?

- [ ] To convert relational data into a different format for display.
- [x] To bridge the impedance mismatch between objects and relations.
- [ ] To optimize SQL queries for performance improvements.
- [ ] To provide a graphical user interface for database management.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Mapping software (ORMs) bridges the impedance mismatch between objects and relations. Data format conversion, query optimization, and GUI management are separate concerns, not the core purpose of object-relational mapping.

</p>
</details>

---

## Question 7

What is the core idea behind "Key-Value Stores"?

- [ ] To store data in a highly structured, relational format always.
- [x] To store data as simple key-value pairs with unique keys.
- [ ] To provide complex querying capabilities across multiple tables.
- [ ] To enforce strict data types for all stored values strictly.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Key-value stores provide simple unique-key lookups with flexible values. They don't enforce relational structure, complex querying (unlike relational databases), or strict typing (unlike strongly-typed databases).

</p>
</details>

---

## Question 8

For what type of data are "Column-Oriented Databases" particularly well-suited?

- [ ] Transactional data with frequent updates throughout.
- [x] Read-heavy analytical data like BI or data warehousing.
- [ ] Unstructured document data in various formats.
- [ ] Graph data with complex relationships between nodes.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Column-oriented databases excel at read-heavy analytical workloads (BI, data warehousing). Transactional systems need row-oriented databases, document databases handle semi-structured data, and graph databases handle network relationships.

</p>
</details>

---

## Question 9

What is the primary advantage of using a specialized database (like a Graph Database for graph data) instead of a general-purpose one?

- [ ] Specialized databases are always cheaper to operate.
- [x] They optimize for specific structures and access patterns.
- [ ] They eliminate the need for any data modeling efforts.
- [ ] They can store any type of data more efficiently always.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Specialized databases optimize for specific structures/access patterns (graph traversals for graph databases), improving performance and mapping. Cost, data modeling elimination, and universal efficiency aren't advantages—specialization trades generality for targeted optimization.

</p>
</details>

---
