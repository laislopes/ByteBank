package Codigo;




public class PessoaJuridica extends Pessoa {
    
    private static int idClientePJ = 0;
    private String CNPJ;
    private String razaoSocial;
    private String nomeFantasia;
    private String inscricaoEstadual;
    private String site;
    
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

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getSite() {
        return this.site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    
    
}
