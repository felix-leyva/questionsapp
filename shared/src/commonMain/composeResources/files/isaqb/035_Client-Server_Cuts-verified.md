## Question 1

What is the primary characteristic of a "Fat Client" from a user's perspective?

- [ ] It requires continuous server roundtrips for all interactions.
- [ ] It has minimal integration capabilities with local operating systems.
- [x] Everything runs on the local machine, making it super fast and fully integrated, similar to a
  desktop application.
- [ ] It functions primarily through web browser interfaces.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Fat clients run entirely locally, providing speed and full OS integration like
desktop apps. Continuous roundtrips, minimal integration, and web-based operation characterize thin
clients, not fat clients.

</p>
</details>

---

## Question 2

What is the main advantage of a "Thin Client" from a developer's perspective, compared to a Fat
Client?

- [ ] It enables more sophisticated application logic on client devices.
- [x] It avoids duplicating application logic for every platform, as it's done once on the server.
- [ ] It delivers richer user experiences with imperceptible server latency.
- [ ] It completely eliminates the need for presentation layer code.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Thin clients centralize application logic on the server, avoiding platform-specific
duplication. Client-side logic sophistication, rich experiences, and presentation layer elimination
are not thin client advantages.

</p>
</details>

---

## Question 3

What is the goal of a "Rich Client" architecture?

- [ ] To maximize server-side application logic processing.
- [ ] To entirely eliminate all server communication roundtrips.
- [x] To strike a balance between user concerns (speed, responsiveness) and developer concerns (less
  platform-specific duplication).
- [ ] To ensure complete local data storage on client machines.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Rich clients balance user needs (speed/responsiveness) with developer needs (reduced
duplication). Maximizing server logic, eliminating roundtrips, and local data storage represent
extreme architectures, not balanced approaches.

</p>
</details>

---

## Question 4

From whose perspective is an "Ultra Thin Client" (or Zero Client) considered the "best thing that
can happen"?

- [ ] The end-user, experiencing seamless local integration.
- [ ] The marketing team, maximizing product appeal.
- [x] The developer or administrator, due to its ease of installation and single software chunk.
- [ ] The quality assurance team, enabling simplified testing.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Ultra thin clients are ideal for developers/administrators: single server deployment,
minimal client management. Users experience poor integration, marketing faces limited appeal, and QA
still faces testing challenges.

</p>
</details>

---

## Question 5

What is a significant drawback of an "Ultra Thin Client" from a user's perspective?

- [ ] It demands very powerful local hardware resources.
- [ ] It provides excessive features creating overwhelming complexity.
- [x] It often lacks integration with the local operating system and can be tedious to work with,
  leading to a poor user experience.
- [ ] It suffers from frequent crashes due to architectural complexity.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Ultra thin clients lack OS integration and create tedious user experiences (e.g.,
Citrix). They don't require powerful hardware, provide excessive features, or crash
frequently—they're simply poorly integrated.

</p>
</details>

---

## Question 6

What is the primary characteristic of a "Fat Client" from a developer's perspective?

- [ ] It simplifies deployment and ongoing maintenance significantly.
- [x] It requires duplicating application logic for every platform, leading to more work.
- [ ] It streamlines testing through self-contained execution environments.
- [ ] It minimizes impact on local machine resource consumption.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Fat clients require duplicating application logic per platform (Windows, Mac, Linux),
multiplying development work. Deployment, testing, and resource consumption remain challenging, not
simplified.

</p>
</details>

---

## Question 7

What is the primary characteristic of a "Thin Client" from a user's perspective?

- [ ] It provides super-fast performance with full local integration.
- [x] It requires constant server roundtrips, leading to a less responsive experience.
- [ ] It delivers rich interactive interfaces with minimal latency.
- [ ] It maintains all application data in local storage.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Thin clients require server roundtrips for every interaction, creating poor
responsiveness. Fast performance, rich interfaces, and local data storage characterize fat clients,
not thin clients.

</p>
</details>

---

## Question 8

What is the primary characteristic of a "Rich Client" from a developer's perspective?

- [ ] It mandates duplicating all application logic across every platform.
- [x] It aims to avoid duplicating application logic for every platform by keeping it on the server,
  while still providing a good user experience.
- [ ] It represents the simplest development approach with minimal client code.
- [ ] It completely eliminates requirements for server-side processing.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Rich clients keep application logic server-side (avoiding duplication) while
providing good UX through selective client-side functionality. Full duplication, minimal client
code, and no server processing represent other architectures.

</p>
</details>

---

## Question 9

What is the primary characteristic of an "Ultra Thin Client" from a developer's perspective?

- [ ] It demands complex multi-platform client-side development.
- [x] It is the easiest to develop and deploy, as it's a single software chunk on the server.
- [ ] It provides maximum flexibility for client-side customization.
- [ ] It necessitates extensive platform-specific coding efforts.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Ultra thin clients are simplest for developers: single server deployment, no client
distribution. Complex client development, customization flexibility, and platform-specific coding
characterize fat clients.

</p>
</details>

---
