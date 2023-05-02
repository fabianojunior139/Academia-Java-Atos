import java.io.IOException;
import java.util.Scanner;

public class TestaBancoDeDados {
    public static void main(String[] args) throws IOException {

        //Definindo a url, o usuário e a senha do bando de dados.
        final String db_url = "jdbc:mysql://localhost:3306/reuniao";
        final String db_user = "root";
        final String db_password = "";

        //Criando uma instância do scanner para solicitar informações do usuário via console
        Scanner scan = new Scanner(System.in);

        //Criando uma instância da classe Log
        Log meuLogger = new Log("Log.txt");

        //Criando instância da classe BancoDeDados para realizar as operações solicitadas no exercício
        BancoDeDados banco = new BancoDeDados();

        //Utilizando a função "conectar" da classe BancoDeDados que serve para conectar ao MySQL
        banco.conectar(db_url, db_user, db_password);

        //Para tirar uma dúvida
        String a;

        //As variáveis nome, email e cargo serão solicitadas ao usuário para cadastro ou alteração de dados no banco
        String nome;
        String email;
        String cargo;

        //A variável db_query será a query mandada para o banco de dados
        String db_query;

        //A variável linhas é responsável por fazer a contagem das linhas que serão afetadas com as operações feitas no banco
        int linhas = 0;

        //A variável option é responsável por interromper o loop while
        int option = 0;

        //A variável ID fica responsável por armazenar o ID do usuário para realizar algumas queries
        int id = 0;

        //Aqui utilizo o while para criar uma interface de interação para o usuário via console, enquanto a variável option for diferente de 5, o laço continuará
        while (option != 5) {

            meuLogger.logger.info("\n\nNovo loop iniciado!");
            //Criando o menu de navegação para o usuário
            System.out.println("----------------------------------------");
            System.out.println("Digite 1 para fazer uma consulta");
            System.out.println("Digite 2 para realizar um novo cadastro");
            System.out.println("Digite 3 para alterar um cadastro");
            System.out.println("Digite 4 para excluir um cadastro");
            System.out.println("Digite 5 para finalizar a aplicação");
            System.out.println("----------------------------------------");
            System.out.print("Digite a opção: \n");
            option = scan.nextInt();
            System.out.println("----------------------------------------\n");

            //Switch utilizado para verificar a opção escolhida pelo usuário conforme menu de navegação acima
            switch (option) {
                case 1:
                    db_query = "SELECT * FROM pessoa";
                    banco.consultar(db_query);
                    break;

                case 2:
                    System.out.println("Cadastro de novo membro! \n");
                    a = scan.nextLine();

                    System.out.print("Digite o nome da pessoa: ");
                    nome = scan.nextLine();

                    System.out.print("Digite o email da pessoa: ");
                    email = scan.nextLine();

                    System.out.print("Digite o cargo da pessoa: ");
                    cargo = scan.nextLine();

                    db_query = "INSERT INTO pessoa (`nome`, `email`, `cargo`) VALUES ('" + nome + "', '" + email + "', '" + cargo + "')";
                    linhas += banco.inserirAlterarExcluir(db_query);

                    System.out.println("\nCadastro realizado com sucesso! \n");
                    System.out.println("O número de linhas afetadas foi: " + linhas + "\n");
                    meuLogger.logger.info("Usuário com " + nome + " adicionado a base de dados!");
                    break;

                case 3:
                    db_query = "SELECT * FROM pessoa";
                    banco.consultar(db_query);

                    System.out.print("Digite o ID da pessoa que você deseja alterar: ");
                    id = scan.nextInt();
                    System.out.println();

                    db_query = "SELECT * FROM  pessoa WHERE id = " + id;
                    banco.consultar(db_query);
                    a = scan.nextLine();

                    System.out.print("Digite o nome a ser alterado: ");
                    nome = scan.nextLine();

                    System.out.print("Digite o email a ser alterado: ");
                    email = scan.nextLine();

                    System.out.print("Digite o cargo a ser alterado: ");
                    cargo = scan.nextLine();

                    db_query = "UPDATE pessoa SET `nome`='" + nome + "',`email`='" + email + "',`cargo`='" + cargo + "' WHERE id = " + id;
                    linhas += banco.inserirAlterarExcluir(db_query);

                    System.out.println("\nMembro alterado com sucesso!\n");
                    System.out.println("O número de linhas afetadas foi: " + linhas + "\n");
                    meuLogger.logger.info("Usuário " + nome + " foi alterado na base de dados");
                    break;

                case 4:
                    db_query = "SELECT * FROM pessoa";
                    banco.consultar(db_query);

                    System.out.print("Digite o ID da pessoa que você deseja excluir: ");
                    id = scan.nextInt();

                    db_query = "DELETE FROM pessoa WHERE id = " + id;
                    linhas += banco.inserirAlterarExcluir(db_query);

                    System.out.println("\nUsuário com id " + id + " excluído com sucesso!\n");
                    System.out.println("O número de linhas afetadas foi: " + linhas + "\n");
                    meuLogger.logger.info("Usuário com " + id + " foi excluído da base de dados");
                    break;

                case 5:
                    System.out.println("Obrigado por utilizar nossos serviços, até a próxima!\n");
                    banco.desconectar();
                    option = 5;
                    meuLogger.logger.info("Aplicação encerrada, e um total de " + linhas + " foram alteradas no banco de dados");
                    break;

                default:
                    meuLogger.logger.warning("\nOpção inválida digitada no console");
                    System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}