import java.util.*;
public class Halfparamid {
 public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    int n;
    System.out.println("Enter the number of Rows: ");
    n=s.nextInt();
    s.close();
    for(int i=1;i<=n;i++){      //for(int i=n;i>=1;i--) for reverse
        for(int j=1;j<=i;j++){
            System.out.print("*");
                   }
        System.out.println();
    }

 }   
}
