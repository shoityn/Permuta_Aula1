package desafio2;

public class MensageFactory {
    public static Mensagem criar(String tipo){
        switch (tipo.toLowerCase()){
            case "boasvindas":
                return new MensagemBoasVindas();
            case "despedida":
                return new MensagemDespedida();
            case "agradecimento":
                return new MensagemAgradecimento();
            default:
                throw new IllegalArgumentException("Tipo de mensagem inválido: " + tipo);
        }
    }
}


