import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę stopni schodów: ");
        int steps = scanner.nextInt();

        // Pętla zewnętrzna iteruje po liczbie stopni
        for (int i = 1; i <= steps; i++) {
            // Wypisywanie spacji, zmniejszającej się z każdym stopniem
            for (int j = steps; j > i; j--) {
                System.out.print("  ");
            }
            // Wypisywanie gwiazdek dla kolejnych stopni
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Przejście do nowego wiersza po każdym stopniu
            System.out.println();
        }

        scanner.close();
    }
}
