<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/views/include/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form role="form" target="main" action="<c:url value='TraceServlet'/>" method="get">
	<div class="input-group">
		  <span class="input-group-addon" id="basic-addon1">项目名称</span>
		  <input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
		  <span class="input-group-addon" id="basic-addon1">项目编号</span>
		  <input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
	</div>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon1">项目名称</span>
		  <input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
		  <span class="input-group-addon" id="basic-addon1">项目编号</span>
		  <input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
	</div>
	</form>
</body>
</html>