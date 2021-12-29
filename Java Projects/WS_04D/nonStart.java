public String nonStart(String a, String b) {
  //int lastLocationA = a.lastIndexOf(a);
  //int lastLocationA = b.lastIndexOf(b);
  String omitALetter = a.substring(0, 1);
  String omitBLetter = b.substring(0, 1);
  a = a.replace(omitALetter, "");
  b = b.replace(omitBLetter, "");
  String output = a + b;
  return output;
}
