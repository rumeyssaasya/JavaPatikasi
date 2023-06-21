import java.util.Scanner;
public class fiyat {
    public static void main(String[] args) {
        double a,b,c,d,e,total,kg;
        Scanner inp =new Scanner(System.in);
        System.out.println("Armut için KG cinsinden giriniz");
        a=inp.nextDouble();

        System.out.println("Elma için KG cinsinden giriniz");
        b=inp.nextDouble();

        System.out.println("Domates için KG cinsinden giriniz");
        c=inp.nextDouble();

        System.out.println("Muz için KG cinsinden giriniz");
        d=inp.nextDouble();

        System.out.println("Patlıcan için KG cinsinden giriniz");
        e=inp.nextDouble();
        kg=a+b+c+d+e;
        total=a*2.14+b*3.67+c*1.11+d*0.95+e*5;
        System.out.println("Armut kg:"+""+a+
                "\n"+"Elma kg:"+""+b+
                "\n"+"Domates kg:"+c+
                "\n"+"Muz kg:"+""+d+
                "\n"+"Patlıcan kg:"+""+e);
        System.out.println("Toplam tutar:"+""+total+" , "+"Toplam kilo:"+""+kg);

    }
}
