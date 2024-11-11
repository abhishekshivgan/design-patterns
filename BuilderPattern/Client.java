package BuilderPattern;

public class Client {
    public static void main(String[] args) {
        
        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocal("http://").hostname("abhishek.com:").port("3000/").pathParam("articles");
        URLBuilder urlBuilder = builder.build();

        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
        System.out.print(urlBuilder.port);
        System.out.print(urlBuilder.pathParam);

    }
}
