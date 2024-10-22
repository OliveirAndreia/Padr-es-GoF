package ProjetoPadraozinho;

public final class Superpadraozinho {
    // A instância única da classe Superpadraozinho
    private static final Superpadraozinho INSTANCE = new Superpadraozinho();

    // Construtor privado para evitar a instância externa
    private Superpadraozinho() {
        // Inicialização do personagem, se necessário
    }

    // Método para acessar a instância única
    public static Superpadraozinho getInstance() {
        return INSTANCE;
    }

    // Exemplo de métodos que o personagem pode ter
    public void realizarAcao() {
        System.out.println("Superpadrãozinho está realizando uma ação!");
    }
}
