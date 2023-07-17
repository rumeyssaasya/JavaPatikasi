
import java.util.Scanner;
public class kombinasyon {
        static int Faktoriyel(int sayi) {
            int sonuc = 1;
            for(int i = 1; i <= sayi; i++)
            {
                sonuc = sonuc * i;
            }
            return sonuc;
        }
    public static void main(String[] args) {
        Scanner inpi = new Scanner(System.in);
        int n, r,sonuc,a;
        System.out.println("n in r li kombinasyonu için n: ");
        n= inpi.nextInt();

        System.out.println("n in r li kombinasyonu için r: ");
        r= inpi.nextInt();
        while(n<r){
            System.out.println("n için girilen sayı r için girilen sayıdan küçük olamaz.");
            break;}
        System.out.print("C("+n+","+r+") = ");
       
        sonuc = Faktoriyel(n) / ( Faktoriyel(r) * Faktoriyel(n-r) );
        System.out.print(sonuc);
    }
}
