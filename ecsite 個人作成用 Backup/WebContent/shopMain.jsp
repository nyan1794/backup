<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=utf=8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta http-equiv="Content-Script-Type" content="text/javascript" />
		<meta http-equiv="imagetoolbar" content="no" />
		<meta name="discription" content="" />
		<meta name="keywords" content="" />

		<style type="text/css">

		body{
		margin:0;
		padding:0;
		line-height:1.6;
		letter-spacing:1px;
		font-family:Verdana,Helvetica,sans-serif;
		font-size:12px;
		color:#333;
		background:#fff;
		}
		table{
		text-align:center;
		margin:0 auto;
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
			<div id="pr">
			</div>
		</div>
		<div id="main">
			<div id="top">
				<p>店舗商品管理画面</p>
			</div>
			<div>
				<table border="1">
					<tr>
						<th>ストア内商品id</th>
						<th>商品名</th>
						<th>値段</th>
						<th>在庫数</th>
						<th>販売日</th>
						<th>最終情報更新日</th>
						<th>変更</th>
					</tr>
					<s:iterator value="#session.shopSellItemList">
					<tr>
						<td><s:property value="id" /></td>
						<td><s:property value="itemName" /></td>
						<td><s:property value="itemPrice" /></td>
						<td><s:property value="itemStock" /></td>
						<td><s:property value="insertDate" /></td>
						<td><s:property value="updateDate" /></td>
						<td>
							<s:form action="ShopItemUpdateAction">
								<input type="hidden" name="id" value="<s:property value='id'/>">
								<s:submit value="変更" />
							</s:form>
						</td>
					</tr>
					<s:if test="id == #session.updateId">

							<tr>
							<s:form action="ShopItemUpdateConfirmAction">
								<td><s:property value="id" /></td>
								<td><s:property value="itemName" /></td>
								<td><s:textfield name="newItemPrice"/></td>
								<td><s:textfield name="addItemStock" /></td>
								<td><s:property value="insertDate" /></td>
								<td><s:property value="updateDate" /></td>
								</s:form>
							</tr>

					</s:if>


					</s:iterator>
				</table>

				<div>
					商品登録は<a href="<s:url action='ItemAddPageAction' />">こちら</a>
					ログアウトは<a href="<s:url action='ShopLogoutAction'/>">こちら</a>
				</div>
			</div>
		</div>
		<div id="footer">
			<div id="pr">
			</div>
		</div>
	</body>
</html>