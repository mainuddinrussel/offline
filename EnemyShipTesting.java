
package enemyshiptesting;

import java.util.*;

public class EnemyShipTesting {

   
    public static void main(String[] args) {
        
        EnemyShipFactory shipFactory=new EnemyShipFactory();
        //EnemyShip theEnemy=null;
        Random randomGenerator = new Random();
        
        Scanner userInput=new Scanner(System.in);
        
        System.out.println("What type Ship??(U/R/B)");
        
        if(userInput.hasNextLine())
        {
            String typeOfShip=userInput.nextLine();
            theEnemy=shipFactory.makeEnemyShip(typeOfShip);
        }
        
        if(theEnemy!=null)
        {
            doStuffEnemy(theEnemy);
        }
        // TODO code application logic here
    }
    
    public static void doStuffEnemy(EnemyShip anEnemyShip)
    {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
        System.out.println("");
    }
    
}
