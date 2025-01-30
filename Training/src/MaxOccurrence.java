import java.util.Scanner;

public class MaxOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers : ");

        int max = Integer.MIN_VALUE;
        int count = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;
            if (num > max) {
                max = num;
                count = 1;
            } else if (num == max) {
                count++;
            }
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}

