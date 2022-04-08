public class Driver {

  public static void main(String args[]) {
    System.out.println("Driver");
    Integer[] intArray = { 1, 2, 3, 4, 5 };
    String[] strArray = { "one", "two", "three", "four", "five" };
    CircularArray<Integer> intArry = new CircularArray<>(intArray);
    CircularArray<String> strArry = new CircularArray<>(strArray);
    CircularArray<Integer> numArry = new CircularArray<>(5);

    for (int i = 0; i < numArry.length(); i++) {
      numArry.set(i, i);
    }

    System.out.println("Rotating intArry:");
    for (int i = 0; i < intArry.length(); i++) {
      System.out.println("Rotating intArry by +1");
      intArry.rotate(1);
      for (Integer j : intArry) {
        System.out.println(j);
      }
    }

    System.out.println("Rotating numArry: ");
    for (int i = 0; i < numArry.length(); i++) {
      System.out.println("Rotating numArry by +1");
      numArry.rotate(1);
      for (Integer j : numArry) {
        System.out.println(j);
      }
    }

    System.out.println("Rotating strArry: ");
    for (int i = 0; i < strArry.length(); i++) {
      System.out.println("Rotating strArry by -1");
      strArry.rotate(-1);
      for (String s : strArry) {
        System.out.println(s);
      }
    }
  }
}
