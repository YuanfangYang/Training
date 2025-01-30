import java.util.Scanner;

public class MinuteToYearDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        long years = minutes / (60 * 24 * 365);
        long days = (minutes % (60 * 24 * 365)) / (60 * 24);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}

