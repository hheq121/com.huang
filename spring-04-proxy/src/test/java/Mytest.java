import com.rbc.Host;
import com.rbc.Proxy;

public class Mytest {


    public static void main(String[] args) {
        Host host = new Host();

        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
