<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>
			ユーザー登録
		</title>
	</head>
	<body>
		<s:property value="username"/>さんの登録が完了しました。<br>
		あなたのパスワードは<s:property value="password"/>です。
	</body>
</html>