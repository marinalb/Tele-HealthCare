package Business.AllergyList.Controller;

import java.util.ArrayList;

/**
 * @author Conrado Werlang
 * @author Gabriel Mattos
 * @author Marina Barros
 */
public class AllergyList {
    
      private ArrayList<Allergy> allergyList;
    
      
      public AllergyList(){
          allergyList = new ArrayList<>();
      }

    public ArrayList<Allergy> getAllergyList() {
        return allergyList;
    }

    public void setAllergyList(ArrayList<Allergy> allergyList) {
        this.allergyList = allergyList;
    }
    
    /** Adiciona uma alergia na lista
 * @param allergy Alergia a ser adicionada
 * @result a alergia foi adicionada na lista com sucesso
 */
 
      public Allergy addAllergy(){   
            Allergy allergy = new Allergy("allergyName", 0);
            allergyList.add(allergy);
               return allergy;
        }

    /** Procura uma alergia na lista
 * @param allergy Alergia a ser buscada
 * @result a alergia foi encontrada ou não, com sucesso
 */

      
    public Allergy searchAllergy(String allergy){
        
        for(Allergy a: allergyList)
        {
            if(a.getAllergyName().equals(allergy)){
                return  a;
            }
        }        
        return null;
    }  
      
    @Override
    public String toString(){
        return "AllergyList";
    }
         
}
