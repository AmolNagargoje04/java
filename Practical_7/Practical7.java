public class Practical7{
    public static void printname(int size){
     size= size+5;
        for (int ln = 1; ln <= size; ln++) {
             // Print A
            for (int star = 1; star <= size; star++) {
                if (ln == 1 || ln == 4 || star == 1 || star == size) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); 
            
            // Print M
            for (int star = 1; star <= size; star++) {
                if (star == 1 || star == size || (ln == star && star <= size / 2 + 1) || (ln + star == size + 1 && ln <= size / 2 + 1)) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); 
            
             // Print O
            for (int star = 1; star <= size; star++) {
                if (ln == 1 || ln == size || star == 1 || star == size) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); 
            
            // Print L
            for (int star = 1; star <= size; star++) {
                if (star == 1 || ln == size) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println(); // Move to the next row
        }
    }

    public static void main(String[] args) {
        String size1= args[0];
        int size = Integer.parseInt(size1);
        printname(size);
    }
}

