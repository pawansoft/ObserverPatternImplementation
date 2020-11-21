public interface Observable {
    public boolean register(Observer observer);
    public boolean unRegister(Observer observer);
    public void update(int i);
}
