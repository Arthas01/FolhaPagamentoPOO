classDiagram
    class Funcionario {
        <<abstract>>
        - String nome
        - String setor
        - String funcao
        + Funcionario(String nome, String setor, String funcao)
        + calcularSalario()* int
        + getNome() String
        + getSetor() String
        + getFuncao() String
    }

    class Assalariado {
        - int salarioFixo
        + Assalariado(String nome, String setor, String funcao, int salarioFixo)
        + calcularSalario() int
    }

    class Horista {
        - int horasTrabalhadas
        - int valorHora
        + Horista(String nome, String setor, String funcao, int horasTrabalhadas, int valorHora)
        + calcularSalario() int
    }

    class Folha {
        - ArrayList~Funcionario~ funcionarios
        + Folha()
        + addFuncionario(Funcionario f) void
        + calcularFolhaTotal() int
        + relatorioFolha() void
    }

    class Main {
        + main(String[] args) void
    }

    Funcionario <|-- Assalariado : Herança
    Funcionario <|-- Horista : Herança
    Folha "1" o-- "*" Funcionario : Agregação (Possui 0..*)
    Main ..> Folha : Utiliza
    Main ..> Funcionario : Instancia
