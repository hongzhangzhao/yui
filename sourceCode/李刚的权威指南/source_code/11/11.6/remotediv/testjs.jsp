<%@ page contentType="text/html;charset=GBK" language="java" %>
<%
    request.setAttribute("decorator", "none");
    response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
%>

<script language="JavaScript" type="text/javascript">
    alert('Spring2.0����');
</script>
������J2EE��ҵӦ��ʵս
<script language="JavaScript" type="text/javascript">
    alert('����J2EE��Ajax����!');
</script>