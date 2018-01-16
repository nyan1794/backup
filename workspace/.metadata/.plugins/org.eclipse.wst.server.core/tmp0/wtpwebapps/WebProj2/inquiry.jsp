<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>お問い合わせ</title>
	</head>
	<body>
		<h1>お問い合わせ</h1>
		<s:form method="post" action="InquiryCompleteAction">
			名前<input type="text"  name="name"><br>
			お問い合わせの種類<br>
			<select name="qtype">
				<option value="company">会社について</option>
				<option value="product">製品について</option>
				<option value="support">アフターサポートについて</option>
			</select>
			お問い合わせ内容<br>
			<s:textarea name="body"/>
			<s:submit value="送信"/>
		</s:form>
	</body>
</html>