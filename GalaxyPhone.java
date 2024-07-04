public class GalaxyPhone extends Smartphone {
    public GalaxyPhone(Person owner, Brand brand) {
        super(owner, brand);
    }

    @Override
    public void printTurnOnProcess(String comment){
        System.out.println("*** "+comment+" ***");
    }


}
