function match1(){              //関数match1を作成
    var bz1=document.getElementById("id1").value;   //id1から要素を抽出ブラジルの得点をbz1に代入する。
    var sp1=document.getElementById("id2").value;   //id2から要素を抽出スペインの得点をsp1に代入する。
    bz1=Number(bz1);    //Number関数を使って文字列を数列化
    sp1=Number(sp1);       //上に同じく
    var bzteam=0;       //ブラジルの勝ち点を０に設定
    var spteam=0;       //スペインの勝ち点を０に設定
    if(bz1==sp1){       //if文で同点だった場合にスペインとブラジルに勝ち点を１点加算する
        bzteam++;
        spteam++;
    }else if(bz1<sp1){  //スペインの得点が高かった場合にスペインに勝ち点３を加算する。
        spteam+=3;
    }else if(bz1>sp1){  //ブラジルの得点が高かった場合にブラジルに勝ち点３を加算する。
        bzteam+=3;
    }
    var match1bz=bz1-sp1; //ブラジルの得点からスペインの得点を引き得失点をmatch1bzに代入する
    var match1sp=sp1-bz1; //スペインの得点からブラジルの点数を引き得失点をmatch1spに代入する
    var bz2=document.getElementById("id3").value;//上とほぼ同意義なので説明は割愛
    var jp1=document.getElementById("id4").value;
    bz2=Number(bz2);
    jp1=Number(jp1);
    var jpteam=0;
    if(bz2==jp1){
        bzteam++;
        jpteam++;
    }else if(bz2<jp1){
        jpteam+=3;
    }else if(bz2>jp1){
        bzteam+=3;
    }
    var match2bz=match1bz+bz2-jp1;//ブラジルの一試合目の得失点と今回の得点を足し日本の得点を引きmatch2bzに代入する。
    var match1jp=jp1-bz2;
    
    var sp2=document.getElementById("id5").value;
    var jp2=document.getElementById("id6").value;
    sp2=Number(sp2);
    jp2=Number(jp2);
    if(sp2==jp2){
        spteam++;
        jpteam++;
    }else if(sp2<jp2){
        jpteam+=3;
    }else if(sp2>jp2){
        spteam+=3;
    }
    var match2sp=match1sp+sp2-jp2;//var match2bzと同意義
    var match2jp=match1jp+jp2-sp2;

    document.write("ブラジルの勝ち点"+bzteam+"得失点差は"+match2bz);
    document.write("<br>");//勝ち点bzteamと得失点の合計match2bzを出力する。
    document.write("スペインの勝ち点"+spteam+"得失点差は"+match2sp);
    document.write("<br>");
    document.write("日本の勝ち点"+jpteam+"得失点差は"+match2jp);
    document.write("<br>");

    }
