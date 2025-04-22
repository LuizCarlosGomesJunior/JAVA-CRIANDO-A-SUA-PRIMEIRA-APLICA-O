import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Luiz Gomes";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.println("*********************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println(" ");
        System.out.println("Nome:            " + nome);
        System.out.println("Tipo conta:      " + tipoConta);
        System.out.printf("Saldo inicial:   R$ %.2f%n", saldo);
        System.out.println("*********************************");

        System.out.println();
        System.out.println();
        System.out.println("Operações");

        System.out.println();
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");

        System.out.println();
        System.out.println("Digite a opção desejada:");
        int opcao = leitura.nextInt();

        while (opcao != 4) {
            if(opcao == 1) {
                System.out.printf("Saldo em conta de R$ %.2f",saldo);
                System.out.println();
                System.out.println("Informe qual operação deseja fazer agora");
                opcao = leitura.nextInt();


            }
            else if(opcao == 2) {
                System.out.print("Digite o valor a ser recebido: R$ ");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("Informe qual operação deseja fazer agora");
                opcao = leitura.nextInt();
            }
            else if(opcao == 3) {
                System.out.print("Digite o valor a ser transferido: R$ ");
                double valorTransferido = leitura.nextDouble();
                if(valorTransferido > saldo) {
                    System.out.println("Saldo insuficiente para realizar a transferência");
                } else {
                    saldo -= valorTransferido;
                    System.out.println("Valor transferido com sucesso");
                }
                System.out.println("Informe qual operação deseja fazer agora");
                opcao = leitura.nextInt();
            }
            else {
                System.out.println("Valor inválido");
                System.out.println("Informe qual operação deseja fazer agora");
                opcao = leitura.nextInt();
            }
        }

        System.out.println("Sistema finalizado");


    }
}