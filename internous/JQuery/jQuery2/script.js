$(function(){
    $(".box1").hover(
        function(){
        $(".box2").hide();
    },
        function(){
        $(".box2").show();
        });
})

$(function(){
    $("#aq").hover(
        function(){
            $("#bq").animate({width:"220px",height:"220px"});
        },
        function(){
            $("#bq").animate({width:"200px",height:"200px"});
        });
});