package ex05;

class CalculadoraSimples implements Calculavel {

    @Override
    public int adicionar(int a, int b) {
        return a + b;
    }

    @Override
    public int subtrair(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }

    @Override
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possivel dividir por 0.");
        }
        return a / b;
    }
}
