
var otonagroup=[2,1,3];
var kodomogroup=[4,5,7];


 
function ryokin(number){
    otonaryokin=500;
    kodomoryokin=200;

var total = otonagroup[number]*otonaryokin + kodomogroup[number]*kodomoryokin;
    return total;
    }
for(var i=0;i<=2;i++){
    document.write(ryokin(i)+"<br>");
}