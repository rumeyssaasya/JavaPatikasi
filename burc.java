import java.util.Scanner;
public class burc {
    public static void main(String[] args) {
        Scanner inpint = new Scanner(System.in);
        Scanner inpstr = new Scanner(System.in);
        String ay;
        int gun;
        
        System.out.print("Doğduğunuz Ayı giriniz: ");
        ay = inpstr.next();
        System.out.print("Doğdunuz günü giriniz: ");
        gun = inpint.nextInt();


        if(ay.equals("ocak")){
            if(1<=gun&& gun<=21)
                System.out.println("Oğlak burcu");
            else if(22<=gun && gun<=31)
                System.out.println("Kova burcu");}

        if(ay.equals("şubat")){
            if(1<=gun&& gun<=21)
                System.out.println("Kova burcu");
            else if(20<=gun && gun<=29)
                System.out.println("Balık burcu");}

        if(ay.equals("mart")){
            if(1<=gun&& gun<=20)
                System.out.println("Balık burcu");
            if(21<=gun && gun<=31)
                System.out.println("Koç burcu");}

        if(ay.equals("nisan")){
            if(1<=gun&& gun<=20)
                System.out.println("Koç burcu");
            if(21<=gun && gun<=30)
                System.out.println("Boğa burcu");}

        if(ay.equals("mayıs")){
            if(1<=gun&& gun<=21)
                System.out.println("Boğa burcu");
            if(22<=gun && gun<=31)
                System.out.println("İkizler burcu");}

        if(ay.equals("haziran")){
            if(1<=gun&& gun<=22)
                System.out.println("İkizler burcu");
            if(23<=gun && gun<=30)
                System.out.println("Yengeç burcu");}

        if(ay.equals("temmuz")){
            if(1<=gun&& gun<=22)
                System.out.println("Yengeç burcu");
            if(23<=gun && gun<=31)
                System.out.println("Aslan burcu");}

        if(ay.equals("ağustos")){
            if(1<=gun&& gun<=22)
                System.out.println("Aslan burcu");
            if(23<=gun && gun<=31)
                System.out.println("Başak burcu");}

        if(ay.equals("eylül")){
            if(1<=gun&& gun<=22)
                System.out.println("Başak burcu");
            if(23<=gun && gun<=30)
                System.out.println("Terazi burcu");}

        if(ay.equals("ekim")){
            if(1<=gun&& gun<=22)
                System.out.println("Terazi burcu");
            if(23<=gun && gun<=31)
                System.out.println("Akrep burcu");}

        if(ay.equals("kasım")){
            if(1<=gun&& gun<=21)
                System.out.println("Akrep burcu");
            if(22<=gun && gun<=30)
                System.out.println("Yay burcu");}

        if(ay.equals("aralık")){
            if(1<=gun&& gun<=21)
                System.out.println("Yay burcu");
            if(22<=gun && gun<=31)
                System.out.println("Oğlak burcu");}


    }
}
