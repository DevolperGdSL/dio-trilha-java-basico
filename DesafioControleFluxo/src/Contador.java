import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		menu();	
	}
	static void menu(){ 
		int escolha;
     	do{
			System.out.println("Menu");
            System.out.println("Digite uma opção:");
            System.out.println(0 + " - Sair");
            System.out.println(1 + " - Usar contador");
            escolha = receber();
			switch (escolha) {
				case 0:
					System.out.println("Saindo...");
					break;
				case 1:
				contador();
				escolha = 0;
				default:
					break;
			}
		}while(escolha != 0);
	}
	static void contador(){
		System.out.println("Digite o primeiro parâmetro");
				int parametroUm = receber();
				System.out.println("Digite o segundo parâmetro");
				int parametroDois = receber();
				try {
					//chamando o método contendo a lógica de contagem
					contar(parametroUm, parametroDois);
				
				}catch (ParametrosInvalidosException e) {
					//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
					System.out.println("O segundo parâmetro deve ser maior que o primeiro");
					System.out.println("Tente novamente");
					menu();
				}
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException();
        }else{
		    int contagem = parametroDois - parametroUm;
            for(int i=1; i<=contagem; i++){
                System.out.println("Imprimindo o número " + i);    
            }
        }
		//realizar o for para imprimir os números com base na variável contagem
	}
	static int receber(){
		Scanner terminal = new Scanner(System.in);
		int numero = terminal.nextInt();
		return numero;
	}
}