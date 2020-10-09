public class MyClass {
    static void mymethode(String name){
        System.out.println("my name is :"+name);
    }
    static int myMethod(int x, int y) {
        return x + y;
      }

      static int plusMethod(int x, int y) {
        return x + y;
      }
      
      static double plusMethod(double x, double y) {
        return x + y;
      }

    public static void main(String[] args) {
        mymethode("jayaram");
        int z = myMethod(5, 3);
        System.out.println(z);

        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("int: " + plusMethod(6, 14));
        System.out.println("double: " + myNum2);

      System.out.println("Hello World");
      System.out.println("Hi jayaram how are you");
      for (int i = 0; i <= 5; i++) {
        System.out.println(i);
      }  
      for (int i = 0; i <= 10; i = i + 2) {
        System.out.println(i);
      }  
      int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
      String[] names = {"jayaram","kasim","priya"};
      System.out.println(names.length+"jay");
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars.length);

      for (int i = 0; i < myNumbers.length; ++i) {

        for(int j = 0; j < myNumbers[i].length; ++j) {
          System.out.println(myNumbers[i][i]);
        }
      }
    }
  }