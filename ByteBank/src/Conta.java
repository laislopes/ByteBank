
public abstract class Conta {
    
    private int numeroDaConta;
    private int numeroAgencia;
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
    }
         