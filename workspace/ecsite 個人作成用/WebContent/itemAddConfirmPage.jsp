<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta http-equiv="imagetoolbar" content="no" />
		<meta name="discription" content="" />
		<meta name="keywords" content="" />
		<title>商品追加確認画面</title>
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
		</style>
	</head>
	<body>
		<div id="header">
			<div id="pr">
			</div>
		</div>
		<div id="main">
			<div id="top">
				<p>追加商品の確認</p>
				確認が終了したら、店舗コードを入力して
				<p>商品追加を完了してください</p>
			</div>
			<div>
				<h1><s:property value="errorMassage"/></h1>
				<h3>追加する商品はこちらでよろしいですか？</h3>
				商品名
				<s:property value="#session.sellItemName" />
				<br><br>
				商品の値段
				<s:property value="#session.sellItemPrice" />円
				<br><br>
				商品の初期在庫数
				<s:property value="#session.sellItemStock" />個
				<br><br>
				<s:form action="ItemAddCompleteAction" >
					<s:password name="insertShopCode"/>
					<s:submit value="完了" />
				</s:form>
			</div>
		</div>
	</body>
</html>