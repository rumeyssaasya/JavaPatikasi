import java.util.Scanner;
public class sayibolme {
    public static void main(String[] args) {
        Scanner inpi = new Scanner(System.in);
        int a, i,j,c=0,s,d;
        System.out.print("Sayı Giriniz: ");
        a=inpi.nextInt();
        for (i=1; i<a; i++){
            if(i%3==0){

            for (j=i; j<=i; j++){
                if(j%4==0){
                    c++;
                System.out.println(" bu sayılar: "+j );}}
            }
        }System.out.println("hem 3'e hem 4'e bölünen "+c+" tane sayı vardır");
        //2.durum
        System.out.println("***************************************************************************");
        System.out.println("Hem 3'e hem 4'e bölünen sayılar. ");
        for (d=1;d<a;d++){
            if(d%3==0 && d%4==0)
                System.out.println(d );
        }


    }
}
