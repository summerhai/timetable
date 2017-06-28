<%--
  Created by IntelliJ IDEA.
  User: mingl
  Date: 2017-6-27
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script>var CONTEXTPATH = "${pageContext.request.contextPath}" </script>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <base href="<%=basePath%>">
    <title>Login Page | Amaze UI Example</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="alternate icon" type="image/png" href="static/amazeui/assets/i/favicon.png">
    <link rel="stylesheet" href="static/amazeui/assets/css/amazeui.min.css"/>
    <link rel="stylesheet" type="text/css" href="static/sweetalert/dist/sweetalert.css">
    <style>
        .header {
            text-align: center;
        }
        .header h1 {
            font-size: 200%;
            color: #333;
            margin-top: 30px;
        }
        .header p {
            font-size: 14px;
        }
    </style>
</head>
<body>
<div class="header">
    <div class="am-g">
        <h1>Web ide</h1>
        <p>Integrated Development Environment<br/>代码编辑，代码生成，界面设计，调试，编译</p>
    </div>
    <hr />
</div>
<div class="am-g">
    <div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
        <h3>登录</h3>
        <hr>
        <div class="am-btn-group">
            <label><input name="userType" type="radio" value="student" checked/>学生 </label>
            <label><input name="userType" type="radio" value="teacher" />教师 </label>
            <label><input name="userType" type="radio" value="admin" />管理员 </label>
        </div>
        <br>
        <br>

        <div class="am-form">
            <label for="username">账户编号:</label>
            <input type="text" name="" id="username" value="">
            <br>
            <label for="password">密码:</label>
            <input type="password" name="" id="password" value="">
            <div class="form-group">
                <div class="col-sm-3">
                    <img src="/code/captcha-image" id="verify" align="middle" title="看不清，请点我" onclick="refreshVerifyCode()"  style="cursor:hand;height:46px;width:90px"/><br/>
                </div>

                <div class="col-sm-5">
                    <input type="text" id="verifyCode" class="form-control" name="verifyCode" placeholder="验证码">
                </div>
            </div>
            <br>
            <label for="remember-me">
                <input id="remember-me" type="checkbox">
                记住密码
            </label>
            <br />
            <div class="am-cf">
                <input type="submit" name="" id="loginButton" value="登 录" class="am-btn am-btn-primary am-btn-sm am-fl">
                <input type="submit" name="" value="忘记密码 ^_^? " class="am-btn am-btn-default am-btn-sm am-fr">
            </div>
        </div>
        <hr>
        <p>© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
    </div>
</div>
<script type="text/javascript" src="static/jquery/jquery-1.8.3.min.js"> </script>
<script type="text/javascript" src="static/layer/layer.js"> </script>
<script type="text/javascript" src="static/script/login/login.js"> </script>

</body>
</html>
