package Business.AllergyList.Controller;
import Business.AllergyList.Model.DAOException;
import Business.AllergyList.Model.DAODerby; 
import Business.AllergyList.Model.DAO; 
import java.util.List;

/**
 * @author Conrado Werlang
 * @author Gabriel Mattos
 * @author Marina Barros
 */

public class Allergy {
    private String allergyName;
    private int count =0;
    

public Allergy(String allergyName, int count) {
        this.allergyName = allergyName;
        this.count = count;
    }
    
    public String getAllergyName() {
        return allergyName;
    }

    public void setAllergyName(String allergyName) {
        this.allergyName = allergyName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    @Override
    public String toString(){
        return allergyName;
    }
    
    public static void main(String[] args) throws DAOException{
        {
		DAO test =  new DAODerby();
                List<Allergy> Livro = test.buscarTodos();
                System.out.print(Livro);
                    
	}
    }
    
    
}
