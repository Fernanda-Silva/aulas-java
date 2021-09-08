package aulas.cap02.exemplos;

public class Exemplo4 {
    public static void main(String[] args) {
    
        String s1 = "10";
        int v = Integer.parseInt(s1); // passar de striang para inteiro
        float x = Float.parseFloat(s1); // passar de string para float
        double y = Double.parseDouble(s1); // passar de string para double
        int w = (int) x;
        int z = (int) y;
        String s2 = String.valueOf(v);
        System.out.println(s2 + w + z);

    }
}
