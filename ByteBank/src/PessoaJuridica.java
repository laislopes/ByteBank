
public class PessoaJuridica extends Pessoa {
    
    String CNPJ;
    
    public PessoaJuridica(String CNPJ){
        
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return this.CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    
}
