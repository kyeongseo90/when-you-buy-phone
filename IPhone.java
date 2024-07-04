public class IPhone extends Smartphone {
    public IPhone(Person owner, Brand brand) {
        super(owner, brand);
    }

    @Override
    public void printTurnOnProcess(String comment){
        System.out.println("@@@ "+comment+" @@@");
    }


}
