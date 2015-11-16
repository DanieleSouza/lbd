package visual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseModel {
    private static final String DB_URL = "jdbc:oracle:thin:@camburi.pucrs.br:1521:facin11g";
    
    private static final String USER = "xxxxxxxx";
    private static final String PASS = "xxxxxxxx";
    
    private Connection conn = null;
    
    public DatabaseModel() throws Exception {
	// registra o driver durante execução do código fonte
        Class.forName("oracle.jdbc.OracleDriver");

        // abre uma conexão com o banco de dados
        conn = DriverManager.getConnection(DB_URL, USER, PASS);  
    }
    
    public void createDatabase() throws Exception {
        // throw new Exception("Implement createDatabase method from InquireModel class!");
    }
    
    public void clearDatabase() throws Exception {
        // throw new Exception("Implement clearDatabase method from InquireModel class!");
    }

    /**
     * Código de exemplo. Modificar para a base escolhida.
     * @param typeQuery O índice da consulta na lista de consultas.
     * @return Lista de resultados da base de dados.
     * @throws Exception 
     */
    public ArrayList<String> query(int typeQuery) throws Exception {    
//        Statement st = conn.createStatement();
//        ResultSet rs = st.executeQuery("SELECT * FROM INGREDIENTES");
        
	ArrayList<String> results = new ArrayList<>();
	results.add("Implemente-me!");
	
//        System.out.println("INGREDIENTES:");
//        while(rs.next()) {
//            String id = rs.getString("idingrediente");
//            String nome = rs.getString("nome");
//	    
//	    results.add("ID: " + id + '\t' + "NOME: " + nome);
//        }
//        
//        st.close();
//        rs.close();
	
	return results;
    }
    
    public void closeConnections() throws Exception {
	conn.close();
    }
}
