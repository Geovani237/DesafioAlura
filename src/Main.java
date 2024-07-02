import java.text.Format;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = leitura.nextLine();
        System.out.println("Digite o valor da sua conta: ");
        double valorConta = leitura.nextDouble();


        System.out.println("*************************************\n");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome:           " + name);
        System.out.println("Tipo conta:     Corrente");
        System.out.println("Saldo inicial:   " + valorConta);
        System.out.println("*************************************\n");

        int i = 0;
        while (i != 4) {
            System.out.println("Operações\n");

            System.out.println("1 - Consultar Saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair\n");
            i = leitura.nextInt();

            if(i == 1) {
                System.out.println("O saldo atual é R$ "+ valorConta);
            }
            else if (i == 2) {
                System.out.println("informe o valor a receber: ");
                double valorReceber = leitura.nextDouble();
                valorConta = valorConta + valorReceber;
                System.out.println("Saldo atualizado R$ " + valorConta);
            }
            else if(i == 3){

                System.out.println("Digite um valor para transferir");
                double valorTransferir = leitura.nextDouble();


                if (valorTransferir > valorConta) {
                    System.out.println("Não tem saldo suficiente\n");
                } else {
                    valorConta = valorConta - valorTransferir;
                    System.out.println("Saldo atualizado R$ " + valorConta);
                }

            } else if(i != 4) {
                System.out.println("Opção invalida\n");
            }

        }

    }
}
