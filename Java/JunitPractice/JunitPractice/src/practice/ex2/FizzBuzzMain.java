package practice.ex2;

public class FizzBuzzMain {
  public static void main(String[] args) {
      FizzBuzz fizzBuzz = new FizzBuzz();

      // 1から15までのFizzBuzzを表示
      for (int i = 1; i <= 15; i++) {
          System.out.println(fizzBuzz.fizzBuzz(i));
      }
  }
}
