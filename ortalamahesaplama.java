import java.util.Scanner;

public class ortalamahesaplama {
    public static void main(String[] args) {
        int f,k,m,t,b;
        double avg;
        Scanner inp =new Scanner(System.in);
        System.out.println("Fizik notunuzu giriniz");
        f=inp.nextInt();
        System.out.println("Kimya notunuzu giriniz");
        k=inp.nextInt();
        System.out.println("Matematik notunuzu giriniz");
        m=inp.nextInt();
        System.out.println("Türkçe notunuzu giriniz");
        t=inp.nextInt();
        System.out.println("Biyoloji notunuzu giriniz");
        b=inp.nextInt();
        avg = (f+k+m+t+b)/5;
        if(avg<55)
            System.out.println(avg+" ortalama ile kaldın");
        else
            System.out.println(avg+" ortalama ile geçtin");

    }
}
