import java.util.Scanner;
public class harmonik {
    public static void main(String[] args) {
        Scanner inpi =new Scanner(System.in);
        int n;
        double sonuc=0;
        System.out.print("Harmonik hesaplama için sayı giriniz: ");
        n = inpi.nextInt();
        for(double i=1; i<=n; i++)
            sonuc = sonuc + (1/i);
        System.out.println(sonuc);
    }

}
