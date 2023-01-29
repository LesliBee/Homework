package Class15Homework;

public class Task4 {
    //Create a method that will say Hello in different language based on the country
    // that will pass when method is executed
    String greetings(String myCountry) {

        switch (myCountry) {
            case "USA":
                return "Hello";

            case "Spain":
                return "Hola";

            case "Italy":
                return "Ciao";

            case "Greece":
                return "Geia";

            default:
                return "Unknown country";
        }
    }
}
