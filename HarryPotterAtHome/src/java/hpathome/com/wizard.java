package hpathome.com;

public class wizard {


    private int healthPoint; //private pour pas y accéder via le jeu
    private int spell; //On va faire ca comme de l'exp

    public character(){ //stats de notre soricier
        healthPoint = 20;
        spell = 0;
    }

    public enemy(int healthPoint, int spell){ //stat d'un énemie lambda dont on définira les capacités plus tard
        healthPoint = hp;
        spell = sp;
    }

    public int getHealthPoint(){  // pour récupérer les hp
        return healthPoint;
    }

    public int getSpell(){ // pour connaître les spells
        return spell;
    }

    public void setHealthPoint(int hp){ // Pour définir les hp
        healthPoint = hp;
    }

    public void setSpell(int sp){  // Pour définir les spells
        spell = sp;
    }

    public void potion(){
        healthPoint += 4;
        if (healthPoint > 20){
            healthPoint = 20;
        }

    }

    public String soString(){
        if(healthPoint == 20){
            return "Vous avez " + healthPoint + "\r Vous êtes en pleine forme, allons combattre les méchants !";
        } else if (healthPoint > 16) {
            return "Vous avez " + healthPoint + "\r Vous êtes en forme, allons combattre les méchants !";
        } else if (healthPoint > 12) {
            return "Vous avez " + healthPoint + "\r Vous êtes blessé, une potion serait la bienvenue";
        }else if (healthPoint > 8) {
            return "Vous avez " + healthPoint + "\r Vous êtes mal en point, une potion est nécessaire";
        } else if (healthPoint > 4) {
            return "Vous avez " + healthPoint + "\r La pause s'impose";
        } else {
            return "Vous avez " + healthPoint + "\r Arrête d'explorer retourne étudier mon reuf";
        }
    }

}
