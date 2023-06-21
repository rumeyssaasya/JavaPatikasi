import java.util.Scanner;
public class kdvtutari {
    public static void main(String[] args) {
        int k18, k8,var, wkdv;

        Scanner inp =new Scanner(System.in);
        System.out.println("Para değerini giriniz:");
        var = inp.nextInt();
        if(var<1000 && var>0){
            k18=var*18/100;
            System.out.println("Kdv %18 dir. ve kdv tutarı "+" "+k18+" TL'ye denk geliyor");
            System.out.println("Kdv'li tutar:"+""+(var+k18));;
        }
        if(var>1000){
            k8=var*8/100;
            System.out.println("Kdv %8'dir. ve tutarı "+" "+k8+" TL'ye denk geliyor");
            System.out.println("Kdv'li tutar:"+""+(var+k8));

        }

    }
}
