import java.util.Scanner;

public class master {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ile ocen z elektrotechniki? ");
        int[] eie = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen z fizyki? ");
        int[] fizyka = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen z chemii? ");
        int[] chemia = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen z angielskiego? ");
        int[] angol = new int[scanner.nextInt()];
        
        podajOceny(eie, scanner, "elektrotechniki");
        podajOceny(fizyka, scanner, "fizyki");
        podajOceny(chemia, scanner, "chemii");
        podajOceny(angol, scanner, "angielskiego");
        double suma = 0;

        int liczbaOcen = eie.length + fizyka.length + chemia.length + angol.length;
        suma += sumaOcen(eie);
        suma += sumaOcen(fizyka);
        suma += sumaOcen(chemia);
        suma += sumaOcen(angol);
        double srednia = suma / liczbaOcen;

        System.out.printf("Średnia wszystkich ocen: %.2f", srednia);
    }
    
    private static void podajOceny(int[] oceny, Scanner scanner, String przedmiot) {
        for (int i = 0; i < oceny.length; i++) {
            System.out.printf("Podaj ocenę nr %d z %s: ", i + 1, przedmiot);
            oceny[i] = scanner.nextInt();
        }
    }
    
    private static double sumaOcen(int[] oceny) {
        int suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        return suma;
    }
}