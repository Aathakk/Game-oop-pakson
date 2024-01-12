package game_ps;


public class Game_PS {

    public static void main(String[] args) {
        //buat Objek
        Player Hero = new Player();
        Player Enemy = new Player();
        
        //memberi nilai atribut
        Hero.name = "Ata";
        Hero.speed = 20;
        Hero.HealthPoint = 100;
        Hero.damage = 100;
        Hero.armor = 50;
        
        Enemy.name  = "Napis";
        Enemy.speed = 25;
        Enemy.HealthPoint = 100;
        Enemy.damage = 65;
        Enemy.armor = 50;
        
        
        //menjalankan 
        Hero.run();
        Enemy.run();
        Enemy.attack();
        Hero.defense();
        Hero.attack();
        
        //mati
        if(Hero.isDead()){
            System.out.println("Game Over!!");
            
         if(Enemy.isDead()){
            System.out.println("Game Over!!");
         }
        }
        
    }
    
}
