import java.util.Scanner;

public class artikyil {
    public static void main(String[] args) {
        Scanner inpi =new Scanner(System.in);
        int a;
        System.out.print("Kontrol etmek istediğiniz yılı giriniz.");
        a=inpi.nextInt();
        if(a%100!=0){
            if(a%4==0)
                System.out.println(a+" bir artık yıldır.");}
        else if (a%100==0) {
            if(a%400==0)
                System.out.println(a+" bir artık yıldır.");
            else if (a%400!=0) {
                System.out.println(a+" bir artık yıl değildir.");

            }
        }
        if (a%4!=0) {
            System.out.println(a+" bir artık yıl değildir.");

        }
    }
}
