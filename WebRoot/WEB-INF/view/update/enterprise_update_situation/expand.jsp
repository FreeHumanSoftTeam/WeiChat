<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<title>企业发展</title>
		<link rel="stylesheet" type="text/css" href="../window/css/base.css" />
		<script src="../window/js/jquery1.9.0.min.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
		</script>
	</head>
	<body>
	<form name="expendform" action="../expend/expendupdate.jhtml" method="POST">
		<div class="qyfz subcontent clearfloat">
			<div class="intbox">
				<span class="name">固定资产投资</span>
				<input type="text" class="write" value="${expend.investment }"/>
			</div>
			<div class="intbox">
				<span class="name">产值</span>
				<input type="text" class="write" value="${expend.chanzhi }"/>
			</div>
			<div class="intbox">
				<span class="name">税收</span>
				<input type="text" class="write" value="${expend.shuishou }"/>
			</div>
			<p class="title">规模企业培育</p>
			<div class="intbox">
				<span class="name">上规时间</span>
				<input type="text" class="write" value="${expend.shangTime }"/>
			</div>
			<div class="intbox">
				<span class="name">下规时间</span>
				<input type="text" class="write" value="${expend.xiaTime }"/>
			</div>
			<div class="intbox">
				<span class="name">投产时间</span>
				<input type="text" class="write" value="${expend.touTime }"/>
			</div>
			<div class="intbox">
				<span class="name">高新技术企业</span>
				<input type="text" class="write" value="${expend.jiushuQiye }"/>
			</div>
			<div class="intbox">
				<span class="name">从业人员总数</span>
				<input type="text" class="write" value="${expend.renYuan }"/>
			</div>
			<div class="intbox">
				<span class="name">主要产品</span>
				<input type="text" class="write" value="${expend.zhuyaoPro }"/>
			</div>
			<div class="btn clearfloat">
				<a href="##" class="submit">提交</a>
			</div>
		</div>
	</form>
	</body>
</html>
