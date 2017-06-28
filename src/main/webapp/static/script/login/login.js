/**
 * Created by mingl on 2017-6-27.
 */

$("#loginButton").on("click",function(){
    loginCheck();
})

function loginCheck() {
    var userName = $("#username").val();
    var password = $("#password").val();
    var remember = $("#remember-me").val();
    var userType = $("input[name='userType'][checked]").val();

    if(userName == ""){
        layer.msg('用户编号不能为空', {icon: 5});
    }else if(password == ""){
        layer.msg('密码不能为空', {icon: 5});
    }else{
        console.log("准备登陆");
        $.ajax({
            url: CONTEXTPATH+'/login',
            type: 'POST',
            data: {
                "username" : userName,
                "password" : password,
                "remember" : remember,
                "userType" : userType
            },
            success: function (data) {
                console.log(data);
                if(data.flag){
                    layer.msg('登录成功', {icon: 1});
                    location.href=CONTEXTPATH+'/main';
                }else{
                    layer.msg(data.error, {icon: 5});
                }
            },
            error: function (data) {
            }
        });
    }
}
