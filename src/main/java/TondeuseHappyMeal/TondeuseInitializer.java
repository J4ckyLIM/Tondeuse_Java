package TondeuseHappyMeal;
import TondeuseHappyMeal.Object.Grille;

import java.util.Scanner;



    public class TondeuseInitializer{
    private static final String MESSAGE_ACCUEIL = "Bienvenue sur la Tondeuse Happy Meal";

    private static Scanner scan = new Scanner (System.in);

    public static void main(String [] args){
        //afficherMessageAccueil();
        Grille kjfdkjf = new Grille(12,20);
        kjfdkjf.afficherGrille(); 

    }
}
