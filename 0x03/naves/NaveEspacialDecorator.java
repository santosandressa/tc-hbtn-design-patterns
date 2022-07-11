public class NaveEspacialDecorator extends NaveEspacial{

    private NaveEspacial naveEspacial;

    public NaveEspacialDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial.getSaude(), naveEspacial.getAtaque());
        this.naveEspacial = naveEspacial;
    }

    @Override
    public int getSaude() {
        return naveEspacial.getSaude();
    }

    @Override
    public int getAtaque() {
        return  naveEspacial.getAtaque();
    }
}
