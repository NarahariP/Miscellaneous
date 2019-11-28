$(window).ready(function () {
    $(".button").click(function(){
       $('.box').show();
    });
    $('.popupCloseButton').click(function(){
       $('input[name=a][value=n]').prop('checked',true);
        $('input[name=b][value=n]').prop('checked',true);
        $('input[name=c][value=n]').prop('checked',true);
        $('input[name=d][value=n]').prop('checked',true);
        $('input[name=cb]').prop('checked',false);
        $('.proposal').hide();
        $('.box').hide();
    });
    $(".submit").click(function(){
       $('.box').hide();
    });
    $('.cancel').click(function(){
    		$('input[name=a][value=n]').prop('checked',true);
        $('input[name=b][value=n]').prop('checked',true);
        $('input[name=c][value=n]').prop('checked',true);
        $('input[name=d][value=n]').prop('checked',true);
        $('input[name=cb]').prop('checked',false);
        $('.proposal').hide();
        $('.box').hide();
    });
    $('.proposal').hide();
    var val1;
    var val2;
    $('input[name=c][value=y]').prop('disabled','disabled');
    $('input[name=a]').click(function(){
    	var1 = $('input[name=a]:checked').val();
      varifyValue(var1,var2);
    });
    $('input[name=b]').click(function(){
    	var2 = $('input[name=b]:checked').val();
      varifyValue(var1,var2);
    });
    $('input[name=c]').click(function(){
    	var i = $('input[name=c]:checked').val();
      if('y'===i){
      	$('.proposal').show();
      }else{
      	$('input[name=cb]').prop('checked',false);
      	$('.proposal').hide();
      }
    });
});
function varifyValue(var1,var2){
	if('y'===var1 && 'y'===var2){
  	$('input[name=c][value=y]').prop('disabled',false);
  }else{
  	$('input[name=c][value=n]').prop('checked',true);
    $('input[name=c][value=y]').prop('disabled','disabled');
    $('.proposal').hide();
  }
}
