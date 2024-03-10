package Usuario;
import ServicosMensagem.*;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		System.out.println("ENTRANDO NO MSN");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		System.out.println("SAINDO DO MSN");
		System.out.println("ENTRANDO NO FACEBOOK");
		FacebookMessenger fbm = new FacebookMessenger();
		fbm.enviarMensagem();
		fbm.receberMensagem();
		System.out.println("SAINDO DO FACEBOOK");
		System.out.println("ENTRANDO NO TELEGRAM");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
		System.out.println("SAINDO DO TELEGRAM");
	}
}
