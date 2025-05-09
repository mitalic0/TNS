import java.util.Scanner;

class Student {
    Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Address: ");
        address = scanner.nextLine();

        System.out.print("Enter Phone: ");
        phone = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = scanner.nextDouble();
    }

    public void calculateCommission() {
        double commission;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + commission);
    }
}

public class Question_2 {
    public static void main(String[] args) {
        Student student = new Student();

        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}
