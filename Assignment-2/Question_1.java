import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter Full Name with Initial:");
        String fullName = scanner.nextLine();

        System.out.println("Enter Roll Number:");
        String rollNumber = scanner.nextLine();

        System.out.println("Enter Grade:");
        String grade = scanner.nextLine();

        System.out.println("Enter Percentage:");
        String percentage = scanner.nextLine();

        // Output
        System.out.println("\n" + fullName);
        System.out.println(rollNumber);
        System.out.println(grade);
        System.out.println(percentage);

        scanner.close();
    }
}
 