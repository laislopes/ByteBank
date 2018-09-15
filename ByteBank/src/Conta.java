
public abstract class Conta {
    
    private int numeroDaConta;
    private int numeroDaAgencia;
    private Pessoa titularDaConta;
    private double saldoDaConta;
    
    
    public Conta(int numeroDaConta){
        
        if(numeroDaConta > 0){
            
            this.numeroDaConta = numeroDaConta;
        }
        else{
            System.out.println("O número da Conta não pode ser negativo!");
        }
    }

    public int getNumeroDaAgencia() {
        return this.numeroDaAgencia;
    }

    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }

    public double getSaldoDaConta() {
        return this.saldoDaConta;
    }

    public Pessoa getTitularDaConta() {
        return this.titularDaConta;
    }

    public void setNumeroDaAgencia(int numeroDaAgencia) {
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public void setTitularDaConta(Pessoa titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    
    
    }
         