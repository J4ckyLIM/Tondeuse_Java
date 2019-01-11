package TondeuseHappyMeal.utils;
import TondeuseHappyMeal.Object.Tondeuse;

public enum Ordre {
    Rotation_Gauche {
        public void executer(final Tondeuse tondeuse) {
            Tondeuse.RotationGauche();
        }
    },

    Rotation_Droit {
        public void executer(final Tondeuse tondeuse) {
            Tondeuse.RotationDroite();
        }
    },

    Avancer {
        public void executer(final Tondeuse tondeuse) {
            Tondeuse.Avancer();
        }
    };

    abstract void executer(final Tondeuse tondeuse);
    public static void RotationGauche(){

    }
    public static void RotationDroite(){

    }
    public static void Avancer(){

    }
}
