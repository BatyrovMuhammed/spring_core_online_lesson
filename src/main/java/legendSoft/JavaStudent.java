package legendSoft;

public class JavaStudent implements Teacher{

    @Override
    public void code() {
        System.out.println("""
                public class Main {
                  public static void main(String[] args) {
                    System.out.println("Hello World");
                  }
                """);
    }

    @Override
    public void speed() {
        System.out.println("FAST");
    }
}
