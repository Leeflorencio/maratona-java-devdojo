package academy.devdojo.maratonajava.introducao;

public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 6000;
       /* String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;

        if(salario > 5000){
            resultado = mensagemDoar;
        } else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
     */

        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(resultado);
    }
}
