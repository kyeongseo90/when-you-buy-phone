public class GalaxyPhone extends Smartphone {
    public GalaxyPhone() {
        super(Brand.SAMSUNG);
    }

    @Override
    public void printTurnOnProcess(String comment){
        System.out.println("*** "+comment+" ***");
    }


}
