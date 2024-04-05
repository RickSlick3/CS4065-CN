
package webserver;

public class FtpTest {
    public static void main(String args[]) {
        FtpClient test = new FtpClient();
        test.connect("ricky", "abc");
        test.getFile("ftp_test.txt");
        test.getFile("test.txt");
        test.disconnect();
    }
}