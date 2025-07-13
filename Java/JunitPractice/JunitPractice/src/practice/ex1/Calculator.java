package practice.ex1;
/**
 * Calculator クラスは、基本的な四則演算（加算、減算、乗算、除算）を行う
 */
public class Calculator {
	
    /**
     * 2つの整数を加算
     * 
     * @param a 加算対象の1つ目の整数
     * @param b 加算対象の2つ目の整数
     * @return a と b の合計
     */
	public int add(int a, int b) {
		return a + b;
	}

    /**
     * 2つの整数を減算
     * 
     * @param a 減算の被減数
     * @param b 減算の減数
     * @return a から b を引いた結果
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * 2つの整数を乗算
     * 
     * @param a 乗算対象の1つ目の整数
     * @param b 乗算対象の2つ目の整数
     * @return a と b の積
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * 2つの整数を除算
     * 
     * @param a 被除数
     * @param b 除数（0でないことが前提）
     * @return a を b で割った結果
     * @throws IllegalArgumentException b が 0 の場合
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
