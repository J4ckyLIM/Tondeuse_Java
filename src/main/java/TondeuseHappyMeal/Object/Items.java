package TondeuseHappyMeal.Object;

public class Items{ // creation de la classe GrilleObject qui servira pour la creation d'objet dans la grille
    private int positionL;
    private int positionH;
    private char [][]positionItems;

    public Items(int L, int H){
        this.positionL = L;
        this.positionH = H;
        char [L][H]positionItems;
    }
}
