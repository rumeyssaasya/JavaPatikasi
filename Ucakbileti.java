import java.util.Scanner;
public class Ucakbileti {
    public static void main(String[] args) {
        Scanner inpi =  new Scanner(System.in);
        double km;
        int   wtype, age;
        System.out.println("Karmen'e Hoş Geldiniz.\n ************************\n");
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km=inpi.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        age = inpi.nextInt();
        System.out.print(" Gidiş Dönüş için 1 \n Sadecee gidiş için 2 giriniz: ");
        wtype= inpi.nextInt();
        double a=(km*0.10);
        if(km<0 && age<0)
            System.out.println("Mesafe için pozitif sayı girmelisiniz.");
        switch (wtype){
            case 1:
                System.out.println("Bilet fiyatı: "+(a*20/100+a));
                break;
            case 2:
                System.out.println("Bilet fiyatı: "+a);
                break;
        }
        if(age<=12)
            System.out.println("Bilet fiyatınız %50 indirimlidir. "+(a+a*50/100) );
        else if (age>12 && age<24 )
            System.out.println("Bilet fiyatınız %10 indirimlidir. "+(a*10/100+a));

        else if (age>65)
            System.out.println("Biletiniz %30 indirimlidir. "+(a*30/100+a));


    }
}
