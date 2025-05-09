import java.util.Scanner;

//Circle class with radius and color.
 
class Circle {
    private double radius;
    private String color;

    //Accept user input for radius and color.
    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Radius of the Circle: ");
        radius = scanner.nextDouble();
        scanner.nextLine();  

        System.out.print("Enter Color of the Circle: ");
        color = scanner.nextLine();
    }

    
    //Calculate and display the area of the circle.
    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("\n--- Circle Details ---");
        System.out.println("Color: " + color);
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f\n", area);
    }
}

public class Question_3 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getInput();
        circle.calcArea();
    }
}
