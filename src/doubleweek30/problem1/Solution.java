package doubleweek30.problem1;

class Solution {
  public String reformatDate(String date) {
    String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    String[] arrays = date.split(" ");
    String day = arrays[0].substring(0, arrays[0].length() - 2);
    if (day.length() <= 1) {
      day = "0" + day;
    }
    int month = -1;
    for (int i = 0; i < months.length; i++) {
      if (months[i].equals(arrays[1])) {
        month = i;
        break;
      }
    }
    month++;
    return arrays[2] + (month < 10 ? "-0" : "-") + month + "-" + day;
  }
}
