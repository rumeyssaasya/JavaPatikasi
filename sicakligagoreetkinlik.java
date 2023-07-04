import java.util.Scanner;
public class sicakligagoreetkinlik {
    public static void main(String[] args) {
        int degree ;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sıcaklık Derecesini giriniz:");
        degree= inp.nextInt();
        if(degree>25)
            System.out.println("Önerilen etkinlik yüzme");
        else if (degree<5) {
            System.out.println("Önerilen etkinlik kayak");
        } else if (25>degree && degree>15) {
            System.out.println("Önerilen etkinlik Piknik");
        }else if(degree>5&&degree<15)
            System.out.println("Önerilen etkinlik Sinema");

    }
}
