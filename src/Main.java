//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main { //
    /*public static void main(String[] args) {
        exercice1
        Personne p1=new Personne();
        p1.initialiser("BE1120","hammouchi","douaa","hammouchi@gmail",22);
        System.out.println(p1.afficherpersonne());
        }*/
   /* public static void main(String[] args){ //exo2

        Point pointA = new Point();
        pointA.initialiser('A', 35.0);

        // Affichage des caractéristiques du pointA
        System.out.println("Avant translation :");
        pointA.afficher();

        // Translation du pointA de 2.5 unités vers la droite
        pointA.translate(2.5);

        // Affichage des caractéristiques du pointA après translation
        System.out.println("Après translation :");
        pointA.afficher();

    }*/
     public static void main(String[] args){

         Point2 point = new Point2('B', 15.0);
         // Affichage des caractéristiques du point
         System.out.println("Avant effectuer la translation :");
         point.affiche();
         // Translation du point de 2.5 unités vers la droite
         point.translate(2.5);
         // Affichage des caractéristiques du point après translation
         System.out.println("Après effectuer la translation :");
         point.affiche();
     }


    }
