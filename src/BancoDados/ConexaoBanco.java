package BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexaoBanco {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/empresa","root","");
        }catch(Exception erro){
            throw new RuntimeException(erro);
        }
    }
    public static void main(String[]args){
        try{
            new ConexaoBanco().getConnection();
            JOptionPane.showMessageDialog(null,"CONEXÃO COM SUCESSO");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null,"ERRO NA CONEXÃO"+erro);
        }
    }
}
