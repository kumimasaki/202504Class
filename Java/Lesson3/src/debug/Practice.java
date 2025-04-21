package debug;

public class Practice {

    public static void main(String[] args) {
        int[] scores = {70, 85, 40, 90, 60};
        int total = 0;

        for (int i = 0; i <= scores.length; i++) { // ← わざと「=」つけてある
            System.out.println("i: " + i); // ← i の確認
            total += scores[i];           // ← ここでエラーになる可能性あり
        }

        System.out.println("合計点: " + total);
    }
}
