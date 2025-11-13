public class Patterns {
    public static void main(String args[]) {

        //PATTERNS

        System.out.println("1. Rectangle");

        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        //PATTERNS

        System.out.println("2. Hollow Rectangle");    

        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        //PATTERNS

        System.out.println("3. Half Pyramid");

        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //PATTERNS        

        System.out.println("4. Half Pyramid DownLeft");
    
        for(int i = 4; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //PATTERNS 

        System.out.println("5. Half Pyramid UpRight");

        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 4-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //PATTERNS 

        System.out.println("6. 1 to 5 Pyramid");

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }   // ✅ closing brace added here

        //PATTERNS 

        System.out.println("\n7. 1 to 5 Pyramid DownLeft\n");

        for(int i = 1; i <= 6; i++) {
            for(int j = 1; j <= 6 - i + 1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //PATTERNS 

        System.out.println("8. Floyds Triangle");

        int n = 5;
        int number = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(number+" "); 
                number++;
            }
            System.out.println();
        }

        //PATTERNS 

        System.out.println("9. Zero One Triangle");

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                int sum = i + j;
                if(sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        //PATTERNS 

        System.out.println("10. Butterfly Pattern");

        //Upper Half
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            int space = 2 * (5-i);
            for(int j=1; j<=space; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower Half
        for(int i=5; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            int space = 2 * (5-i);
            for(int j=1; j<=space; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //PATTERNS 

        System.out.println("11. Rhombus");

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("12. Number Pyramid");
        
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //PATTERNS 

        System.out.println("13. Palindromic Pattern");

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5-i; j++) {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //PATTERNS

        System.out.println("14. Diamond Pattern");

        for(int i=1; i<=4; i++) {
            for(int j=1; j<=4-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=4; i>=1; i--) {
            for(int j=1; j<=4-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
