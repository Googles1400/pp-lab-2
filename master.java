import java.util.Scanner;

public class master {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ile ocen chcesz wprowadzić dla elektrotechniki? ");
        int[] eie = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla angielskiego? ");
        int[] angol = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla matematyki? ");
        int[] matematyka = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla fizyki? ");
        int[] fizyka = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla polskiego? ");
        int[] polski = new int[scanner.nextInt()];
        
        wprowadzIWyswietlOceny(eie, scanner, "elektrotechnika");
        wprowadzIWyswietlOceny(angol, scanner, "angielski");
        wprowadzIWyswietlOceny(matematyka, scanner, "matematyka");
        wprowadzIWyswietlOceny(fizyka, scanner, "fizyka");
        wprowadzIWyswietlOceny(polski, scanner, "polski");
        
        double suma = sumaOcen(eie) + sumaOcen(angol) + sumaOcen(matematyka) + sumaOcen(fizyka) + sumaOcen(polski);
        int liczbaOcen = eie.length + angol.length + matematyka.length + fizyka.length + polski.length;
        double srednia = suma / liczbaOcen;
        
        System.out.printf("Średnia wszystkich ocen wynosi: %.2f\n", srednia);
    }
    
    private static void wprowadzIWyswietlOceny(int[] oceny, Scanner scanner, String przedmiot) {
        int suma = 0;
        System.out.println("Wprowadzanie ocen z " + przedmiot + ":");
        for (int i = 0; i < oceny.length; i++) {
            int ocen;
            do {
                System.out.printf("Podaj ocene nr %d z %s: ",i + 1, przedmiot);
                ocen = scanner.nextInt();
            }while (ocen < 1 || ocen > 5);
            oceny[i] = ocen;
            suma += oceny[i];
        }
        
        System.out.print("Wprowadzone oceny z " + przedmiot + ": ");
        for (int ocena : oceny) {
            System.out.print(ocena + " ");
        }
        System.out.println("\nSuma ocen z " + przedmiot + ": " + suma);
        System.out.printf("Średnia ocen z %s: %.2f\n\n", przedmiot, suma / (double)oceny.length);
    }
    
    private static double sumaOcen(int[] oceny) {
        int suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        return suma;
    }
}
