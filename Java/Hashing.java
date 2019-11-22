import java.security.MessageDigest;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Hashing {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        in.close();
        
        String hashType = "SHA-256";
        // String hashType = "SHA-512";
        // String hashType = "SHA-384";
        // String hashType = "SHA-1";
        // String hashType = "MD5";

        try {
            MessageDigest messageDigest = MessageDigest.getInstance(hashType);
            messageDigest.update(message.getBytes());
            byte[] hash = messageDigest.digest();

            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
