package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 25;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
        } else
        System.out.println("Não está autorizado a comprar");
    }
}
