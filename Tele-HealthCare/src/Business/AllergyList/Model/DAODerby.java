package Business.AllergyList.Model;
import Business.AllergyList.Controller.Allergy;
import Business.AllergyList.Controller.AllergyList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Conrado Werlang
 * @author Gabriel Mattos
 * @author Marina Barros
 */

public class DAODerby implements DAO {
    
    public List<Allergy> buscarTodos() throws DAOException {
        List<Allergy> Allergy = new ArrayList();
        String sql = "SELECT * FROM Allergy";
        try (Connection conexao = BancoDadosSource.conectarBd()) {
            try (Statement comando = conexao.createStatement()) {
                try (ResultSet variavel = comando.executeQuery(sql)) {
                    while (variavel.next()) {
                        Allergy f1 = new Allergy(
                                variavel.getString("allergyName"),
                                variavel.getInt("count")
                        );
                        
              
                        Allergy.add(f1);
                    }
                    return Allergy;
                }
            }
        } catch (Exception e) {
            throw new DAOException("Falha na busca", e);
        }
    }
       
    
}