public class IPhone extends Smartphone {
    public IPhone() {
        super(Brand.APPLE);
    }

    @Override
    public void printTurnOnProcess(String comment){
        System.out.println("@@@ "+comment+" @@@");
    }


}
