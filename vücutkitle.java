import java.util.Scanner;
public class vücutkitle {
    public static void main(String[] args) {
        double kitle, boy,kilo;
        Scanner inp =new Scanner(System.in);
        System.out.println("Sırasıyla boy ve kilonuzu giriniz.");
        boy = inp.nextDouble();
        kilo = inp.nextDouble();
        kitle = kilo / (boy*boy);
        System.out.println("Vücut kitle endeksiniz"+" "+kitle);
    }
}
