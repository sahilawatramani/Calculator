import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input in = new Input();

        System.out.println("Choose an operation:");
        System.out.println("1. Sum");
        System.out.println("2. Difference");
        System.out.println("3. Product");
        System.out.println("4. Quotient");
        System.out.println("5. Square Root");
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: 
                int[] sumNumbers = in.inputTwoNumbers();
                Calculator sumCalc = new Calculator(sumNumbers);
                System.out.println("Sum is: " + sumCalc.calculateSum());
                break;

            case 2: 
                int[] diffNumbers = in.inputTwoNumbers();
                Calculator diffCalc = new Calculator(diffNumbers);
                System.out.println("Difference is: " + diffCalc.calculateDifference());
                break;

            case 3: 
                int[] prodNumbers = in.inputTwoNumbers();
                Calculator prodCalc = new Calculator(prodNumbers);
                System.out.println("Product is: " + prodCalc.calculateProduct());
                break;

            case 4:
                int[] quotNumbers = in.inputTwoNumbers();
                Calculator quotCalc = new Calculator(quotNumbers);
                double quotient = quotCalc.calculateQuotient();
                if (!Double.isNaN(quotient)) {
                    System.out.println("Quotient is: " + quotient);
                }
                break;

            case 5: 
                int sqrtNumber = in.inputSingleNumber();
                Calculator sqrtCalc = new Calculator(sqrtNumber);
                double result = sqrtCalc.calculateSquareRoot();
                if (!Double.isNaN(result)) {
                    System.out.println("Square Root is: " + result);
                }
                break;

            default:
                System.out.println("Invalid choice! Please select between 1-5.");
        }
    }
}
