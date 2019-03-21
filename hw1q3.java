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
