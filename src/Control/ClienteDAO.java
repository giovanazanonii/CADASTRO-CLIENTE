package Control;

import BancoDados.ConexaoBanco;
import Model.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ClienteDAO {
    private Connection conectar;
    
    public ClienteDAO(){
        //Conectando com o banco
        conectar = new ConexaoBanco().getConnection();
    }
    //Metodo que ira cadastrar no banco
    public void cadastrarClientes(Clientes dados){
        try{
        //Comando SQL
        String sql = "INSERT INTO tb_clientes(nome,cpf,celular,email)VALUES"+
                "(?,?,?,?)";
     
        //Declaração que será responsável pelo cadastro
        PreparedStatement inserir = conectar.prepareStatement(sql);
        inserir.setString(1,dados.getNome());
        inserir.setString(2,dados.getCpf());
        inserir.setString(3,dados.getCelular());
        inserir.setString(4,dados.getEmail());
        inserir.execute();
        inserir.close();
            JOptionPane.showMessageDialog(null,"CADASTRADO COM SUCESSO");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null,"ERRO NO CADASTRO"+erro);
        }     
    }
}
