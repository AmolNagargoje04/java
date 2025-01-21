
 class Practical5 {

    // Factorial using for loop
    int factorialUsingForLoop(int num) {
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Factorial using while loop
    int factorialUsingWhileLoop(int num) {
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }
    }

 

