# Week 2 - S2 - String Operations & Performance

This folder contains concept demonstrations covering Java Strings, built-in inspection methods, transformation methods, ASCII character codes, mutable strings (`StringBuilder` vs `StringBuffer`), and performance benchmarks.

---

## 📌 Summary Cheat Sheet

| Topic | Key Concept |
|---|---|
| **String Immutability** | Strings never change; every edit produces a new object in memory. |
| **String Pool** | String literals share memory locations in the intern pool. |
| **Inspection Methods** | `length()`, `charAt()`, `substring(start, end)`, `indexOf()` (all 0-indexed). |
| **Manipulation Methods** | `trim()` (cleans outer edges), `replace()` (exact match), `split()` (regex delimiter). |
| **ASCII Codes** | Uppercase `A-Z` (65–90), Lowercase `a-z` (97–122). Gap between them is 32. |
| **StringBuilder vs StringBuffer** | `StringBuilder` is fast and mutable for single-threaded operations. `StringBuffer` is synchronized for multi-threaded safety. |
| **Performance Benchmark** | Never use `+=` inside large loops; always use `StringBuilder.append()`. |

---

## 📂 Files Overview

1. `StringBasicsDemo.java`: Pool reference vs Heap object comparison (`==` vs `.equals()`).
2. `StringMethodsDemo.java`: Built-in reading methods (`length`, `charAt`, `substring`, `indexOf`, etc.).
3. `StringManipulationDemo.java`: Transformation methods (`trim`, `replace`, `split`, `join`, `toCharArray`).
4. `AsciiDemo.java`: Character-to-integer conversions, 32-gap trick, and `Character` class utilities.
5. `MutableStringDemo.java`: `StringBuilder` and `StringBuffer` manipulation methods.
6. `PerformanceDemo.java`: Micro-benchmark comparing `+=` loop with `StringBuilder.append()`.
