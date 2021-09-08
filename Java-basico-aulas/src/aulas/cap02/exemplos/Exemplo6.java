package aulas.cap02.exemplos;

import java.io.*;

public class Exemplo6 {
    public static void main(String[] args) {
        String s; 
        float largura, comprimento, área, perímetro;
        BufferedReader dado;
        try { 
            System.out.println("Entre com o comprimento");
            dado = new BufferedReader (new InputStreamReader(System.in));
            s = dado.readLine();
            comprimento = Float.parseFloat(s);

            System.out.println("Entre com o largura");
            dado = new BufferedReader(new InputStreamReader(System.in)); 
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
