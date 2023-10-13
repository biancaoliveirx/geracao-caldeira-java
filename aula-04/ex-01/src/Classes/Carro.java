package Classes;

public class Carro extends Veiculo{

    private static final double custo_por_km = 0.20;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularCustoViagem(int distancia) {
        return custo_por_km * distancia;
    }
}
