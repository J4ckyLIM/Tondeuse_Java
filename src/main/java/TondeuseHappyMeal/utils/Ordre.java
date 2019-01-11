package TondeuseHappyMeal.utils;
import TondeuseHappyMeal.Object.Tondeuse;

public enum Ordre {
    GAUCHE ("Rotation tondeuse vers la gauche"),
    DROITE ("Rotation tondeuse vers la droite"),
    AVANCER ("La tondeuse avance d'une case");
    public String description;

    Order(String description){
        this.description = description;
    }
    public static void Rotation_Gauche(){

    }

    public static void Rotation_Droite(){

    }
    public static void Avancer(){

    }
}
