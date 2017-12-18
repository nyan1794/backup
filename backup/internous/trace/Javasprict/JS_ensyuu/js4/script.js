for (var i=1; i<=25 ; i++){
   
    if(i%5==0&&i!=25){
        document.write("★"+"<br>")
    }else if(i%6==2){
        document.write("★");
    }else if(i%6==1){
        document.write("☆");
    }else{
        document.write("★");
    }
}
document.write("<br>");
