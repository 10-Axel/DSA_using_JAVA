import java.util.*;
public class array {
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] marks = new int[size];

        for(int i=0; i<size ; i++) {
            marks[i]=sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);     
        }

    }*/
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int[][] arr= new int[r][c];
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.print("Enter the number to get the location in the matrix : ");
        int n=s.nextInt();
        
        /*for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if(arr[i][j] ==n) {
                    System.out.println("Row = "+(i+1)+" ; Column = "+(j+1));
                }
            }
        }
        s.close();
        

    }
}

