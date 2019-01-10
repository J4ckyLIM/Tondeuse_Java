package TondeuseHappyMeal.Object;

public class Tondeuse{ // creation de la classe GrilleObject qui servira pour la creation d'objet dans la grille
    private int positionL;
    private int positionH;
    private char [][]positionTondeuse;
    private int debrouissalleuse = 0;

    public Tondeuse(int L, int H){ // on rentre en parametre la position de la tondeuse
        this.positionL = L; // assigne la position en longueur
        this.positionH = H; // assigne la position en hauteur
        this.positionTondeuse[positionL][positionH]; // assigne la position de la tondeuse
    }

    public int getDebrouissalleuse() {
        return debrouissalleuse+=1;
    }
}


