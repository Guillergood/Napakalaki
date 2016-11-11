/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author guillermo
 */



public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList<Monster> monstruos = new ArrayList();
    
    static ArrayList<Monster> getLevelOver10(){
    
        ArrayList<Monster> result = new ArrayList();
            for (Monster m:monstruos)
            {
                if (m.getCombatLevel() > 10)
                    result.add(m);
            }
        
        
        return result;
     
    
    }
    
      static ArrayList<Monster> getLoseLevel(){
    
        ArrayList<Monster> result = new ArrayList();
            for (Monster m:monstruos)
            {
                if (m.getBadConsequence().getLevels() > 0 &&
                    m.getBadConsequence().getVisibleTresures() == 0 &&
                    m.getBadConsequence().getHiddenTresures() == 0 &&
                    m.getBadConsequence().getDeath() == false)
                    result.add(m);
         
            }
        
        
        return result;
     
    
    }
        
        
    static ArrayList<Monster> getGainLevel(){
    
        ArrayList<Monster> result = new ArrayList();
            for (Monster m:monstruos)
            {
                if (m.getPrize().getLevel() > 1)
                    result.add(m);
         
            }
        
        
        return result;
     
    
    }
    
   static ArrayList<Monster> getLoseTreasures(){
    
        ArrayList<Monster> result = new ArrayList();
            for (Monster m:monstruos)
            {
                if (m.getBadConsequence().getHiddenTresures()
                        + m.getBadConsequence().getVisibleTresures() > 0)
                    result.add(m);
         
            }
        
        
        return result;
     
    
    }
    
    
    
    static void meteMonstruos () {
        
    // EL REY DE ROSADO    
    //------------------------------------------------------------------------//    
        BadConsequence badConsequence =
        new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles", 5, 3, 0);
        
        Prize prize = new Prize(3,2);
        
        monstruos.add(new Monster("El rey de rosado", 11, 
                badConsequence, prize));
     
    //------------------------------------------------------------------------//
        
        
    // DEMONIOS DE MAGALUF    
    //------------------------------------------------------------------------//    
        
        badConsequence =
        new BadConsequence("Te atrapan para llevarte de fiesta y te dejan caer "
        +"en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",0,
        new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
        new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
        prize = new Prize(4,1);
        monstruos.add(new Monster("Demonios de Magaluf", 2, badConsequence,
        prize));
        
    //------------------------------------------------------------------------//    
    
    // TENOCHLITLAN
    //------------------------------------------------------------------------//    
        
        badConsequence =
        new BadConsequence("Embobados con el lindo primigenio "
                + "te descartas de tu casco visible",0,
        new ArrayList(Arrays.asList(TreasureKind.HELMET)),
        new ArrayList());
        
        prize = new Prize(1,1);
        
        monstruos.add(new Monster("Tenochlitlan", 2, badConsequence,
        prize));
        
    //------------------------------------------------------------------------//    
    
    // H.P. MUNCHCRAFT
    //------------------------------------------------------------------------//    
        
        badConsequence =
        new BadConsequence("Pierdes la armadura visible ",0,
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
        new ArrayList());
        
        prize = new Prize(2,1);
        
        monstruos.add(new Monster("H.P. Munchcraft", 6, badConsequence,
        prize));
        
    //------------------------------------------------------------------------//    
    
    // LOS HONDOS
    //------------------------------------------------------------------------//    
        
        badConsequence =
        new BadConsequence("Estos monstruos resultan bastantes superficiales "
                + "y te aburren mortalmente. Estas muerto ",true);
        
        prize = new Prize(2,1);
        
        monstruos.add(new Monster("Los hondos", 8, badConsequence,
        prize));
        
    //------------------------------------------------------------------------//    
    
    // DAMEARGO
    //------------------------------------------------------------------------//    
        
        badConsequence =
        new BadConsequence("Te intentas escaquear. Pierdes una mano visible",0,
        new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
        new ArrayList());
        
        prize = new Prize(2,1);
        
        monstruos.add(new Monster("Dameargo", 2, badConsequence,
        prize));
        
    //------------------------------------------------------------------------//    
    
    // YSKHTIHYSSG-GOTH
    //------------------------------------------------------------------------//    
        
        badConsequence =
        new BadConsequence("No le hace gracia que pronuncien mal su nombre."
                + " Estas muerto",true);
        
        prize = new Prize(3,1);
        
        monstruos.add(new Monster("Yskhtihyssg-Goth", 14, badConsequence,
        prize));
        
    //------------------------------------------------------------------------//    
    
    // ROBOGGOTH
    //------------------------------------------------------------------------//    
        
        badConsequence =
        new BadConsequence("La quinta directiva primaria te obliga a perder "
                + "2 niveles y 1 tesoro de 2 manos visible",2,
        new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),
        new ArrayList());
        
        prize = new Prize(2,1);
        
        monstruos.add(new Monster("Roboggoth", 8, badConsequence,
        prize));
        
    //------------------------------------------------------------------------//    
    
    // TONGUE
    //------------------------------------------------------------------------//    
        
        badConsequence =
        new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles "
                + "y 5 tesoros visibles",2,5,0);
        
        prize = new Prize(2,1);
        
        monstruos.add(new Monster("Tongue", 19, badConsequence,
        prize));
        
    //------------------------------------------------------------------------//    
    
    // FAMILIA FELIZ
    //------------------------------------------------------------------------//    
        
        badConsequence =
        new BadConsequence("La familia te atrapa. Estas muerto ", true);
        
        prize = new Prize(3,1);
        
        monstruos.add(new Monster("Familia Feliz", 1, badConsequence,
        prize));
        
    //------------------------------------------------------------------------//    
    
    // BICEFALO
    //------------------------------------------------------------------------//    
        
        badConsequence =
        new BadConsequence("Te faltan manos para tanta cabeza. Pierdes 3 niveles"
                + " y tus tesoros visibles de las manos",3,
        new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS,
                TreasureKind.ONEHAND, TreasureKind.ONEHAND)),
        new ArrayList());
        
        prize = new Prize(2,1);
        
        monstruos.add(new Monster("Bicefalo", 21, badConsequence,
        prize));
        
    //------------------------------------------------------------------------//

    // BYAKHEES DE BONANZA
    //------------------------------------------------------------------------//
       
        badConsequence =
        new BadConsequence("Pierdes tu armadura visible y otra oculta", 0,
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        prize = new Prize(2,1);
        monstruos.add(new Monster("Byakhees de bonanza", 8, badConsequence,
        prize));
       
    //------------------------------------------------------------------------//
       
    // EL SOPOR DE DUNWICH
    //------------------------------------------------------------------------//
      
        badConsequence =
        new BadConsequence("El primordial bostezo contagioso. " 
        + "Pierdes el calzado visible", 0,
        new ArrayList(Arrays.asList(TreasureKind.SHOES)),
        new ArrayList());
        prize = new Prize(1,1);
        monstruos.add(new Monster("El sopor de Dunwich", 2, badConsequence,
        prize));
           
    //------------------------------------------------------------------------//
    
    // EL GORRÓN EN EL UMBRAL
    //------------------------------------------------------------------------//
      
        badConsequence =
        new BadConsequence("Pierdes todos tus tesoros visibles", 0,
        Integer.MAX_VALUE, 0);
        prize = new Prize(3,1);
        monstruos.add(new Monster("El gorrón en el umbral", 13, badConsequence,
        prize));
       
    //------------------------------------------------------------------------//
       
    
    // NECRÓFAGO
    //------------------------------------------------------------------------//
      
        badConsequence =
        new BadConsequence("Descarta la armadura visible"
        + "Sientes bichos bajo la ropa. ", 0,
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
        new ArrayList());
        prize = new Prize(1,1);
        monstruos.add(new Monster("Necrófago", 13, badConsequence,
        prize));    
       
    //------------------------------------------------------------------------//
    
    // FLECHERZ
    //------------------------------------------------------------------------//
      
        badConsequence =
        new BadConsequence("Toses los pulmones y pierdes 2 niveles", 2,
        0, 0);
        prize = new Prize(1,1);
        monstruos.add(new Monster("Flecherz", 2 , badConsequence,
        prize));  
       
    //------------------------------------------------------------------------//
     
    // SEMILLAS CTHULHU
    //------------------------------------------------------------------------//
      
        badConsequence =
        new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos", 2,
        0, 2);
        prize = new Prize(2,1);
        monstruos.add(new Monster("Semillas Cthulhu", 4, badConsequence,
        prize));  
       
    //------------------------------------------------------------------------//
    
    // POLLIPÓLIPO VOLANTE
    //------------------------------------------------------------------------//
         
        badConsequence =
        new BadConsequence("Da mucho asquito. Pierdes 3 niveles", 3,
        0, 0);
        prize = new Prize(2,1);
        monstruos.add(new Monster("Pollipólipo volante", 3, badConsequence,
        prize));  
       
    //------------------------------------------------------------------------//
    
    // EL ESPÍA SORDO
    //------------------------------------------------------------------------//
      
        badConsequence =
        new BadConsequence("Te asusta en la noche. " +
        "Pierdes un casco visible", 0,
        new ArrayList(Arrays.asList(TreasureKind.HELMET)),
        new ArrayList());
        prize = new Prize(1,1);
        monstruos.add(new Monster("El espía sordo", 5, badConsequence,
        prize));  
       
    //------------------------------------------------------------------------//
    
        
}
    
    public static void main(String[] args) {
    
     meteMonstruos();
     
     System.out.println(PruebaNapakalaki.getLevelOver10());
     System.out.println(PruebaNapakalaki.getGainLevel());
     System.out.println(PruebaNapakalaki.getLoseLevel());
     System.out.println(PruebaNapakalaki.getLoseTreasures());
        
    }
    
}
