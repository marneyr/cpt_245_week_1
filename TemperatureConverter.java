public class TemperatureConverter {
    

    private static void convertToCelsius(double degreesInFahrenheit) {

        // #### Assignment Starts Here ####

        /**
         * 
         * Please write an "algorithm" below taking the "input parameter" degreesInFarenheit
         * and converting it to the variable "degreesInCelsius" which will be printed below
         *  
         */

        
        double degreesInCelsius = (degreesInFahrenheit - 32) * (5.0/9);
         
         //convert degrees in fahrenheit to degrees in celsius by taking 32 away from the inputted degrees in Fahrenheit
         //and multiplying this value by 5/9 to determine the degrees in celsius

         // #### Assignment Ends Here ####

        System.out.println(degreesInFahrenheit + " to Celsius is: " + degreesInCelsius);

    }

    public static void main(String[] args) {

        double degreesInFahrenheit = 25;
        

        convertToCelsius(degreesInFahrenheit);


    }
}
