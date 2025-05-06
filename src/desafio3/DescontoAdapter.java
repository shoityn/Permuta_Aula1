package desafio3;

public class DescontoAdapter implements CalculadoraDesconto {
    private SistemaDescontoExterno sistemaExterno;

    public DescontoAdapter() {
        this.sistemaExterno = new SistemaDescontoExterno();
    }

    @Override
    public double calcular(double valor, double percentual) {
        return sistemaExterno.aplicarDescontoPercentual(valor, percentual);
    }
}
