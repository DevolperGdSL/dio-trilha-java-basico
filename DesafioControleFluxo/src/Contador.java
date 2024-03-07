import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		menu();	
	}
	static void menu(){ 
		int escolha;
		Scanner scanner = new Scanner(System.in);
     	do{
			System.out.println("Menu");
            System.out.println("Digite uma opção:");
            System.out.println(0 + " - Sair");
            System.out.println(1 + " - Usar contador");
            escolha = scanner.nextInt();
			switch (escolha) {
				case 0:
					System.out.println("Saindo...");
					break;
				case 1:
				int parametroUm = receber();
				int parametroDois = receber2();
				try {
					//chamando o método contendo a lógica de contagem
					contar(parametroUm, parametroDois);
				
				}catch (ParametrosInvalidosException e) {
					//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
					System.out.println("O segundo parâmetro deve ser maior que o primeiro");
					System.out.println("Tente novamente");
					menu();
				}
				default:
					break;
			}
		}while(escolha != 0);
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
		System.out.println("Digite o primeiro parâmetro");
		int numero = terminal.nextInt();
		return numero;
	}
	static int receber2(){
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o segundo parâmetro");
		int numero = terminal.nextInt();
		return numero;
	}
}