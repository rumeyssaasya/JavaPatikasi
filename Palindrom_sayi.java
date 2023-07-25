import javax.management.StringValueExp;
import java.util.Scanner;
public class Palindrom_sayi {
    public static void main(String[] args) {
        Scanner inpi = new Scanner(System.in);
        int palindrom;
        System.out.print("Sayı giriniz: ");
        palindrom=inpi.nextInt();
        int ilkdeger = palindrom;
        int length = String.valueOf(palindrom).length();

        int kalan,deger=0;
        for (int i = 0; i<length; i++){

            kalan = palindrom % 10;
            deger = deger * 10 + kalan;
            palindrom = palindrom /10;
            System.out.println(deger );
        }

        if(deger == ilkdeger){
            System.out.println(deger + " Palindrom Sayidir.");
        }else{
            System.out.println(deger + " Palindrom Sayi Degildir.");
        }



    }


    }

