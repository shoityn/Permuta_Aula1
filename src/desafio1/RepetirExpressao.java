package desafio1;

public class RepetirExpressao implements Expressao {
    private int vezes;
    private String texto;

    public RepetirExpressao(int vezes, String texto) {
        this.vezes = vezes;
        this.texto = texto;
    }

    @Override
    public String interpretar() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < vezes; i++) {
            resultado.append(texto);
        }
        return resultado.toString();
    }
}
