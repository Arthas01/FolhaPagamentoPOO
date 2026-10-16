import java.util.Scanner;
//import java.util.InputMismatchException;

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
            //System.out.print("\033[H\033[2J");
            //System.out.flush(); -> isso é pra limpar o terminal, mas nao ta funcionando do jeito que eu queria1
            System.out.println("=====SISTEMA DE FOLHA=====");
            System.out.println("1. Cadastro de funcionário");
            //System.out.println("2. ");
            //System.out.println("3. ");
            //System.out.println("4. ");
            System.out.println("2. Calcular folha");
            System.out.println("0. Sair");
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

                        System.out.println("Selecione 'A' para assalariado\nou 'H' para Horista");
                        String tipo = "";
                        do{

                            tipo = scanner.nextLine();
                            if(tipo.equalsIgnoreCase("A")) // esse equalsIgnoreCase serve pra fazer comparação de string (ex: a == A)
                            {
                                int Salario = 0;
                                while (Salario < 1621) {
                                    try{
                                        System.out.println("Salário: ");
                                        Salario = scanner.nextInt();
                                        scanner.nextLine(); // Limpa o buffer

                                        Funcionario assalariado = new Assalariado(nome, setor, funcao, Salario);
                                        folha.addFuncionario(assalariado);
                                        System.out.println("-> Funcionário assalariado cadastrado!"); 
                                    }
                                    catch(RuntimeException e){
                                        System.out.println(e.getMessage());

                                    }
                                }   
                            }
                            else if(tipo.equalsIgnoreCase("H"))
                            {
                                int ValorHora = 0;
                                
                                
                                while (ValorHora < 8) {
                                    try{
                                        System.out.println("Valor por Hora: ");
                                        ValorHora = scanner.nextInt();
                                        if (ValorHora < 8) {
                                            System.out.println("-> O mínimo é R$8/h");
                                        }
                                        }
                                        catch(RuntimeException e){
                                            System.out.println(e.getMessage());
                                            scanner.nextLine();
                                        }
                                }
                                int HorasTrabalhadas = 0;
                                while(HorasTrabalhadas <= 0 || HorasTrabalhadas > 222){
                                    try{
                                        System.out.println("Horas Trabalhadas: ");
                                        HorasTrabalhadas = scanner.nextInt();
                                        scanner.nextLine(); // Limpa o buffer
                                        if (HorasTrabalhadas <= 0 || HorasTrabalhadas > 222) {
                                            System.out.println("-> Máximo de 222 Horas trabalhadas");
                                        }
                                        }
                                        
                                        catch(RuntimeException e){
                                            System.out.println(e.getMessage());
                                        }
                                }
                                Funcionario horista = new Horista(nome, setor, funcao, HorasTrabalhadas, ValorHora);
                                folha.addFuncionario(horista);
                                System.out.println("-> Funcionário Horista cadastrado!");
                            }
                            else{System.out.println("Opção inválida! Digite A ou H."); }
                        }
                        while (!tipo.equalsIgnoreCase("A") && !tipo.equalsIgnoreCase("H"));
                        break;
                    case 2:
                        folha.RelatorioFolha();
                        break;
                        
                }
                
            }
            catch(RuntimeException e)
            {
                System.out.println(e.getMessage()); //Erro de menu
                scanner.nextLine();
            }
            
        
        }while(opcao != 0);
        scanner.close();
    }
}