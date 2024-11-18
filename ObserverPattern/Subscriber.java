package ObserverPattern;

public class Subscriber {
    private String name;
    private Channel channel = new Channel(); //Assumption: Each subscriber can subscribe to only one channel

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Channel getChannel() {
        return channel;
    }

    public void update() {
        System.out.println("Hey " + name + ", Check out new video: " + channel.getTitle());
    }

    public void subscribeChannel(Channel ch) {
        channel = ch;
    }
    
}
