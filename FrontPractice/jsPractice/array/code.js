// 配列の初期化
let arr = [1, 2, 3, 'Alice', 12.5];
console.log(arr);

// 配列に値を追加
arr.push('追加');
console.log(arr);
console.log(arr.length);
// 配列の一番最後のデータを削除
arr.pop();
console.log(arr);

// 配列の作成
let arr2 = new Array(5);
// 0番目に12、1番目"hello"　を代入
arr2[0] = 12;
arr2[1] = 'hello';
// 配列の中身を表示
console.log(arr2);

// オブジェクトの書き方
let obj = {name:'Alice', id:111, isStudent:true};
console.log(obj);
// 特定のデータの表示の仕方
console.log(obj.name);
console.log(obj["name"]);
// 値の上書き
obj.id = 222;
console.log(obj.id);

// isStudentをfalseで上書き
obj.isStudent = false;
// isStudentの内容を表示
console.log(obj.isStudent);

// for-of
// let arr = [1, 2, 3, 'Alice', 12.5];
for (let a of arr){
    console.log(a);
}

// for-in
// let obj = {name:'Alice', id:222, isStudent:false};
for(let key in obj){
    console.log(key + '：' + obj[key]);
}