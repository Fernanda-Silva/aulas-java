package aulas.cap03.exemplos;

import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null,"Forneça o número do mês");
        if (aux != null){
            try{
                int mês = Integer.parseInt(aux);
                if (mês >= 1 && mês <= 12){ // condições compostas
                    JOptionPane.showMessageDialog(null,"Número de mês válido: \n" + mês);
                } else{
                    JOptionPane.showMessageDialog(null,"Número do mês inválido: \n" + mês);
                }

            } catch (Exception e) { 
                JOptionPane.showMessageDialog(null,"Digite apenas valores inteiros: \n" + e);   
            }
        }
        else {
                JOptionPane.showMessageDialog(null,"Operação Cancelada!"); 
        }
        System.exit(0);
    }
}
