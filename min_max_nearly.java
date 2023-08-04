public class min_max_nearly {
    public static void main(String[] args) {
        int list[] = {15, 12, 788, 1, -1, -778, 2, 0};
        int gecici;

        System.out.println("Dizinin küçükten büyüğe doğru sıralanmış hali:\n");
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    gecici = list[i];
                    list[i] = list[j];
                    list[j] = gecici;
                }
            }
        }
        System.out.println("Dizinin sıralanmış hali:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(" "+list[i]+",");

        }
        System.out.println("\n\nDizideki en küçük sayı "+ list[0]+"\nDizide en küçük sayıya en yakın sayı "+list[1]);
        System.out.println("Dizideki en büyük sayı "+ list[7]+"\nDizide en büyük sayıya en yakın sayı "+list[6]);
    }
}
