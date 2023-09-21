public class BoucleForEachSomme {
    
    public static void main(String[] args) {

        // créer un tableau
        int[] valeurs = { 5, 6, 7, 8, 9, 10 };
        int somme = 0;
        for (int v : valeurs) {
            somme += v;
        }
        System.out.println(somme);
    }
}
