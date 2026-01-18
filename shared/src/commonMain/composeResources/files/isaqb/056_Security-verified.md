## Question 1

What are the five security goals that a system should aim to achieve, as mentioned in the text?

- [ ] Speed, Efficiency, Scalability, Usability, and Cost-effectiveness.
- [x] Confidentiality, Integrity, Authenticity, Authorization, and Availability.
- [ ] Encryption, Decryption, Hashing, Digital Signatures, and Firewalls.
- [ ] Prevention, Detection, Response, Recovery, and Forensics.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** The five security goals are Confidentiality, Integrity, Authenticity, Authorization, and Availability (CIA triad plus authorization and availability). Speed/efficiency are performance goals, encryption/hashing are mechanisms, and prevention/detection are security process phases, not core goals.

</p>
</details>

---

## Question 6

Which of the following are the five security goals that a system should aim to achieve? (Select all that apply)

- [x] Confidentiality
- [x] Integrity
- [x] Authenticity
- [x] Authorization
- [x] Availability
- [ ] Scalability
- [ ] Performance
- [ ] Usability

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Security goals are Confidentiality, Integrity, Authenticity, Authorization, and Availability. Scalability, performance, and usability are quality attributes, not security goals—they may compete with security requirements.

</p>
</details>

---

## Question 2

What is the purpose of using an MD5 checksum when downloading software, in relation to security?

- [ ] To encrypt the software for secure storage purposes.
- [ ] To verify the software's compatibility with the operating system.
- [x] To check file integrity and detect tampering during transfer.
- [ ] To authenticate the user who downloaded the software.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** MD5 checksums verify file integrity, detecting tampering during transfer. They don't encrypt (separate process), check compatibility (OS concern), or authenticate users (identity verification)—they ensure data hasn't changed.

</p>
</details>

---

## Question 3

What is a critical piece of advice regarding implementing cryptographic procedures yourself?

- [ ] It is always recommended to implement your own cryptographic procedures.
- [ ] Only implement them if you have a small team and can control code.
- [x] Don't implement crypto yourself; use established libraries.
- [ ] It is acceptable if you use a very old algorithm like Caesar cipher.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Never implement crypto yourself—use established libraries from security experts due to ongoing security arms race. DIY crypto, small teams, and old algorithms (Caesar cipher is trivially broken) all create vulnerabilities.

</p>
</details>

---

## Question 4

Why is it generally not recommended to use self-signed certificates for public-facing websites?

- [ ] They are technically less secure than purchased certificates.
- [ ] They are too expensive to generate for most organizations.
- [x] They cause browser pop-ups that irritate users and erode trust.
- [ ] They are only compatible with specific web browsers only.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Self-signed certificates irritate users with browser warnings, undermining trust. They're not less secure technically, are free (not expensive), and work in all browsers—the UX and trust problems are the issues.

</p>
</details>

---

## Question 5

At what OSI level should security measures ideally be implemented, and why?

- [ ] At the highest level (Application Layer) for maximum flexibility.
- [ ] At the middle layers (Session, Presentation) for balanced control.
- [x] At a low OSI level, deep down, to ensure robustness and prevent bypassing.
- [ ] It does not matter at which level security is implemented.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Implement security at low OSI levels to prevent bypassing (defense in depth). High-level/application-only security can be circumvented, middle layers offer incomplete protection, and level doesn't matter ignores attack surface reduction.

</p>
</details>

---

## Question 7

What is "Confidentiality" in the context of security goals?

- [ ] Ensuring that data is accurate and complete always.
- [x] Ensuring only authorized people can access data.
- [ ] Verifying the identity of a user or system always.
- [ ] Ensuring that a system is available when needed.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Confidentiality ensures only authorized access to data (the "C" in CIA triad). Accuracy is integrity, identity verification is authenticity, and system availability is availability—distinct security goals.

</p>
</details>

---

## Question 8

What is "Integrity" in the context of security goals?

- [ ] Ensuring that only authorized people can read or access data.
- [x] Ensuring data is accurate, complete, and not tampered with.
- [ ] Verifying the identity of a user or system directly.
- [ ] Ensuring that a system is available when needed always.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Integrity ensures data accuracy and completeness without tampering (the "I" in CIA). Authorized access is confidentiality, identity is authenticity, and availability is availability—separate security goals.

</p>
</details>

---

## Question 9

What is "Authenticity" in the context of security goals?

- [ ] Ensuring that data is accurate and complete in storage.
- [ ] Ensuring that only authorized people can read or access data.
- [x] Verifying identity, ensuring they are who they claim to be.
- [ ] Ensuring that a system is available when needed always.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Authenticity verifies identity ("you are who you claim to be"). Data accuracy is integrity, access control is confidentiality, and system availability is availability—distinct goals.

</p>
</details>

---

## Question 10

What is "Authorization" in the context of security goals?

- [ ] Verifying the identity of a user or system.
- [x] Determining what an authenticated user or system is allowed to do.
- [ ] Ensuring that data is accurate and complete.
- [ ] Ensuring that a system is available when needed.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Authorization determines permissions ("what are you allowed to do") after authentication. Identity verification is authenticity, data accuracy is integrity, and availability is availability—authorization follows authentication.

</p>
</details>

---

## Question 11

What is "Availability" in the context of security goals?

- [ ] Ensuring that data is accurate and complete.
- [ ] Verifying the identity of a user or system.
- [x] Ensuring that a system is available when needed, even under attack.
- [ ] Determining what an authenticated user or system is allowed to do.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Availability ensures system access even under attack (the "A" in CIA). Data accuracy is integrity, identity is authenticity, and permissions are authorization—availability prevents denial of service.

</p>
</details>

---
