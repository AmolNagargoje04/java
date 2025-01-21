
 class Practical5 {

    // Factorial using for loop
    int factorialUsingForLoop(int num) {
        if (num < 0)
        {
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
        if (num < 0) 
        {
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
  
    
    // Factorial using recursion 
    
    int factorialUsingRecursion(int num) {
        if (num < 0)
        {
            return -1;
        }
        if (num == 0 || num == 1) {
        return 1; 
   }
    return num * factorialRecursive(num - 1);
   }
   
   
   //Sum of array elements without using loop
   
   static int sumArray(int[] arr, int n) {
        if (n == 0) 
            return 0;  
        return arr[n - 1] + sumArray(arr, n - 1);
   
   

    }

 

