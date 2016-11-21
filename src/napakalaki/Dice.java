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
public class Dice {
    
    private static Dice instance = null;
    
    private Dice(){
    }
    
    private synchronized static void createInstance() {
        if (instance == null) { 
            instance = new Dice();
        }
    }
    
    public static Dice getInstance() {
        if (instance == null) 
            createInstance();
        return instance;
    }
    
    public int nextNumber() {
        return (int) Math.random()*6 + 1;
    }
}
