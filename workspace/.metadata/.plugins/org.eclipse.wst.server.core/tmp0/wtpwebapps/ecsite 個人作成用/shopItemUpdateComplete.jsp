<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
	<style type="text/css" >
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
		width:780px;
		margin:30px auto;
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
		#item{
		font-size:20px;
		}
		</style>

<title>商品情報変更完了</title>
</head>
<body>
		<div id="header">
		</div>
		<div id="main">
			<div id="top">
				<p>商品情報の更新が完了しました</p>
			</div>
			<div id="item">
				<s:property value="session.newItemName" /><br>
				<s:property value="session.newItemPrice" />円<br>
				<s:property value="session.newStock" />個
			</div>
			<div>
				店舗管理画面に移動するには<a href="<s:url action='GoShopMainFromUpdateAction' />">こちら</a>
			</div>
		</div>
		<div id="footer">
		</div>
</body>
</html>