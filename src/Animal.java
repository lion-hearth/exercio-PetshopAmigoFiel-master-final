public class Animal {
    private final String nome;
    private final String especie;
    private final String raca;
    private final String dataDeNascimento;
    private final String proprietario;

    public Animal(String nome, String especie, String raca, String dataDeNascimento, String proprietario) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dataDeNascimento = dataDeNascimento;
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getProprietario() {
        return proprietario;
    }
}

// Classe abstrata para Serviço
abstract class Servico {
    public abstract String descricao();
    public abstract double preco();
}

// Subclasses específicas de Serviço
class Banho extends Servico {
    @Override
    public String descricao() {
        return "Banho";
    }

    @Override
    public double preco() {
        return 25.0;
    }
}

class Tosa extends Servico {
    @Override
    public String descricao() {
        return "Tosa";
    }

    @Override
    public double preco() {
        return 30.0;
    }
}

class ConsultaVeterinaria extends Servico {
    @Override
    public String descricao() {
        return "Consulta Veterinária";
    }

    @Override
    public double preco() {
        return 50.0;
    }
}
