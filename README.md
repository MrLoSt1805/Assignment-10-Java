# Java Threads Demonstration

## Author Information
- **Name:** Dhaerya More
- **PRN:** 23070126033
- **Batch:** AIML A2

## Project Overview
This project demonstrates how Java Threads work using a simple program split across multiple files. Two operations (printing numbers and alphabets) run on their own threads. The program is designed modularly, with proper coding standards and comments.

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

In this program, we implement the `Runnable` interface for both operations to ensure modular and reusable code. Threads are managed in the `Main` class using `start()` and `join()` methods.

---

## Class and Method Explanations

### 1. `PrintNumbers.java`

**Class:** `PrintNumbers`  
**Implements:** `Runnable`

**Method:** `run()`  
This method prints numbers from 1 to 5 with a 500ms delay using `Thread.sleep(500)`. It demonstrates basic thread behavior and introduces a delay to simulate concurrent activity.

**Purpose:** Shows a basic thread that performs a counting operation.

---

### 2. `PrintAlphabets.java`

**Class:** `PrintAlphabets`  
**Implements:** `Runnable`

**Method:** `run()`  
Prints alphabets from 'A' to 'E' with a 500ms delay using `Thread.sleep(500)`.

**Purpose:** Demonstrates how a thread can handle character-based output.

---

### 3. `Main.java`

**Class:** `Main`

**Method:** `main(String[] args)`  
This is the main class that:
- Prints a start message
- Creates two threads: one for numbers, one for alphabets
- Starts both threads using `start()`
- Waits for threads to finish using `join()`
- Prints a finish message

**Purpose:** Coordinates and demonstrates multithreaded execution.

---

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/JavaThreads.git
   ```

2. Navigate into the project directory:
   ```bash
   cd JavaThreads
   ```

3. Compile all Java files:
   ```bash
   javac *.java
   ```

4. Run the program:
   ```bash
   java Main
   ```

---

## Commit Guidelines

- Each Java file was committed separately.
- Each method or logic block was introduced with its own commit.
- Proper commit messages and coding style were followed.

## License
For educational purposes only.
