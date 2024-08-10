import java.util.Scanner;

class First{
    @SuppressWarnings("resource")
    public static void main(String args[] ) {
        Scanner s=new Scanner(System.in);
        /*for( int i=0; i<3; i++){
            System.out.print("a=");
            int a=s.nextInt();
            System.out.print("b=");
            int b=s.nextInt();
            System.out.println("sum"+i+"=");
            int sum=a+b;



        System.out.println(sum);
        }*/
        int n=s.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }



    }    
}