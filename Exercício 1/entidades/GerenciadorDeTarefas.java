package entidades;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {
    List<Tarefas> listaDeTarefas;

    public GerenciadorDeTarefas() {
        listaDeTarefas = new ArrayList<>();
    }

    public void AdicionarTarefa(Tarefas tarefa) {
        listaDeTarefas.add(tarefa);
    }

    public List<Tarefas> listarTarefas() {
        return listaDeTarefas;
    }
