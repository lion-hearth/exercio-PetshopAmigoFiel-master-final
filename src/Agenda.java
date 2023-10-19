import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private Animal animal;
    private Servico servico;
    private Date data;
    private String horario;

    public Agenda(Animal animal, Servico servico, Date data, String horario) {
        this.animal = animal;
        this.servico = servico;
        this.data = data;
        this.horario = horario;
    }

    // Adicione um campo para armazenar os agendamentos
    private static List<Agenda> agendamentos = new ArrayList<>();

    // Método para verificar a disponibilidade
    public static boolean verificarDisponibilidade(Date dataDesejada, String horarioDesejado) {
        for (Agenda agenda : agendamentos) {
            // Verifique se a data e o horário desejados conflitam com algum agendamento existente
            if (agenda.data.equals(dataDesejada) && agenda.horario.equals(horarioDesejado)) {
                return false; // Horário não está disponível
            }
        }
        return true; // Horário está disponível
    }

    // Método para adicionar um agendamento
    public static void adicionarAgendamento(Agenda novoAgendamento) {
        agendamentos.add(novoAgendamento);
    }
}
