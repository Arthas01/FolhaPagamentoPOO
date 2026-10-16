//CLASSE GERENCIADORA.

import java.util.ArrayList;

public class Folha
{
    // aqui usei lista dinamica
    //Arraylist<ClasseAlvo> nome da lista;
    private ArrayList<Funcionario> funcionario; 

    public Folha()
    {
            //construtor da lista
            this.funcionario = new ArrayList<>(); 
    }

    public void addFuncionario(Funcionario f)//precisa receber um objeto da classe Funcionario
    {
        //metodo de add funcionario -> pega esse obj "f" e adiciona na lista funcionario (eu poderia ter colocado outro nome)
        funcionario.add(f);
    }

    public int CalcularFolhaTotal()
    {
        //loop pta pegar todos os funcionarios
        int Total = 0;
        for (Funcionario f : funcionario) // vai puxar todos os funcionarios f que tem
        {
            //vai chamar o calcular salario de cada classe de acordo com o funcionario f
            Total += f.CalcularSalario();
        }
        return Total;
    }

    public void RelatorioFolha()
    {
        System.out.println("===RELATÓRIO DA FOLHA===");
        for (Funcionario f : funcionario) // vai puxar todos os funcionarios f que tem
        {
            //vai printar todos os funcionarios e cargo
            System.out.println("Nome: " + f.getNome() + " | Setor: " +f.getSetor());
        }
        System.out.println("========================");
        System.out.println("Folha Total: " + CalcularFolhaTotal());
    }
}