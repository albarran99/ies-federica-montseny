public class ZooFake implements Zoo {


    @Override
    public void imprimeHerbivoro() {
        System.out.println("Me gustan las patatas");
    }

    @Override
    public void imprimeCarnivoro() {
        System.out.println("Me gusta el rojo");
    }

    @Override
    public void imprimeOmnivoro() {
        System.out.println("Me llamo Ralhp");
    }
}
