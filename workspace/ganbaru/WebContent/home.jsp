<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Type-Style" content="text/css" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="discription" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" type="text/css" href="./css/style.css" >
<title>Home画面</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>Home</p>
		</div>
		<div id="text-center">
			<s:form action="HomeAction">
				<s:submit value="商品購入" />
			</s:form>
			<s:if test="#session.id != null">
				<p>ログアウトする場合は</p>
				<a href='<url action="LogoutAction" />'>こちら</a>
			</s:if>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>