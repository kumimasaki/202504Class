$(function() {
    // ページの読み込みが完了したら、関数を実行
    
    // .sample-buttonクラスの要素を取得して、clickイベントを設定
    $(".sample-button").on("click", () => {
        // Ajaxリクエストを作成
        $.ajax({
            url: "test.html", // リクエストするURL
            type: "GET",      // リクエストのタイプ（GET）
            dataType: "html"  // 期待するデータタイプ（HTML）
        })
        .done(function(data) {
            // リクエストが成功した場合、取得したデータを.resultクラスの要素に挿入
            $(".result").html(data);
        })
        .fail(function() {
            // リクエストが失敗した場合、コンソールにエラーメッセージを表示
            console.log("通信が失敗しました");
        });
    });
});