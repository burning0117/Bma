(function (jQuery) {
    $.fn.controlCheckBox= function(){
       if($(this).attr("checked")){
           alert("aaaa");
           $("input[name='"+checkname+"']").attr("checked",true);
       }else{
           $("input[name='"+checkname+"']").attr("checked",false);
       }
    }
})(jQuery);