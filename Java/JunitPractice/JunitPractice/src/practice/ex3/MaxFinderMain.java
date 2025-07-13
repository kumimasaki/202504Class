package practice.ex3;

public class MaxFinderMain {
  public static void main(String[] args) {
      MaxFinder maxFinder = new MaxFinder();

      // テスト用の配列を定義
      int[] numbers1 = {1, 2, 3, 4, 5};
      int[] numbers2 = {-1, -2, -3, 0, 1};
      int[] numbers3 = {100, 200, 300, 400, 500};
      int[] numbers4 = {3, 5, 2, 8, 1};

      // 各配列の最大値を表示
      System.out.println("Max of {1, 2, 3, 4, 5} = " + maxFinder.findMax(numbers1));
      System.out.println("Max of {-1, -2, -3, 0, 1} = " + maxFinder.findMax(numbers2));
      System.out.println("Max of {100, 200, 300, 400, 500} = " + maxFinder.findMax(numbers3));
      System.out.println("Max of {3, 5, 2, 8, 1} = " + maxFinder.findMax(numbers4));

      // 空の配列に対する例外処理
      try {
          maxFinder.findMax(new int[]{});
      } catch (IllegalArgumentException e) {
          System.out.println("Error: " + e.getMessage());
      }

      // nullに対する例外処理
      try {
          maxFinder.findMax(null);
      } catch (IllegalArgumentException e) {
          System.out.println("Error: " + e.getMessage());
      }
  }
}
