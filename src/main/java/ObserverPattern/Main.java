package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImplementation;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImplementation;
import ObserverPattern.Observer.MobileAlertObserverImplementation;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImplementation();
        NotificationAlertObserver obj1 = new EmailAlertObserverImplementation("abc", iphoneStockObservable);
        NotificationAlertObserver obj2 = new EmailAlertObserverImplementation("jkl", iphoneStockObservable);
        NotificationAlertObserver obj3 = new MobileAlertObserverImplementation("xyz", iphoneStockObservable);

        iphoneStockObservable.add(obj1);
        iphoneStockObservable.add(obj2);
        iphoneStockObservable.add(obj3);

        iphoneStockObservable.setStockCount(10);
        System.out.println(iphoneStockObservable.getStockCount());
        iphoneStockObservable.setStockCount(-10);
        System.out.println(iphoneStockObservable.getStockCount());
        iphoneStockObservable.setStockCount(100);
        System.out.println(iphoneStockObservable.getStockCount());


    }
}