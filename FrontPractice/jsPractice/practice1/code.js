// 定数
const CALC_NUM = 100;

// isPrimeメソッド作成
function isPrime(x){
    for (let i = 2; i < x; i++) {
        if (x % i == 0) {
            return false;
        }
    }
    return true;
}

// mainメソッド作成
function main(args){
    let primes = new Array(CALC_NUM);
    let k = 0;
    for (let i = 2; k < CALC_NUM; i++) {
        if (isPrime(i)) {
            primes[k++] = i;
        }
    }
    console.log(primes);
}

// 呼び出し
main();