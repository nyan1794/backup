<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="discription" content="" />
	<meta name="keywords" content="" />
	<style type="text/css">
	body{
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana,Helvetica,sans-serif;
	font-size:12px;
	color:#333;
	background:#fff;
	}
	table{
	text-align:center;
	margin:0 auto;
	}

	#top{
	margin:30px auto;
	width:780px;
	border:1px solid #333;
	}
	#header{
	width:100%;
	height:80px;
	background-color:black;
	}
	#main{
	width:100%;
	height:500px;
	text-align:center;
	}
	#footer{
	width:100%;
	height:80px;
	background-color:black;
	clear:both;
	}
	</style>
	<title>商品追加完了画面</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>商品追加を完了しました</p>
		</div>
		<div>
			商品管理画面に戻るには<a href="<s:url action='GoShopMainAction' />">こちら</a>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>