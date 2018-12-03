<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>403</title>
	<script type="text/javascript" src="js/jquery.js"></script>
	<script language="javascript" type="text/javascript">
		setTimeout(function () { this.location.href = "index.jsp" }, 5000);
	</script>
	<link rel="stylesheet" type="text/css" href="css/403.css">
</head>
<body>
	<div class="center">
		<div class="center_img">
			<img src="images/403.png">			
		</div>
		<div class="center_text">
			<p class="center_fail">403</p>
			<p class="center_p">呀！出错了！</p>
			<p class="center_p1">亲爱的用户，您无权访问该页面...</p> 
			<p class="center_p2"><span class="time"></span>秒后将跳回首页</p>
		</div>
	</div>
	<script type="text/javascript">
		var timeEle = document.querySelector('.time'),
		count = 5;
		timeEle.innerHTML = count;
        // 设置计时器
        var judge = setInterval(function() {
        	count--;
        	if (!count) {
                // 清除计时器
                clearInterval(judge);
            };
            // 标签当中显示时间
            timeEle.innerHTML = count;
        }, 1000);
    </script>
</body>
</html>
