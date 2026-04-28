class AdapterCheminee implements Appareils{
    public Cheminee c;

    public AdapterCheminee(Cheminee c){
        this.c = c;
    }

    @Override
    public void allumer() {
        c.changerIntensite(100);
        System.out.println("La cheminée est allumée.");
    }

    @Override
    public void eteindre() {
        c.changerIntensite(0);
        System.out.println("La cheminée est éteinte.");
    }
}
