<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<script type="text/javascript">
	if(ids!=""){
		$("#albumFrom").form("load",ids);
	};
		
	
</script>


<form method="post" id="albumFrom" align="center" enctype="multipart/form-data">
	<div>专辑名称:<input  name="name"/></div>
	<div>章节数量:<input  name="count"/></div>
	<div>专辑得分:<input  name="score"/></div>
	<div>专辑作者:<input  name="author"/></div>
	<div>播音员   :<input  name="teller"/></div>
	<div>出版时间:<input  name="pulishDate"/></div>
	<div>专辑封面:<input  name="coverPath"/></div>
	<div>专辑简介:<input  name="brief"></div>
</form>