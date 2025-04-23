// 要素の取得
let result = document.getElementById("text-result");
let buttonReset = document.getElementById("change-text1");
let buttonAdd = document.getElementById("change-text2");
let buttonSub = document.getElementById("change-text3");

// 「値：」を定数で保持
const BASE_TEXT = "値：";
// 計算結果を格納する変数
let resultValue = 0;

// 値を表示するメソッド
function changeResultText(){
    result.innerHTML = BASE_TEXT + resultValue;
}

// 値を計算するためのメソッド
function calculateResultValue(setValue) {
    resultValue = resultValue + setValue;
}

// リセットボタンをクリック
buttonReset.addEventListener("click", () =>{
    resultValue = 0;
    changeResultText();
});

//１を加算した時
buttonAdd.addEventListener("click", () => {
    calculateResultValue(1);
    changeResultText();
});

//１を減算した時
buttonSub.addEventListener("click", () => {
    calculateResultValue(-1);
    changeResultText();
});
