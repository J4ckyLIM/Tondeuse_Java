package TondeuseHappyMeal.Object;
import java.util.*;

public class Grille {
    private int nbLigne; // Longueur de la grille (ligne)
    private int nbColonne;  // Hauteur de la grille (colonne)
    private char[][] grille;  // Dimension de la grille

    public Grille(int L, int H) { // Utilisation du constructeur pour instancier la grille
        nbLigne = L;  // nombre de ligne
        nbColonne = H; // nombre de colonne/hauteur
        grille = new char[nbLigne][nbColonne]; // dimension de la grille

        for (int i = 0; i < L; i++) {
            for (int j = 0; j < H; j++) {
                //grille[i][j] = 'X';
            }
        }
    }

    public void afficherGrille(){
        System.out.println(); // Pour retourner a la ligne et avoir un espace
        for (int i = 0; i < nbLigne; i++){
            for (int j = 0; j < nbColonne; j++){
                System.out.print(" | " + grille[i][j]); // permet d'afficher dans chaque "case" un chiffre
            }
            System.out.println(" | "); // ajout des barres pour visualiser la grille
        }
        System.out.println();// Creation d'un espace
    }
}
