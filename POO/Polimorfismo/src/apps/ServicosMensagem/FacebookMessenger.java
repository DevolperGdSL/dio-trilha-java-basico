package apps.ServicosMensagem;

import apps.ServicoPai.ServicoMensagemInstantanea;

public class FacebookMessenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Histórico de mensagem salvo pelo Facebook Messenger");
    }

}
