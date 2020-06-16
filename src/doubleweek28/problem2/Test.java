package doubleweek28.problem2;

public class Test {
  public static void main(String[] args) {
    SubrectangleQueries obj1 = new SubrectangleQueries(new int[][]{
        {1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1}
    });
    System.out.println(obj1.getValue(0, 2));
    obj1.updateSubrectangle(0, 0, 3, 2, 5);
    System.out.println(obj1.getValue(0, 2));
    System.out.println(obj1.getValue(3, 1));
    obj1.updateSubrectangle(3, 0, 3, 2, 10);
    System.out.println(obj1.getValue(3, 1));
    System.out.println(obj1.getValue(0, 2));

    SubrectangleQueries obj2 = new SubrectangleQueries(new int[][]{
        {1, 1, 1}, {2, 2, 2}, {3, 3, 3}
    });
    System.out.println(obj2.getValue(0, 0));
    obj2.updateSubrectangle(0, 0, 2, 2, 100);
    System.out.println(obj2.getValue(0, 0));
    System.out.println(obj2.getValue(2, 2));
    obj2.updateSubrectangle(1, 1, 2, 2, 20);
    System.out.println(obj2.getValue(2, 2));
  }
}
