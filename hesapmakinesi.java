import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String[] args) {
        int s1,s2,sonuc,secim;
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        s1= inp.nextInt();
        System.out.print("İkinci sayıyı girniz:");
        s2 = inp.nextInt();

        System.out.println("Yapacağınız işlemi seçiniz:\n 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        secim=inp.nextInt();
        switch (secim){
            case 1:
                sonuc=s1+s2;
                System.out.println("sayı1 + sayı2 = "+sonuc);
                break;
            case 2:
                sonuc=s1-s2;
                System.out.println("sayı1 - sayı2 = "+sonuc);
                break;
            case 3:
                sonuc=s1*s2;
                System.out.println("sayı1 * sayı2 = "+sonuc);
                break;
            case 4:
                sonuc=s1/s2;
                System.out.println("sayı1 / sayı2 = "+sonuc);
                break;

        }
    }
}
