import java.util.*;
public class functionandmethods {
    /*public static void printMyName (String name) {
        System.out.println(name);
        return;
    }
    public static int calcSum(int a,int b) {
        int sum = a+b;
        return sum;
    }

    public static int calcProd(int a,int b) {
        int prod=a*b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        
        printMyName(name);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=calcSum(a,b);
        System.out.println("Sum is "+sum);
        int prod=calcProd(a ,b);
        System.out.println("Product is "+prod);


        
        //System.out.println("Hello world");
    }
    */


/*
1    Enter 3 numbers from the user & make a function to print their average.
2    Write a function to print the sum of all odd numbers from 1 to n.
3   Write a function which takes in 2 numbers and returns the greater of those two.
4    Write a function that takes in the radius as input and returns the circumference of a circle.
5   Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
6    Write an infinite loop using do while condition.
7   Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
8   Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
9   Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
10  Write a program to print Fibonacci series of n terms where n is input by user :
    0 1 1 2 3 5 8 13 21 ..... 
    In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
    (BONUS)
 */

 public static int average(int a,int b,int c) {
    int Avg=(a+b+c)/3;
    System.out.println(Avg);
    return Avg;
}

    
    public static void main(String[] args) {
        //1 
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        average(a,b,c);
        
        
        sc.close();
        
    }

   



}




