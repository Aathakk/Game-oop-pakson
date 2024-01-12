package game_ps;

public class Player {
    //atribut
    String name;
    int speed, HealthPoint;
    int armor,damage;
    
    //method (kalo ga pake void pake return, kalo pake gausah)
    void run(){
        System.out.println(name+" is running ...");
        System.out.println("Health : " + HealthPoint);
        System.out.println("Speed : " + speed);
    }
    
    void attack(){
        System.out.println(name + " is attacking");
        System.out.println("Damage : " + damage);
    }
    
    void leftHealth(){
        System.out.println("Health point");
    }
    
    void defense(){
        System.out.println(name + " is taking cover");
        System.out.println("Defense is increase to : +" + armor);
    }
    
    boolean isDead(){
        if(HealthPoint<=0) return true;
        return false;
    }
    
    boolean IsDead(){
        if(HealthPoint<=0) return true;
        return false;
    }
}
