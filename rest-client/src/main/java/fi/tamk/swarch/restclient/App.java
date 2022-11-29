package fi.tamk.swarch.restclient;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Rest Client for SW Architecture");
        RestClient client = new RestClient();
        client.restTestInfo();
        client.restTestId(7);
    }
}
