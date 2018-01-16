<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>お問い合わせ結果</title>
	</head>
	<body>
		<s:property value="name"/>さんお問い合わせありがとうございました。
		<br>
		<p>お問い合わせの種類</p>
		<s:if test="qtype=='company'">
		会社について
		</s:if>
		<s:if test="qtype=='product'">
		製品について
		</s:if>
		<s:if test="qtype'support'">
		アフターサポートについて
		</s:if>
		<br>
		<p>お問い合わせ内容</p>
		<s:property value="body"/>
	</body>
</html>