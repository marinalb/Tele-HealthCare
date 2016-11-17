package Business.AllergyList;

import Business.AllergyList.Controller.Allergy;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Conrado Werlang
 * @author Gabriel Mattos
 * @author Marina Barros
 */

public class AllergyTestInvalid {
    
    @Test(expected=IllegalArgumentException.class)
	public void testInvalidCountTooShort() {
		Allergy allergy = new Allergy("Alergia a Alimentos", 2);
		int actual = allergy.getCount();
		int expected = 201;
		assertEquals(expected, actual);
	}
        
        @Test(expected=IllegalArgumentException.class)
	public void testInvalidAllergyTooShort() {
		Allergy allergy = new Allergy("Al", 3);
		String actual = allergy.getAllergyName();
		String expected = "Alergia01";
		assertEquals(expected, actual);
    }
    
    
}