public class HelloWorld {
  // args = data dari command line
  public static void main(String[] args) {
	for (int i=0; i < args.length; i++) {
		System.out.println(args[i]);
	}
	
    System.out.println("Hello World");
  }
}