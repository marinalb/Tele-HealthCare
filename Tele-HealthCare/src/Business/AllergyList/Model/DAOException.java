package Business.AllergyList.Model;


/**
 * @author Conrado Werlang
 * @author Gabriel Mattos
 * @author Marina Barros
 */

public class DAOException extends Exception{
    
 /** Aponta a exceção 
 * @param falha falha foi encontrada
 * @result Após falha ser encontrada, retorna exceção
 */   
    
     public DAOException(String falha, Exception e) {
        throw new UnsupportedOperationException("Não funcionou!",e);
    }
    
}
