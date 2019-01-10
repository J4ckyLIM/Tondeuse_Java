package TondeuseHappyMeal.Object;

public class GrilleObject{ // creation de la classe GrilleObject qui servira pour la creation d'objet dans la grille
        private int positionL;
        private int positionH;
        private char [][]positionObjet;

        public GrilleObject(int L, int H){
                this.positionL = L;
                this.positionH = H;
        }
}
