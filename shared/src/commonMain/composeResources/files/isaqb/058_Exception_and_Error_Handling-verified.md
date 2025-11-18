## Question 1

What is the distinction between an "error" and an "exception" as defined in the text?

- [ ] An error is a programming mistake, while an exception is a runtime issue.
- [x] An error is a difference between what is expected and what is received, while an exception is
  when the system cannot deal with that unexpected result.
- [ ] An error is always recoverable, while an exception is not.
- [ ] There is no practical difference; the terms are interchangeable.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Errors are expectation mismatches; exceptions occur when systems can't handle those
errors. Programming mistakes vs runtime, recoverability, and interchangeability all miss the
error-detection vs exception-handling distinction.

</p>
</details>

---

## Question 2

What is a major challenge of error handling in distributed systems?

- [ ] Errors never occur in distributed systems.
- [ ] Errors are always easy to diagnose and fix remotely.
- [x] Errors occurring on remote machines need to be signaled back, and they can be transformed or
  wrapped, making diagnosis complicated.
- [ ] Distributed systems automatically correct all errors without human intervention.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Distributed errors must signal back and can be transformed/wrapped, complicating
diagnosis (original vs consequential). Error-free systems, easy diagnosis, and auto-correction all
ignore distributed error propagation complexity.

</p>
</details>

---

## Question 3

What is the importance of distinguishing between an "original error" and a "consequential error"?

- [ ] All errors are equally important and should be treated the same.
- [x] It helps in identifying the root cause of a problem and avoids being overwhelmed by a cascade
  of secondary errors.
- [ ] Consequential errors are always more critical than original errors.
- [ ] This distinction is only relevant for very small systems.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Distinguishing original from consequential errors identifies root causes, preventing
error cascade overwhelm (1 real vs 999 consequential). Equal importance, consequential criticality,
and small-system-only all miss root cause analysis importance.

</p>
</details>

---

## Question 4

What does the text advise regarding preemptive error handling, using the example of disk space?

- [ ] Continue operations as normal, even if resources are running out.
- [ ] Only react to errors after they have fully manifested and caused a system crash.
- [x] React preemptively to potential problems (e.g., low disk space) to prevent critical failures
  and ensure error logging is possible.
- [ ] Rely on the operating system to handle all resource management automatically.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** React preemptively to prevent failures (low disk space → can't log errors).
Continuing normally, post-crash reactions, and OS-only reliance all miss proactive "fail fast"
opportunities to prevent cascading failures.

</p>
</details>

---

## Question 5

What is the recommended approach for displaying technical errors to end-users?

- [ ] Always show the full stack trace for complete transparency.
- [ ] Hide all errors from the user to avoid confusion.
- [x] Hide technical details, quietly log the error, and show a user-friendly, understandable
  message.
- [ ] Send an automatic message to the user's phone with all technical error codes.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Show user-friendly messages, hide technical details, log silently for developers.
Stack traces confuse users, hiding everything prevents user action, and phone messages with codes
compound confusion—balance user clarity with developer diagnostics.

</p>
</details>

---

## Question 6

What is the primary goal of error handling in software?

- [ ] To prevent all errors from ever occurring.
- [x] To deal with unexpected results or situations in a controlled manner.
- [ ] To always crash the system when an error occurs.
- [ ] To ignore all errors that do not lead to immediate system failure.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Error handling manages unexpected results controlledly. Error prevention (
impossible), always crashing, and ignoring non-fatal errors all miss controlled graceful degradation
and recovery goals.

</p>
</details>

---

## Question 7

What is the "fail-fast" principle in error handling?

- [ ] To continue processing as long as possible, even with errors.
- [x] To detect errors as early as possible and stop processing immediately to prevent further
  damage or propagation of incorrect state.
- [ ] To log errors only after the system has crashed.
- [ ] To ignore errors that do not affect the user interface.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Fail-fast detects and stops immediately, preventing damage/incorrect state
propagation. Continuing processing, post-crash logging, and UI-only concerns all contradict
fail-fast's early detection and immediate stopping.

</p>
</details>

---

## Question 8

What is the advice regarding error messages for developers?

- [ ] Error messages should be as short as possible.
- [x] Error messages for developers should be as verbose and detailed as possible, including all
  relevant technical information.
- [ ] Error messages should only contain user-friendly text.
- [ ] Error messages should be sent directly to the user's email.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Developer messages need verbosity (stack traces, parameters, context) for debugging.
Short messages, user-friendly-only text, and user emails all lack technical detail developers need
for root cause analysis.

</p>
</details>

---
