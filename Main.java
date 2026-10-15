import java.util.Scanner;
import java.util.InputMismatchException;

// Só pra lembrar:
// Classe + Nome do objeto = new chamar Classe();

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //pra receber oq foi digitado pelo usuario

        int opcao = 0;

        Folha folha = new Folha();

        do 
        {
            System.out.println("=====SISTEMA DE FOLHA=====");
            System.out.println("1. Cadastro de funcionário");
            //System.out.println("2. ");
            //System.out.println("3. ");
            //System.out.println("4. ");
            System.out.println("5. Calcular folha");
            System.out.println("Sair");
            System.out.println("ESCOLHA: ");

            try{
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do \n

                switch(opcao)
                {  
                    //LOGICA DA SELECAO
                    case 1:

                        System.out.println("Nome do Funcionário: ");
                        String nome = scanner.nextLine();
                        System.out.println("Setor: ");
                        String setor = scanner.nextLine();
                        System.out.println("Função: ");
                        String funcao = scanner.nextLine();

                        System.out.println("Selecione 'A' para assalariado\nou  'H' para Horista");
                        String tipo = scanner.nextLine();

                        if(tipo.equalsIgnoreCase("A")) // esse equalsIgnoreCase serve pra fazer comparação de string (ex: a == A)
                        {
                            System.out.println("Salário: ");
                            int Salario = scanner.nextInt();
                            scanner.nextLine(); // Limpa o buffer

                            Funcionario assalariado = new Assalariado(nome, setor, funcao, Salario);
                            folha.addFuncionario(assalariado);
                            System.out.println("-> Funcionário assalariado cadastrado!");
                            break;
                        }
                        else if(tipo.equalsIgnoreCase("H"))
                        {
                            System.out.println("Valor por Hora: ");
                            int ValorHora = scanner.nextInt();
                            System.out.println("Horas Trabalhadas: ");
                            int HorasTrabalhadas = scanner.nextInt();
                            scanner.nextLine(); // Limpa o buffer

                            Funcionario horista = new Horista(nome, setor, funcao, HorasTrabalhadas, ValorHora);
                            folha.addFuncionario(horista);
                            System.out.println("-> Funcionário Horista cadastrado!");
                            break;
                        }
                        else{System.out.println("Opção inválida! Digite A ou H."); }

                    case 5:
                        folha.RelatorioFolha();
                        break;
                        
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Digite um número do menu!");
                scanner.nextLine(); //limpabuffer
            }
            
        
        }while(opcao != 0);
        scanner.close();
    }
}