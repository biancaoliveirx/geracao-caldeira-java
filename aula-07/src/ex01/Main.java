package ex01;

public class Main {
    public static void main(String[] args) {
        Desenhavel circulo = new Circulo();
        Desenhavel quadrado = new Quadrado();

        circulo.desenhar();
        quadrado.desenhar();
    }
}
