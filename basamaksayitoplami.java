import java.util.Scanner;

public class basamaksayitoplami {
    public static void main(String[] args) {
        Scanner inpi = new Scanner(System.in);
        int n,a,counter,b,c,d,sonuc;
        counter = 0;
        sonuc=0;
        System.out.print("Basamak sayı toplamlarını istediğiniz sayıyı giriniz: ");
        n = inpi.nextInt();
        while (n!=0){
            sonuc=n%10 + sonuc;
            n/=10;
            counter++;}

        System.out.println("\n Sayının rakamları toplamı = "+sonuc);

    }
}
