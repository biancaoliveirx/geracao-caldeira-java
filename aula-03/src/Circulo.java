public class Circulo {

    private double raio;

    // Construtor
    public Circulo(double raio) {
        if (raio <= 0) {
            System.out.println("Raio deve ser positivo. Definindo para 1 por padrão.");
            this.raio = 1.0;
        } else {
            this.raio = raio;
        }
    }

    // Métodos
    public double calcularArea() {
        return 3.14 * raio * raio;
    }

    public double calcularCircunferencia() {
        return 2 * 3.14 * raio;
    }

    public void definirRaio(double novoRaio) {
        if (novoRaio <= 0) {
            System.out.println("Raio deve ser positivo. Não alterando.");
        } else {
            this.raio = novoRaio;
        }
    }

    public double getRaio() {
        return this.raio;
    }

    public String toString() {
        return "Circulo com raio " + raio + ", área " + calcularArea() + " e circunferência " + calcularCircunferencia();
    }

    public boolean isEqual(Circulo outroCirculo) {
        return this.raio == outroCirculo.getRaio();
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public double calcularAreaSombreada(Circulo maiorCirculo) {
        if (this.raio >= maiorCirculo.getRaio()) {
            System.out.println("Este círculo deve ser o menor para calcular a área sombreada.");
            return 0.0;
        } else {
            double areaMaior = maiorCirculo.calcularArea();
            double areaMenor = this.calcularArea();
            return areaMaior - areaMenor;
        }
    }

    // Testando a classe
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5);
        Circulo c2 = new Circulo(10);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Os círculos são iguais? " + c1.isEqual(c2));
        System.out.println("Área sombreada entre c1 e c2: " + c1.calcularAreaSombreada(c2));
    }
}

