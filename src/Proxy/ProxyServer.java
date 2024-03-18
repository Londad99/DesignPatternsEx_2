package Proxy;

public class ProxyServer implements Server{

        private RealServer server;
        private String host;
        private int port;

        public ProxyServer(String host, int port){
            System.out.println("Creating a new proxy server...");
            this.host = host;
            this.port = port;
        }

        public boolean isRestricted(String url){
            return url.contains("xxx");
        }

        public void download(String url) {
            if(isRestricted(url)){
                System.out.println("Access to " + url + " is restricted");
            }else{
                if(server == null){
                    server = new RealServer(host, port);
                }
                server.download(url);
            }
        }
}
