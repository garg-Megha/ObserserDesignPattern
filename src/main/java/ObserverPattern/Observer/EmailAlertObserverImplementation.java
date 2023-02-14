package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImplementation implements NotificationAlertObserver{
    StockObservable observable;
    String emailId;
    public EmailAlertObserverImplementation(String email, StockObservable obj){
        this.emailId = email;
        this.observable = obj;
    }
    public void update(){
        sendMail(emailId,"product is back in stock");
    }

    private void sendMail(String email, String msg){
        System.out.println("Mail sent to:" + email + " "+  msg);
    }
}
