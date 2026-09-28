import java.util.Scanner;

public class Atv12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] jogos = new String[5];
        int[] estoque = new int[5];
        int cadastrados = 0;

        System.out.print("Digite o nome do 1º jogo: ");
        String nome1 = scanner.nextLine();
        System.out.print("Digite a quantidade inicial de " + nome1 + ": ");
        int qtd1 = scanner.nextInt();
        scanner.nextLine();

        if (qtd1 >= 0) {
            jogos[cadastrados] = nome1;
            estoque[cadastrados] = qtd1;
            cadastrados++;
            System.out.println("Jogo cadastrado com sucesso!");
        } else {
            System.out.println("Quantidade inválida.");
        }

        System.out.print("Digite o nome do 2º jogo: ");
        String nome2 = scanner.nextLine();
        System.out.print("Digite a quantidade inicial de " + nome2 + ": ");
        int qtd2 = scanner.nextInt();
        scanner.nextLine();

        if (qtd2 >= 0) {
            jogos[cadastrados] = nome2;
            estoque[cadastrados] = qtd2;
            cadastrados++;
            System.out.println("Jogo cadastrado com sucesso!");
        } else {
            System.out.println("Quantidade inválida.");
        }

        System.out.println("--- Estoque Atual ---");
        for (int i = 0; i < cadastrados; i++) {
            System.out.println((i + 1) + " - " + jogos[i] + ": " + estoque[i] + " unidades");
        }

        if (cadastrados > 0) {
            System.out.print("Digite o número do jogo para vender (1 a " + cadastrados + "): ");
            int numJogoVenda = scanner.nextInt();

            if (numJogoVenda >= 1 && numJogoVenda <= cadastrados) {
                int pos = numJogoVenda - 1;
                System.out.print("Quantidade para vender: ");
                int qtdVenda = scanner.nextInt();

                if (qtdVenda > 0 && qtdVenda <= estoque[pos]) {
                    estoque[pos] -= qtdVenda;
                    System.out.println("Venda realizada! " + jogos[pos] + " agora tem " + estoque[pos] + " unidades.");
                } else if (qtdVenda > estoque[pos]) {
                    System.out.println("Estoque insuficiente");
                } else {
                    System.out.println("Escolha inválida");
                }
            } else {
                System.out.println("Escolha inválida");
            }
        }

        if (cadastrados > 0) {
            System.out.print("Digite o número do jogo para repor estoque (1 a " + cadastrados + "): ");
            int numJogoRepor = scanner.nextInt();

            if (numJogoRepor >= 1 && numJogoRepor <= cadastrados) {
                int pos = numJogoRepor - 1;
                System.out.print("Quantidade para repor: ");
                int qtdReposicao = scanner.nextInt();

                if (qtdReposicao > 0) {
                    estoque[pos] += qtdReposicao;
                    System.out.println("Reposição realizada! " + jogos[pos] + " agora tem " + estoque[pos] + " unidades.");
                } else {
                    System.out.println("Quantidade inválida");
                }
            } else {
                System.out.println("Jogo não encontrado");
            }
        }

        if (cadastrados > 0) {
            System.out.print("Digite o número do jogo para consultar (1 a " + cadastrados + "): ");
            int numJogoConsulta = scanner.nextInt();

            if (numJogoConsulta >= 1 && numJogoConsulta <= cadastrados) {
                int pos = numJogoConsulta - 1;
                System.out.println(jogos[pos] + ": " + estoque[pos] + " unidades");
            } else {
                System.out.println("Jogo não encontrado");
            }
        }

        int totalUnidades = 0;
        for (int i = 0; i < cadastrados; i++) {
            totalUnidades += estoque[i];
        }
        System.out.println("Total de unidades disponíveis na loja: " + totalUnidades);
    }
}

