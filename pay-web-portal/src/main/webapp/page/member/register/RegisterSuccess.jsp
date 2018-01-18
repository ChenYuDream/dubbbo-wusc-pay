<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/page/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/page/include/headScript.jsp"%>
<title>会员注册 注册成功</title>
</head>
<body>
<%
String url = "login_loginUI.action";
response.setHeader("refresh","5;url="+url);
%>
<jsp:include page="../../IndexHead.jsp" />
<div class="container">
<div class="bd-container">
<div class="headline">
	<div class="title">会员注册</div>
</div>
       <div class="memThirdSetpFlow mtop10">
        </div>
        <div class="memFlowTex">
		<ul>
			<li  class="green">验证账户名</li>
			<li class="green" style="width: 420px;">设置身份信息</li>
			<li class="red">注册成功</li>
			</ul>
		</div>
       
		<div class="tipsTitle">
			<ul>
				<li class="TipsImg SuccTipsImg"></li>
				<li class="tipTxt markGreen">注册成功！</li>

			</ul>
		</div>
		<div class="tipsCont" style="min-height: 100px;">恭喜您，${loginName}账号注册成功，马上进入登录页面。
					<p>
            <label id="tt" class="markRed"></label>
            秒后自动跳到登录页面
          </p></div>
		<div class="clear"></div>
    </div>
    </div>
	<jsp:include page="../../foot.jsp" />
</body>
</html>
<script type="text/javascript">
/*页面分类*/
 var secs = 5; //倒计时的秒数
for(var i=secs;i>=0;i--)
{
window.setTimeout("doUpdate(" + i + ")", (secs-i) * 1000);
}
function doUpdate(num)
{
document.getElementById("tt").innerHTML = num ;
}
</script>