## Question 1

What is the most widely used type of database for most applications, despite the emergence of newer
paradigms?

- [ ] Hierarchical databases.
- [ ] Network databases.
- [x] Relational databases.
- [ ] Object-oriented databases.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Relational databases remain the workhorse for most applications despite newer
paradigms. Hierarchical/network databases are legacy models, while object-oriented databases address
specific OO integration needs but haven't replaced relational databases as the mainstream choice.

</p>
</details>

---

## Question 2

What is the main challenge when using relational databases with object-oriented programming
languages?

- [ ] Relational databases are too slow for object-oriented applications.
- [ ] Relational databases do not support SQL.
- [x] There is an impedance mismatch, requiring mapping software to bridge the gap between object
  structures and relational database structures.
- [ ] Object-oriented languages cannot connect to relational databases.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Impedance mismatch between object structures and relational tables requires mapping
software (ORMs). Performance, SQL support, and connectivity aren't the issues—the structural
paradigm difference is the fundamental challenge.

</p>
</details>

---

## Question 3

What is the primary goal of object-oriented databases?

- [ ] To replace all relational databases with a new, more efficient model.
- [x] To seamlessly integrate with object-oriented programming languages by making the boundary
  between in-memory objects and persistent storage transparent.
- [ ] To store data in a hierarchical structure.
- [ ] To provide a key-value store for unstructured data.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Object-oriented databases make persistence transparent, creating seamless integration
with OO languages. They're not about replacement, hierarchies (legacy model), or key-value storage (
different NoSQL paradigm).

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

**Rationale:** Graph databases excel at network structures (power grids, social networks,
navigation) with complex relationships. Key-value stores handle simple lookups, relational databases
handle tabular data, and document databases handle semi-structured documents.

</p>
</details>

---

## Question 5

What is a key characteristic of "Document-Oriented Databases" that makes them suitable for data like
tweets?

- [ ] They enforce strict relational integrity between all stored documents.
- [ ] They require all data to be stored in a flat, non-nested structure.
- [x] They allow for storing semi-structured data (like JSON, XML) within a document, and
  references (like hashtags) can exist even if the referenced item doesn't yet, without invalidating
  the document.
- [ ] They are primarily designed for high-performance transactional processing.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Document databases allow semi-structured data with flexible references (hashtags can
reference non-existent items). They don't enforce relational integrity, support nested structures (
not flat), and prioritize flexibility over strict ACID transactions.

</p>
</details>

---

## Question 6

What is the primary purpose of "mapping software" when using relational databases with
object-oriented languages?

- [ ] To convert relational data into a different format for display.
- [x] To bridge the impedance mismatch between object structures and relational database structures.
- [ ] To optimize SQL queries for performance.
- [ ] To provide a graphical user interface for database management.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Mapping software (ORMs) bridges the impedance mismatch between objects and relations.
Data format conversion, query optimization, and GUI management are separate concerns, not the core
purpose of object-relational mapping.

</p>
</details>

---

## Question 7

What is the core idea behind "Key-Value Stores"?

- [ ] To store data in a highly structured, relational format.
- [x] To store data as a simple key-value pair, where the key is unique and the value can be
  anything.
- [ ] To provide complex querying capabilities across multiple tables.
- [ ] To enforce strict data types for all stored values.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Key-value stores provide simple unique-key lookups with flexible values. They don't
enforce relational structure, complex querying (unlike relational databases), or strict typing (
unlike strongly-typed databases).

</p>
</details>

---

## Question 8

For what type of data are "Column-Oriented Databases" particularly well-suited?

- [ ] Transactional data with frequent updates.
- [x] Data that is primarily read and analyzed, such as for business intelligence or data
  warehousing.
- [ ] Unstructured document data.
- [ ] Graph data with complex relationships.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Column-oriented databases excel at read-heavy analytical workloads (BI, data
warehousing). Transactional systems need row-oriented databases, document databases handle
semi-structured data, and graph databases handle network relationships.

</p>
</details>

---

## Question 9

What is the primary advantage of using a specialized database (like a Graph Database for graph data)
instead of a general-purpose one?

- [ ] Specialized databases are always cheaper.
- [x] They are optimized for specific data structures and access patterns, leading to better
  performance and easier mapping.
- [ ] They eliminate the need for any data modeling.
- [ ] They can store any type of data more efficiently.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Specialized databases optimize for specific structures/access patterns (graph
traversals for graph databases), improving performance and mapping. Cost, data modeling elimination,
and universal efficiency aren't advantages—specialization trades generality for targeted
optimization.

</p>
</details>

---
