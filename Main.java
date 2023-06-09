public class Main {
  public static void main(String[] args){
    int value = 0;
    int num;
    
    System.out.println("Rolling dice...");
    
    for(int i = 1; i <= 2; i++){
      num = (int)Math.ceil(Math.random() * 6);
      
      System.out.println("Die " + i + ": " + num);
      value += num;
    }
    
    System.out.println("Total value: " + value);
  }
}
