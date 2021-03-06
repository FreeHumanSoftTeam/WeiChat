<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
		<meta name=" apple-mobile-web-app-capable" content="yes" />
		<meta name="apple-mobile-web-app-status-bar-style" content="black" />
		<title>企业基本信息</title>
		<meta http-equiv="keywords" content="企业">
		<meta http-equiv="description" content="企业">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="../mobile/css/base.css?v=1.0" />
		<script src="../mobile/js/jquery1.9.0.min.js" type="text/javascript"></script>
		<script src="../mobile/js/base.js?v=1.0" type="text/javascript"></script>
<!-- 		<link rel="stylesheet" type="text/css" href="../window/css/themes/bootstrap/easyui.css" /> -->
<!-- 		<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet"> -->
		<script type="text/javascript">
		function removeAnEnterpriseSituationInfo(identity){
			//提示用户
			if(confirm("确定要删除此企业信息吗？")){
			$.ajax({
				    url: '<%=basePath%>companymobile/delEnterpriseInfo.jhtml',         
				    data: {"enterpriseSituationId" : identity},
				    dataType : "json",
				    type: "get",          
				    success: function (data) {
				        if (data.result == "success") {
							alert("恭喜！您已成功删除此企业的信息！");
							//window.location.reload(true);//刷新页面
							window.location.href="/WeiChat/company/mobilelist.jhtml";//回到首页
						} else {
							alert("非常抱歉，删除此企业的信息失败！请重试操作。");
						}
				    }
			});
			}
		}
		</script>
	</head>
	<body>
		<div class="main">
		<form action="../companymobile/ebu.jhtml" id="companyform" method="post">
			<input id="id" name="id" hidden="hidden" value="${company.id }">
		<div class="qyjbqk subcontent clearfloat">
			<div class="intbox clearfloat">
				<span class="name">企业名称：</span><input id="name" name="name" type="text" class="write" value="${company.name }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">项目名称：</span><input id="productname" name="productname" type="text" class="write" value="${company.productname }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">产品描述：</span><input id="productdes" name="productdes" type="text" class="write" value="${company.productdes }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">行业分类：</span><input id="dustry" name="dustry" type="text" class="write" value="${company.dustry }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">行业代码：</span><input id="industrycode" name="industrycode" type="text" class="write" value="${company.industrycode }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">企业法人：</span><input id="legalperson" name="legalperson" type="text" class="write" value="${company.legalperson }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">企业联系人：</span><input id="contacts" name="contacts" type="text" class="write" value="${company.contacts }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">企业联系方式：</span><input id="telenumber" name="telenumber" type="text" class="write" value="${company.telenumber }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">企业网站：</span><input id="enterprisewebsite" name="enterprisewebsite" type="text" class="write" value="${company.enterprisewebsite }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">签约时间：</span><input id="signingtime" name="signingtime" type="text" class="write" value="${company.signingtime }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">占地（亩）：</span><input id="area" name="area" type="text" class="write" value="${company.area }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">协议投资（万元）：</span><input id="agreement" name="agreement" type="text" class="write" value="${company.agreement }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">预计年产值：</span><input id="estimated" name="estimated" type="text" class="write" value="${company.estimated }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">预计年税收：</span><input id="annualtax" name="annualtax" type="text" class="write" value="${company.annualtax }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">协议开工时间：</span><input id="begintime" name="begintime" type="text" class="write" value="${company.begintime }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">协议竣工时间：</span><input id="completiontime" name="completiontime" type="text" class="write" value="${company.completiontime }"/>
			</div>
			<div class="intbox clearfloat">
				<span class="name">备注：</span><input id="beizhu" name="beizhu" type="text" class="write" value="${company.beizhu }"/>
			</div>
			<div class="btn clearfloat">
				<a class="submit" href="javascript:removeAnEnterpriseSituationInfo(${company.id });">删除</a>
				<a href="##" class="submit" onclick="document.getElementById('companyform').submit();">提交</a>
			</div>
		</div>
		</form>
		</div>
	</body>
</html>