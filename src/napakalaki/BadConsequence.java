/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author guillermo
 */
public class BadConsequence {
    private static final int MAXTREASURES = 10;
    private String text;
    private int levels;
    private int nVisibleTresures;
    private int nHiddenTresures;
    private boolean death;
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
        this.text = text;
        this.levels = levels;
        this.nVisibleTresures = nVisible;
        this.nHiddenTresures = nHidden;
    }
    
    public BadConsequence(String text, boolean death){
        this.text = text;
        this.death = death;
    }
    
    public BadConsequence(String text, int levels, 
            ArrayList<TreasureKind> tVisible,ArrayList<TreasureKind> tHidden){
        this.text = text;
        this.levels = levels;
        this.specificVisibleTreasures = tVisible;
        this.specificHiddenTreasures = tHidden;
    }
    
    public boolean isEmpty(){
        
    }
    
    public void substractVisibleTreasure(Treasure t){
        
    }
    public void substractHiddenTreasure(Treasure t){
        
    }
    
    public BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v, 
            ArrayList<Treasure> v){
        
    }
    
    public String getText(){
        return (text);
    }
    
    public int getNVisibleTresures(){
        return(nVisibleTresures);
    }
    
    public int getNHiddenTresures(){
        return(nHiddenTresures);
    }
    
    public int getLevels(){
        return(levels);
    }
    
    public boolean getDeath(){
        return(death);
    }
    
    public ArrayList<TreasureKind> getSpecificHiddenTreasures(){
        return(specificHiddenTreasures);
    }
    
    public ArrayList<TreasureKind> getSpecificVisibleTreasures(){
        return(specificVisibleTreasures);
    }    

    @Override
    public String toString() {
        return "BadConsequence{" + "text=" + text + ", levels=" + levels + 
                ", nVisibleTresures=" + nVisibleTresures + 
                ", nHiddenTresures=" + nHiddenTresures + 
                ", death=" + death + 
                ", specificHiddenTreasures=" + specificHiddenTreasures + 
                ", specificVisibleTreasures=" + specificVisibleTreasures + '}';
    }
    
    
}
