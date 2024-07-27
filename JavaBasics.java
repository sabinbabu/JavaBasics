import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
//run code : java JavaBasics.java
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Hello World");
        // System.out.println("Hello again");
        // int a = 1;
        // int b = 2;
        // System.out.println(a+b);
        
        // byte b = 8;
        // System.out.println(b);

     
        
        // System.out.println("Write name");
        // String input = sc.next();
        // System.out.print("Your name is ");
        // System.out.println(input);

        // Scanner sc =new Scanner(System.in);

        // double PIE = 3.14;
        // System.out.print("Enter the radius of circle : ");
        // Double radius = sc.nextDouble();
        // Double area = radius*radius*PIE;
        // System.out.print("The area of circle is: ");
        // System.out.println(area);

        // float a = 88.55f;
        // int b = (int) a++;
        // System.out.println(a==b);

        // System.out.println(a);
        // System.out.println(b);

    //    Integer age = 18;
        // if (age >= 18) {
        //     System.out.println("Awesome");
        // }else{
        //     System.out.println("Grow up some more");
        // }
        
        // switch (age) {
        //     case 18:
        //         System.out.println("Awesome");
        //         break;
        
        //     default:
        //     System.out.println("This is a prank");
        //         break;
        // }

        // int counter = 1;
        // while (counter<6) {
        //     System.out.println("Hello World"); 
        //     counter++;           
        // }

        // for (int number = 1; number <=10; number++) {
        //     System.out.println("________________________");
        //     System.out.println("Table for " + number);
        //     System.out.println("________________________");
        //     for (int counter = 1; counter<=10; counter++) {
        //         System.out.println(number +"*"+ counter +"="+ (number*counter));
        //     }
        // }

        //  Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number : ");
        // int number = sc.nextInt();
        // int counter = 1;
        // int sum = 0;
        // while (counter<=number) {
        //     sum =  sum + counter;
        //     counter++;
        // }
        // System.out.println(sum);


        //reverse
        //  System.out.print("Enter a number : ");
        //  int number = sc.nextInt();
        //  int reverse = 0;

        // while (number>0) {
        //     reverse = number % 10;
        //     number = number/10; 
        //     System.out.print(reverse);           
        // }



        //prime
        // System.out.print("Enter a number : ");
        // int number = sc.nextInt();
    
        // for (int i = 2; i <= Math.sqrt(number); i++) {
        //     if (number%i!=0) {
        //         System.out.println("prime");
        //     }else System.out.println(" not  prime");
        // }




        ///Patterns

        // ****
        // ****
        // ****
        // ****

        // for (int i = 0; i < 4; i++) {
        //     System.out.println("");
        //     for (int j = 0; j < 4; j++) {
        //         System.out.print("*");
        //     }
        // }

        
        // *
        // **
        // ***
        // ****

        // for (int i = 1; i <= 5; i++) {
        //     System.out.println("");
        //     for (int j = 1; j < i; j++) {
        //         System.out.print("*");
        //     }
        // }


        
        // ****
        // ***
        // **
        // * 

        // for (int i = 5; i > 1; i--) {
        //     System.out.println("");
        //     for (int j = i; j > 1; j--) {
        //         System.out.print("*");
        //     }
        // }


        // 1
        // 12
        // 123
        // 1234


        // for (int i = 1; i <= 5; i++) {
        //     System.err.println("");
        //     for (int j = 1; j < i; j++) {
        //         System.err.print(j);
        //     }
        // }


        // A
        // BC
        // DEF
        // GHIJ
    //    int n = 4;
    //    char ch = 'A';

    //     for (int i = 1; i <= n; i++) {
    //         System.err.println("");
    //         for (int j = 1; j <= i; j++) {
    //             System.err.print(ch);
    //             ch++;
    //         }
    //     }
        
        
        // ****
        // *  *
        // *  *
        // ****
        // for (int i = 0; i < 4; i++) {
        //     System.out.println();
        //     for (int j = 0; j <4; j++) {
        //        if (i==0 || i==3 || j==0 || j==3) {
        //         System.out.print("*");
        //        }else{
        //         System.out.print(" ");
        //        }
                
        //     }
        // }


        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *

        // for (int i = 1; i <=4; i++) {
        //     System.out.println();
        //     for (int j = 1; j <=i; j++) {
        //       System.out.print("*");
        //     }

        //     for (int j = 1; j <= 2*(5-i); j++) {
        //         System.out.print(" ");
        //     }

        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        // }

        // for (int i = 5; i >= 1; i--) {
        //     System.out.println();
        //     for (int j = i; j >=1; j--) {
        //         System.out.print("*");
        //     }

        //     for (int j = 1; j <=2*(5-i); j++) {
        //         System.out.print(" ");
        //     }

        //     for (int j = i; j >=1; j--) {
        //         System.out.print("*");
        //     }
        // }



     ///+++++++Function+++++++++++++++++++/// 
     swap(2,6);

    }
    public static void swap(int firstValue, int secondValue){
        int temp = 0;
        temp = firstValue;
        firstValue = secondValue;
        secondValue = temp;
        System.out.println("a: "+firstValue + " b : "+secondValue);
    }
}
