import java.sql.SQLOutput;
import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int degisim;
        String kadi, sifre, gsifre, yenisifre ;

        System.out.println("Merhaba kullanıcı adınızı giriniz.");
        kadi = inp.nextLine();

        System.out.println("Merhaba " + kadi + " Şifrenizi giriniz:");
        sifre = inp.nextLine();

        if(sifre.equals("rumeysa"))
            System.out.println("Giriş başarılı");



        else{
            System.out.println("Şifre hatalı.");

        System.out.println("Şifrenizi değiştirmek ister misiniz \n Evet için 1 \n Hayır için 2");
        degisim= inp.nextInt();
        if (degisim==1){
            System.out.println("Yeni Şifrenizi giriniz.");
            yenisifre= inp.nextLine();
            if (sifre.equals(yenisifre))
                System.out.println("Şifreniz eski şifreniz ile aynı olamaz.");
            else
                System.out.println("Şifreniz değiştirildi.");
        }}

        }
    }

