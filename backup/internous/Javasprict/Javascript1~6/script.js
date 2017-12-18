//第一
document.write("hello world");
document.write("<h1>hello</h1>");
alert("ページを移動しようとしています");//アラーと
confirm("入力を確定してもよろしいでしょうか");//確認
/*javascriptはjavaとはまったく違う言語です。
そこを注意しましょう*/
//////////////////////////////////////////////


//第二
document.write(12345);//数列
document.write("<br>おはよう")//文字列　""で囲む
//論理値 true false

/////////////////////////////////////////////
document.write("<br>")
/////////////////////////////////////////////


//第三
//変数 var ~~
//変数の大文字と小文字は区別される
//変数には最初の文字に数字と_以外の記号は使えない
// 代入　
var name ="高橋";
document.write(name);
/////////////////////////////////////////////
document.write("<br>")
/////////////////////////////////////////////


//第四
var a =3+3;//足し算
document.write(a);

document.write("<br>")

var a1=10/2;//割り算
document.write(a1);

document.write("<br>")

var a2=-3-5//引き算
document.write(a2)

document.write("<br>")

var a3=4*5//掛け算
document.write(a3)

document.write("<br>")

var a4=21%5//剰余　割ってあまりを出す。
document.write(a4)

//数式を文字列と認識させるには""で囲んで文字列にする
////////////////////////////////////////////////
document.write("<br>")
/////////////////////////////////////////////////
//第五

var a=10;
document.write(++a)//前置加算子　変数に1を加えて表示する

document.write("<br>")

var b=20;
document.write(b++)//後置加算子 変数を表示した後に1を加える
//↑の場合この文のあとのbの変数は21となる
//--の形で減算子にも使える