package problem1396;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UndergroundSystem {

  private Map<String, List<Integer>> map;
  private Map<Integer, Record> table;

  public UndergroundSystem() {
    map = new HashMap<>();
    table = new HashMap<>();
  }

  public void checkIn(int id, String stationName, int t) {
    if (table.containsKey(id)) {
      return;
    }
    table.put(id, new Record(stationName, t));
  }

  public void checkOut(int id, String stationName, int t) {
    if (!table.containsKey(id)) {
      return;
    }
    Record record = table.remove(id);
    int time = t - record.t;
    String key1 = record.stationName + "," + stationName;
    String key2 = stationName + "," + record.stationName;
    if (map.containsKey(key1)) {
      map.get(key1).add(time);
    } else if (map.containsKey(key2)) {
      map.get(key2).add(time);
    } else {
      List<Integer> list = new ArrayList<>();
      list.add(time);
      map.put(key1, list);
    }
  }

  public double getAverageTime(String startStation, String endStation) {
    String key1 = startStation + "," + endStation;
    String key2 = endStation + "," + startStation;
    List<Integer> list = null;
    if (map.containsKey(key1)) {
      list = map.get(key1);
    } else if (map.containsKey(key2)) {
      list = map.get(key2);
    }
    double sum = 0d;
    if (list != null) {
      for (int i = 0; i < list.size(); i++) {
        sum += list.get(i);
      }
      return sum / list.size();
    }
    return sum;
  }

  private class Record {
    String stationName;
    int t;

    public Record(String stationName, int t) {
      this.stationName = stationName;
      this.t = t;
    }
  }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
