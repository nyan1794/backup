<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta http-equiv="Content-Script-Type" content="text/javascript" />
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
		margin:0 auto;
		text-align:center;
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
				<p>商品追加画面</p>
			</div>
			<div>
				<s:property value="errorItemName"/>
				<s:property value="errorItemPrice" />
				<s:property value="errorItemStock" />
				<s:form action="ItemAddConfirmAction">
					<s:textfield name="sellItemName" label="商品名を25文字以内で入力してください"/>
					<s:textfield name="sellItemPrice" label="値段を10桁以内、半角英数で入力してください"/>
					<s:textfield name="sellItemStock" label="初期入庫数を10桁以内、半角英数で入力してください"/>
					<s:submit value="確認"/>
				</s:form>
			</div>
		</div>
	</body>
</html>