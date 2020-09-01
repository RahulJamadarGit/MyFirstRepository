class HelloWorld {

  public static void main(String[] args){
    System.out.println("Hello World....Welcome to GitHub!");
    System.out.println("Addition is: "+add(10,20));
    System.out.println("Subtraction is: "+subtract(40,10));
    System.out.println("Multiplicaton is: "+multiply(40,10));
    System.out.println("Division is: "+divide(50,10));
  }
  public static int add(int a, int b){
   return a+b; 
  }
  public static int subtract(int a, int b){
   return a-b; 
  }
  public static int multiply(int a, int b){
   return a*b; 
  }
  public static int divide(int a, int b){
   return a/b; 
  }
}
