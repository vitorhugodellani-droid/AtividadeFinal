import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];
        int quantidade = 0;

        System.out.print("Quantos alunos deseja cadastrar (1 a 10)? ");
        int qtdEntrada = scanner.nextInt();

        if (qtdEntrada >= 1 && qtdEntrada <= 10) {
            quantidade = qtdEntrada;

            for (int i = 0; i < quantidade; i++) {
                System.out.print("Digite a nota do aluno " + (i + 1) + " (0 a 10): ");
                double notaEntrada = scanner.nextDouble();

                if (notaEntrada >= 0 && notaEntrada <= 10) {
                    notas[i] = notaEntrada;
                } else {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                    i--; // Repete a leitura do aluno atual
                }
            }

            System.out.println("--- Lista de Notas ---");
            for (int i = 0; i < quantidade; i++) {
                System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
            }

            double soma = 0;
            for (int i = 0; i < quantidade; i++) {
                soma += notas[i];
            }
            double media = soma / quantidade;
            System.out.println("Média da turma: " + media);

            double maior = notas[0];
            double menor = notas[0];

            for (int i = 1; i < quantidade; i++) {
                if (notas[i] > maior) {
                    maior = notas[i];
                }
                if (notas[i] < menor) {
                    menor = notas[i];
                }
            }
            System.out.println("Maior nota: " + maior);
            System.out.println("Menor nota: " + menor);

            System.out.print("Digite o número do aluno para consultar (1 a " + quantidade + "): ");
            int numAluno = scanner.nextInt();

            if (numAluno >= 1 && numAluno <= quantidade) {
                System.out.println("A nota do aluno " + numAluno + " é: " + notas[numAluno - 1]);
            } else {
                System.out.println("Número de aluno inválido!");
            }

        } else {
            System.out.println("Quantidade de alunos inválida! Deve ser entre 1 e 10.");
        }
    }
}

