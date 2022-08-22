package aug1308;

public class main {
    public static void main(String[] args) {
        String s1 = "as2tdasaivjeffuheasdfkgu873hfiuJHDILUh7ie7asafasfmf sda";
        String s2 = "as";
//        int count = 0;
//        for (int i = 0; i < s1.length() - s2.length(); i++) {
//            if (s1.charAt(i) == s2.charAt(0)) {
//                if (s1.substring(i, i + s2.length()).equals(s2)) {
//                    count++;
//                    i+=s2.length() - 1;
//                }
//            }
//        }
        String[] string = s1.split(s2);
        System.out.println(string.length - 1);
    }
}
