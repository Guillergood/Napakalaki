/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Guillermo & enrique
 */
public class CardDealer {

    private static CardDealer instance = null;
   
    private ArrayList<Treasure> unusedTreasures;
    
    private ArrayList<Monster> unusedMonsters;
    
    private ArrayList<Treasure> usedTreasures;
    
    private ArrayList<Monster> usedMonsters;
    
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
    
    /*public Treasure nextTreasure(){
        
    }
    
    public Monster nextMonster(){
        
    }*/
    
    public void initCards(){
        
    }
    
    private void initTreasureCardDeck() {

        unusedTreasures = new ArrayList();
        usedTreasures = new ArrayList();
        
        unusedTreasures.add
          (new Treasure("Botas de investigación",   3, TreasureKind.SHOES));
        unusedTreasures.add
          (new Treasure("Capucha de Cthulhu",       3, TreasureKind.HELMET));
        unusedTreasures.add
          (new Treasure("A prueba de babas",        2, TreasureKind.ARMOR));
        unusedTreasures.add
          (new Treasure("Botas de lluvia acida",    1, TreasureKind.BOTHHANDS));
        unusedTreasures.add
          (new Treasure("Casco minero",             2, TreasureKind.HELMET));
        unusedTreasures.add
          (new Treasure("Ametralladora ACME",       4, TreasureKind.BOTHHANDS));
        unusedTreasures.add
          (new Treasure("Camiseta de la ETSIIT",    1, TreasureKind.ARMOR));
        unusedTreasures.add
          (new Treasure("Clavo de rail ferroviario",3, TreasureKind.ONEHAND));
        unusedTreasures.add
          (new Treasure("Cuchillo de sushi arcano", 2, TreasureKind.ONEHAND));
        unusedTreasures.add
          (new Treasure("Fez alópodo",              3, TreasureKind.HELMET));
        unusedTreasures.add
          (new Treasure("Hacha prehistórica",       2, TreasureKind.ONEHAND));
        unusedTreasures.add
          (new Treasure("El aparato del Pr. Tesla", 4, TreasureKind.ARMOR));
        unusedTreasures.add
          (new Treasure("Gaita",                    4, TreasureKind.BOTHHANDS));
        unusedTreasures.add
          (new Treasure("Insecticida",              2, TreasureKind.ONEHAND));
        unusedTreasures.add
          (new Treasure("Escopeta de tres cañones", 4, TreasureKind.BOTHHANDS));
        unusedTreasures.add
          (new Treasure("Garabato místico",         2, TreasureKind.ONEHAND));
        unusedTreasures.add
          (new Treasure("La rebeca metálica",       2, TreasureKind.ARMOR));
        unusedTreasures.add
          (new Treasure("Lanzallamas",              4, TreasureKind.BOTHHANDS));
        unusedTreasures.add
          (new Treasure("Necro-comicón",            1, TreasureKind.ONEHAND));
        unusedTreasures.add
          (new Treasure("Necronomicón",             5, TreasureKind.BOTHHANDS));
        unusedTreasures.add
          (new Treasure("Linterna a 2 manos",       3, TreasureKind.BOTHHANDS));
        unusedTreasures.add
          (new Treasure("Necro-gnomicon",           2, TreasureKind.ONEHAND));
        unusedTreasures.add
          (new Treasure("Necrotelecom",             2, TreasureKind.HELMET));
        unusedTreasures.add
          (new Treasure("Mazo de los antiguos",     3, TreasureKind.ONEHAND));
        unusedTreasures.add
          (new Treasure("Necroplayboycón",          3, TreasureKind.ONEHAND));
        unusedTreasures.add
          (new Treasure("Porra preternatural",      2, TreasureKind.ONEHAND));
        unusedTreasures.add
          (new Treasure("Shogulador",               1, TreasureKind.BOTHHANDS));
        unusedTreasures.add
          (new Treasure("Varita de atizamiento",    3, TreasureKind.ONEHAND));
        unusedTreasures.add
          (new Treasure("Tentáculo de pega",        2, TreasureKind.HELMET));
        unusedTreasures.add
          (new Treasure("Zapato deja-amigos",       1, TreasureKind.SHOES));
        
    }
    
    private void initMonsterCardDeck() {
        
        unusedMonsters = new ArrayList();
        usedMonsters = new ArrayList();
        
        //-----------------------------------------------------------------------  
        
        // EL REY DE ROSADO    
        //----------------------------------------------------------------------  
            BadConsequence badConsequence =
            new BadConsequence(
                             "Pierdes 5 niveles y 3 tesoros visibles", 5, 3, 0);

            Prize prize = new Prize(3,2);

            unusedMonsters.add(new Monster("El rey de rosado", 11, 
                                     badConsequence, prize));

        //----------------------------------------------------------------------

        // DEMONIOS DE MAGALUF    
        //----------------------------------------------------------------------    

            badConsequence =
            new BadConsequence(
                 "Te atrapan para llevarte de fiesta y te dejan caer "
               + "en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",
                0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
                   new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));

            prize = new Prize(4,1);

            unusedMonsters.add(new Monster("Demonios de Magaluf", 2, 
                                            badConsequence, prize));

        //----------------------------------------------------------------------  

        // TENOCHLITLAN
        //---------------------------------------------------------------------- 

            badConsequence =
            new BadConsequence("Embobados con el lindo primigenio "
                             + "te descartas de tu casco visible",
                             0, 
                             new ArrayList(Arrays.asList(TreasureKind.HELMET)),
                             new ArrayList());

            prize = new Prize(1,1);

            unusedMonsters.add(new Monster("Tenochlitlan", 2, badConsequence,
                                                                     prize));

        //----------------------------------------------------------------------  

        // H.P. MUNCHCRAFT
        //----------------------------------------------------------------------  

            badConsequence =
            new BadConsequence("Pierdes la armadura visible ",0,
               new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                                               new ArrayList());

            prize = new Prize(2,1);

            unusedMonsters.add(new Monster("H.P. Munchcraft", 6, badConsequence,
                                                                        prize));

        //----------------------------------------------------------------------    

        // LOS HONDOS
        //----------------------------------------------------------------------  

            badConsequence =
            new BadConsequence(
                    "Estos monstruos resultan bastante superficiales "
                  + "y te aburren mortalmente. Estas muerto ",true);

            prize = new Prize(2,1);

            unusedMonsters.add(new Monster("Los hondos", 8, badConsequence,
                                                                   prize));

        //---------------------------------------------------------------------- 

        // DAMEARGO
        //----------------------------------------------------------------------  

            badConsequence =
            new BadConsequence(
                            "Te intentas escaquear. Pierdes una mano visible",0,
                             new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
                             new ArrayList());

            prize = new Prize(2,1);

            unusedMonsters.add(new Monster("Dameargo", 2, badConsequence,
                                                                 prize));

        //----------------------------------------------------------------------

        // YSKHTIHYSSG-GOTH
        //----------------------------------------------------------------------  

            badConsequence =
            new BadConsequence("No le hace gracia que pronuncien mal su nombre."
                             + " Estas muerto",true);

            prize = new Prize(3,1);

            unusedMonsters.add(new Monster("Yskhtihyssg-Goth", 14,
                                          badConsequence, prize));

        //----------------------------------------------------------------------  

        // ROBOGGOTH
        //----------------------------------------------------------------------

            badConsequence =
            new BadConsequence(
                    "La quinta directiva primaria te obliga a perder "
                  + "2 niveles y 1 tesoro de 2 manos visible", 2,
                    new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),
                    new ArrayList());

            prize = new Prize(2,1);

            unusedMonsters.add(new Monster("Roboggoth", 8, badConsequence,
                                                                  prize));

        //----------------------------------------------------------------------  

        // TONGUE
        //----------------------------------------------------------------------  

            badConsequence =
            new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles "
                             + "y 5 tesoros visibles",2,5,0);

            prize = new Prize(2,1);

            unusedMonsters.add(new Monster("Tongue", 19, badConsequence,
                                                                prize));

        //----------------------------------------------------------------------    

        // FAMILIA FELIZ
        //----------------------------------------------------------------------    

            badConsequence =
            new BadConsequence("La familia te atrapa. Estas muerto ", true);

            prize = new Prize(3,1);

            unusedMonsters.add(new Monster("Familia Feliz", 1, badConsequence,
                                                                      prize));

        //---------------------------------------------------------------------- 

        // BICEFALO
        //----------------------------------------------------------------------   

            badConsequence =
            new BadConsequence(
                    "Te faltan manos para tanta cabeza. Pierdes 3 niveles"
                  + " y tus tesoros visibles de las manos",3,
                    new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS,
                        TreasureKind.ONEHAND, TreasureKind.ONEHAND)),
                    new ArrayList());

            prize = new Prize(2,1);

            unusedMonsters.add(new Monster("Bicefalo", 21, badConsequence,
                                                                  prize));

        //----------------------------------------------------------------------

        // BYAKHEES DE BONANZA
        //----------------------------------------------------------------------

            badConsequence =
            new BadConsequence("Pierdes tu armadura visible y otra oculta", 0,
                             new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                             new ArrayList(Arrays.asList(TreasureKind.ARMOR)));

            prize = new Prize(2,1);

            unusedMonsters.add(new Monster("Byakhees de bonanza", 8, 
                                            badConsequence, prize));

        //----------------------------------------------------------------------

        // EL SOPOR DE DUNWICH
        //----------------------------------------------------------------------

            badConsequence =
            new BadConsequence("El primordial bostezo contagioso. " 
                             + "Pierdes el calzado visible", 0,
                  new ArrayList(Arrays.asList(TreasureKind.SHOES)),
                  new ArrayList());

            prize = new Prize(1,1);

            unusedMonsters.add(new Monster("El sopor de Dunwich", 2,
                                            badConsequence, prize));

        //----------------------------------------------------------------------

        // EL GORRÓN EN EL UMBRAL
        //----------------------------------------------------------------------

            badConsequence =
            new BadConsequence("Pierdes todos tus tesoros visibles", 0,
                                                 Integer.MAX_VALUE, 0);

            prize = new Prize(3,1);

            unusedMonsters.add(new Monster("El gorrón en el umbral", 13,
                                                badConsequence, prize));

        //----------------------------------------------------------------------


        // NECRÓFAGO
        //----------------------------------------------------------------------

            badConsequence =
            new BadConsequence("Descarta la armadura visible"
                             + "Sientes bichos bajo la ropa. ", 0,
                 new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                 new ArrayList());

            prize = new Prize(1,1);

            unusedMonsters.add(new Monster("Necrófago", 13, badConsequence,
                                                                   prize));    

        //----------------------------------------------------------------------

        // FLECHERZ
        //----------------------------------------------------------------------

            badConsequence =
            new BadConsequence("Toses los pulmones y pierdes 2 niveles", 2,
                                                                     0, 0);

            prize = new Prize(1,1);

            unusedMonsters.add(new Monster("Flecherz", 2 , badConsequence,
                                                                  prize));  

        //----------------------------------------------------------------------

        // SEMILLAS CTHULHU
        //----------------------------------------------------------------------

            badConsequence =
            new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos", 2,
                                                                    0, 2);

            prize = new Prize(2,1);

            unusedMonsters.add(new Monster("Semillas Cthulhu", 4,
                                         badConsequence, prize));  

        //----------------------------------------------------------------------

        // POLLIPÓLIPO VOLANTE
        //----------------------------------------------------------------------

            badConsequence =
            new BadConsequence("Da mucho asquito. Pierdes 3 niveles", 3,
                                                                  0, 0);

            prize = new Prize(2,1);

            unusedMonsters.add(new Monster("Pollipólipo volante", 3,
                                           badConsequence,  prize));  

        //----------------------------------------------------------------------

        // EL ESPÍA SORDO
        //----------------------------------------------------------------------

            badConsequence =
            new BadConsequence("Te asusta en la noche. "
                             + "Pierdes un casco visible", 0,
                               new ArrayList(Arrays.asList(TreasureKind.HELMET)),
                               new ArrayList());

            prize = new Prize(1,1);

            unusedMonsters.add(new Monster("El espía sordo", 5, badConsequence,
                                                                       prize));  

        //----------------------------------------------------------------------
    }
    
    private void shuffleTreasures() {
        Collections.shuffle(unusedTreasures);
    }
    
    private void shuffleMonsters() {
        Collections.shuffle(unusedMonsters);
    }
    
    public void giveTreasureBack(Treasure t) {
        usedTreasures.add(t);
    }
    
    public void giveMonsterBack(Monster m) {
        usedMonsters.add(m);
    }
    
}