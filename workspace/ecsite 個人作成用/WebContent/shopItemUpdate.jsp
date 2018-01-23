<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="html/html;charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta http-equiv="imagetoolbar" content="no" />
		<meta name="discription" content="" />
		<meta name="keywords" content="" />
		<style type="text/css" >
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
				</div>
				<div>
					<s:iterator value="#session.shopSellItemList">
						<s:if test="session.updateId == id">
							<s:form action="shopItemUpdateConfirmAction" theme="simple">
								<ul>
										<li>商品名</li>
										<li><s:property value="itemName" /></li>
										<li>商品名変更</li>
										<li><s:textfield name="newItemName" /></li>
										<li>値段</li>
										<li><s:property value="itemPrice" /></li>
										<li>値段変更</li>
										<li><s:textfield name="newItemPrice" /></li>
										<li>在庫</li>
										<li><s:property value="itemStock" /></li>
										<li>在庫追加</li>
										<li><s:textfield name="addItemStock" /></li>
										<li><s:submit value="変更" /></li>
								</ul>
							</s:form>
						</s:if>
					</s:iterator>
			<s:form action="shopItemDeleteAction" >
				<input type="hidden" value="delete" name="delete">
				<s:submit value="商品削除" />
			</s:form>

			</div>
		</div>
		<div id="footer">
		</div>
	</body>
</html>