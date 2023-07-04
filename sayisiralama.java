import java.util.Scanner;
public class sayisiralama {
    public static void main(String[] args) {
        int a,b,c;
        String sonuc;
        Scanner inp =new Scanner(System.in);
        System.out.print("Birinci sayı: ");
        a=inp.nextInt();

        System.out.print("İknici sayı: ");
        b=inp.nextInt();

        System.out.print("Üçüncü sayı: ");
        c=inp.nextInt();

        if(a<b){
            if(a<c){
                if(b<c)
                System.out.println(a+"<"+b+"<"+c);
                else
                System.out.println(a+"<"+c+"<"+b);}
        }
        if(c<b){
            if(c<a){
            if(a<b)
                System.out.println(c+"<"+a+"<"+b);
            else
                System.out.println(c+"<"+b+"<"+a);}}
        if(b<a){
            if(b<c) {
            if(a<c)
                System.out.println(b+"<"+a+"<"+c);
            else
                System.out.println(b+"<"+c+"<"+a);
            }
        }

        

    }
}
