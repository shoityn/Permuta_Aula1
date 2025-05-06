package desafio1;

public class Interpretador {
    public static Expressao interpretar(String entrada) {
        if (entrada.startsWith("caixa_alta")) {
            int cmc = entrada.indexOf("\"") + 1;
            int fim = entrada.lastIndexOf("\"");
            String texto = entrada.substring(cmc, fim);
            return new CaixaAltaExpressao(texto);
        }
        else if (entrada.startsWith("repetir")) {
            int cmcPar = entrada.indexOf("(");
            int virgula = entrada.indexOf(",");
            int fimPar = entrada.indexOf(")");

            String nreps = entrada.substring(cmcPar + 1, virgula).trim();
            int n = Integer.parseInt(nreps);

            int cmcText = entrada.indexOf("\"") + 1;
            int fimText = entrada.lastIndexOf("\"");
            String texto = entrada.substring(cmcText, fimText);

            return new RepetirExpressao(n, texto);
        }
        else {
            System.out.println("erro de comando");
            System.out.println();
            return null;
        }
    }
}
