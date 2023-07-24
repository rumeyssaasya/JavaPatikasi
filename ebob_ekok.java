import java.util.Scanner;
public class ebob_ekok {
    public static int ebob(int n1,int n2){
        while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        return n1;
    }
    public static int ekok(int n1, int n2){
       int ekok;
        ekok= (n1 > n2) ? n1 : n2;

        while(true)
        {
            if( ekok % n1 == 0 && ekok % n2 == 0 )
            {
                ekok =ekok;
                break;
            }
            ++ekok;
        }
        return ekok;
    }
    public static void main(String[] args) {
        Scanner inpi = new Scanner(System.in);
        int n1, n2;
        int ebob,ekok;
        System.out.print("Birinci sayıyı giriniz: ");
        n1=inpi.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2=inpi.nextInt();
        ebob=ebob(n1,n2);
        ekok =ekok(n1,n2);
        System.out.println("Ebob("+n1+","+n2+")="+ebob);
        System.out.println("Ekok("+n1+","+n2+")="+ekok);
    }
}

