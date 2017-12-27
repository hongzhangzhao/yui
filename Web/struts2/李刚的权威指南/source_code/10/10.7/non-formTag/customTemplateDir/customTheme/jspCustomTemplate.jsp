<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<div style="background-color:#eeeeee;">
<b>JSP自定义模板<br>
请选择您喜欢的图书<br></b>
<s:select list="parameters.list"/>
</div>
