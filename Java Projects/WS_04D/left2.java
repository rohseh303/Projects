public String left2(String str) {
  String twoChar = str.substring(0,2);
  str = str.replace(twoChar, "");
  str = str + twoChar;
  return str;
}