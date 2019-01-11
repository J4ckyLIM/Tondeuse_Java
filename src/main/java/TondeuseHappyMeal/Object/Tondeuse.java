package TondeuseHappyMeal.Object;

public class Tondeuse{ // creation de la classe GrilleObject qui servira pour la creation d'objet dans la grille
    public int positionL;
    public int positionH;
    public char [][]positionTondeuse;
    public int debroussailleuse = 0;

    public Tondeuse(int L, int H){ // on rentre en parametre la position de la tondeuse
        this.positionL = L; // assigne la position en longueur
        this.positionH = H; // assigne la position en hauteur
        positionTondeuse = new char[L][H]; // Position de la tondeuse
        //this.positionTondeuse[positionL][positionH]; // assigne la position de la tondeuse
    }

    public int getDropDebrouissalleuse() {
        return debroussailleuse+=1;
    }
}