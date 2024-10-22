package ProjetoPadraozinho;

public class SelvaJurasicaFactory implements CenarioFactory {
    @Override
    public AnimalPerigoso criarAnimalPerigoso() {
        return new TRex();
    }

    @Override
    public AnimalTransporte criarAnimalTransporte() {
        return new Pterodatilo();
    }
}
