package operationsUnitTesting;

import operationsLibrary.TemperatureConverter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TemperatureUnitTesting {

    @Test
    public void testCelsiusToFahrenheit() {
        // Arrange
        double celsius = 0.0;
        double expectedFahrenheit = 32.0;

        // Act
        double actualFahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);

        // Assert
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001);
    }

    @Test
    public void testFahrenheitToCelsius() {
        // Arrange
        double fahrenheit = 32.0;
        double expectedCelsius = 0.0;

        // Act
        double actualCelsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        assertEquals(expectedCelsius, actualCelsius, 0.001);
    }
}
