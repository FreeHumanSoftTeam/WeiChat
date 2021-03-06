<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name=" apple-mobile-web-app-capable" content="yes" />
	<meta name="apple-mobile-web-app-status-bar-style" content="black" />
    <title>企业党团建设</title>
    <meta http-equiv="keywords" content="企业">
    <meta http-equiv="description" content="企业">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="../mobile/css/base.css?v=1.0" />
	<script src="../mobile/js/jquery1.9.0.min.js" type="text/javascript"></script>
	<script src="../mobile/js/base.js?v=1.0" type="text/javascript"></script>
	</head>
	<body>
	<div class="main">
	<form id="partyform" action="<%=basePath%>partymobile/partyadd.jhtml" method="post">
		<div class="dtjs subcontent clearfloat">
			<div class="intbox">
				<span class="name">党组织建设情况</span>
				<input name="jianSeQingK" type="text" class="write" />
			</div>
			<div class="intbox">
				<span class="name">党支部书记</span>
				<input name="shuji" type="text" class="write" />
			</div>
			<div class="intbox">
				<span class="name">联系电话</span>
				<input name="phone" type="text" class="write" />
			</div>
			<div class="intbox">
				<span class="name">党务工作者</span>
				<input name="dangwugzz" type="text" class="write" />
			</div>
			<div class="intbox">
				<span class="name">党员人数</span>
				<input name="dangYpeoper" type="text" class="write" />
			</div>
			<div class="intbox">
				<span class="name">团组织建设情况</span>
				<input name="tjianSeQingK" type="text" class="write" />
			</div>
			<div class="intbox">
				<span class="name">团员人数</span>
				<input name="tuanYpeoper" type="text" class="write" />
			</div>
			<div class="intbox">
				<span class="name">活动开展情况</span>
				<input name="huoDongkaiZhan" type="text" class="write" />
			</div>
			<div class="btn clearfloat">
					<a href="javascript:document.getElementById('partyform').submit();" class="submit">提交</a>
				</div>
		</div>
		</form>
		</div>
	</body>
</html>
