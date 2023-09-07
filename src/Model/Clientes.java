package Model;

import Control.ClienteDAO;

public class Clientes {
    private int id;
    private String nome;
    private String cpf;
    private String celular;
    private String email;
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public static void enviarDados(Clientes dados){
        ClienteDAO enviar = new ClienteDAO();
        enviar.cadastrarClientes(dados);
    }
}
