package aug0308;

public class  FileNameExtractor {
  public static String extractFileName(String dirtyFileName) {
    // write code here
    int index = dirtyFileName.indexOf("_");
    dirtyFileName = dirtyFileName.substring(index + 1);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(dirtyFileName);
    stringBuilder.reverse();
    index = stringBuilder.toString().indexOf(".");
    dirtyFileName = stringBuilder.toString().substring(index + 1);
    stringBuilder.setLength(0);
    stringBuilder.append(dirtyFileName);
    stringBuilder.reverse();
    return stringBuilder.toString();
  }
}
