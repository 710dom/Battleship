import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readLine = reader.readLine();
        StringBuilder strb = new StringBuilder(readLine);
        readLine = strb.reverse().toString();
        System.out.println(readLine);
        reader.close();
    }
}