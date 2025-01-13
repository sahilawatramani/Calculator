import java.util.*;

class Input {
    Scanner scan = new Scanner(System.in);

    int[] inputTwoNumbers() {
        System.out.println("Enter First Number:");
        int first_number = scan.nextInt();
        System.out.println("Enter Second Number:");
        int second_number = scan.nextInt();
        return new int[]{first_number, second_number};
    }

    int inputSingleNumber() {
        System.out.println("Enter a Number:");
        return scan.nextInt();
    }
}
