import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        TextMessageSender tms = new TextMessageSender();
        UserCommunicator usercomm = new UserCommunicator();

        int numberOfMessages = usercomm.askForNumberOfMessages();

        String message = usercomm.askForMessage();
        String number = usercomm.askForTextMessageInfo();


        tms.send(number, message);
    }
}