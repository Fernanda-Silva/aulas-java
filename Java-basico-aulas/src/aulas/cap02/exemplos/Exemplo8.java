package aulas.cap02.exemplos;

import javax.swing.JOptionPane;

public class Exemplo8 {
    public static void main(String[] args) {
        String aux;
        float largura, comprimento, área, perimetro;
        try {
            aux = JOptionPane.showInputDialog(null,"Entre com o Comprimento: ");
            comprimento = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog(null,"Entre com o Largura: ");
            largura = Float.parseFloat(aux);

            área = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            JOptionPane.showMessageDialog(null, "Área do retângulo: "+ área +
                                                "\nPerimetro do retângulo: "+perimetro);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Houve um erro na conversão dos dados, Digite apenas caracteres numéricos\n "
            +e.toString());

        }
    }
}
