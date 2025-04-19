## **Java Calculator Application**

### **Description**
A simple console-based calculator application implemented in Java. This program allows users to perform basic arithmetic, advanced mathematical operations, and simple statistical calculations through a menu-driven interface.

---

### **Features**

#### **1. Basic Arithmetic Operations**
- Sum  
- Difference  
- Product  
- Quotient  

#### **2. Advanced Mathematical Operations**
- Square Root  
- Fibonacci Sequence Generation  

#### **3. Statistical Operations**
- Mean of an Array  
- Mode of an Array (calculated using sorting-based logic)  

---

### **How to Use**

#### **1. Run the Program**
Compile and run the `Main.java` file in any Java-supported environment or terminal.

#### **2. Choose an Operation**
Upon running, you will be presented with a menu:
```
1. Sum
2. Difference
3. Product
4. Quotient
5. Square Root
6. Fibonacci Sequence
7. Mean of an Array
8. Mode of an Array
```

#### **3. Provide Input**
Depending on your selection:
- For arithmetic: Enter **two numbers**
- For square root: Enter **one number**
- For Fibonacci: Enter the **number of terms**
- For mean or mode: Enter **array size and elements**

#### **4. View the Output**
The program processes your input and displays the result accordingly.

---

### **Project Files**

| File         | Description |
|--------------|-------------|
| `Main.java`  | Contains the main method and handles user interaction and menu navigation |
| `Calculator.java` | Performs all calculations – arithmetic, square root, Fibonacci, mean, and mode |
| `Input.java` | Handles all user input in a clean and reusable manner |

---

### **Classes and Key Methods**

#### **Main.java**
- **Purpose**: Acts as the entry point and UI controller
- **Main Method**:
  - `public static void main(String[] args)`: Controls program flow via menu options

#### **Calculator.java**
- **Purpose**: Core logic for all calculations
- **Key Methods**:
  - `int calculateSum(int[] numbers)`
  - `int calculateDifference(int[] numbers)`
  - `int calculateProduct(int[] numbers)`
  - `double calculateQuotient(int[] numbers)`
  - `double calculateSquareRoot(int number)`
  - `void generateFibonacci(int terms)`
  - `double calculateMean(int[] array)`
  - `int calculateMode(int[] array)`

#### **Input.java**
- **Purpose**: Clean input abstraction from user
- **Key Methods**:
  - `int[] inputTwoNumbers()`
  - `int inputSingleNumber()`
  - `int[] inputArray()`

---

### **Example Usage**

#### Example 1: Calculate Sum
- **Input**:
  ```
  Choose an operation:
  1
  Enter First Number: 10
  Enter Second Number: 20
  ```
- **Output**:
  ```
  Sum: 30
  ```

#### Example 2: Generate Fibonacci Sequence
- **Input**:
  ```
  Choose an operation:
  6
  Enter the number of terms: 5
  ```
- **Output**:
  ```
  Fibonacci Sequence: 0 1 1 2 3
  ```

#### Example 3: Find Mode
- **Input**:
  ```
  Choose an operation:
  8
  Enter the size of the array: 6
  Enter the elements of the array: 2 3 3 5 2 2
  ```
- **Output**:
  ```
  Mode: 2
  ```

---

### **Requirements**
- **JDK**: Java 8 or later  
- **IDE/Tools**: IntelliJ IDEA, Eclipse, NetBeans, or CLI (Command Line Interface with `javac` and `java`)

---

### **Compilation and Execution**

#### **1. Compile**
```bash
javac Main.java
```

> Make sure `Calculator.java` and `Input.java` are in the same directory.

#### **2. Run**
```bash
java Main
```
