public String makeOutWord(String out, String word) {
  String firstPart = out.substring(0,2);
  String endPart = out.substring(2,4);
  String newBuild = firstPart + word + endPart;
  return newBuild;
}
