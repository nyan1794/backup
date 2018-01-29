<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>カート内商品購入確認画面</title>
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
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>購入情報を確認してください</p>
		</div>
		<div>

				<table>
					<tr>
						<th>商品名</th>
						<th>個別商品合計金額</th>
						<th>購入個数</th>
						<th>販売店舗名</th>
					</tr>
					<s:iterator value="session.myPageList">
					<tr>
						<td><s:property value="itemName"/></td>
						<td><s:property value="totalItemPrice" /></td>
						<td><s:property value="totalCount"/></td>
						<td><s:property value="shopName" /></td>
					</tr>
					</s:iterator>
				</table>
				合計金額<s:property value="orderTotalPrice" />
				<s:form action="BuyItemFromCartConfirmAction">
					<s:hidden name="orderTotalPrice" value="%{orderTotalPrice}" />
					<s:submit value="確定"/>
				</s:form>

		</div>
	</div>
</body>
</html>