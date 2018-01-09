<%@ page language="java" contentType="text/html;charset-UTF8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>INDEX</title>
	</head>
	<body>
		<s:form action="HelloStrutsAction">
		 <s:submit value="HelloStruts" />
		</s:form>
		<s:form action="WelcomeAction">
			<s:submit value="Welcome" />
		</s:form>
		<s:form action="InquiryAction">
			<s:submit value="お問合わせ" />
		</s:form>
		Get通信
		<s:form method="get" action="TestAction">
			<s:textfield name="username" />
			<s:password name="password" />
			<s:submit value="送信" />
		</s:form>
		Post通信
		<s:form method="post" action="TestAction">
			<s:textfield name="username" />
			<s:password name="password" />
			<s:submit value="送信" />
		</s:form>
	</body>

</html>