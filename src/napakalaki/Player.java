/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author Guillermo
 */
public class Player {
    private String name;
    private int level;
    private boolean death = true;
    private boolean canISteal = true;
    private static final int MAXLEVEL = 10;
    
    
    public Player(String nombre){
        name = nombre;
    }
    
    public String getNombre(){
        return(name);
    }
    
    private void bringToLife(){
        
    }
    
    private int getCombatLevel(){
        
    }
    
    private void incrementLevels(int incremento){
        
    }
    
    private void decrementLevels(int decremento){
        
    }
    
    private void setPendingBadConsequence(BadConsequence bc){
        
    }
    
    private void applyPrize(Monster m){
    
    }
    
    private void applyBadConsequence(Monster m){
        
    }
    
    private boolean canMakeTreasureVisible(Treasure t){
        
    }
    
    private int howManyVisibleTreasures(TreasureKind tKind){
        
    }
    
    private void dieIfNoTreasures(){
        
    }
    
    public boolean isDead(){
        
    }
    
    public ArrayList<Treasure> getHiddenTreasures(){
        
    }
    
    public ArrayList<Treasure> getVisibleTreasures(){
        
    }
    
    public CombatResult combat(Monster m){
        
    }
    
    public void makeTreasureVisible(Treasure t){
        
    }
    
    public void discardVisibleTreasure(Treasure t){
        
    }
    
    public void discardHiddenTreasure(Treasure t){
        
    }
    
    public boolean validState(){
        
    }
    
    public void initTreasures(){
        
    }
    
    public int getLevels(){
        
    }
    
    public Treasure stealTreasure(){
        
    }
    
    public void setEnemy(Player enemy){
        
    }
    
    private Treasure giveMeATreasure(){
        
    }
    
    public boolean canISteal(){
        
    }
    
    private boolean canYouGiveMeATreasure(){
        
    }
    
    private void haveStolen(){
        
    }
    
    public void discardAllTreasures(){
        
    }







    



    
    
    
    
    
    

    
    
    
}
