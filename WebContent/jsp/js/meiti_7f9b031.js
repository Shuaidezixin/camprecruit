define("index:widget/meiti/meiti.js",function(e,i,n){var t=t||{};t={init:function(){var e=$(".strategy2 .swiper-wrapper>a").size();e>6&&this.strategy()},strategy:function(){var e=new Swiper(".swiper-strategy",{paginationClickable:!0,slidesPerView:6,loop:!0});$(".strategy2").hover(function(){$("#banner-left4,#banner-right4").fadeIn()},function(){$("#banner-left4,#banner-right4").fadeOut()}),$("#banner-left4").click(function(){e.swipePrev()}),$("#banner-right4").click(function(){e.swipeNext()})}},n.exports=t});