package Proxy;

public class RealServer implements Server{

    private int port;
    private String host;

    public RealServer(String host, int port){
        System.out.println("Creating a new server...");
        this.host = host;
        this.port = port;
    }

    public void download(String url) {
        System.out.println("Downloading " + url + " from " + host + ": " + port);
    }
}
