import java.util.Scanner;
import java.lang.Math;
public class ücgenalan {
    public static void main(String[] args) {
        int k1,k2,k3;
        double alan,s;
        Scanner inp =new Scanner(System.in);
        System.out.println("Kenar uzunluklarını giriniz:");
        k1= inp.nextInt();
        k2= inp.nextInt();
        k3= inp.nextInt();
        s=(k1+k2+k3)/2;
        alan=Math.sqrt(s*(s-k1)*(s-k2)*(s-k3));
        System.out.println("Alan: "+ alan);
    }
}
