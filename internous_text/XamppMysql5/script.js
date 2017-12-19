$(function(){
    $("#list dt").on("click",function(){
        $(this).next("div").slideToggle();
    });
});
$(function(){
    $("div.button").on("click",function(){
        $(this).next("dl").slideToggle();
    });
});