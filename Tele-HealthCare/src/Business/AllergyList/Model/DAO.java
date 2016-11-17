package Business.AllergyList.Model;
import Business.AllergyList.Controller.Allergy;
import java.util.List;



/**
 * @author Conrado Werlang
 * @author Gabriel Mattos
 * @author Marina Barros
 */


    
    public interface DAO {
    
	List <Allergy> buscarTodos() throws DAOException;
   
}

    

