import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Number_guess {
    public static void main(String[] args) {
        Random rand= new Random();
        int selected= rand.nextInt(0,100);

        Scanner inpi = new Scanner(System.in);
        int right=0;
        int number;
        boolean isWin=false;
        boolean isWrong=false;
        while(right<=5){
        System.out.print("0 ile 100 arasında bir sayı giriniz: ");
        number= inpi.nextInt();
        if(number<0&&number>=99){
            System.out.println("Lütfen 1 ile 100 arasında bir sayı giriniz.");

        if(isWrong){
            right++;
            System.out.println("Hatalı giriş yaptınız kalan hakkınız: "+(5-right));
        }
        else {
            isWrong = true;
            System.out.println("Her hatalı girişte hakkınızdan düşülecektir.");
        }}
        if (number < selected){
                right++;
            System.out.println("Daha büyük bir sayı giriniz kalan hakkınız: "+(5-right));
        }
        if (number > selected){
            right++;
            System.out.println("Daha küçük bir sayı giriniz kalan hakkınız: "+(5-right));
        }

            if (number==selected){
            System.out.println("Tebrikler doğru bildiniz.");
            isWin=true;
            break;

        }
            if (right==5){
                System.out.println("Kaybettiniz. Seçilen sayı: "+selected);
            break;}
        }

    }
}
