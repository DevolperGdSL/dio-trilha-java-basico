import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) throws Exception {
     int escolha;
     Scanner scanner = new Scanner(System.in);
     int a, b;
        do{
            System.out.println("Menu");
            System.out.println("Digite uma opção:");
            System.out.println(0 + " - Sair");
            System.out.println(1 + " - Multiplicar");
            System.out.println(2 + " - Subtrair");
            System.out.println(3 + " - Somar");
            System.out.println(4 + " - Reduzir");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 0: 
                    System.out.println("Saindo..");
                    break;
                case 1:
                    System.out.println("Digite dois numeros: ");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + Multiplicar(a, b));
                    break;
                case 2:
                    System.out.println("Digite dois numeros: ");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + Subtrair(a, b));
                    break;
                case 3: 
                    System.out.println("Digite dois numeros: ");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + Somar(a, b));
                    break;
                case 4: 
                    System.out.println("Digite dois numeros: ");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + Dividir(a, b));
                    break;
                default:
                    System.out.println("Numero inválido");
                    break;
            }
        }while(escolha != 0);
    }
    public static int Multiplicar(int a,int  b) {
        int c;
            c = a * b;
        return c;
        
    } 

    public static int Subtrair(int a, int b){
        int c;
        c = a - b;
        return c;
    }

    public static int Somar(int a, int b){
        int c;
        c = a + b;
        return c; 
    }

    public static int Dividir(int a, int b){
        int c;
        c = a/b;
        return c;
    }
}
