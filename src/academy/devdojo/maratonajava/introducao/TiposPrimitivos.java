package academy.devdojo.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 10000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        String nome = "Goku";
        int teste = (int) 10000000000L; //casting

        System.out.println("char unicode " +caractere);
        System.out.println("Oi, eu sou o " + nome);
        System.out.println("João tem " + idade + " anos de idade");
    }
}
