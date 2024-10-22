package ProjetoPadraozinho;

public class DesertoFactory implements CenarioFactory {
    @Override
    public AnimalPerigoso criarAnimalPerigoso() {
        return new Serpente();
    }

    @Override
    public AnimalTransporte criarAnimalTransporte() {
        return new Dromedario();
    }
}
