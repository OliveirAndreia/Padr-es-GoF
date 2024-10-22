package ProjetoPadraozinho;

public class Jogo {
    public static void main(String[] args) {
        // Obtendo a instância única do Superpadraozinho
        Superpadraozinho superpadraozinho = Superpadraozinho.getInstance();

        // Exemplo de ação do Superpadraozinho
        superpadraozinho.realizarAcao();

        // Cenário: Deserto
        CenarioFactory desertoFactory = new DesertoFactory();
        AnimalPerigoso serpente = desertoFactory.criarAnimalPerigoso();
        AnimalTransporte dromedario = desertoFactory.criarAnimalTransporte();

        // Interação com os animais do Deserto
        serpente.mostrarPerigo();
        dromedario.transportar();

        System.out.println(); // Apenas para separar a saída

        // Cenário: Selva Jurássica
        CenarioFactory selvaFactory = new SelvaJurasicaFactory();
        AnimalPerigoso trex = selvaFactory.criarAnimalPerigoso();
        AnimalTransporte pterodatilo = selvaFactory.criarAnimalTransporte();

        // Interação com os animais da Selva Jurássica
        trex.mostrarPerigo();
        pterodatilo.transportar();
    }
}
