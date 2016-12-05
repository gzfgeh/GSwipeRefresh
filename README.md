# GSwipeRefresh <br>
###            ![](/screen/SwipeRefresh.gif) <br>

1. 由于系统自带的SwipeRefreshLayout下拉头 有些人不喜欢，所以在SwipeRefreshLayout基础上自定义下拉头  <br> 
2. 如果还是不行，那可以自定义下拉头然后调用swipeRefreshLayout.setCustomHeadview(View view),自动切换成自己的下拉头  <br>  
3. 一般下拉头都用动画，所以要继承SwipeRefreshLayout.CustomSwipeRefreshHeadLayout，可以参考项目中的DefaultCustomHeadView
4. 使用

    Add it in your root build.gradle at the end of repositories: <br>  
        maven { url "https://jitpack.io" } <br>  
    Add the dependency  <br>  
	    compile 'com.github.gzfgeh:GSwipeRefresh:v1.0.0' 
