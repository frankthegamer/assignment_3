import java.util.Scanner;

public class MetricConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        
        System.out.println("Welcome to Metric Converter!\n");

        do {
            System.out.println("Enter a number to choose a conversion:\n");
            System.out.println("1. Millimeters to Inches");
            System.out.println("2. Meters to Kilometers");
            System.out.println("3. Feet to Miles");
            System.out.println("4. Inches to Centimeters");
            System.out.println("5. Fahrenheit to Celsius");
            System.out.println("-1 to exit");
             
            // prompt user for conversion type
            choice = scanner.nextInt();

            if (choice == -1) {
                System.out.println("Exiting the program...");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                continue;
            }

            // prompt user for value to convert
            System.out.print("Enter the value to convert: ");
            double inputValue = scanner.nextDouble();
            double result = 0;

            switch (choice) {
                case 1:
                    result = inputValue / 25.4;
                    System.out.println(inputValue + " mm is " + result + " in");
                    break;
                case 2:
                    result = inputValue / 1000;
                    System.out.println(inputValue + " m is " + result + " km");
                    break;
                case 3:
                    result = inputValue / 5280;
                    System.out.println(inputValue + " ft is " + result + " mi");
                    break;
                case 4:
                    result = inputValue * 2.54;
                    System.out.println(inputValue + " in is " + result + " cm");
                    break;
                case 5:
                    result = (inputValue - 32) / 1.8;
                    System.out.println(inputValue + " F is " + result + " C");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number 1-5");
            }
        } while (true);

        scanner.close();
    }
}
