import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    private TemperatureConverter converter;

    @BeforeEach
    public void setUp() {
        converter = new TemperatureConverter();
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100, converter.fahrenheitToCelsius(212), 0.01);
        assertEquals(-40, converter.fahrenheitToCelsius(-40), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32, converter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212, converter.celsiusToFahrenheit(100), 0.01);
        assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.01);
    }

    @Test
    public void testKelvinToCel() {
        assertEquals(-273.15, converter.kelvinToCel(0), 0.01);
        assertEquals(0, converter.kelvinToCel(273.15F), 0.01);
        assertEquals(26.85, converter.kelvinToCel(300), 0.01);
    }

    @Test
    public void testIsExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-41));
        assertTrue(converter.isExtremeTemperature(51));
        assertFalse(converter.isExtremeTemperature(-40));
        assertFalse(converter.isExtremeTemperature(50));
        assertFalse(converter.isExtremeTemperature(25));
    }
    @Test
    public void testKelvinToFah() {
        assertEquals(-459.67, converter.kelvinToFah(0), 0.01);
        assertEquals(32, converter.kelvinToFah(273.15), 0.01);
        assertEquals(80.33, converter.kelvinToFah(300), 0.01);
    }
}