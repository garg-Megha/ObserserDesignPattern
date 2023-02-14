package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImplementation implements StockObservable {
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount =0;

    public void add(NotificationAlertObserver observer){
        observerList.add(observer);
    }

    public void remove(NotificationAlertObserver observer){
        observerList.remove(observer);
    }

    public void notifySubscribers(){
        for(NotificationAlertObserver obj: observerList){
            obj.update();
        }
    }

    public void setStockCount(int newStock){
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount+=newStock;
    }

    public int getStockCount(){
        return stockCount;
    }



}
