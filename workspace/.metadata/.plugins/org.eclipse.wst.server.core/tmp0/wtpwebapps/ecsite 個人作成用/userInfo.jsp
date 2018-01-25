<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<style type="text/css" >

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
		   height: 1000px;
		   text-align: center;
		}

		#footer {
			width: 100%;
			height: 80px;
			background-color: black;
			clear:both;
		}

</style>
<title>ユーザ情報確認画面</title>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>ユーザ情報</p>
		</div>
		<div>
			<table>
				<tr>
					<td>
						<span>ユーザー名</span>
					</td>
					<td>
						<s:property value="#session.userName" />
					</td>
				</tr>
				<tr>
					<td>
						<span>ID</span>
					</td>
					<td>
						<s:property value="#session.loginId" />
					</td>
				</tr>
				<tr>
					<td>
						<span>パスワード</span>
					</td>
					<td>
						<s:property value="#session.loginPassword" />
					</td>
				</tr>
				<tr>
					<td>
						<span>メールアドレス</span>
					</td>
					<td>
						<s:property value="#session.userEmail" />
					</td>
				</tr>
				<tr>
					<td>
						<span>郵便番号</span>
					</td>
					<td>
						<s:property value="#session.userZipcode" />
					</td>
				</tr>
				<tr>
					<td>
						<span>住所</span>
					</td>
					<td>
						<s:property value="#session.userPrefecture" /><br>
						<s:property value="#session.userCity" /><br>
						<s:property value="#session.userAddress" /><br>
						<s:if test="#session.userBuilding != 'noBuilding'">
						<s:property value="#session.userBuilding" />
						</s:if>

					</td>
				</tr>
				<s:if test="#session.userCreditNum != 'no'">
				<tr>
					<td>
						<span>クレジットカード番号</span>
					</td>
					<td>
						<s:property value="#session.userCreditNum" />
					</td>
				</tr>
				<tr>
					<td>
						<span>カード有効期限</span>
					</td>
					<td>
						<s:property value="#session.userCreditDate" />
					</td>
				</tr>
				</s:if>
			</table>
		</div>
		<div>
			<s:form action="UserInfoUpdateAction">
				<s:submit value="ユーザー情報の変更はこちらのボタン" />
			</s:form>
		</div>
		<div>
			商品購入画面に戻る場合は<a href="<s:url action='GoBuyItemFromUserInfoAction'/>">こちら</a>
		</div>
	</div>

</body>
</html>