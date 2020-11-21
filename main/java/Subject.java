import java.util.ArrayList;
import java.util.List;

public class Subject implements Observable {

    List<Observer> observerList = new ArrayList<>();

    @Override
    public boolean register(Observer observer) {
        observerList.add(observer);
        return true;
    }

    @Override
    public boolean unRegister(Observer observer) {
        observerList.remove(observer);
        return true;
    }

    @Override
    public void update(int i) {
        for (Observer observer: observerList
             ) {
            observer.getData(i);
        }
    }

    public void performSomeTask(){
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
            update(i);
        }

    }
}
