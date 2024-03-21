    public class Personne { //creation de classe personne
     private String CIN;
     private String Nom;
     private String Prenom;
     private String Email;
     private int Age;

     public void initialiser (String CIN, String Nom, String Prenom, String Email, int Age) {
         this.CIN = CIN;
         this.Age= Age;
         this.Email=Email;
         this.Nom=Nom;
         this.Prenom= Prenom;
     }
     public String afficherpersonne (){
         return "CIN= "+ this.CIN + "\nPrenom= "+ this.Prenom + "\nNom= "+ this.Nom +"\nAge = "+ this.Age+"\nEmail = "+this.Email;
     }
}


