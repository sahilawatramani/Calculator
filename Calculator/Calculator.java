import java.util.*;

class Calculator {
    private int[] numbers;

    public Calculator(int[] numbers) {
        this.numbers = numbers;
    }

    public Calculator(int number) {
        this.numbers = new int[]{number};
    }

    public int calculateSum() {
        return numbers[0] + numbers[1];
    }

    public int calculateDifference() {
        return numbers[0] - numbers[1];
    }

    public int calculateProduct() {
        return numbers[0] * numbers[1];
    }

    public double calculateQuotient() {
        if (numbers[1] == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return (double) numbers[0] / numbers[1];
    }

    public double calculateSquareRoot() {
        if (numbers[0] < 0) {
            System.out.println("Error: Cannot calculate square root of a negative number!");
            return Double.NaN;
        }
        return Math.sqrt(numbers[0]);
    }
}
