//CLASSE GERENCIADORA.

import java.util.ArrayList;

public class Folha
{
    private ArrayList<Funcionario> funcionario;

    public Folha()
    {
            this.funcionario = new ArrayList<>(); 
    }

    public void addFuncionario(Funcionario f)
    {
        funcionario.add(f);
    }

    public int CalcularFolhaTotal()
    {
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