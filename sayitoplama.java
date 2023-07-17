import java.util.Scanner;
public class sayitoplama {
    public static void main(String[] args) {
        Scanner inpi =new Scanner(System.in);
       int x, a=0,i;
        System.out.println("Çift sayı giriniz bitirmek için tek sayı giriniz: ");
        x= inpi.nextInt();
        while(x!=0){
           if(x%4==0 ){
               a+=x;

           }
            System.out.println("Çıkmak için tek sayı giriniz");
           x=inpi.nextInt();
           if(x%2!=0)
               break;
       }
        System.out.println("Girilen sayılardan çift ve 4 e tam bölünenlerin toplamı = "+a);
    }
}
