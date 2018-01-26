<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<title>新店舗出店画面</title>
<style type="text/css">
		/* ========TAG LAYOUT======== */
		body {
		   margin:0;
		   padding:0;
		   line-height:1.6;
		   letter-spacing:1px;
		   font-family:Verdana, Helvetica, sans-serif;
		   font-size:12px;
		   color:#333;
		   background:#fff;
		}

		table {
			text-align:center;
			margin:0 auto;
		}

		/* ========ID LAYOUT======== */
		#top {
		   width:780px;
		   margin:30px auto;
		   border:1px solid #333;
		}

		#header {
		   width: 100%;
		   height: 80px;
		   background-color: black;
		}

		#main {
		   width: 100%;
		   height: 500px;
		   text-align: center;
		}

		#footer {
			width: 100%;
			height: 80px;
			background-color: black;
			clear:both;
		}
		#small{
		font-size:10px;
		}
	</style>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>新店舗出店</p>
		</div>
		<div>
			<s:iterator value="errorMassage">
					<h2><s:property  /></h2>
				</s:iterator>
		</div>
		<div>
			<s:form action="ShopCreateConfirmAction" theme="simple">
				<table>
					<tr>
						<td>店舗名:</td>
						<td><s:textfield name="shopName" /></td>
					</tr>
					<tr>
						<td>店舗ID:</td>
						<td><s:textfield name="shopId" /></td>
					</tr>
					<tr>
						<td>店舗パスワード:</td>
						<td><s:textfield name="shopPassword" /></td>
					</tr>
					<tr>
						<td>店舗メールアドレス</td>
						<td><s:textfield name="shopEmail" /></td>
					</tr>
					<tr>
						<td>管理コード:</td>
						<td><s:textfield name="shopCode" /></td>
					</tr>
				</table>
				<s:submit value="送信" />
			</s:form>
			<div id="small">
				*店舗IDとパスワードは20文字以内半角英数字で入力してください<br>
				*管理コードは4桁の半角数字入力してください。商品登録、商品情報変更時に使います。また忘れた場合再発行できません。
			</div>
		</div>
	</div>
</body>
</html>