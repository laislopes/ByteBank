
package Codigo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PessoaJuridicaTableModel extends AbstractTableModel{
    
    List<PessoaFisica> dados = new ArrayList <>();
    String[] colunas = {"ID","Nome", "CPF"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return dados.get(linha).getIDCliente();
            case 1:
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getCPF();
             
                
        }
        return null;
        }
    
    public void addRow(PessoaFisica PF){
        
        this.dados.add(PF);
        this.fireTableDataChanged();
        
    }
    
    
}
