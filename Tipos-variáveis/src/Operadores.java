public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Nome"+ " " + "+" + " " + "Sobrenome";
        System.out.println(nomeCompleto);
        int numero = 5;
        numero = -numero;
        int i;
        for(i=0;i<4;i++){
            System.out.println(i);
        }
        System.out.println(numero);
        int a = 4;
        int b = 5;
        boolean resultado = a==b ? true: false;
        System.out.println(resultado);
        String nomeUm = "name";
        String nomeDois = new String("name");
        System.out.println(nomeUm.equals(nomeDois));
    }
}
