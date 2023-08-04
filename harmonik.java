import java.util.Scanner;
public class harmonik {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double result=0;
        for(double i=1; i<=numbers.length; i++)//Harmonik ortalama hesabı
          result = result + (1/i);
        System.out.println(result);
    }

}
