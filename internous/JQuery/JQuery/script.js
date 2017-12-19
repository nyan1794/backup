$(function(){
    $("h1").css("color","red");
    $("h1").click(function(){
          $("h3").fadeOut();
          $("h1").dblclick(function(){
              $("h3").fadeIn();
          });
    
    });
  
});
$(function(){
    $("h2").text("おやすみ");
});

$(function(){
    $("#aa,#bb").css("color","red");
    
});
$(function(){
    $(".total").click(function(){
        $("p").text("20です。");
    });
});

$(function(){
    $(".x").click(function(){
        $(".y").hide();
    });
})