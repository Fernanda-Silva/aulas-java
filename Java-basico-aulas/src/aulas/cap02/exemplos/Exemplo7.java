package aulas.cap02.exemplos;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        float largura, comprimento, área, perímetro;
        Scanner dado;
        try { 
            System.out.println("Entre com o comprimento");
            dado = new Scanner(System.in);
            comprimento = dado.nextFloat();

            System.out.println("Entre com o largura");
            dado = new Scanner(System.in); 
            largura = dado.nextFloat();

            área = comprimento * largura;
            perímetro = comprimento * 2 + largura * 2;
            System.out.println("Área do retângulo: "+ área);
            System.out.println("Perímetro do retângulo: "+ perímetro);

        }catch (NumberFormatException e) {
            System.out.println("Houve um erro na conversão dos dados, Digite apenas caracteres numéricos "+e.toString());
        }

    }
}
