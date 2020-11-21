public class Client implements Observer{
    @Override
    public void getData(int i) {
        System.out.println("Data received from subject" + i);
    }
}
