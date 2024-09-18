package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoMySQL {

    // Dados de conexão ao banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/BancoDeDados"; // banco de dados
    private static final String USER = "root";  //  usuário MySQL
    private static final String PASSWORD = "18/07/05";  //  senha MySQL

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try {
            // Conectando ao banco de dados
            Connection conexao = conectar();
            System.out.println("Conexão estabelecida com sucesso!");

            // Criando uma consulta para listar os usuários
            String sql = "SELECT * FROM Usuario";
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Exibindo os resultados da tabela Usuario
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                boolean barbeiro = rs.getBoolean("barbeiro");

                System.out.println("ID: " + id + ", Nome: " + nome + ", Email: " + email 
                                    + ", Telefone: " + telefone + ", Barbeiro: " + barbeiro);
            }

            // Fechando recursos
            rs.close();
            stmt.close();
            conexao.close();
            System.out.println("Conexão fechada com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
