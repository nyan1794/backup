<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<title>ユーザ情報更新完了画面</title>
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
			<p>ユーザー情報の変更が完了しました</p>
		</div>
		<div>
			こちらのボタンでユーザー情報確認画面に戻れます。
			<s:form action="UserInfoAction">
				<s:submit value="戻る"/>
			</s:form>
		</div>
	</div>
</body>
</html>