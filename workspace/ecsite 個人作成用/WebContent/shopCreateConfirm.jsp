<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<title>出店入力情報確認画面</title>
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
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>入力内容を確認してください。</p>
		</div>
		<div>
		<s:form action="ShopCreateEmailAction">
			<table>
				<tr>
					<td>店舗名</td>
					<td><s:property value="shopName" />
					<s:hidden value="%{shopName}" name="shopName" />
					</td>

				</tr>
				<tr>
					<td>店舗ID</td>
					<td>
					<s:property value="shopId" />
					<s:hidden value="%{shopId}" name="shopId"/>
					</td>
				</tr>
				<tr>
					<td>店舗パスワード</td>
					<td>
					<s:property value="shopPassword" />
					<s:hidden value="%{shopPassword}" name="shopPassword"/>
					</td>
				</tr>
				<tr>
					<td>店舗メールアドレス</td>
					<td>
					<s:property value="shopEmail" />
					<s:hidden value="%{shopEmail}" name="shopEmail"/>
					</td>
				</tr>
				<tr>
					<td>店舗コード</td>
					<td>
					<s:property value="shopCode" />
					<s:hidden value="%{shopCode}" name="shopCode"/>
					</td>
				</tr>
			</table>
			<s:submit value="確定" />
		</s:form>
		</div>
	</div>
	<div id="footer">
	</div>

</body>
</html>