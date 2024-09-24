public class TemperatureConverter {

    /**
     * Converts Fahrenheit to Celsius.
     *
     * @param fahrenheit The temperature in Fahrenheit.
     * @return The temperature in Celsius.
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Converts Celsius to Fahrenheit.
     *
     * @param celsius The temperature in Celsius.
     * @return The temperature in Fahrenheit.
     */
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Checks if the given Celsius temperature is extreme.
     *
     * @param celsius The temperature in Celsius.
     * @return True if the temperature is below -40 or above 50, otherwise false.
     */
    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public float kelvinToCel(float kel){
        return (float) (kel - 273.15);
    }

    public double kelvinToFah(double kel) {
        return (kel - 273.15) * 9 / 5 + 32;
    }
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double fahrenheit = 100;
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");

        celsius = 0;
        fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

        double kelvin = 300;
        celsius = converter.kelvinToCel((float) kelvin);
        System.out.println(kelvin + " Kelvin is " + celsius + " Celsius");

        kelvin = 0;
        fahrenheit = converter.kelvinToFah(kelvin);
        System.out.println(kelvin + " Kelvin is " + fahrenheit + " Fahrenheit");
    }
}