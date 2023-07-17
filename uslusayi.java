import java.util.Scanner;
public class uslusayi {
    public static void main(String[] args) {
        Scanner inpi = new Scanner(System.in);
        int alt,us,sonuc;
        sonuc=1;
        System.out.print("Sayıyı giriniz: ");
        alt=inpi.nextInt();
        System.out.print("Üssü giriniz: ");
        us= inpi.nextInt();
        for(int i=1; i<=us;i++)
            sonuc*=alt;
        System.out.println(sonuc);
    }
}
