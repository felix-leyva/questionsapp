## Question 1

What is the fundamental mechanism of application integration using "File Transfer"?

- [ ] Applications communicate directly through network socket connections.
- [ ] Applications share data via common in-memory caching systems.
- [x] Exporter writes to shared file system; importer reads from it.
- [ ] Applications exchange data through remote procedure invocations.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** File Transfer uses shared file systems: exporters write, importers read. Network sockets, in-memory caches, and RPC represent different integration patterns, not file-based transfer.

</p>
</details>

---

## Question 2

Which of the following are advantages of using File Transfer for application integration?

- [x] No need for additional software or extra skills, as file system access is universal.
- [ ] Guarantees real-time data consistency across all applications.
- [x] It is totally asynchronous, allowing loose coupling between applications.
- [ ] Requires significant invasive changes to core application functionality.
- [x] Core application functionality remains unchanged, with integration handled by an external wrapper.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** File Transfer advantages: universal access (no special software), asynchronous operation (loose coupling), and non-invasive integration (external wrappers). It doesn't guarantee real-time consistency or require core changes.

</p>
</details>

---

## Question 3

What is a significant disadvantage of File Transfer integration, particularly concerning data?

- [ ] It proves too complex for most development teams to implement.
- [x] Write-read gaps can lead to data inconsistencies in readers.
- [ ] It mandates both applications run online simultaneously always.
- [ ] It exclusively supports binary formats, excluding text-based data.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** File Transfer's key disadvantage: write-read gaps create data inconsistency windows. It's not complex, doesn't require simultaneous operation, and supports both binary and text formats.

</p>
</details>

---

## Question 4

How can the problem of data inconsistency in File Transfer be ameliorated?

- [ ] By adopting a different file system protocol specification entirely.
- [x] By writing data more frequently to reduce write-read gaps.
- [ ] By implementing manual data synchronization between applications.
- [ ] By completely replacing the file system with shared database access.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Reduce inconsistency by shrinking write-read gaps through increased frequency (hourly, minutely). Protocol changes, manual sync, and database replacement don't address the fundamental timing issue.

</p>
</details>

---

## Question 5

What additional consideration arises when increasing the frequency of data writing in File Transfer?

- [ ] The requirement for more complex data serialization formats overall.
- [x] Managing large data volumes: file organization, cleanup, storage.
- [ ] A proportional decrease in overall system performance always.
- [ ] The mandatory deployment of dedicated file transfer servers.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Increased frequency creates data volume challenges: file organization, cleanup routines, and storage management. It doesn't necessarily require complex formats, decrease performance, or mandate dedicated servers.

</p>
</details>

---

## Question 6

What is the role of an "external wrapper" in File Transfer integration?

- [ ] To fundamentally modify core application functionality and logic.
- [x] To handle the integration without requiring big changes inside the core application.
- [ ] To perform data format conversions between incompatible systems.
- [ ] To enable real-time synchronization of shared data.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** External wrappers handle integration without modifying core application logic, isolating file I/O from business logic. They don't modify cores, convert formats automatically, or provide real-time sync.

</p>
</details>

---

## Question 7

What is a key characteristic of File Transfer integration regarding its synchronicity?

- [ ] It always operates synchronously requiring simultaneous application activity.
- [x] It is totally asynchronous, allowing loose coupling between applications.
- [ ] It can operate either synchronously or asynchronously depending on file system capabilities.
- [ ] It mandates a dedicated synchronization coordination service.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** File Transfer is inherently asynchronous enabling loose coupling—applications operate independently without coordination. It's not synchronous, mode-switchable, or requiring coordination services.

</p>
</details>

---

## Question 8

What is a potential issue with File Transfer integration if the data is not written frequently enough?

- [ ] The underlying file system will experience corruption issues.
- [x] Inconsistencies arise in readers due to write-read gaps.
- [ ] The applications will become tightly coupled to each other.
- [ ] The file transfer operations will fail silently without notice.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Infrequent writes create large temporal gaps causing data inconsistencies for readers. File systems don't corrupt, applications remain loosely coupled, and failures aren't inherently silent.

</p>
</details>

---
