<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>
<decorator:title default="商业拍卖Java EE程序框架"/></title>
<link href="images/css.css" rel="stylesheet" type="text/css">
<s:head/>
</head>
<body>
<table width="780" height="110" border="0" align="center" cellpadding="0" cellspacing="0" background="images/bodybg.jpg">
  <tr>
    <td width="100" height="94" rowspan="2"><img src="images/logo.jpg" width="94" height="94" align="right"></td>
	
    <td width="577" height="65"><div align="center"><font size="+2" color="#CC6600"><b>商业拍卖Java EE程序框架</b></font></div></td>
    <td width="103" rowspan="2"><img src="images/logo.jpg" width="94" height="94"></td>
  </tr>
  <tr>
    <td height="15"><div align="center" class="title">如果需要开发高档的Java EE应用，请联系<a href="mailto:kongyeeku@163.com">kongyeeku@163.com</a>。谢谢</div></td>
  </tr>
  <tr>
  <td colspan="3"><br>    <table width="574" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td width="116"><a href="viewItemSu.action" class="pt9">查看竞得的物品</a></td>
      <td width="101"><a href="viewFailItem.action" class="pt9">浏览流拍物品</a></td>
      <td width="79"><a href="mgrKind.action" class="pt9">管理种类</a></td>
      <td width="79"><a href="mgrItem.action" class="pt9">管理物品</a></td>
      <td width="105"><a href="viewKind.action" class="pt9">浏览拍卖物品</a></td>	  	  	  
      <td width="103"><a href="viewBid.action" class="pt9">查看自己的竞标</a></td>
      <td width="70"><a href="index.action" class="pt9">返回首页</a></div></td>
    </tr>
  </table></td>
  </tr>
  <tr>
    <td height="5" colspan="3"><hr></td>
  </tr>
</table>
<decorator:body/>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td background="images/bodybg.jpg">
		<br><br>
		<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">	
		  <TR>
			<TD width="283" valign=TOP><img src="images/struts2.png" width="188" height="66"></TD>
			<TD width="246" valign=TOP><img src="images/spring.gif" width="152" height="66"></TD>
			<TD width="243" valign=TOP><img src="images/hibernate.png" width="203" height="56"></TD>
		  </TR>
		</table>	
	</td>
  </tr>
  <tr>
    <td height="68" background="images/bodybg.jpg">   <div align="center" class="pt9">
      All Rights Reserved.<br>
      版权所有 Copyright@2006 Yeeku.H.Lee <BR>
    如有任何问题和建议，<A href="mailto:kongyeeku@163.com">请E-mail to me</A>！<BR>
    建议您使用1024*768分辨率，IE5.0以上版本浏览本站!</p>
    </div>    </td>
  </tr>
  <tr height="5"><td background="images/bottom.jpg"></td></tr>
</table>
</body>
</html>
