package poly.metier;

public class Calcul {
    private CalculCarre calculCarre;
    private CalculSomme calculSomme;

    public Calcul(CalculCarre calculCarre, CalculSomme calculSomme) {
        this.calculCarre = calculCarre;
        this.calculSomme = calculSomme;
    }

    public double pithagore(double a, double b) {
        double aCarre = calculCarre.carre(a, 2);
        double bCarre = calculCarre.carre(b, 2);
        return Math.sqrt(calculSomme.somme(aCarre, bCarre));
    }
}
