import java.util.Scanner;

import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu;
        int quantFunc = 0;
        Double salario = 0.0;
        String nome = null;
        Funcionario funcionario = new Funcionario(100);


        while (true) {
            Funcionario.exibeOpcoes();
            menu = teclado.nextInt();
            if (menu == 1) {
                System.out.println("Você escolheu [CADASTRAR FUNCIONÁRIO(S)]");
                System.out.println("Quantos funcionários você gostaria de cadastrar? ");
                quantFunc = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Você escolheu cadastrar " + quantFunc + " funcionário(s).");
                for (int i = 0; i < quantFunc; i++) {
                    System.out.println("[CADASTRO DO " + (i + 1) + "° FUNCIONÁRIO] ");
                    System.out.println("Nome do " + (i + 1) + "° funcionário: ");
                    nome = teclado.nextLine();
                    System.out.println("Salário do " + (i + 1) + "° funcionário: ");
                    salario = teclado.nextDouble();
                    teclado.nextLine();
                    funcionario.adiciona(new Funcionario(nome, salario));
                }
                System.out.println(" ");
                System.out.println("[Funcionários cadastrados!]");
                System.out.println(" ");
            } else if (menu == 2) {
                System.out.println(" ");
                System.out.println("Você escolheu [LISTAR DADOS]");
                funcionario.imprimeLista();
            } else if (menu == 3) {
                System.out.println("Você escolheu [BUSCAR FUNCIONÁRIO]");
                String funcBusca;
                System.out.println("Insira o nome do(a) funcionário(a) que deseja encontrar: ");
                teclado.nextLine();
                funcBusca = teclado.nextLine();
                funcionario.busca(funcBusca);



            }
        }
    }
}