/**
 * Classe abstrata que representa um explorador na Caça ao Tesouro Paralela.
 * Define a estrutura básica para diferentes tipos de exploradores.
 */
public abstract class Explorador implements Runnable  {
    protected String nome;
    protected String tipo;
    protected int prioridade;
    protected String tarefa;

    public Explorador( String nome, String tipo, int prioridade, String tarefa) {
        this.nome= nome;
        this.tipo= tipo;  
        this.prioridade= prioridade;
        this.tarefa= tarefa; 

    }

    
    // * Construtor que inicializa todos os atributos do explorador.
    


    /**
     * Método abstrato que deve ser implementado pelas subclasses.
     * Define como cada tipo de explorador executa sua tarefa.
     * @throws TarefaInvalidaException Se a tarefa for inválida
     */
    public abstract void executarTarefa() throws TarefaInvalidaException;

    @override
    public void run() {
        try {
            executarTarefa();
        } catch (TarefaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

}
    
    /**
     * Exibe o status completo do explorador com formatação clara.
     */
    public void exibirStatus() {

    }
