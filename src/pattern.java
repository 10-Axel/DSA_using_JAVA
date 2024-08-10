import java.util.*;
public class pattern {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        /*for (int i=1; i<=n ;i++ ) {
            for ( int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for( int k=1; k<=2*(n-i) ; k++) {
                    System.out.print(" ");
                }
            for (int j=1; j<=i ; j++)  {
                System.out.print("*");
            }  
            System.out.println();
        }
        for (int i=n; i>=1 ;i-- ) {
            for ( int j=i; j>=1; j--) {
                System.out.print("*");
            }
            for( int k=2*(n-i); k>=1 ; k--) {
                    System.out.print(" ");
                }
            for (int j=i; j>=1 ; j--)  {
                System.out.print("*");
            }  
            System.out.println();
        }*/
        for ( int i=1; i<=n; i++) {
            int j;
            for ( j=n; j>=1;j--) {
                if(j<=i) {
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");
                }
            }
            while(j<i-1) {
                System.out.print(j+2);
                j++;
            }
            System.out.println();

        }




    }    
}
