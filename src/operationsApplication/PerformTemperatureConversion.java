package operationsApplication;

import operationsLibrary.TemperatureConverter;
import java.util.Scanner;

public class PerformTemperatureConversion {

    public void startConversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Please choose a conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheitResult = TemperatureConverter.celsiusToFahrenheit(celsius);
                System.out.printf("Result: %.2f°C = %.2f°F%n", celsius, fahrenheitResult);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsiusResult = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
                System.out.printf("Result: %.2f°F = %.2f°C%n", fahrenheit, celsiusResult);
                break;
            default:
                System.out.println("Invalid choice. Please run the program again.");
        }

        scanner.close();
    }
}
