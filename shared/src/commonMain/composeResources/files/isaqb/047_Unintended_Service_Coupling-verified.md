## Question 1

What is the primary distinction between intentional and unintentional coupling in software systems?

- [ ] Intentional coupling is always beneficial, unintentional always detrimental.
- [x] Intentional coupling is conscious design; unintentional is unexpected.
- [ ] Unintentional coupling is easier to fix than intentional coupling.
- [ ] Intentional coupling only occurs in monolithic system architectures.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Intentional coupling is conscious and designed; unintentional coupling is unexpected and problematic. Neither type is always good/bad, unintentional isn't easier to fix, and intentional coupling exists in all architectures.

</p>
</details>

---

## Question 2

What is a "time-related dependency" in the context of service coupling?

- [ ] When services communicate only at specific scheduled times daily.
- [x] When an application relies on another system outside its maintenance window.
- [ ] When services are synchronized using global clock mechanisms always.
- [ ] When service performance depends on time of day significantly.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Time-related dependency occurs when services depend on availability across time zones/maintenance windows (e.g., New York system using Singapore service during Singapore's midnight maintenance). Scheduled communication, clock sync, and performance variation are different concerns.

</p>
</details>

---

## Question 3

What is a "local dependency" and how can it be avoided?

- [ ] When an application relies on local file system storage paths.
- [x] When an application uses a specific IP address that changes; use DNS.
- [ ] When an application is deployed on local server infrastructure.
- [ ] When an application depends on local user input validation rules.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Local dependency means hard-coded specific addresses (IP addresses) breaking when addresses change; DNS/similar mechanisms avoid this. File systems, server location, and user input are separate concerns.

</p>
</details>

---

## Question 4

What is an "implementation dependency" or "structural dependency" in the context of service coupling?

- [ ] When a service relies on specific programming language features used.
- [x] When an application bypasses official interfaces to use internal details.
- [ ] When a service depends on specific hardware architectures deployed.
- [ ] When a service relies on specific public interface data structures.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Implementation/structural dependency means bypassing official interfaces for internal details, risking breakage with implementation changes. Language, hardware, and public interface structures are separate dependencies.

</p>
</details>

---

## Question 5

What is a "data dependency" in the context of service coupling?

- [ ] When an application relies on specific public interface data formats.
- [x] When an application assumes data format, breaking if format changes.
- [ ] When an application stores data in shared database instances only.
- [ ] When an application depends on external data source availability.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Data dependency means format/content assumptions (e.g., always-numerical IDs) breaking when formats change. Public interface formats, shared databases, and data availability are different dependency types.

</p>
</details>

---

## Question 6

Which scenario best demonstrates a time zone-related service coupling issue?

- [ ] Two services in identical data centers communicating during business hours.
- [x] A New York application depending on Singapore service offline at midnight.
- [ ] Services using different timestamp formats for logging purposes always.
- [ ] An application with better performance during off-peak hours observed.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Time zone coupling: New York service failing when Singapore service enters midnight maintenance window (midday New York). Same data center, timestamp formats, and performance variations don't create time zone coupling.

</p>
</details>

---

## Question 7

What is the primary risk of making format assumptions about data from external services?

- [ ] Increased network latency when processing received data from services.
- [ ] Higher memory usage due to data validation overhead requirements.
- [x] Application breakage when external service changes its data format.
- [ ] Reduced security due to data exposure vulnerabilities introduced.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Format assumptions risk breakage when external services change formats (e.g., numerical to alphanumeric IDs after merger). Latency, memory, and security are separate concerns not caused by format assumptions.

</p>
</details>

---
