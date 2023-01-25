package academy.devdojo.maratonajava.introducao;

public class Switch {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo

        byte dia = 9;
        // char, int, byte, short, enum, String
        switch(dia){
            case 1 :
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("Segunda-feira");
                break;
            case 3 :
                System.out.println("Terça-feira");
                break;
            case 4 :
                System.out.println("Quarta-feira");
                break;
            case 5 :
                System.out.println("Quinta-feira");
                break;
            case 6 :
                System.out.println("Sexta-feira");
                break;
            case 7 :
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        char sexo = 'F';
        switch (sexo){
            case 'F' :
                System.out.println("Feminino");
                break;
            case 'M' :
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
