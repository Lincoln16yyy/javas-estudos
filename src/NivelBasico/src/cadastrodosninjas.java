import java.util.Scanner;

public class cadastrodosninjas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //fazer um array
        int Numero_Max = 5;
        String[] ninjas = new String[Numero_Max];


        // contadores
        int cadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {


            //cadastrar com array e depois acessar com switch cases
            System.out.println("===== Menu Ninja =====");
            System.out.println("1.cadastrar ninjas");
            System.out.println("2.listar ninjas");
            System.out.println("3.sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (opcao) {
                case 1:
                    if (cadastrados < Numero_Max) {
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[cadastrados] = nomeNinja;
                        cadastrados++;
                        System.out.println("Ninja cadastrado com sucesso");
                    } else {
                        System.out.println("A lista de ninja esta cheia");
                    }
                    break;
                case 2:
                    if (cadastrados == 0) {
                        System.out.println("nenhum ninja foi encontrado");
                    } else {
                        System.out.println("=============== Lista de ninjas ===============");
                        for (int i = 0; i < cadastrados; i++) {
                            System.out.println(ninjas[i]);

                        }
                    }
                    break;
                case 3:
                    // sair
                    break;
                default:
                    System.out.println("Essa opcao nao e valida");
                    break;


            }


        }


    }
}