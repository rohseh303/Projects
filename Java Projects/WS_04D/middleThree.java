public String middleThree(String str) {
  int length = str.length();
  int middleIndex = length/2;
  int a = middleIndex -1;
  int b = middleIndex + 2;
  String finalString = str.substring(a, b);
  return finalString;
}
