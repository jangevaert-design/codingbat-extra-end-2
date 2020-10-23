public class ExtraEnd2 {
  public String extraEnd(String str) {
    int len = str.length();

    return (str.substring(len - 2, len) + str.substring(len - 2, len)
        + str.substring(len - 2, len));
  }
}
