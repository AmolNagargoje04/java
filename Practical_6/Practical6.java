public class Practical6 {

    public static void displayPattern1(int num) {
        int size = num;
        for (int ln = 1; ln <= size; ln++) {
            for (int spaces = 1; spaces <= size - ln; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * ln - 1; stars++) {
                System.out.print("+");
            }
            System.out.println();
        }

        for (int ln = size - 1; ln >= 1; ln--) {
            for (int spaces = 1; spaces <= size - ln; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * ln - 1; stars++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void displayPattern2(int num) {
        int size = num;
        for (int ln = 1; ln <= size; ln++) {
            for (int spaces = 1; spaces <= size - ln; spaces++) {
                System.out.print("    ");
            }
            for (int symbol = 1; symbol <= ln; symbol++) {
                System.out.print("+");
                if (symbol < ln) {
                    System.out.print("       ");
                }
            }
            System.out.println();
        }

        for (int ln = size - 1; ln >= 1; ln--) {
            for (int spaces = 1; spaces <= size - ln; spaces++) {
                System.out.print("    ");
            }
            for (int symbol = 1; symbol <= ln; symbol++) {
                System.out.print("*");
                if (symbol < ln) {
                    System.out.print("       ");
                }
            }
            System.out.println();
        }
    }


    
    
   static void displayPattern3(int size) 
   {
    for(int ln = 1; ln <= 2*size; ln++) {
             if(ln <=size) {
    for(int space = size - ln; space > 0; space--) {
            System.out.print(" ");
         }
     for(int plus = 2*ln-1; plus > 0; plus--) {
         if((ln+plus) % 2 == 0) {
         System.out.print("*");

    }
       else {
        System.out.print("+");
         }
   }
     System.out.print("");
      }else {
      for(int space = 1; space <(ln-size);space++) {
       System.out.print(" ");
         }
     for(int stars = 2*(size-(ln-size)+1)-1; stars > 0; stars--) 
     if((ln+stars) % 2 == 0) {
      System.out.print("*");
        }
         else {
         System.out.print("+");
            }
          }
        System.out.println("");
            }
        }

  
        

    public static void main(String[] args) {
        displayPattern1(3);
        System.out.println();
        displayPattern2(3);
        System.out.println();     
        displayPattern3(4);
        System.out.println();     
    }
}

