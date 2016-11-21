/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author Guillermo & enrique
 */
public class Monster {
    private String name;
    private int combatLevel;
    private Prize prize;
    private BadConsequence bc;
    
    
    Monster(String name, int level, BadConsequence bc, Prize prize){
        this.bc = bc;
        this.combatLevel = level;
        this.name = name;
        this.prize = prize;
    }
    
    public String getName(){
        return(name);
    }
    
    public int getCombatLevel(){
        return(combatLevel);
    }
    
    public Prize getPrize(){
        return(prize);
    }
    
    public BadConsequence getBadConsequence(){
        return(bc);
    }

   public int getLevelGained(){
       return prize.getLevel();
   }
   public int getTreasuresGained(){
       return prize.getTreasures();
   }
    
    @Override
    public String toString() {
        return "Monster{" + "name = " + name + 
                ", combatLevel = " + combatLevel + 
                ", prize = " + prize + 
                ", bc = " + bc + '}';
    }
    
    
    
}
