## Question 1

What is the key concept of Remote Procedure Invocation (RPI) for application integration?

- [ ] Moving data across networks to enable local computational processing.
- [x] Accessing functionality on a remote server, where the calculations are performed, rather than
  moving data.
- [ ] Sharing common database schemas between distributed applications.
- [ ] Transferring files between applications using shared file systems.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** RPI shares functionality remotely—calculations occur server-side, not locally. Moving
data for local processing, shared databases, and file transfer represent different integration
patterns.

</p>
</details>

---

## Question 2

Which of the following are advantages of using Remote Procedure Invocation?

- [ ] It guarantees perpetual remote server availability.
- [x] Functionality gets reused, avoiding code duplication.
- [ ] It completely eliminates all network latency concerns.
- [x] Data is fully encapsulated on the remote side, reducing coupling.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** RPI advantages: functionality reuse (avoiding duplication) and data encapsulation (
reducing coupling). It doesn't guarantee server availability or eliminate network latency—those are
inherent distributed system challenges.

</p>
</details>

---

## Question 3

What is a significant disadvantage of Remote Procedure Invocation concerning server availability?

- [ ] The remote server can remain offline without impacting calling applications.
- [x] If the remote server is not up, the calling application cannot access the functionality and
  cannot perform the task on its own.
- [ ] The remote server automatically scales to accommodate any workload.
- [ ] The remote server only requires availability during deployment phases.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** RPI creates server dependency—unavailable servers block functionality since calling
applications lack local data/logic. Servers don't auto-scale, and continuous availability is
required, not just during deployment.

</p>
</details>

---

## Question 4

What is a potential performance issue with RPI?

- [ ] It universally performs faster than local execution alternatives.
- [x] High latency and delays can occur because data is not local and must be retrieved over the
  network.
- [ ] It mandates dedicated high-speed local network connections.
- [ ] Performance degrades exclusively when remote servers are underutilized.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** RPI suffers from network latency since data retrieval requires network round-trips.
It's not universally faster, doesn't require special networks, and latency exists regardless of
server utilization.

</p>
</details>

---

## Question 5

How do cyclic dependencies manifest in the context of RPI, and what is their impact?

- [ ] They invariably improve overall system performance.
- [ ] They are automatically detected and resolved by RPI frameworks.
- [x] They can occur between applications, leading to deadlocks that are difficult to disentangle,
  similar to cycles between other building blocks.
- [ ] They exclusively affect data format specifications, not logic.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Cyclic RPI dependencies cause deadlocks between applications, as difficult to resolve
as cycles between code modules. They don't improve performance, aren't auto-resolved, and affect
application logic.

</p>
</details>

---

## Question 6

What is the primary benefit of RPI regarding data encapsulation?

- [ ] Data is systematically duplicated across all participating applications.
- [x] Data is fully encapsulated on the remote side, reducing coupling between applications.
- [ ] Data is always transferred to clients for local processing.
- [ ] Data is centrally stored in shared database infrastructure.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** RPI encapsulates data remotely—clients don't access internal data structures,
reducing coupling. Data isn't duplicated, transferred locally, or stored in shared databases.

</p>
</details>

---

## Question 7

What is a key challenge with RPI when the remote server is not available?

- [ ] The calling application continues functioning using cached local data.
- [x] The calling application cannot access the functionality and cannot perform the task on its
  own.
- [ ] The RPI framework automatically redirects calls to backup servers.
- [ ] The remote server automatically restarts and recovers operations.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Without server availability, calling applications cannot proceed—no local data or
functionality exists. Frameworks don't automatically redirect, cache, or restart servers.

</p>
</details>

---

## Question 8

What is the impact of network latency on RPI performance?

- [ ] Network latency has zero measurable impact on RPI.
- [x] High latency and delays can occur because data is not local and must be retrieved over the
  network.
- [ ] RPI architecture is specifically designed to eliminate latency.
- [ ] Network latency only affects initial connection establishment.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Network latency directly impacts RPI—every remote call incurs network overhead. RPI
doesn't eliminate latency, and latency affects all calls, not just initial connections.

</p>
</details>

---
