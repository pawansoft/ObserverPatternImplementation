public class Driver {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Client client = new Client();
        Client client1 = new Client();
        AnotherClient anotherClient = new AnotherClient();
        subject.register(client);
        subject.register(client1);
        subject.register(anotherClient);
        subject.performSomeTask();
    }
}
