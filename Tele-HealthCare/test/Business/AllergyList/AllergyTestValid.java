package Business.AllergyList;

import Business.AllergyList.Controller.Allergy;
import Business.AllergyList.Controller.AllergyList;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * @author Conrado Werlang
 * @author Gabriel Mattos
 * @author Marina Barros
 */

public class AllergyTestValid {
    
    @Test
	public void testValidAllergy() {
		Allergy allergy = new Allergy("Alergia01", 1);
		String actual = allergy.getAllergyName();
		String expected = "Alergia01";
		assertEquals(expected, actual);
	}

        @Test
	public void testValidAllergyCount() {
		Allergy allergy = new Allergy("Alergia a Alimentos", 2);
		int actual = allergy.getCount();
		int expected = 2;
		assertEquals(expected, actual);
	}
      
        
      
}