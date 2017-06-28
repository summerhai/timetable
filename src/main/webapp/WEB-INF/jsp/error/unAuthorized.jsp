<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
String path = request.getContextPath();
%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link type="text/css" rel="stylesheet" href="static/css/error/error.css" />
		<title>未授权页面</title>
	</head>

	<body>
		<div id="error" style=" ">
			<div class="content">
				<p class="p_t">抱歉！您访问的页面暂未授权...</p>
				<p class="p_c"><span>暂未授权.</span> That’s an error url.</p>
				<p class="p_b">请检查您访问的网址是否正确</p>
			</div>
		</div>
	</body>
</html>

