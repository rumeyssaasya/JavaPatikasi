import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        int mesafe;
        double tutar;
        Scanner inp = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz.");
        mesafe= inp.nextInt();
        tutar=mesafe*2.20+10;
        tutar=(tutar<20)?20:tutar;
        System.out.println("Taksimetre tutarı "+tutar);
        }


    }

