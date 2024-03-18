package Proxy;

public class Main {

        public static void main(String[] args) {
            Server server = new ProxyServer("localhost", 8080);

            server.download("http://www.google.com");

            server.download("http://www.xxx.com");
        }
}
