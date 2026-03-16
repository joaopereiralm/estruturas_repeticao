import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String op;

        System.out.println("------------------------");
        System.out.println(" Estruturas Repetição ");
        System.out.println("------------------------");
        do {
            System.out.println("1 - Tabuada Personalizada");
            System.out.println("2 - O somatório de N números");
            System.out.println("3 - Validação com insistência");
            System.out.println("4 - O contador de Pares");
            System.out.println("5 - Login e Senha");
            System.out.println("6 - Média de Idades com Sentinela");
            System.out.println("7 - Fatorial de um Número");
            System.out.println("8 - Cadastro de Prdutos");
            System.out.println("9 - Investimento com Juros");
            System.out.println("10 - Sequência de Fibonacci Simples");
            System.out.println("0 - Sair");
            System.out.println("\nQual deseja? :");
            op = sc.next();

            switch (op) {
                case "1":
                    System.out.println("-----------");
                    System.out.println(" Tabuada ");
                    System.out.println("-----------");
                    System.out.println("Digite um número: ");
                    int num = sc.nextInt();

                    for (int i = 0; i <= 10; i++) {
                        int tab = num * i;
                        System.out.println(num + "x" + i + " = " + tab);
                    }
                    break;

                case "2":
                    System.out.println("-----------");
                    System.out.println(" Soma ");
                    System.out.println("-----------");
                    System.out.println("Quantas vezes deseja somar?: ");
                    int numa = sc.nextInt();
                    int somatotal = 0;

                    for (int i = 1; i <= numa; i++) {

                        System.out.println(i + "° Número:");
                        int numb = sc.nextInt();

                        somatotal = somatotal + numb;
                    }

                    System.out.println("Soma total dos números: " + somatotal);
                    break;

                case "3":
                    System.out.println("-----------------");
                    System.out.println(" Nota correta ");
                    System.out.println("-----------------");
                    System.out.println("Escreva um número: ");
                    int num1 = sc.nextInt();

                    while (num1 < 0 || num1 > 10) {
                        System.out.println("Nota incorreta");
                        System.out.println("Digite novamente: ");
                        num1 = sc.nextInt();
                    }
                    System.out.println("Nota correta: " + num1);
                    break;

                case "4":
                    System.out.println("-----------");
                    System.out.println(" Pares ");
                    System.out.println("-----------");
                    System.out.println("Digite a quantidade de números que deseja digitar: ");
                    int numx = sc.nextInt();
                    int numy = 0;
                    int pares = 0;

                    for (int i = 1; i <= numx; i++) {
                        System.out.println("Digite o " + i + "° Número: ");
                        numy = sc.nextInt();

                        if (numy % 2 == 0) {
                            System.out.println("O número é par\n");
                            pares++;
                        }
                    }

                    System.out.println("\nQuantidade de Números pares: " + pares);
                    break;

                case "5":
                    System.out.println("-----------");
                    System.out.println(" Login ");
                    System.out.println("-----------");
                    System.out.println("Nome de usuário: ");
                    String nome = sc.next();
                    System.out.println("Senha com números e caractéres: ");
                    String senha = sc.next();

                    while (nome.equals(senha)) {
                        System.out.println("-----------");
                        System.out.println(" Login ");
                        System.out.println("-----------");
                        System.out.println("\nSenha incorreta");
                        System.out.println("A senha não pode ser igual ao nome.");
                        System.out.println("\nDigite uma nova senha: ");
                        senha = sc.next();
                    }

                    System.out.println("------- Cadastro -------");
                    System.out.println("Nome: " + nome);
                    System.out.println("Senha: " + senha);
                    break;

                case "6":
                    System.out.println("-----------");
                    System.out.println(" Idade ");
                    System.out.println("-----------");
                    int i = 1;
                    int somaidades = 0;
                    int contador = 0;

                    System.out.println(i + "° Idade do Aluno: ");
                    int idade = sc.nextInt();

                    while (idade >= 0) {
                        somaidades += idade;
                        i++;
                        contador++;

                        System.out.println(i  + "° Idade do Aluno:");
                        idade = sc.nextInt();
                    }

                    if (idade < 0) {
                        System.out.println("Idade indevida.");
                    }

                    if (contador > 0){
                        double media = (double) somaidades / contador;
                        System.out.println("Media das idades: " + media);
                    }
                    else {
                        System.out.println("Nenhuma idade válida foi inserida.");
                    }
                    break;


                case "7":
                    System.out.println("-----------");
                    System.out.println(" Fatorial ");
                    System.out.println("-----------");
                    System.out.println("Digite um número: ");
                    int n = sc.nextInt();

                    long fatorial = 1;

                    for (int j = 1; j <= n; j++) {
                        fatorial *= j;
                    }

                    System.out.println("Fatorial de " + n + " é: " + fatorial);
                    break;

                case "8":
                    System.out.println("-------------");
                    System.out.println(" Maior Produto ");
                    System.out.println("-------------");
                    String cont = "s";
                    String nomedomaior = "";
                    double maiorvalor = 0;
                    double valorproduto = 0;
                    String nomeproduto = "";

                    while (cont.equalsIgnoreCase("s") || cont.equalsIgnoreCase("sim")) {
                        System.out.println("Nome do produto: ");
                        nomeproduto = sc.next();

                        System.out.println("Preço do produto: R$");
                        valorproduto = sc.nextDouble();

                        System.out.println("Produto: " + nomeproduto + "\nValor: R$" + valorproduto);
                        System.out.println("Deseja continuar? (S = Sim / N = Não");
                        cont = sc.next();
                    }

                    if (valorproduto > 0) {
                        System.out.println("O produto de maior valor informado foi: " + nomeproduto + " Preço: R$ " + valorproduto);
                    }
                    break;

                case "9":
                    System.out.println("-----------");
                    System.out.println(" Juros ");
                    System.out.println("-----------");
                    System.out.println("Valor Inicial: R$");
                    double valinicial = sc.nextDouble();

                    System.out.println("Taxa de juros: R$");
                    double valjuros = sc.nextDouble();

                    valjuros = valjuros / 100;

                    double saldo = valinicial;

                    for (int j = 1; j <= 12; j++) {
                        saldo = saldo + (saldo * valinicial);

                        System.out.println(j + "° Mês, Saldo: R$" + saldo);
                    }
                    System.out.println("\nSaldo após 12 meses: R$" + saldo);
                    break;

                case "10":
                    System.out.println("--------------------------");
                    System.out.println(" Sequência de Fibonacci ");
                    System.out.println("--------------------------");
                    System.out.println("Quantos termos você deseja que somar?: ");
                    int nums = sc.nextInt();

                    System.out.println("\n");

                    int anterior = 0;
                    int posterior = 1;

                    for (int j = 1; j <= nums; j++) {

                        System.out.println(anterior + "");

                        int proximo = anterior + posterior;
                        anterior = posterior;
                        posterior = proximo;
                    }
                    System.out.println("\nFim da sequência.");
                    break;
            }
            System.out.println("\nRetornar ao Menu?");
            System.out.println("Sim / Não: ");
            op = sc.next();
        }while (op.equalsIgnoreCase("s") || op.equalsIgnoreCase("sim"));

        System.out.println("Programa Finalizado");
    }
}