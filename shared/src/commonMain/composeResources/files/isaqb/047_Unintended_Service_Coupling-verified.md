## Question 1

What is the primary distinction between intentional and unintentional coupling in software systems?

- [ ] Intentional coupling is always beneficial, unintentional always detrimental.
- [x] Intentional coupling is a conscious design choice, while unintentional coupling often causes
  problems because it's unexpected and not thought about.
- [ ] Unintentional coupling is easier to fix than intentional coupling.
- [ ] Intentional coupling only occurs in monolithic system architectures.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Intentional coupling is conscious and designed; unintentional coupling is unexpected
and problematic. Neither type is always good/bad, unintentional isn't easier to fix, and intentional
coupling exists in all architectures.

</p>
</details>

---

## Question 2

What is a "time-related dependency" in the context of service coupling?

- [ ] When services communicate only at specific scheduled times.
- [x] When an application relies on another system being available outside its maintenance window,
  leading to issues if the other system is in a different time zone or undergoing maintenance.
- [ ] When services are synchronized using global clock mechanisms.
- [ ] When service performance depends on time of day.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Time-related dependency occurs when services depend on availability across time
zones/maintenance windows (e.g., New York system using Singapore service during Singapore's midnight
maintenance). Scheduled communication, clock sync, and performance variation are different concerns.

</p>
</details>

---

## Question 3

What is a "local dependency" and how can it be avoided?

- [ ] When an application relies on local file system storage.
- [x] When an application uses a specific address (e.g., IP address) to access a service, and this
  address changes, it can be avoided by using DNS or similar mechanisms.
- [ ] When an application is deployed on local server infrastructure.
- [ ] When an application depends on local user input validation.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Local dependency means hard-coded specific addresses (IP addresses) breaking when
addresses change; DNS/similar mechanisms avoid this. File systems, server location, and user input
are separate concerns.

</p>
</details>

---

## Question 4

What is an "implementation dependency" or "structural dependency" in the context of service
coupling?

- [ ] When a service relies on specific programming language features.
- [x] When an application bypasses an official interface to use an unofficial or internal
  implementation detail of another service, leading to breakage if the internal implementation
  changes.
- [ ] When a service depends on specific hardware architectures.
- [ ] When a service relies on specific public interface data structures.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Implementation/structural dependency means bypassing official interfaces for internal
details, risking breakage with implementation changes. Language, hardware, and public interface
structures are separate dependencies.

</p>
</details>

---

## Question 5

What is a "data dependency" in the context of service coupling?

- [ ] When an application relies on specific public interface data formats.
- [x] When an application makes assumptions about the format or content of data received from
  another service (e.g., expecting a numerical ID to always be numerical), leading to breakage if
  the format changes.
- [ ] When an application stores data in shared database instances.
- [ ] When an application depends on external data source availability.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Data dependency means format/content assumptions (e.g., always-numerical IDs)
breaking when formats change. Public interface formats, shared databases, and data availability are
different dependency types.

</p>
</details>

---

## Question 6

Which scenario best demonstrates a time zone-related service coupling issue?

- [ ] Two services in identical data centers communicating during business hours.
- [x] An application in New York depending on a service maintained in Singapore that goes offline
  for maintenance at midnight Singapore time (1 PM New York time).
- [ ] Services using different timestamp formats for logging purposes.
- [ ] An application with better performance during off-peak hours.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Time zone coupling: New York service failing when Singapore service enters midnight
maintenance window (midday New York). Same data center, timestamp formats, and performance
variations don't create time zone coupling.

</p>
</details>

---

## Question 7

What is the primary risk of making format assumptions about data from external services?

- [ ] Increased network latency when processing received data.
- [ ] Higher memory usage due to data validation overhead.
- [x] Application breakage when the external service changes its data format (e.g., from numerical
  to alphanumeric IDs).
- [ ] Reduced security due to data exposure vulnerabilities.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Format assumptions risk breakage when external services change formats (e.g.,
numerical to alphanumeric IDs after merger). Latency, memory, and security are separate concerns not
caused by format assumptions.

</p>
</details>

---
