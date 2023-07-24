import java.util.Scanner;
public class elmas {
    public static void main(String[] args) {
        Scanner inpi = new Scanner(System.in);
        int n;
        System.out.print("Sayı giriniz: ");
        n= inpi.nextInt();

        for (int i=1; i<=n; i++)
            System.out.print(" * ");
        System.out.println("");
        for(int j=1; j<=n+1; j++)
            System.out.print("*  ");

        System.out.println("");
        for(int k=n;k>=0;k--){
            for(int y=1;y <=n-k;y++){
                System.out.print(" ");
            }
            for(int m=1;m<=k;m++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
