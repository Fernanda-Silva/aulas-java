package aulas.cap02.exemplos;

import java.io.*;

public class Exemplo5 {
    public static void main(String[] args) {
        String s; //toda forma de entrada de dados via usuário, só entra de forma "STRING"
        float largura, comprimento, área, perímetro;
        DataInputStream dado;
        try { // tratamento de erro, try a tentativa
            System.out.println("Entre com o comprimento");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            comprimento = Float.parseFloat(s);

            System.out.println("Entre com o largura");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            largura = Float.parseFloat(s);

            área = comprimento * largura;
            perímetro = comprimento * 2 + largura * 2;
            System.out.println("Área do retângulo: "+ área);
            System.out.println("Perímetro do retângulo: "+ perímetro);

        } catch (IOException e) {
            System.out.println("Houve um erro na entrada dos dados, "+e.toString());
        }catch (NumberFormatException e) {
            System.out.println("Houve um erro na conversão dos dados, Digite apenas caracteres numéricos "+e.toString());
        }

    }
}
