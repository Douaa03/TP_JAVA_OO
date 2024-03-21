public class Point2 {
        private char nom;
        private double abscisse;

        // Constructeur prenant le nom et l'abscisse du point
        public Point2(char nom, double abscisse) {
            this.nom = nom;
            this.abscisse = abscisse;
        }
        public void affiche() {
            System.out.println("Point" + nom + ": Abscisse = " + abscisse);
        }
        // Méthode pour effectuer une translation du point
        public void translate(double valeur) {
            abscisse += valeur;
        }
    }


