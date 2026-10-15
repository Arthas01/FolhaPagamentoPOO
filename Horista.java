public class Horista extends Funcionario
{
    private int ValorHora;
    private int HorasTrabalhadas;

    //CONSTRUTOR - PUXADO DA SUPERCLASSE

    

    public Horista (String nome, String setor, String funcao, int ValorHora, int HorasTrabalhadas)
    {
        super(nome, setor, funcao);
        if (HorasTrabalhadas < 0 || ValorHora < 0)
        {
            throw new IllegalArgumentException("Valor por hora ou tempo de trabalho não podem ser menor que 0");
        }

        this.HorasTrabalhadas = HorasTrabalhadas;
        this.ValorHora = ValorHora;
        
    }

    @Override
    public int CalcularSalario()
    {
        return ValorHora * HorasTrabalhadas;
    }
}