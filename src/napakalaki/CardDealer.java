/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author Guillermo
 */
public class CardDealer {

    private static CardDealer instance = null;
    
    private CardDealer(){
        
    }
    
    private synchronized static void createInstance() {
        if (instance == null) { 
            instance = new CardDealer();
        }
    }
    
    public static CardDealer getInstance() {
        if (instance == null) 
            createInstance();
        return instance;
    }
    
    
    private void initTreasureCardDeck(){
        
    }
    
    private void initMonsterCardDeck(){
        
    }
    
    private void shuffleTreasures(){
        
    }
    
    private void shuffleMonsters(){
        
    }
    
    public Treasure nextTreasure(){
        
    }
    
    public Monster nextMonster(){
        
    }
    
    public void GiveTreasureBack (Treasure t){
        
    }
    
    public void GiveMonsterBack (Monster m){
        
    }
    
    public void initCards(){
        
    }
    
}
