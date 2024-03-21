public class Point { //creation de classe Point
    private char nom;
    private  double abscisse;

    public void initialiser (char nom,double abscisse){ //fonction initialiser
        this.nom = nom;
        this.abscisse=abscisse;
    }
    public void initialiser (Point autrepoint){
        this.nom=nom;
        this.abscisse=abscisse;
    }
    public void afficher(){
        System.out.println("Point"+ nom +" :Abscisse= "+ abscisse);
    }
    public void translate(double valeur){
    abscisse += valeur;
    }
    }



