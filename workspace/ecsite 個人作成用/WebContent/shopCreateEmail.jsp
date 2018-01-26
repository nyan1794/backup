<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<title>メール認証ページ</title>
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
			height:80px;
			width:100%;
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
	</div>
	<div id="main">
		<div id="top">
			<p>メールアドレスに送られた認証コードを入力してください</p>
		</div>
		<div>
			<s:property value="errorMassage"/>
		</div>
		<div>
			<s:form action="ShopCreateCompleteAction" >
				<s:textfield name="ActivationCode" />
				<s:hidden value="%{randNum}" name="randNum"/>
				<s:hidden value="%{shopName}" name="shopName"/>
				<s:hidden value="%{shopId}" name="shopId"/>
				<s:hidden value="%{shopPassword}" name="shopPassword"/>
				<s:hidden value="%{shopEmail}" name="shopEmail"/>
				<s:hidden value="%{shopCode}" name="shopCode"/>
				<s:submit value="確定" />
			</s:form>
		</div>
	</div>
</body>
</html>