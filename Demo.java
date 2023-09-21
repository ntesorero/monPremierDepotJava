public class Demo{
    public static void main(String[] args) {
        System.out.println("salut tout le monde");
        Test t1 = new Test();
        int resultat        = t1.add(520, 10);
        double resultatSusbs   = t1.subs(520, 10);
        double resultatMulti   = t1.mult(520, 10);
        double resultatDivi    = t1.divi(520, 10);

        System.out.println("resultat:"+         resultat        );
        System.out.println("resultatSusbs:"+    resultatSusbs   );
        System.out.println("resultatMulti:"+    resultatMulti   );
        System.out.println("resultatDivi:"+     resultatDivi    );
    }
}