public class Assalariado extends Funcionario
{
    private int SalarioFixo;

    //CONSTRUTOR
    public Assalariado(String nome, String setor, String funcao, int SalarioFixo){
        super(nome, setor, funcao); //Vai pegar o construtor da superclasse

        if(SalarioFixo < 0)
        {
            System.out.printf("Valor invalido, salario nao pode ser menor que 0.");
        }

        this.SalarioFixo = SalarioFixo;
    }

    @Override
    public int CalcularSalario()
    {
        return SalarioFixo;
    }
}