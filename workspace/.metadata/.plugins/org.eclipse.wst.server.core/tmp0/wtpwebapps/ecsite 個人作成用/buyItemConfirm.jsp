
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta charset="utf-8">
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<title>BuyItemConfirm画面</title>
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
	</style>
	<script type="text/javascript">
		function submitAction(url) {
			$('form').attr('action', url);
			$('form').submit();
		}
	</script>
</head>
<body>
	<div id="header">
	 	<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>BuyItemConfirm</p>
		</div>
		<div>
			<s:form>
			<s:if test="#session.totalPrice != 0">
				<s:iterator value="#session.buyItemConfirmList">
				<tr>
					<td>商品名</td>
					<td><s:property value="itemName" /></td>
				</tr>
				<tr>
					<td>値段</td>
					<td><s:property value="itemTotalPrice" /><span>円</span></td>
				</tr>
				<tr>
					<td>購入個数</td>
					<td><s:property value="count" /><span>個</span></td>
				</tr>
				<tr>
					<td>出品店舗</td>
					<td><s:property value="shopName" /></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>

				</s:iterator>
				<tr>
					<td>合計金額</td>
					<td><s:property value="#session.totalPrice"/><span>円</span></td>
				</tr>
				<tr>
					<td><span>支払い方法</span></td>
					<td>現金払い<input type="radio" name="pay" value="1" checked="checked"></td>
					<td>クレジット払い<input type="radio" name="pay" value="2"></td>
				</tr>
				</s:if>
				<s:elseif test="#session.totalPrice == 0">
				<tr>
					<td><h1>購入商品がありません。商品を追加してください</h1></td>
				</tr>
				</s:elseif>
				<tr>
					<td>
						<br>
					</td>
				</tr>
				<tr>
					<td><input type="button" value="戻る" onclick="submitAction('HomeAction')" /></td>
					<s:if test="#session.totalPrice != 0">
					<td><input type="button" value="完了" onclick="submitAction('BuyItemConfirmAction')" /></td>
					</s:if>
				</tr>
			</s:form>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>