# Session 1 - Java Strings & Exception Handling

This directory contains theoretical notes, diagrams, and runnable code implementations for Session 1.

---

## 📑 Agenda
1. Understanding Java Strings (Immutability & String Pool)
2. Creating Strings (Literals, `new`, Character Arrays, `StringBuilder`)
3. Escape Sequences & Platform Separators
4. String Input (`Scanner` vs `BufferedReader`)
5. String Arrays & `java.util.Arrays` Operations
6. Strings as Method Parameters & Pass-by-Value
7. Java Exception Hierarchy & Handling

---

## 🧠 Theoretical Concepts

### 1. String Immutability & Memory Layout
In Java, `String` objects are immutable. Any modification operation (e.g. `.concat()`, `.replace()`) produces a new object in memory.

```text
Heap Memory Layout:
┌─────────────────────────────────┐
│ String Pool                     │
│ "Hello" <────── str1, str2      │
├─────────────────────────────────┤
│ Regular Heap                    │
│ [String Object (value="Hello")] │ <────── str3
└─────────────────────────────────┘
```

### 2. String vs StringBuilder vs StringBuffer
| Feature | `String` | `StringBuilder` | `StringBuffer` |
|---|---|---|---|
| **Mutability** | Immutable | Mutable | Mutable |
| **Thread Safety** | Inherently Safe | No (Not thread-safe) | Yes (Synchronized) |
| **Performance** | Slower on concatenations | Very Fast | Moderate |
| **Use Case** | Constants, Map keys | Single-threaded concatenation | Multi-threaded concatenation |

### 3. Escape Sequences
- `\n`: Line feed (newline)
- `\t`: Horizontal tab
- `\"`: Double quote
- `\\`: Literal backslash
- `\u0048`: 4-digit hexadecimal Unicode character

### 4. Input Stream Comparison
- **`Scanner`**: Parses primitives using regex tokens, convenient for interactive console apps.
- **`BufferedReader`**: Reads full text lines directly from the stream with a larger buffer, ideal for high performance.

### 5. Exception Hierarchy
```text
               Throwable
               /       \
           Error      Exception
                     /         \
       RuntimeException       Checked Exceptions
     (Unchecked Exceptions)   (e.g., IOException, FileNotFoundException)
     - ArithmeticException
     - NullPointerException
     - ArrayIndexOutOfBoundsException
```

---

## 📂 Source Code Files

| File | Purpose |
|---|---|
| [`StringCreationDemo.java`](file:///session_1/StringCreationDemo.java) | Compares String literal pooling, heap instantiation, and `StringBuilder`. |
| [`EscapeSequences.java`](file:///session_1/EscapeSequences.java) | Demonstrates control characters, quotes, and Unicode escapes. |
| [`StringInput.java`](file:///session_1/StringInput.java) | Demonstrates `Scanner` token parsing and validation. |
| [`BufferedReaderExample.java`](file:///session_1/BufferedReaderExample.java) | Demonstrates buffered stream reading and integer parsing. |
| [`StringArrayDemo.java`](file:///session_1/StringArrayDemo.java) | Covers array loops, `Arrays.sort()`, `binarySearch()`, and bounds checking. |
| [`StringMethods.java`](file:///session_1/StringMethods.java) | Demonstrates pass-by-value, null safety, and varargs. |
| [`StringProcessor.java`](file:///session_1/StringProcessor.java) | Demonstrates method overloading with strings. |
| [`ExceptionHandlingDemo.java`](file:///session_1/ExceptionHandlingDemo.java) | Illustrates unchecked (`ArithmeticException`) and checked (`FileNotFoundException`, `IOException`) exceptions. |

---

## ⚙️ How to Compile & Run

```bash
# Navigate to session_1
cd session_1

# Compile all files
javac *.java

# Run any example
java StringCreationDemo
java EscapeSequences
java StringArrayDemo
java StringMethods
java StringProcessor
java ExceptionHandlingDemo
```
