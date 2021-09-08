package aulas.cap03.exemplos;

import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null,"Forneça o numero do mês:");
        if (aux != null){
            try {
                int mês = Integer.parseInt(aux);
                if (mês == 1){
                    aux = "Janeiro";
                } else if (mês == 2){    
                     aux = "Fevereiro";
                } else if (mês == 3){
                     aux = "Março";
                } else if (mês == 4){
                     aux = "Abril";
                } else if (mês == 5){
                     aux = "Maio";
                } else if (mês == 6){
                     aux = "Junho";
                } else if (mês == 7){
                     aux = "Julho";
                } else if (mês == 8){
                     aux = "Agosto";
                } else if (mês == 9){
                     aux = "Setembro";
                } else if (mês == 10){
                     aux = "Outubro";
                } else if (mês == 11){
                     aux = "Novembro";
                } else if (mês == 12){
                     aux = "Dezembro";
                } 
                else{
                    aux = "Mês inválido";
                }
                JOptionPane.showMessageDialog(null, aux);
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
