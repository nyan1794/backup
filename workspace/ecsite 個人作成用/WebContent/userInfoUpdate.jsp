<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<title>ユーザー情報変更画面</title>
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
#big{
font-size:20px;
}
</style>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="pr">
		</div>
		<div>
			<s:form action="UserInfoUpdateConfirmAction" theme="simple">
				<table>
					<tr>
						<th></th>
						<th>変更前</th>
						<th id="big">→</th>
						<th>変更後</th>
					</tr>
					<tr>
						<td>ユーザー名</td>
						<td><s:property value="#session.userName" /></td>
						<td>→</td>
						<td><s:textfield name="newUserName" value="%{#session.userName}"/></td>
					</tr>
					<tr>
						<td>ID</td>
						<td><s:property value="#session.loginId" /></td>
						<td>→</td>
						<td><s:textfield name="newLoginId" value="%{#session.loginId}"/></td>
					</tr>
					<tr>
						<td>パスワード</td>
						<td><s:property value="#session.loginPassword" /></td>
						<td>→</td>
						<td><s:textfield name="newLoginPassword" value="%{#session.loginPassword}"/></td>
					</tr>
					<tr>
						<td>メールアドレス</td>
						<td><s:property value="#session.userEmail" /></td>
						<td>→</td>
						<td><s:textfield name="newUserEmail" value="%{#session.userEmail}"/></td>
					</tr>
					<tr>
						<td>郵便番号</td>
						<td><s:property value="#session.userZipcode" /></td>
						<td>→</td>
						<td><s:textfield name="newUserZipcode1" value="%{#session.userZipcode1}"/>-<s:textfield name="newUserZipcode2" value="%{#session.userZipcode2}"></s:textfield></td>
					</tr>
					<tr>
						<td>都道府県</td>
						<td><s:property value="#session.userPrefecture" /></td>
						<td>→</td>
						<td>
						<select name="newUserPrefecture" >
							<option value="%{#session.userPrefecture}" selected="selected"><s:property value="#session.userPrefecture"/></option>
							<option value="北海道">北海道</option>
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
						<td><s:property value="#session.userCity" /></td>
						<td>→</td>
						<td><s:textfield name="newUserCity" value="%{#session.userCity}"/></td>
					</tr>
					<tr>
						<td>番地</td>
						<td><s:property value="#session.userAddress" /></td>
						<td>→</td>
						<td><s:textfield name="newUserAddress" value="%{#session.userAddress}"/></td>
					</tr>
					<s:if test="#session.userBuilding != 'noBuilding'">
					<tr>
						<td>建物名</td>
						<td><s:property value="#session.userBuilding" /></td>
						<td>→</td>
						<td><s:textfield name="newUserBuilding" value="%{#session.userBuilding}"/></td>
					</tr>
					</s:if>
					<s:else>
					<tr>
						<td>*建物名</td>
						<td>登録建物名なし<td>
						<td>→</td>
						<td><s:textfield name="newUserBuilding" value="" /></td>
					</tr>
					</s:else>
					<s:if test="#session.userCreditNum != 'no'">
					<tr>
						<td>クレジットカード番号</td>
						<td><s:property value="#session.userCreditNum" /></td>
						<td>→</td>
						<td><s:textfield name="newUserCreditNum" value="%{#session.userCreditNum}" /></td>
					</tr>
					<tr>
						<td>カード有効期限</td>
						<td><s:property value="#session.userCreditDate" /></td>
						<td>→</td>
						<td><s:textfield name="newUserCreditMon" value="%{#session.userCreditMon}"/>月<s:textfield name="newUserCreditYear" value="%{#session.userCreditYear}" />年</td>
					</tr>
					</s:if>
					<s:else>
					<tr>
						<td>クレジットカード番号</td>
						<td>クレジットカード情報無し</td>
						<td>→</td>
						<td><s:textfield name="newUserCreditNum" value="" /></td>
					</tr>
					<tr>
						<td>カード有効期限</td>
						<td>クレジットカード情報無し</td>
						<td>→</td>
						<td><s:textfield name="newUserCreditMon" value=""/>月<s:textfield name="newUserCreditYear" value="" /></td>
					</tr>
					</s:else>
					<tr>
						<td>送信フォーム</td>
						<td></td>
						<td>→</td>
						<td><s:submit value="送信" /></td>
					</tr>
				</table>
			</s:form>
		</div>
	</div>
</body>
</html>