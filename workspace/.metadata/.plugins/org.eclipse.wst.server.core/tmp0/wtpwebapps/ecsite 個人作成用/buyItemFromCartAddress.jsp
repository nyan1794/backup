<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<title>郵送先住所確認</title>
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
			<p>送り先の住所を確認してください</p>
		</div>
		<div>
		<s:if test="errorMassage != null">
			<h3><s:property value="errorMassage" /></h3>
		</s:if>
		<s:form action="BuyItemFromCartCompleteAction" theme="simple">
			メイン住所
			<table>
				<tr>
					<td><span>郵便番号</span></td>
					<td><s:property value="#session.zipcode" /></td>
				</tr>
				<tr>
					<td><span>都道府県</span></td>
					<td><s:property value="#session.prefecture"/></td>
				</tr>
				<tr>
					<td><span>市区町村</span></td>
					<td><s:property value="#session.city" /></td>
				</tr>
				<tr>
					<td><span>番地</span></td>
					<td><s:property value="#session.address" /></td>
				</tr>
			<s:if test="#session.building != 'noBuilding'" >
				<tr>
					<td><span>建物名</span></td>
					<td><s:property value="#session.building" /></td>
				</tr>
			</s:if>
		</table>
		<s:hidden name="zipcode" value="%{#session.zipcode}" />
		<s:hidden name="prefecture" value="%{#session.prefecture}" />
		<s:hidden name="city" value="%{#session.city}" />
		<s:hidden name="address" value="%{#session.address}" />
		<s:hidden name="building" value="%{#session.building}" />
		<s:submit value="注文確定"/>
		</s:form>
		<br>
		</div>
		<div>

			<s:iterator value="session.addressList" status="st">
				他の登録住所<s:property value="#st.count" />
				<table>
				<tr>
					<td><span>郵便番号</span></td>
					<td><s:property value="zipcode" /></td>
				</tr>
				<tr>
					<td><span>都道府県</span></td>
					<td><s:property value="prefecture"/></td>
				</tr>
				<tr>
					<td><span>市区町村</span></td>
					<td><s:property value="city" /></td>
				</tr>
				<tr>
					<td><span>番地</span></td>
					<td><s:property value="address" /></td>
				</tr>
			<s:if test="building != 'noBuilding'" >
				<tr>
					<td><span>建物名</span></td>
					<td><s:property value="building" /></td>
				</tr>
			</s:if>
			<s:form action="BuyItemFromCartCompleteAction" >
				<s:hidden value="%{zipcode}" name="zipcode"/>
				<s:hidden value="%{prefecture}" name="prefecture" />
				<s:hidden value="%{city}" name="city" />
				<s:hidden value="%{address}" name="address" />
				<s:submit value="この住所で確定" />
			</s:form>
			</table>
			</s:iterator>
			<br>
		</div>
		<div>
			<br><br>
			<h4>新たに住所を登録する場合はこちら</h4>
			<s:form action="AddressAddAction" theme="simple">
			<table>
				<tr>
					<td>郵便番号</td>
					<td><s:textfield name="newZipcode1"/>-<s:textfield name="newZipcode2" /></td>
				</tr>
				<tr>
					<td>都道府県</td>
					<td>
							<select name="newPrefecture" >
							<option value="北海道" selected="selected">北海道</option>
							<option value="青森県">青森県</option>
							<option value="岩手県">岩手県</option>
							<option value="宮城県">宮城県</option>
							<option value="秋田県">秋田県</option>
							<option value="山形県">山形県</option>
							<option value="福島県">福島県</option>
							<option value="茨城県">茨城県</option>
							<option value="栃木県">栃木県</option>
							<option value="群馬県">群馬県</option>
							<option value="埼玉県">埼玉県</option>
							<option value="千葉県">千葉県</option>
							<option value="東京都">東京都</option>
							<option value="神奈川県">神奈川県</option>
							<option value="新潟県">新潟県</option>
							<option value="富山県">富山県</option>
							<option value="石川県">石川県</option>
							<option value="福井県">福井県</option>
							<option value="山梨県">山梨県</option>
							<option value="長野県">長野県</option>
							<option value="岐阜県">岐阜県</option>
							<option value="静岡県">静岡県</option>
							<option value="愛知県">愛知県</option>
							<option value="三重県">三重県</option>
							<option value="滋賀県">滋賀県</option>
							<option value="京都府">京都府</option>
							<option value="大阪府">大阪府</option>
							<option value="兵庫県">兵庫県</option>
							<option value="奈良県">奈良県</option>
							<option value="和歌山県">和歌山県</option>
							<option value="鳥取県">鳥取県</option>
							<option value="島根県">島根県</option>
							<option value="岡山県">岡山県</option>
							<option value="広島県">広島県</option>
							<option value="山口県">山口県</option>
							<option value="徳島県">徳島県</option>
							<option value="香川県">香川県</option>
							<option value="愛媛県">愛媛県</option>
							<option value="高知県">高知県</option>
							<option value="福岡県">福岡県</option>
							<option value="佐賀県">佐賀県</option>
							<option value="長崎県">長崎県</option>
							<option value="熊本県">熊本県</option>
							<option value="大分県">大分県</option>
							<option value="宮崎県">宮崎県</option>
							<option value="鹿児島県">鹿児島県</option>
							<option value="沖縄県">沖縄県</option>
						</select>
						</td>
				</tr>
				<tr>
					<td>市区町村</td>
					<td><s:textfield name="newCity" /></td>
				</tr>
				<tr>
					<td>番地</td>
					<td><s:textfield name="newAddress" /></td>
				</tr>
				<tr>
					<td>*建物名</td>
					<td><s:textfield name="newBuilding"  value=""/></td>
				</tr>
			</table>
			<s:submit value="送信"/>
			</s:form>

		</div>
		<div id="small">
			*建物名がない場合は空欄のままお進みください。
		</div>
	</div>
</body>
</html>