<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>お問い合わせ結果</title>
	</head>
	<body>
		<h1>お問い合わせ確認</h1>
		名前:<s:property value="name"/><br>

		お問い合わせの種類:<s:if test='qtype=="company"'>
		<br>
		会社について
		</s:if>
		<s:if test='qtype=="product"'>
		製品について
		</s:if>
		<s:if test='qtype=="support"'>
			アフターサポートについて
		</s:if>
		<br>
		お問い合わせ内容:<br>
		<s:property value="body"/>

	</body>
</html>