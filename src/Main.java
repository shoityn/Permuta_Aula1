import java.util.Scanner;
import desafio1.Expressao;
import desafio1.Interpretador;
import desafio2.Mensagem;
import desafio2.MensageFactory;
import desafio3.CalculadoraDesconto;
import desafio3.DescontoAdapter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMENU DE DESAFIOS ");
            System.out.println("1-desafio 1(Interpreter Pattern)");
            System.out.println("2-desafio 2(Factory Method Patterns)");
            System.out.println("3-desafio 3(CAdapter Pattern)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Desafio1(scanner);
                    break;
                case 2:
                    Desafio2();
                    break;
                case 3:
                    Desafio3(scanner);
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Encerrando o programa....");
                    break;
                default:
                    System.out.println("Opção invalida. Tente novamente.");
            }

            if (opcao != 0) {
                System.out.print("\ndeseja ver mais algo? (s/n): ");
                String resposta = scanner.nextLine();
                if (!resposta.equalsIgnoreCase("s")) {
                    continuar = false;
                    System.out.println("Encerrando o programa.....");
                }
            }
        }

        scanner.close();
    }

    private static void Desafio1(Scanner scanner) {
        System.out.println();
        System.out.println("Desafio 1");
        System.out.println();
        System.out.println("caixa_alta('texto') → converte o texto para maiúsculas\n"
                +  "repetir(n, 'texto') → repete o texto n vezes");
        System.out.println("observação: colocar aspas duplas no texto desejado ");
        System.out.print("Digite o comando: ");
        String entrada = scanner.nextLine();

        Expressao expressao = Interpretador.interpretar(entrada);

        if (expressao != null) {
            String resultado = expressao.interpretar();
            System.out.println("Saída: " + resultado);
        } else {
            System.out.println("Comando inválido.");
        }
    }

    private static void Desafio2() {
        System.out.println();
        System.out.println("Desafio 2");
        System.out.println();

        Mensagem m1 = MensageFactory.criar("boasvindas");
        System.out.println(m1.formatar("Valdo"));

        Mensagem m2 = MensageFactory.criar("despedida");
        System.out.println(m2.formatar("Alice"));

        Mensagem m3 = MensageFactory.criar("agradecimento");
        System.out.println(m3.formatar("Otto"));

        try {
            Mensagem m4 = MensageFactory.criar("invalido de teste");
            System.out.println(m4.formatar("Lucas"));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }
    }

    private static void Desafio3(Scanner scanner) {
        System.out.println();
        System.out.println("Desafio 3");
        System.out.println();

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        double percentual = scanner.nextDouble();
        scanner.nextLine();

        CalculadoraDesconto calculadora = new DescontoAdapter();
        double valorComDesconto = calculadora.calcular(valor, percentual);

        System.out.printf("Valor com desconto: R$%.2f%n", valorComDesconto);
    }
}
