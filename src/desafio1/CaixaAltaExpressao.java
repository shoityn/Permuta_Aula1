package desafio1;

public class CaixaAltaExpressao implements Expressao {
    private String texto;

    public CaixaAltaExpressao(String texto) {
        this.texto = texto;
    }

    @Override
    public String interpretar() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            resultado.append(c);
        }
        return resultado.toString();
    }
}
