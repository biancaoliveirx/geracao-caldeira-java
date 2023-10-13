package Classes;

public class TesteVeiculos {
    public static void main(String[] args) {
        // Instanciando objetos
        Carro carro = new Carro("Renalt", "Logan", 2022);
        Moto moto = new Moto("Honda", "CBR", 2020);

        // Calculando o custo de viagem para uma distancia de 80km
        double custoViagemCarro = carro.calcularCustoViagem(80);
        double custoViagemMoto = moto.calcularCustoViagem(80);

        // Imprimindo os resultados
        System.out.println("Custo de viagem de 80km com o carro é: R$" + custoViagemCarro);
        System.out.println("Custo de viagem de 80km com a moto é: R$" + custoViagemMoto);
    }

}
