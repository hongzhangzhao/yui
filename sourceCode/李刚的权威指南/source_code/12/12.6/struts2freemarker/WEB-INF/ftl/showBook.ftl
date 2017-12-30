<html>
    <head>
        <title>作者李刚的图书</title>
    </head>
    <body>

	<table border="1" width="360">
	<caption>作者李刚的图书</caption>
	<#list books as book>
	<tr>
		<td>书名：</td>
		<td>${book}</td>
	</tr>
	</#list>
	</table>

    </body>
</html>