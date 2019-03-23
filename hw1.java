public class hw1/q2{
  public static void main(String[] args){
    for(int x = 50; x <=100; x+=2){
      System.out.println(x);
    }
  }
}

public class hw1/q1{
  public static void main(String[] args){
    int fib1 = 1;
    int fib2 = 1;
    int interations = 5;
    for(int i = 0; i < iterations; i++){
      System.out.println(fib1);
      int tempFib1 = fib1;
      fib1 = fib2;
      fib2 += tempFib1;

    }
  }

}

public class hw1/q3{
  public static void main(String[] args){
    ArrayList<int> integers = new ArrayList<int>();
    int total = 0;
    for(int i = 0; i < 10; i++){
      System.out.println(i);
      integers.add(i);
    }
    for(int integer: integers){
      total += integer;
    }
    System.out.println(total);
  }
}
