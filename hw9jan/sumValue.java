package hw9jan;

import java.util.Scanner;

public class sumValue {
    public static int a;
    public static int b;
    public static int sum;
   

    public static int sum (int a, int b ){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        sum = sum(a,b);
        System.out.println("The sum of "+a+" and "+b+" is "+sum);
       


        sc.close();
    }


}