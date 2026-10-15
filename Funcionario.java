// ARTHUR ALBUQUERQUE - 17078155
// PROGRESSO: TUDO QUE PRECISA FAZER VOU ADICIONAR AQUI
// TERMINAR A IMPLEMENTAÇÃO BASE
// PRECISO FAZER UM UML AINDA, SÓ PRA CONTER NO README.MD


public abstract class Funcionario
{
    private String nome;
    private String setor;
    private String funcao;

    //CONSTRUTOR
    public Funcionario(String nome, String setor, String funcao)
    {

        if(nome == null || nome.isBlank())
        {
            System.out.printf("Nome vazio ou invalido, tente novamente.");
        }

        if(setor == null || setor.isBlank())
        {
            System.out.printf("Setor vazio ou invalido, tente novamente.");
        }

        if(funcao == null || funcao.isBlank())
        {
            System.out.printf("Funcao vazio ou invalida, tente novamente.");
        }

        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
    }

    //METODO
    //Cada subclasse vai ter o seu com @override
    public abstract int CalcularSalario();


    //AINDA PRECISO CRIAR OS RETURNS SEGUROS (COM O METODO GET) - fazido

    public String getNome(){return this.nome;}
    public String getSetor(){return this.setor;}
    public String getFuncao(){return this.funcao;}


}

