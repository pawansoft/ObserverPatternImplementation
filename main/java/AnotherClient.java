public class AnotherClient implements Observer{
    @Override
    public void getData(int i) {
        System.out.println("Data received from subject in another client" +i);
    }
}
