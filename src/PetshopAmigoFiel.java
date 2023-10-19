import java.util.Date;

public class PetshopAmigoFiel {
    public static void main(String[] args) {
        // Crie uma instância da classe Animal
        Animal animal1 = new Animal("Nome do Animal", "Espécie", "Raça", "Data de Nascimento", "Proprietário");

        // Exemplo de verificação de disponibilidade de horário
        Date dataDesejada = new Date(); // Substitua pela data desejada
        String horarioDesejado = "10:00"; // Substitua pelo horário desejado
        boolean horarioDisponivel = Agenda.verificarDisponibilidade(dataDesejada, horarioDesejado);

        if (horarioDisponivel) {
            // Agende o serviço
            Servico servicoDesejado = new Banho(); // Substitua pelo serviço desejado
            Agenda novoAgendamento = new Agenda(animal1, servicoDesejado, dataDesejada, horarioDesejado);

            // Verifique novamente a disponibilidade
            if (Agenda.verificarDisponibilidade(dataDesejada, horarioDesejado)) {
                Agenda.adicionarAgendamento(novoAgendamento);
                System.out.println("Agendamento realizado com sucesso!");
            } else {
                System.out.println("Horário já foi ocupado por outra reserva. Escolha outro horário.");
            }
        } else {
            System.out.println("Horário indisponível. Escolha outro horário.");
        }

        // ...
    }
}
