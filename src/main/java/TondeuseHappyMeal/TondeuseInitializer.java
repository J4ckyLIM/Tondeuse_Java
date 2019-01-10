package TondeuseHappyMeal;
import TondeuseHappyMeal.Object.Grille;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;



    public class TondeuseInitializer{
    private static final String MESSAGE_ACCUEIL = "Bienvenue sur la Tondeuse Happy Meal";

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Fichier:");
        String folder = s.nextLine();
        // Instantiation de la classe reader
        Reader file = new Reader(folder);
        //afficherMessageAccueil();
        Grille LaPelouse = new Grille(12,20); // Initiation de la pelouse à tondre
        LaPelouse.afficherGrille();
        //initialiserTondeuseSurGrille();
        //initialiserObjetsSurGrille();
        //initialiserItemsSurGrille();
        //afficherDemandeInstruction();
        //executerInstruction();
        //afficherPositionFinale();

    }
}
