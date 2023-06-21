import java.util.Scanner;
public class dairealancevre {
    public static void main(String[] args) {
        int r,a;
        double alan,pi=3.14;
        Scanner inp =new Scanner(System.in);
        System.out.print("Yarıçap değerini giriniz:");
        r= inp.nextInt();

        System.out.print("Merkez açısının değerini giriniz:");
        a= inp.nextInt();
        alan=  (pi*r*r*a)/360;
        System.out.println("Daire diliminin alanı="+""+alan);
    }
}
