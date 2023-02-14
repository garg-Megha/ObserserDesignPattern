package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImplementation implements NotificationAlertObserver {
    StockObservable observable;
    String username;
    public MobileAlertObserverImplementation(String username, StockObservable obj){
        this.username = username;
        this.observable = obj;
    }
    public void update(){
        sendMail(username,"product is back in stock");
    }

    private void sendMail(String username, String msg){
        System.out.println("msg sent to mobile:" + username + " " + msg);
    }
}
