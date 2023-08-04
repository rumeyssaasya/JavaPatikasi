import java.util.Scanner;
public class palindrom_kelime {
        static boolean isPalindrome(String str) {
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);
            }

            if (str.equals(reverse)){
                System.out.println("Kelime palindromdur.");
                return true;}
            else{
                System.out.println("Kelime palindrom değildir.");
                return false;}
        }
    public static void main(String[] args) {
           Scanner str= new Scanner(System.in);
            String kelime;
        System.out.print("Polindrom kontrolü için kelime giriniz: ");
            kelime= str.nextLine();
            isPalindrome(kelime);


    }
}
