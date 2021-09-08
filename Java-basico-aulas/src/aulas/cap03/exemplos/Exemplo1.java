package aulas.cap03.exemplos;

import javax.swing.JOptionPane;

public class Exemplo1 {
    public static void main(String[] args) {
        Object[] op = {"Masculino", "Feminino"};
        String resp = (String) JOptionPane.showInputDialog(null, "Selecione o Sexo:\n",
                        ".:Pesquisa:.", JOptionPane.PLAIN_MESSAGE, null, op, "Masculino");
        if( resp == null){
            JOptionPane.showMessageDialog(null,"Você Pressionou o Cancelar!");
        }
        if( resp == "Masculino"){
            JOptionPane.showMessageDialog(null,"Vocêu é Homem!");
        }    
         if( resp == "Feminino"){
            JOptionPane.showMessageDialog(null,"Vocêu é Mulher!");
        }  
        System.exit(0);  
    }    
}
