$(function(){
    // <ol>の取得
    let list = $("#list");
    // 新しい<li>を作成
    let newLink = $("<li>");
    list.append(newLink);

    // 新しい<a>要素を追加
    let item = $("<a>");
    item.html("追加しました");
    newLink.append(item);

    // 要素の削除
    // list.remove();
    // 要素の中を空にする
    list.empty();

    // onClick
    // $("#button1").click(() => {
    //     console.log("ボタン1");
    // });
    
    // addEventListener
    $("#button1").on("click", () => {
        console.log("ボタン1");
    });
});