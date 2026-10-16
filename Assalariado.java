public class Assalariado extends Funcionario
{
    private int SalarioFixo;

    //CONSTRUTOR
    public Assalariado(String nome, String setor, String funcao, int SalarioFixo){
        super(nome, setor, funcao); //Vai pegar o construtor da superclasse

        if(SalarioFixo < 1621)
        {
            //System.out.printf("Valor invalido, salario nao pode ser menor que 0.");
            throw new RuntimeException("O salário mínimo é 1621, corrija!");
        }
        

        this.SalarioFixo = SalarioFixo;
    }

    @Override
    public int CalcularSalario()
    {
        return SalarioFixo;
    }
}