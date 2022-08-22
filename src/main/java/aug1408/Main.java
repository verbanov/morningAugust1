package aug1408;

public class Main {
    public static void main(String[] args) {
        String s = "qwe123qwe";
        String regex = "[^A-Za-z]+";
        s = s.replaceAll(regex, "");
        System.out.println(s);

    }
}
