## Question 1

What is a common misconception about internationalization (I18N) that the text addresses?

- [ ] That it is only relevant for projects with a global reach.
- [x] That it is simply a matter of externalizing strings and having them translated.
- [ ] That it is a purely technical concern with no cultural implications.
- [ ] That it is always easy to implement and requires no special considerations.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** I18N is wrongly assumed to be just string externalization and translation. Global reach relevance, technical-only concerns, and easy implementation all underestimate I18N's complexity involving fonts, layouts, formats, time zones, and cultural sensitivity.

</p>
</details>

---

## Question 2

Beyond text translation, which of the following are examples of internationalization challenges related to layout and display?

- [ ] Ensuring consistent font sizes across all languages.
- [x] Handling special characters and delivering appropriate fonts.
- [x] Mirroring the entire page layout for right-to-left languages like Arabic or Hebrew.
- [ ] Automatically adjusting image resolutions for different locales.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** I18N layout challenges include special character fonts (Polish Ł) and RTL layout mirroring (Arabic/Hebrew). Consistent font sizes and image resolution are presentation concerns, not I18N-specific layout challenges.

</p>
</details>

---

## Question 6

Which of the following are examples of internationalization challenges related to fonts and character display?

- [x] Handling special characters (like Polish L with stripe)
- [x] Delivering appropriate fonts for language-specific characters
- [ ] Ensuring consistent font sizes across all languages
- [ ] Automatically adjusting image resolutions for different locales
- [ ] Using only standard ASCII characters
- [ ] Avoiding any special typography

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Font challenges include special characters (Ł) and delivering supporting fonts. Font sizes, image resolution, ASCII-only, and typography avoidance miss I18N's requirement to support diverse language-specific characters.

</p>
</details>

---

## Question 7

Which of the following are layout challenges specific to right-to-left languages like Arabic or Hebrew?

- [x] Mirroring the entire page layout
- [x] Reversing text direction from right to left
- [x] Adjusting UI element positioning
- [ ] Using different color schemes
- [ ] Changing font sizes dramatically
- [ ] Removing images from the interface

<details>
<summary>Rationale</summary>
<p>

**Rationale:** RTL languages require layout mirroring, text direction reversal, and UI repositioning. Color schemes, font sizing, and image removal aren't RTL requirements—layout direction is the fundamental challenge.

</p>
</details>

---

## Question 3

What is a key piece of advice for handling time zones in internationalized applications?

- [ ] Always store times in the user's local time zone directly.
- [ ] Ignore time zones and assume all users are in the same one.
- [x] Store times in UTC and translate to local for display.
- [ ] Rely on the operating system to manage all time zone conversions.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Store times in UTC and convert for display, avoiding local time storage's ambiguity. Local storage, ignoring zones, and OS-only reliance all create timezone-related bugs (DST, calculations across zones).

</p>
</details>

---

## Question 4

What is a common pitfall when formatting numbers and currencies for different locales?

- [ ] Assuming that all countries use a dot as a decimal separator.
- [x] Assuming same separators and decimal places across countries.
- [ ] Relying on a library for formatting, which is often incorrect.
- [ ] Ignoring currency symbols, as they are universally understood.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Number/currency formatting varies globally (decimal separators, thousands grouping, decimal places like Kuwaiti Dinar's three). Dot-only assumptions, library distrust, and ignoring symbols all miss the broader formatting diversity requiring library support.

</p>
</details>

---

## Question 5

Why should developers be cautious about using symbols and metaphors when internationalizing an application?

- [ ] They are always universally understood and can be used freely.
- [ ] They make the application more engaging for all users.
- [x] Symbols may be offensive or misunderstood across cultures.
- [ ] They are difficult to translate into different languages.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Symbols/metaphors can offend or confuse across cultures (what's friendly in one may be offensive in another). Universal understanding, universal engagement, and translation difficulty miss cultural sensitivity's importance.

</p>
</details>

---

## Question 6

What is the difference between internationalization (I18N) and localization (L10N)?

- [ ] I18N is about translating text, while L10N is about local customs.
- [x] I18N designs for adaptability; L10N is the actual locale adaptation.
- [ ] I18N is for software, and L10N is for hardware specifically.
- [ ] There is no difference; the terms are interchangeable always.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** I18N designs for adaptability without code changes; L10N is the actual locale-specific adaptation. Translation-only I18N, software/hardware division, and interchangeability all miss I18N's enabling role for L10N's specific implementations.

</p>
</details>

---

## Question 7

What is a specific challenge related to character sets and fonts in internationalization?

- [ ] All languages use the same 26-letter alphabet universally.
- [x] Handling special characters and delivering appropriate fonts.
- [ ] Fonts are universally available on all operating systems.
- [ ] Character sets only affect the display of numbers shown.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Special characters (Ł) require appropriate font delivery. 26-letter universality, universal font availability, and number-only impact all ignore linguistic diversity requiring extended character set support.

</p>
</details>

---

## Question 8

What is the advice for handling number and currency formatting in internationalized applications?

- [ ] Manually implement formatting logic for each country separately.
- [x] Use libraries for formatting due to complex regional variations.
- [ ] Assume a single global standard for all numbers and currencies.
- [ ] Only display numbers and currencies as raw values unformatted.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Use libraries for number/currency formatting due to complex regional variations (Indian numbering, Kuwaiti Dinar decimals). Manual implementation, global standards, and raw values all fail to handle formatting diversity correctly.

</p>
</details>

---

## Question 9

What is the primary reason to avoid making assumptions about cultural norms when designing for international audiences?

- [ ] It makes the design process faster and simpler.
- [x] Symbols may be offensive or misunderstood in other cultures.
- [ ] Cultural norms are universally understood everywhere.
- [ ] It simplifies the translation process significantly.

<details>
<summary>Rationale</summary>
<p>

**Rationale:** Cultural assumptions risk offense or misunderstanding across borders. Faster design, universal understanding, and translation simplification all ignore cultural sensitivity's importance in avoiding lawsuits and user alienation.

</p>
</details>

---
