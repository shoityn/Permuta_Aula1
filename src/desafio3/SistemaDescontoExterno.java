package desafio3;

public class SistemaDescontoExterno {
    public double aplicarDescontoPercentual(double valor, double percentual) {
        return valor - (valor * percentual / 100);
    }
}
