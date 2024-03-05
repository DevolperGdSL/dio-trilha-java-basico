public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JULIA", "JONAS", "MARCOS"};  

        for(int x=0; x < alunos.length; x++){
            System.out.println("O aluno de índice: " + x + " é " + alunos[x]);
        }

        for(String aluno:alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
