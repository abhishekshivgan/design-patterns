package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String title;
    private List<Subscriber> subs = new ArrayList<>();

    public void subscribe(Subscriber sub) {
        subs.add(sub);
    }

    public String getTitle() {
        return title;
    }

    public List<Subscriber> getSubs() {
        return subs;
    }

    public void unsubscribe(Subscriber sub) {
        subs.remove(sub);
    }

    public void notifySubscribers() {
        for(Subscriber sub: subs) {
            sub.update();
        }
    }

    public void upload(String title) {
        this.title = title;
        notifySubscribers();
    } 
}
