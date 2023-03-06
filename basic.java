// public class basic {
//     public static void main(String[] args) {
//         System.out.println("krishna");
//         System.out.print("krishna\n");
//         System.out.println("krishna");
//     }

// }

// public class basic {
//     public static void main(String[] args) {
//         System.out.println("*\n**\n***\n****");
//     }

// }

// public class basic {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 5;
//         int c = a + b ;
//         System.out.println(c);
//     }

// }
// import java.util.Scanner;

// public class basic {
//     public static void main(String[] args) {
//         System.out.println("Enter Your Name :");
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println(name);
//         System.out.println("Roll No.");
//         int rn = sc.nextInt();
//         System.out.println(rn);
//     }

// }

// import java.util.Scanner;

// public class basic {
//     public static void main(String[] args) {
//         System.out.println("Enter First number :");
//         Scanner sc = new Scanner(System.in);
//         int first = sc.nextInt();
//         System.out.println(first);
//         System.out.println("Enter second number");
//         int second = sc.nextInt();
//         System.out.println(second);
//         int sum = first + second;
//         System.out.println("The sum is ");
//         System.out.println(sum);
//     }

// }

// import java.util.Scanner;

// public class basic {
//     public static void main(String[] args) {
//         System.out.println("Enter Any number :");
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         System.out.println(number);
//         if (number%2==0) {
//             System.out.println("It is even");
//         } else {
//             System.out.println("It is odd");
//         }
//     }

// }

// import java.util.Scanner;

// public class basic {
//     public static void main(String[] args) {
//         System.out.println("Enter Two number :");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         // System.out.println(a);
//         // System.out.println(b);
//         if (a == b) {
//             System.out.println("they are equal");
//         } else if (a > b) {
//             System.out.println("a is greater");
//         } else {
//             System.out.println("b is lesser");
//         }
//     }
// }

// import java.util.Scanner;

// public class basic {
//     public static void main(String[] args) {
//         System.out.println("Enter Button :");
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();
//         System.out.println(button);
//         switch(button){
//             case 1:System.out.println("hello");
//             break;
//             case 2:System.out.println("Namaste");
//             break;
//             case 3:System.out.println("Hare Krishna");
//             break;
//             default : System.out.println("invalid");
//         }
//     }
// }

// import java.util.Scanner;

// public class basic {
//     public static void main(String[] args) {
//         System.out.println(" CALCULATOR ");
//         System.out.println("Enter Any Two Number :");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("Press 1 for Addition");
//         System.out.println("Press 2 for Substraction");
//         System.out.println("Press 3 for multiplication");
//         System.out.println("Press 4 for division");
//         System.out.println("Press 5 for modulo");
//         System.out.println("Enter your opertion :");
//         int button = sc.nextInt();
//         switch (button) {
//             case 1:
//                 System.out.println(a + b);
//                 break;
//             case 2:
//                 System.out.println(a - b);
//                 break;
//             case 3:
//                 System.out.println(a * b);
//                 break;
//             case 4:
//                 System.out.println(a / b);
//                 break;
//             case 5:
//                 System.out.println(a % b);
//                 break;

//             default:
//                 System.out.println("invalid");
//         }
//         sc.close(); // Close the Scanner object to free up resources
//     }
// }             

// import java.util.Scanner;

// public class basic {
//     public static void main(String[] args) {
//         System.out.println("Calculator\n");

//         Scanner scanner = new Scanner(System.in);

//         // Get the first number
//         System.out.print("Enter the first number: ");
//         double num1 = scanner.nextDouble();

//         // Get the second number
//         System.out.print("Enter the second number: ");
//         double num2 = scanner.nextDouble();

//         // Display the available operations
//         System.out.println("\nAvailable operations:");
//         System.out.println("1. Addition (+)");
//         System.out.println("2. Subtraction (-)");
//         System.out.println("3. Multiplication (*)");
//         System.out.println("4. Division (/)");
//         System.out.println("5. Modulus (%)");

//         // Get the operation choice
//         System.out.print("\nEnter the operation number: ");
//         int operation = scanner.nextInt();

//         // Perform the selected operation
//         double result = 0;
//         switch (operation) {
//             case 1:
//                 result = num1 + num2;
//                 break;
//             case 2:
//                 result = num1 - num2;
//                 break;
//             case 3:
//                 result = num1 * num2;
//                 break;
//             case 4:
//                 if (num2 == 0) {
//                     System.out.println("\nError: Division by zero");
//                     System.exit(0);
//                 }
//                 result = num1 / num2;
//                 break;
//             case 5:
//                 if (num2 == 0) {
//                     System.out.println("\nError: Modulus by zero");
//                     System.exit(0);
//                 }
//                 result = num1 % num2;
//                 break;
//             default:
//                 System.out.println("\nError: Invalid operation");
//                 System.exit(0);
//         }

//         // Display the result
//         System.out.printf("\nResult: %.2f\n", result);

//         scanner.close(); // Close the Scanner object to free up resources
//     }
// }

// public class basic {
//     public static void main(String args[]) {
//         for (int counter = 0; counter < 10; counter = counter + 1) {
//             System.out.println("Hare Krishna");
//         }
//     }
// }

// public class basic {
//     public static void main(String args[]) {
//         for (int counter = 0; counter < 10; counter = counter + 1) {
//             System.out.print(counter+" ");
//         }
//     }
// }

// public class basic {
//     public static void main(String args[]) {
//         int i = 0;
//         while(i<11){
//             System.out.println("Hare krishna");
//             i++;
//         }
//     }
// }

// import java.util.Scanner;

// public class basic {
//     public static void main(String args[]) {
//         System.out.println("Enter Any Number");
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int sum = 0;
//         for(int i = 0; i<=n;i++){
//             sum = sum + i;
//         }
//         System.out.println(sum);
//         }
// }

// import java.util.Scanner;

// public class basic {
//     public static void main(String args[]) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the value of Row :");
//         int n = scanner.nextInt();
//         System.out.println("Enter the value of Colume :");
//         int m = scanner.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= m; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class basic {
//     public static void main(String args[]) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the value of Row :");
//         int n = scanner.nextInt();
//         System.out.println("Enter the value of Colume :");
//         int m = scanner.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= m; j++) {
//                 if (i == 1 || j == 1 || i == n || j == m) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class basic {
//     public static void main(String args[]) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// public class basic {
//     public static void main(String args[]) {
//         int n = 4;
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// public class basic {
//     public static void main(String args[]) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }

//     }
// }

// public class basic {
//     public static void main(String args[]) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-i+1; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }

//     }
// }

// public class basic {
//     public static void main(String args[]) {
//         int n = 5;
//         int number = 1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println();
//         }

//     }
// }

// public class basic {
//     public static void main(String args[]) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 int sum = i + j;

//                 if (sum % 2 == 0) {
//                     System.out.print("1" + " ");
//                 } else {
//                     System.out.print("0" + " ");
//                 }
//             }
//             System.out.println();
//         }

//     }
// }

// import java.util.Scanner;

// public class basic {
//     public static void main(String args[]) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the value of n :");
//         int n = scanner.nextInt();
//         // upper half
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             int spaces = 2 * (n - i);
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print("");
//             }
//             for (int j = 1; j <= i; i++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         // lower half
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             int spaces = 2 * (n - i);
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print("");
//             }
//             for (int j = 1; j <= i; i++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class basic {
//     public static void main(String args[]) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the value of n :");
//         int n = scanner.nextInt();
//         // upper half
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             int spaces = 2 * (n - i);
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         // lower half
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             int spaces = 2 * (n - i);
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.Scanner;

public class basic {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; i++) {
                 System.out.print(" ");
            }
            for (int j = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}