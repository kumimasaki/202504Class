package practice.ex2;

/**
 * FizzBuzz クラスは、整数に対して "Fizz", "Buzz", または "FizzBuzz" の判定を行う
 */
public class FizzBuzz {

    /**
     * 指定された整数 n に基づいて "Fizz", "Buzz", "FizzBuzz" または数値そのものを返す。
     * - n が 3 で割り切れる場合、"Fizz" を返す。
     * - n が 3 と 5 の両方で割り切れる場合、"FizzBuzz" を返す。
     * - 上記の条件に当てはまらない場合は、n を文字列に変換して返す。
     * 
     * @param n 判定する整数
     * @return "Fizz", "Buzz", "FizzBuzz" または n を文字列にしたもの
     */
    public String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
        	// 3 と 5 の両方で割り切れる場合
            return "FizzBuzz";
        } else if (n % 3 == 0) {
        	// 3 でのみ割り切れる場合
            return "Fizz";
        } else if (n % 5 == 0) {
        	// 5 でのみ割り切れる場合
            return "Buzz";
        } else {
        	// どちらでも割り切れない場合
            return String.valueOf(n);
        }
    }
}

