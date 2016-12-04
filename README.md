# GSwipeRefresh <br>
###            ![](/screen/SwipeRefresh.gif) <br>
由于系统自带的SwipeRefreshLayout下拉头 有些人不喜欢，所以在SwipeRefreshLayout基础上自定义下拉头 <br> 
如果还是不行，那可以自定义下拉头然后调用swipeRefreshLayout.setCustomHeadview(View view),自动切换成自己的下拉头 <br> 
一般下拉头都用动画，所以要继承SwipeRefreshLayout.CustomSwipeRefreshHeadLayout，可以参考项目中的DefaultCustomHeadView
