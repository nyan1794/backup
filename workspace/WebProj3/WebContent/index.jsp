<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>眠い</title>
	</head>
	<body>
		<s:form action="HelloStrutsAction">
			<s:submit value="HelloStruts"/>
		</s:form>
		<s:form action="WelcomeStrutsAction">
			<s:submit value="WelcomeStruts" />
		</s:form>
		<s:form action="InquiryAction">
			<s:submit value="お問い合わせ" />
		</s:form>
		<p>Get通信</p>
		<s:form method="get" action="TestAction">
			<s:textfield name="username"/>
			<s:password name="password" />
			<s:submit value="送信" />
		</s:form>
		<p>Post通信</p>
		<s:form method="post" action="TestAction">
			<s:textfield name="username" />
			<s:password name="password" />
			<s:submit value="送信" />
		</s:form>
	</body>
</html>