package Codigo;




public class PessoaJuridica extends Pessoa {
    
    private static int idClientePJ = 0;
    private String CNPJ;
    private String razaoSocial;
    
    
    public PessoaJuridica(String CNPJ){
        
        this.CNPJ = CNPJ;
        idClientePJ++;
    }

    public String getCNPJ() {
        return this.CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
     public int getIDCliente(){
       return idClientePJ;
   }
    
    
}
