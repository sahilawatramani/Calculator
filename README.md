## **Java Calculator Application**

### **Description**
This project is a simple console-based calculator application implemented in Java. The application supports various mathematical operations, including basic arithmetic, square root calculation, Fibonacci sequence generation, and statistical calculations (mean and mode of an array).

---

### **Features**
1. **Basic Arithmetic Operations**:
   - Sum
   - Difference
   - Product
   - Quotient

2. **Advanced Mathematical Operations**:
   - Square Root
   - Fibonacci Sequence Generation

3. **Statistical Operations**:
   - Mean of an Array
   - Mode of an Array (using sorting-based calculation)

---

### **How to Use**
1. **Run the Program**:
   Compile and execute the `Main.java` file in your Java environment.

2. **Choose an Operation**:
   When prompted, select an operation from the menu:
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

3. **Provide Input**:
   Depending on your choice:
   - For arithmetic operations, enter two numbers.
   - For square root, enter a single number.
   - For Fibonacci sequence, specify the number of terms.
   - For statistical operations, input the size and elements of the array.

4. **View the Result**:
   The program calculates and displays the result for the selected operation.

---

### **Project Files**
1. **Main.java**:
   - Manages the user interface and handles operation selection using a menu-driven approach.
   - Calls appropriate methods from the `Calculator` and `Input` classes based on the user's choice.

2. **Calculator.java**:
   - Contains all the methods for performing mathematical and statistical operations.
   - Includes efficient algorithms for mode calculation (using sorting).

3. **Input.java**:
   - Handles user input for numbers, arrays, or sequence lengths.
   - Ensures flexibility and reusability of input methods.

---

### **Classes and Methods**

#### **Main.java**
- **Purpose**: Provides the main entry point and menu interface.
- **Key Method**:
  - `public static void main(String[] args)`: Controls the program flow based on user choice.

#### **Calculator.java**
- **Purpose**: Performs mathematical and statistical calculations.
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
- **Purpose**: Handles user inputs for different operations.
- **Key Methods**:
  - `int[] inputTwoNumbers()`: Takes two numbers as input.
  - `int inputSingleNumber()`: Takes a single number as input.
  - `int[] inputArray()`: Takes an array of numbers as input.

---

### **Example Usage**

#### **Example 1**: Calculate Sum
- Input:
  ```
  Choose an operation:
  1. Sum
  Enter First Number: 10
  Enter Second Number: 20
  ```
- Output:
  ```
  Sum: 30
  ```

#### **Example 2**: Generate Fibonacci Sequence
- Input:
  ```
  Choose an operation:
  6. Fibonacci Sequence
  Enter the number of terms: 5
  ```
- Output:
  ```
  Fibonacci Sequence: 0 1 1 2 3
  ```

#### **Example 3**: Find Mode
- Input:
  ```
  Choose an operation:
  8. Mode of an Array
  Enter the size of the array: 6
  Enter the elements of the array: 2 3 3 5 2 2
  ```
- Output:
  ```
  Mode: 2
  ```

---

### **Requirements**
- **Java Development Kit (JDK)**: Version 8 or higher.
- **Compiler**: Any Java IDE (e.g., IntelliJ, Eclipse) or a terminal with `javac` and `java` commands.

---

### **Compilation and Execution**
1. Compile the program:
   ```bash
   javac Main.java
   ```
2. Run the program:
   ```bash
   java Main
   ```
