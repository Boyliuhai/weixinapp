<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap 实例</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="<c:url value='/static/css/main.css'/>" rel="stylesheet" type="text/css" />
  <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
  <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
  <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="<c:url value='/static/js/main.js'/>" type="text/javascript"></script>
</head>
<body>
<div id="top" class="page-header">
		<h2>
		外委工程智能管理系统
		</h2>
	<div id="topright">
	   <!--  <p><div id="time"></div></p> -->
	    <label>用户名：张三</label>
	<a  href="javascript:fullScreen();">
		<i class="fa fa-desktop"></i> 全屏
	</a>
	<a href="javascript:exitFullScreen();">
		<i class="fa fa-desktop"></i> 退出全屏
	</a>
  </div>
  
</div>
<div id="navigation">
<nav class="navbar navbar-default" role="navigation">
		<div class="container-fluid">
		    <div class="navbar-header">
		        <a class="navbar-brand" href="#">菜鸟教程</a>
		    </div>
		    <div>
		    	<ul class="nav navbar-nav">
		    		<li><a href="<c:url value='./projectmanage/publish.jsp'/>" target="main">电厂项目管理</a></li>
		    		<li><a href="#">外委公司管理</a></li>
		    		<li><a href="#">外委公司信息</a></li>
		    		<li><a href="#">作业人员管理</a></li>
		    		<li><a href="#">工器具管理</a></li>
		    		<li><a href="#">违章管理</a></li>
		    		 <li><a href="#">考勤管理</a></li>
		    		<li><a href="#">工作票管理</a></li>
		    	</ul>
		    </div>
		</div>
</nav>
</div>
<div id="middle">
	<iframe name="main"  frameborder="0"magin="0"></iframe >
</div>
<div id="footer">
	<table width="1000px">
		<tr>
    	<td align="center">CopyRight @2014 
        </td>
    </tr>
		</table>
</div>

</body>
</html>