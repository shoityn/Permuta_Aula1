package desafio2;

public class MensagemAgradecimento implements Mensagem{
    public String formatar(String nome){
        return "obrigado(a) " + nome + ", você precisa de algo mais?";
    }
}
