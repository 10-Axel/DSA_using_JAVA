import java.util.*;

public class recursion{
    public static void tohanoi(int n,String src,String helper, String dest) {
        if(n==1) {
            System.out.println("transfer disc "+n+" from "+src+" to "+dest);
            return;
        }
        tohanoi(n-1,src,dest,helper);
        System.out.println("transfer disc "+n+" from "+src+" to "+dest);
        tohanoi(n-1,helper,src,dest);
    }

    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        tohanoi(n, "S", "H", "D");

    }
}   
