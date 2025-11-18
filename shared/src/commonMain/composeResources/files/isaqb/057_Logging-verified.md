## Question 1

What is the primary challenge related to "invasive logging" that the text addresses?

- [ ] It makes log files too large.
- [ ] It prevents the use of logging frameworks.
- [x] It involves interweaving logging statements directly into the core application code, making it
  less flexible and harder to maintain.
- [ ] It makes it difficult to choose the output channel for logs.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Invasive logging interweaves logging directly in code (system.err.println), reducing
flexibility and maintainability. File size, framework prevention, and output channel difficulty are
symptoms, not the core coupling problem.

</p>
</details>

---

## Question 2

What is the recommended solution for achieving high flexibility and non-invasive logging?

- [ ] Writing all log messages directly to the console.
- [ ] Manually managing log file rotation.
- [x] Using a logging framework and a logging facade to abstract away the details of logging
  implementation and output.
- [ ] Sending all log messages via email.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Logging frameworks with facades abstract implementation details (logger.debug(),
logger.warn()), enabling flexibility. Console-only, manual rotation, and email-only all lack
abstraction and flexibility that frameworks provide.

</p>
</details>

---

## Question 3

What is the minimum level of logging that should be implemented, according to the text?

- [ ] Only fatal errors should be logged.
- [ ] Every method entry and exit should be logged.
- [x] Every time system boundaries are crossed (e.g., user input, data persistence, external system
  calls).
- [ ] Only debug messages during development.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Minimum logging captures all boundary crossings (user input, persistence, external
calls). Fatal-only misses debugging info, method entry/exit creates noise, and debug-only
development logs miss production issues.

</p>
</details>

---

## Question 4

What is a "ring buffer" or "rolling file appender" used for in logging?

- [ ] To store all log messages in memory indefinitely.
- [ ] To send log messages to multiple destinations simultaneously.
- [x] To manage log file size by overwriting older logs when space runs out, keeping a recent
  history.
- [ ] To encrypt log messages for security.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Ring buffers/rolling appenders manage space by overwriting oldest logs (file.1,
file.2, ..., file.10, loop), keeping recent history. Indefinite memory storage, multiple
destinations (different pattern), and encryption (separate concern) aren't ring buffer purposes.

</p>
</details>

---

## Question 5

What is a challenge when merging log files from different systems?

- [ ] Log files are always in the same format, making merging trivial.
- [x] System clocks might not be synchronized, character encodings might differ, and log levels
  might vary, making merging complex.
- [ ] Log files are too small to provide useful information.
- [ ] It is impossible to merge log files from different operating systems.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Merging challenges include clock sync, encoding differences, and varying log levels
across systems. Same formats (false), small files, and OS impossibility all miss real distributed
logging correlation challenges.

</p>
</details>

---

## Question 6

What is the primary purpose of a "logging facade"?

- [ ] To directly implement logging logic.
- [x] To abstract away the details of logging implementation and output, allowing the application
  code to interact with a simple logging interface.
- [ ] To store log messages in a database.
- [ ] To analyze log data for security breaches.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Facades abstract implementation details, providing simple interfaces (logger.debug())
independent of backend. Direct implementation, database storage, and analysis are backend concerns
facades decouple from application code.

</p>
</details>

---

## Question 7

What is the benefit of using a logging framework over manual logging?

- [ ] Logging frameworks are always faster.
- [x] Logging frameworks provide flexibility in choosing output channels, log levels, and formatting
  without changing application code.
- [ ] Logging frameworks eliminate the need for any configuration.
- [ ] Logging frameworks automatically fix errors in the application.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Frameworks provide output flexibility (file, console, network), level control, and
formatting without code changes. Speed varies, configuration is required, and error fixing isn't a
logging framework capability.

</p>
</details>

---

## Question 8

What is the advice regarding logging sensitive data?

- [ ] All data should be logged, regardless of sensitivity.
- [x] Sensitive data should be handled with extreme care and potentially not logged, or logged only
  after encryption or anonymization.
- [ ] Sensitive data should only be logged at the highest debug level.
- [ ] Sensitive data can be logged as long as the log files are stored locally.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Sensitive data requires care—avoid logging or encrypt/anonymize first (prevents
exposure like unencrypted passwords in logs). Logging everything, debug-level-only, and local-only
storage all risk sensitive data leaks.

</p>
</details>

---
