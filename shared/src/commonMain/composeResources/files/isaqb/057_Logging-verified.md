## Question 1

What is the primary challenge related to "invasive logging" that the text addresses?

- [ ] It makes log files too large to manage effectively.
- [ ] It prevents the use of logging frameworks entirely.
- [x] Logging interweaved in code reduces flexibility and maintainability.
- [ ] It makes it difficult to choose the output channel for logs.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Invasive logging interweaves logging directly in code (system.err.println), reducing flexibility and maintainability. File size, framework prevention, and output channel difficulty are symptoms, not the core coupling problem.

</p>
</details>

---

## Question 2

What is the recommended solution for achieving high flexibility and non-invasive logging?

- [ ] Writing all log messages directly to the console always.
- [ ] Manually managing log file rotation and cleanup.
- [x] Using a logging framework and facade to abstract details.
- [ ] Sending all log messages via email to administrators.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Logging frameworks with facades abstract implementation details (logger.debug(), logger.warn()), enabling flexibility. Console-only, manual rotation, and email-only all lack abstraction and flexibility that frameworks provide.

</p>
</details>

---

## Question 3

What is the minimum level of logging that should be implemented, according to the text?

- [ ] Only fatal errors should be logged in production.
- [ ] Every method entry and exit should be logged always.
- [x] Every time system boundaries are crossed (I/O, external calls).
- [ ] Only debug messages during development phases.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Minimum logging captures all boundary crossings (user input, persistence, external calls). Fatal-only misses debugging info, method entry/exit creates noise, and debug-only development logs miss production issues.

</p>
</details>

---

## Question 4

What is a "ring buffer" or "rolling file appender" used for in logging?

- [ ] To store all log messages in memory indefinitely always.
- [ ] To send log messages to multiple destinations simultaneously.
- [x] To manage file size by overwriting older logs cyclically.
- [ ] To encrypt log messages for security purposes.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Ring buffers/rolling appenders manage space by overwriting oldest logs (file.1, file.2, ..., file.10, loop), keeping recent history. Indefinite memory storage, multiple destinations (different pattern), and encryption (separate concern) aren't ring buffer purposes.

</p>
</details>

---

## Question 5

What is a challenge when merging log files from different systems?

- [ ] Log files are always in the same format, making merging trivial.
- [x] Clock sync, encoding, and log level differences complicate merging.
- [ ] Log files are too small to provide useful information always.
- [ ] It is impossible to merge log files from different operating systems.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Merging challenges include clock sync, encoding differences, and varying log levels across systems. Same formats (false), small files, and OS impossibility all miss real distributed logging correlation challenges.

</p>
</details>

---

## Question 6

What is the primary purpose of a "logging facade"?

- [ ] To directly implement logging logic in applications.
- [x] To abstract implementation details, providing a simple interface.
- [ ] To store log messages in a database directly.
- [ ] To analyze log data for security breaches automatically.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Facades abstract implementation details, providing simple interfaces (logger.debug()) independent of backend. Direct implementation, database storage, and analysis are backend concerns facades decouple from application code.

</p>
</details>

---

## Question 7

What is the benefit of using a logging framework over manual logging?

- [ ] Logging frameworks are always faster than alternatives.
- [x] Frameworks provide flexible output, levels, and formatting.
- [ ] Logging frameworks eliminate the need for any configuration.
- [ ] Logging frameworks automatically fix errors in the application.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Frameworks provide output flexibility (file, console, network), level control, and formatting without code changes. Speed varies, configuration is required, and error fixing isn't a logging framework capability.

</p>
</details>

---

## Question 8

What is the advice regarding logging sensitive data?

- [ ] All data should be logged, regardless of sensitivity level.
- [x] Sensitive data needs care: don't log or encrypt/anonymize first.
- [ ] Sensitive data should only be logged at highest debug level.
- [ ] Sensitive data can be logged if log files are stored locally.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Sensitive data requires care—avoid logging or encrypt/anonymize first (prevents exposure like unencrypted passwords in logs). Logging everything, debug-level-only, and local-only storage all risk sensitive data leaks.

</p>
</details>

---
