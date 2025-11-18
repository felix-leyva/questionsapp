## Question 1

What is the defining characteristic of a "Peer-to-Peer" cooperation type?

- [ ] There is a central server controlling all communications.
- [x] All participants are directly connected as equal peers, and any peer can act as either a
  client or a server.
- [ ] Communication always flows unidirectionally, from client to server.
- [ ] Resources are never shared between network peers.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Peer-to-Peer means equal direct connections where peers can be clients or servers.
Central servers, unidirectional flow, and no resource sharing contradict P2P's distributed,
bidirectional, resource-sharing nature.

</p>
</details>

---

## Question 2

Which of the following are advantages of a Peer-to-Peer network?

- [ ] It always makes finding specific peers easy in large networks.
- [x] High reliability and the ability to share resources like CPU time and storage.
- [ ] It guarantees all peer replies are always correct.
- [ ] It simplifies error handling through centralization.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** P2P advantages: high reliability and resource sharing (CPU, storage). Finding peers
in large networks is challenging, peer correctness isn't guaranteed, and error handling is
distributed, not centralized.

</p>
</details>

---

## Question 3

What is a significant challenge in a large Peer-to-Peer network?

- [ ] Ensuring all peers have identical hardware specifications.
- [x] Finding the specific peer you are looking for, requiring complex routing algorithms.
- [ ] Preventing any peer from ever experiencing malfunctions.
- [ ] Limiting the number of resources that can be shared.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Large P2P networks challenge peer discovery, requiring complex routing algorithms (
think Internet scale). Hardware uniformity, malfunction prevention, and resource limitation aren't
P2P challenges.

</p>
</details>

---

## Question 4

What is the central concept of the "Blackboard" cooperation type?

- [ ] A system where all processing is done by single central components.
- [x] A central repository where knowledge is stored, and independent external knowledge sources
  contribute and retrieve information.
- [ ] A peer-to-peer network where all nodes have identical responsibilities.
- [ ] A system that only processes data in sequential manner.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Blackboard uses central repositories for knowledge storage with independent external
sources contributing/retrieving information. Single processing, peer equality, and sequential
processing contradict Blackboard's collaborative parallel nature.

</p>
</details>

---

## Question 5

What is a major disadvantage of the Blackboard cooperation type?

- [ ] It only suits very small data volumes.
- [ ] It prevents external knowledge sources from parallel work.
- [x] It requires a commitment to one common data model, which can be challenging to agree upon
  among multiple experts.
- [ ] It simplifies debugging and testing across knowledge sources.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Blackboard's disadvantage: agreeing on common data models among multiple experts is
challenging. It handles large data, enables parallel work, and complicates (not simplifies)
distributed debugging.

</p>
</details>

---

## Question 6

What is the primary characteristic of a "Client-Server" cooperation type?

- [ ] All participants are equal peers without distinction.
- [x] There is a clear distinction between clients (requesting services) and servers (providing
  services).
- [ ] Communication is always asynchronous without exceptions.
- [ ] Resources are shared directly between client instances.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Client-Server has clear client/server distinction: clients request, servers provide.
Peer equality, mandatory async communication, and client resource sharing contradict this
hierarchical pattern.

</p>
</details>

---

## Question 7

What is a key advantage of the Client-Server cooperation type?

- [ ] It allows for direct resource sharing between clients.
- [x] It simplifies management and security by centralizing services on the server.
- [ ] It eliminates the need for network infrastructure entirely.
- [ ] It ensures all clients have identical complete functionality.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Client-Server advantage: centralized server management and security simplification.
Client resource sharing, network elimination, and client functionality uniformity aren't
Client-Server characteristics.

</p>
</details>

---

## Question 8

What is the primary advantage of the Blackboard cooperation type?

- [ ] It simplifies the common data model requirements.
- [x] It allows independent knowledge sources to contribute and retrieve information, facilitating
  complex problem-solving.
- [ ] It ensures all knowledge sources are tightly coupled.
- [ ] It eliminates the need for any central repositories.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Blackboard advantage: independent knowledge sources facilitate complex collaborative
problem-solving. It complicates (not simplifies) data models, promotes loose (not tight) coupling,
and requires (not eliminates) central repositories.

</p>
</details>

---
