import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner inpi= new Scanner(System.in);
        int n1=0,n2=1,t,n;

        System.out.print("Kaçıncı sıraya kadar görmek istiyorsunuz: ");
        n=inpi.nextInt();
        System.out.print(n1+" "+n2);
        for(int i=2; i<=n; i++){
            t = n1+n2;
            n1=n2;
            n2=t;
            System.out.print(" "+t);
        }


    }
}
