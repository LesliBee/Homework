package Class15Homework;

public class Task5 {
    //Write a method to return whether given number is prime or not?

    boolean primeNum(int num) {
        if (num > 1) {
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

        }else {
            return false;
        }
        return true;
    }

}

