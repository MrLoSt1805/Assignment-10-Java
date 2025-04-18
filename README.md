# Java Threads Demonstration

## Author Information
- **Name:** Daniel John Jacob
- **PRN:** 23070126027
- **Batch:** AIML A2

## Project Overview
This project demonstrates how Java Threads work using a simple program split across multiple files. Each operation (printing numbers, alphabets) runs on its own thread. The program is designed modularly, with proper coding standards and comments.

## Files Structure

```
JavaThreads/
├── Main.java
├── PrintNumbers.java
├── PrintAlphabets.java
├── README.md
```

## How Threads Work in Java

Java threads allow concurrent execution of two or more parts of a program. Threads can be created by:
- Extending the `Thread` class
- Implementing the `Runnable` interface

In this program, we implement the `Runnable` interface for each operation to ensure modular and reusable code.

---

## Class and Method Explanations

### 1. `PrintNumbers.java`

**Class:** `PrintNumbers`  
**Implements:** `Runnable`

**Method:** `printNumbers()`  
This method is invoked in the `run()` method and prints numbers from 1 to 10. Each number is printed with a 1-second delay using `Thread.sleep(1000)`, demonstrating the thread's execution over time.

**Purpose:** Shows a basic thread that performs a counting operation with delays.

---

### 2. `PrintAlphabets.java`

**Class:** `PrintAlphabets`  
**Implements:** `Runnable`

**Method:** `printAlphabets()`  
This method prints alphabets from 'A' to 'J' one by one with a 1-second pause. Called within the `run()` method of the thread.

**Purpose:** Demonstrates a character-based loop running in its own thread.

---



