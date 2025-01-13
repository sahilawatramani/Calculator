# Calculator Application

## Description

This is a **Java-based console application** that performs basic mathematical operations such as:
- **Sum**  
- **Difference**  
- **Product**  
- **Quotient**  
- **Square Root**

The program is structured into three classes for modularity:
1. **`Input`** – Handles user input.  
2. **`Calculator`** – Contains methods for performing calculations.  
3. **`Main`** – Manages the program flow using a menu-driven system with a `switch-case` structure.  

---

## Features

- **Sum:** Add two numbers.  
- **Difference:** Subtract one number from another.  
- **Product:** Multiply two numbers.  
- **Quotient:** Divide one number by another (handles division by zero).  
- **Square Root:** Find the square root of a number (handles negative inputs).  

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or later installed.  
- A text editor or IDE (e.g., **VS Code**, **IntelliJ IDEA**, or **Eclipse**).  

---

## How to Run

1. **Clone or Download the Project:**  
   Save `Input.java`, `Calculator.java`, and `Main.java` in the same directory.

2. **Open the Terminal or Command Prompt:**  
   Navigate to the project folder.

3. **Compile the Java Files:**  
   ```bash
   javac *.java
   ```

4. **Run the Program:**  
   ```bash
   java Main
   ```

---

## Usage

1. The program displays a menu:
   ```
   Choose an operation:
   1. Sum
   2. Difference
   3. Product
   4. Quotient
   5. Square Root
   Enter your choice (1-5): 
   ```

2. Select an operation by entering the corresponding number:
   - For **options 1–4**, enter **two numbers**.  
   - For **option 5 (Square Root)**, enter **one number**.

3. The result will be displayed.

---

## Sample Runs

### Example 1: Sum of Two Numbers
```
Choose an operation:
1. Sum
2. Difference
3. Product
4. Quotient
5. Square Root
Enter your choice (1-5): 1
Enter First Number: 15
Enter Second Number: 25
Sum is: 40
```

### Example 2: Square Root
```
Choose an operation:
1. Sum
2. Difference
3. Product
4. Quotient
5. Square Root
Enter your choice (1-5): 5
Enter a Number: 81
Square Root is: 9.0
```

---

## File Structure

```
Calculator/
├── Input.java        // Handles user input
├── Calculator.java   // Performs calculations
├── Main.java         // Controls the program flow
```

---

## Error Handling

- **Division by Zero:** Displays an error instead of crashing.  
- **Negative Square Root:** Prevents calculation and notifies the user.  

---

## License

This project is licensed under the **MIT License**.  

```
MIT License

