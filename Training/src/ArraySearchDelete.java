import java.util.Scanner;

public class ArraySearchDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size N: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        // Search or Delete
        System.out.print("Enter S to search, D to delete: ");
        char choice = scanner.next().charAt(0);

        if (choice == 'S') {
            System.out.print("Enter X to search: ");
            int X = scanner.nextInt();
            int index = -1;
            for (int i = 0; i < N; i++) {
                if (array[i] == X) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                System.out.println("Found at index: " + index);
            } else {
                System.out.println("Not found");
            }

        } else if (choice == 'D') {

            System.out.print("Enter index to delete: ");
            int index = scanner.nextInt();
            if (index >= 0 && index < N) {
                System.out.print("New array: ");
                for (int i = 0; i < N; i++) {
                    if (i != index) {
                        System.out.print(array[i] + " ");
                    }
                }
                System.out.println();
            } else {
                System.out.println("Invalid index");
            }
        } else {
            System.out.println("Invalid choice");
        }
    }
}

