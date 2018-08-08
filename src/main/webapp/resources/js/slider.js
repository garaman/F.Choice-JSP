$(document).ready(function(){
  var slides = $('.slider > ul > li');
  var cnt = $('.slider > .cnt > a');
  var i = 0;

  setInterval(function(){
    slides.eq(i).animate({'left': '-100%'}, 1000);
    cnt.eq(i).removeClass('active');
    cnt.eq(i+1).addClass('active');
    i++;
    if(i == 6){ i = 0; cnt.eq(0).addClass('active');}
    slides.eq(i).css('left','100%').animate({'left': '0'}, 1000);
  }, 1000*5);

});
