package Classes;

public class Moto extends Veiculo{

    private static final double custo_por_km = 0.15;

    public  Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularCustoViagem(int distancia) {
        return custo_por_km * distancia;
    }
}
