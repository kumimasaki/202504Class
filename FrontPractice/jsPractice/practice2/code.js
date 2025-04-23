// 要素を取得
let label = document.getElementById("label");
let button1 = document.getElementById("change-text1");

button1.addEventListener("click", () => {
    label.innerHTML = "りんご";
});

document.getElementById("change-text2").addEventListener("click", () =>{
    label.innerHTML = "バナナ";
});

document.getElementById("change-text3").addEventListener("click", () =>{
    label.innerHTML = "みかん";
});