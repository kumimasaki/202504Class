package practice.ex1;

/**
 * CalculatorMain クラスは、Calculator クラスのメソッドを使用して基本的な四則演算の結果を確認
 */
public class CalculatorMain {

    /**
     * メインメソッドは、Calculator のインスタンスを作成し、加算、減算、乗算、除算の結果を確認
     * 0での除算を試み、例外が正しく処理されるかどうかも確認
     * 
     * @param args コマンドライン引数（使用しない）
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // 加算の確認
        System.out.println("加算: 2 + 3 = " + calculator.add(2, 3));

        // 減算の確認
        System.out.println("減算: 5 - 3 = " + calculator.subtract(5, 3));

        // 乗算の確認
        System.out.println("乗算: 2 * 3 = " + calculator.multiply(2, 3));

        try {
            // 正常な除算確認
            System.out.println("除算: 6 / 3 = " + calculator.divide(6, 3));
            
            // 0での除算の確認（例外が発生する）
            System.out.println("除算: 1 / 0 = " + calculator.divide(1, 0));
        } catch (IllegalArgumentException e) {
            // 例外が発生した場合の処理
            System.out.println("エラー: " + e.getMessage());
        }
    }
}
