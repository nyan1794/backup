for(var a=1;a<=5;a++){
    document.write("★");
}
document.write("<br>");
for(var b=1;b<=2;b++){
    document.write("<br>");
    for(var c=1;c<=3;c++){
        document.write("★");
    }
}
document.write("<br>");

for(var z=0;z<=19;z++){
    if(z % 5 == 0){
        document.write("<br>");
    }
    document.write("★");
}
document.write("<br>");

for (var h=0;h<=5;h++){
    for(var r=0;r<=h;r++){
        document.write("★");
    }
    document.write("<br>");
    
}

document.write("<br>");
for (var i=1;i<10;i++){
    if(i%3==2){
        document.write("☆");
    }else if(i%3==0){
        document.write("★"+"<br>");
    }else{
        document.write("★");
    }
    
}