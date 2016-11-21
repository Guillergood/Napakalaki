/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import napakalaki.CombatResult;
import napakalaki.Monster;
import napakalaki.Player;
import napakalaki.Treasure;

/**
 *
 * @author Guillermo & enrique
 */
public class Napakalaki {
    private static Napakalaki instance = null;
    
    private Napakalaki(){
        
    }
    
    private synchronized static void createInstance() {
        if (instance == null) { 
            instance = new Napakalaki();
        }
    }
    
    public static Napakalaki getInstance() {
        if (instance == null) 
            createInstance();
        return instance;
    }
  /*  
    private void initPlayers (ArrayList<String> names){
        
    }
    
    private Player nextPlayer(){
        
    }
    
    private boolean nextTurnAllowed() {
        
    }
    
    private void setEnemies(){
        
    }

    public CombatResult developCombat(){
        
    }
    
    public void discardVisibleTreasures(ArrayList<Treasure> treasures){
        
    }
    
    public void discardHiddenTreasures(ArrayList<Treasure> treasures){
        
    }
    
    public void makeTreasuresVisible(ArrayList<Treasure> treasures){
        
    }
    
    public void initGame(ArrayList<String> players){
        
    }
    
    public Player getCurrentPlayer(){
        
    }

    public Monster getCurrentMonster(){
        
    }
    
    public boolean nextTurn(){
        
    }

    public boolean endOfGame(CombatResult result){
        
    }

    */
}
