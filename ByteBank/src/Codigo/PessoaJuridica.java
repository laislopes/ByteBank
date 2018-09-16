package Codigo;




public class PessoaJuridica extends Pessoa {
    
    String CNPJ;
    String razaoSocial;
    
    public PessoaJuridica(String CNPJ){
        
        this.CNPJ = CNPJ;
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
    
    
    
    
}
