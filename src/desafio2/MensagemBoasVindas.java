package desafio2;

public class MensagemBoasVindas implements Mensagem{
    public String formatar(String nome){
        return "Bem-vindo," + nome + "!";
    }
}
