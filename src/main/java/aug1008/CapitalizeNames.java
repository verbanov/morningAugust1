package aug1008;

public class CapitalizeNames {
  public static String[] capitalizeNames(String[] names) {
    // write code here
    for (int i = 0; i < names.length; i++) {
      names[i] = names[i].toLowerCase();
      names[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring(1);
    }
    return names;
  }
}