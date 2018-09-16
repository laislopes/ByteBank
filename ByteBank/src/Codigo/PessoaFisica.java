package Codigo;



public class PessoaFisica extends Pessoa {
    
    private static int idClientePF = 0;
    private String nome;
    private String CPF;
    private String sexo;
    private String celular;
    
    
    
    public PessoaFisica(String CPF){
        
        this.CPF = CPF;
        idClientePF++;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
   public int getIDCliente(){
       return idClientePF;
   }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
   
   
    
            
}
