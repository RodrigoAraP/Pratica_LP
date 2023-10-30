import javax.swing.JOptionPane;
import java.util.ArrayList;


public class ListaDeTarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<String>();
        int opcao = -1;
        do {
            opcao= Integer.parseInt(JOptionPane.showInputDialog(null, "1. Adicionar tarefa\n2. Remover tarefa\n3. Listar tarefas\n4. Sair","Lista de Tarefas",JOptionPane.INFORMATION_MESSAGE));
            switch (opcao) {
                case 1:
                    String tarefa = JOptionPane.showInputDialog(null,"Digite a tarefa a ser adicionada","Adicionar tarefa",JOptionPane.INFORMATION_MESSAGE);
                    // Chame o método para adicionar tarefa
                    adicionarTarefa(tarefas, tarefa);
                    break;
                case 2:
                    int indice = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o índice da tarefa a ser removida","Remover tarefa",JOptionPane.INFORMATION_MESSAGE));
                    // Chame o método para remover tarefa
                    removerTarefa(tarefas, indice);
                    break;
                case 3:
                    // Chame o método para listar tarefas
                    listarTarefas(tarefas);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Saindo do programa.","Lista de Tarefas",JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida. Tente novamente.","Lista de Tarefas",JOptionPane.INFORMATION_MESSAGE);
            }
        } while (opcao != 4);
    }

    private static void adicionarTarefa(ArrayList<String> tarefas, String tarefa) {
        tarefas.add(tarefa);
        JOptionPane.showMessageDialog(null,"Tarefa adicionada com sucesso.","Adicionar tarefa",JOptionPane.INFORMATION_MESSAGE);
    }
    private static void removerTarefa(ArrayList<String> tarefas, int indice) {
        tarefas.remove(indice);
        JOptionPane.showMessageDialog(null,"Tarefa removida com sucesso.","Remover tarefa",JOptionPane.INFORMATION_MESSAGE);
    }
    private static void listarTarefas(ArrayList<String> tarefas) {
        for (String tarefa : tarefas) {
            JOptionPane.showMessageDialog(null,tarefas,"Listar tarefas",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}