package TondeuseHappyMeal.Object;

public class Obstacle{ // creation de la classe GrilleObject qui servira pour la creation d'objet dans la grille
    private int positionL;
    private int positionH;
    private char [][]positionObstacle;

    public Obstacle(int L, int H){
        this.positionL = L;
        this.positionH = H;
        positionObstacle = new char[L][H]; // Position de l'obstacle
    }
}

