<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style=Type" content="text/css" />
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
font-family:Verdana,Helvetiva,sans-serif;
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
clear:both;
}
</style>
<title>オーナーログイン画面</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>ShopLogin</p>
		</div>
		<div>
		<s:if test="massage != null">
		<h3><s:property value="massage"/></h3>
		</s:if>
		<s:if test="#session.id != 'loginComplete'">
			<s:form action="ShopLoginAction">
				<s:textfield name="shopLoginId" label="ShopID" />
				<s:password name="shopLoginPassword" label="Shopパスワード"/>
				<s:submit value="ログイン" />
			</s:form>
		</s:if>
		<s:else>
			<h1>購入者IDでログイン済みです</h1>
			<h1>ログアウトしてから店舗IDでログインしてください</h1>
			前の画面に戻るには<a href="<s:url action='GoHomeAction' />">こちら</a>
		</s:else>

		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>