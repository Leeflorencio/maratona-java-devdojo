package academy.devdojo.maratonajava.introducao;

import java.util.Date;

/* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
    Eu <nome>, morando no endereço <endereço>,
    confirmo que recebi o salário de <salario>, na data <data>
  */
public class TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Leticia";
        String endereco = "Avenida Moacir, 540 - São Paulo";
        double salario = 2500D;
        String dataRecebimento = "05.04.2023";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco +
                ", confirmo que recebi o salário de R$" + salario + ", na data " + dataRecebimento;

        System.out.println(relatorio);
    }
}
