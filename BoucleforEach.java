public class BoucleforEach {
    public static void main(String[] args) {

        // créer un tableau
        int[] valeurs = { 5, 6, 7, 8, 9, 10 };
        String[] eleves = { "Ahmed", "Mohamed", "Ali", "" };
        System.out.println();
        for (int v : valeurs) {
            System.out.println(v);
        }

        for (String v : eleves) {
            System.out.println(v);
        }
    }
}
