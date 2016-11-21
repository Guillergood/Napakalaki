/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author Guillermo & enrique
 */
public class Player {
    
    private String name;
    private int level;
    private boolean death = true;
    private boolean canISteal = true;
    private static final int MAXLEVEL = 10;
    private ArrayList <Treasure> hiddenTreasures;
    private ArrayList <Treasure> visibleTreasures;
    private Player enemy;
    private BadConsequence pendingBadConsequence;
    
    public Player(String nombre){
        name = nombre;
        // setEnemies
    }
    
    /*private void applyPrize(Monster m) {
        
    }
    
    private void applyBadConsequence(Monster m) {
        
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
   
    public void initTreasures(){
       
    }
   
    public Treasure stealTreasure(){
       
    }
   
    private Treasure giveMeATreasure(){
       
    }
   
    public void discardAllTreasures(){
       
    }
    
    */
    
    public boolean isDead() {
        return (death);
    }
    
    public String getName() {
        return (name);
    }
    
    private int getCombatLevel() {
        int bonus = 0;
        
        for(Treasure t:visibleTreasures)
            bonus += t.getBonus();
        
        return (level + bonus);
    }
    
    private void bringToLife() {
        this.death = false;
    }
    
    private void incrementLevels(int i) {
        level += i;
    }
    
    private void decrementLevels(int i) {
        level -= i;
    }
    
    private void setPendingBadConsequence(BadConsequence b) {
        pendingBadConsequence = b;
    }
    
    private void dieIfNoTreasures() {
        
        if (this.visibleTreasures.isEmpty() && this.hiddenTreasures.isEmpty())
            this.death = true;
        
    }
    
    public boolean validState() {
        return (pendingBadConsequence.isEmpty() &&
                (pendingBadConsequence.getHiddenTreasures() <= 4));
               
    }
    
    private int howManyVisibleTreasures(TreasureKind tKind) {
        int i = 0;
        for (Treasure t : this.visibleTreasures) {

            if (t.getType() == tKind)
                i++;
        }
        
        return i;
    }
    
    public int getLevels() {
        return (level);
    }
    
    public void setEnemy(Player enemy) {
        this.enemy = enemy;
    }
    
    public boolean canISteal() {
        return canISteal;
    }
    
    private void haveStolen() {
        canISteal = false;
    }
    
    private boolean canYouGiveMeATreasure() {
        return (!visibleTreasures.isEmpty());
    }
    
}
