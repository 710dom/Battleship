import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;

        int toto = inputStream.read();
        while (toto != -1) {
            System.out.print(toto);
            toto = inputStream.read();
        }
    }
}