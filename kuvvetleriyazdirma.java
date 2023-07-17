import java.util.Scanner;
public class kuvvetleriyazdirma {
    public static void main(String[] args) {
        Scanner inpi = new Scanner(System.in);
        int n;
        System.out.print("Sınır sayıyı giriniz: ");
        n = inpi.nextInt();

        for(int i=1; i<=n; i*=4)
            System.out.println("4 ün kuvveti olan sayılar: "+ i);
        System.out.println("\n");
        for(int j=1; j<=n; j*=5)
            System.out.println("5'in kuvveti olan sayılar: "+j);


    }
}
