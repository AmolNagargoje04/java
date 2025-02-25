public class Practical_9{

    public static int factorialUsingLoop(int number) {
        int fact = 1;
        for (int i = number; i > 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static int factorialUsingRecursion(int number) {
        return (number > 1) ? number * factorialUsingRecursion(number - 1) : 1;
    }

    public static void concatenateUsingString(String[] array) {
        String result = "";
        for (String str : array) {
            result += str;
        }
    }

    public static void concatenateUsingBuffer(String[] array) {
        StringBuffer buffer = new StringBuffer();
        for (String str : array) {
            buffer.append(str);
        }
    }

    public static void concatenateUsingBuilder(String[] array) {
        StringBuilder builder = new StringBuilder();
        for (String str : array) {
            builder.append(str);
        }
    }

    public static void main(String[] args) {
        long start, end;
        int loopDuration = 0, recurDuration = 0;
        long stringTime = 0, bufferTime = 0, builderTime = 0;
        
        int arraySize = Integer.parseInt(args[0]);  
        int[] numbers = new int[arraySize];
        
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = (int) (System.nanoTime() % 50 + 1);
        }
        
        for (int num : numbers) {
            start = System.nanoTime();
            factorialUsingLoop(num);
            end = System.nanoTime();
            loopDuration += (end - start);

            start = System.nanoTime();
            factorialUsingRecursion(num);
            end = System.nanoTime();
            recurDuration += (end - start);
        }

        System.out.println("Avg time for Loop Factorial: " + (loopDuration / arraySize));
        System.out.println("Avg time for Recursive Factorial: " + (recurDuration / arraySize));

        int strArraySize = Integer.parseInt(args[1]);  
        String[] stringArray = new String[strArraySize];
        
        for (int i = strArraySize - 1; i >= 0; i--) {
            stringArray[i] = String.valueOf(System.nanoTime() % 1000 + 1);
        }
        
        start = System.nanoTime();
        concatenateUsingString(stringArray);
        end = System.nanoTime();
        stringTime = end - start;
        
        start = System.nanoTime();
        concatenateUsingBuffer(stringArray);
        end = System.nanoTime();
        bufferTime = end - start;
        
        start = System.nanoTime();
        concatenateUsingBuilder(stringArray);
        end = System.nanoTime();
        builderTime = end - start;
        
        System.out.println("Avg time for String Concatenation: " + (stringTime / strArraySize));
        System.out.println("Avg time for StringBuffer Concatenation: " + (bufferTime / strArraySize));
        System.out.println("Avg time for StringBuilder Concatenation: " + (builderTime / strArraySize));
    }
}

