import java.net.InetAddress;
import java.net.SocketPermission;

/**
 * Created by Dan on 2/8/2015.
 */
public class IPAddress {

    public static void main(String[] args) throws Exception
    {
        System.out.println(InetAddress.getLocalHost());
    }
}
