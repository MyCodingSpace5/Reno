import javax.net.ssl.HttpsURLConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI.*;
import java.net.URL.*;
import java.net.URL;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        Scanner userinput = new Scanner(System.in);
        var stab = "https://api.computerender.com/generate/";
        System.out.println("What image would you like to generate");
        var input = userinput.nextLine();
        System.out.println("Your image is ready");
        System.out.println("Image link: " + stab + input);
    }
}
