<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<script type="text/javascript">

	//音频ablumId
	$("#chapterFormAlbumId").textbox({
			"value":ids.id,
			"width":300,
			"readonly":true
	});
	//音频名称
	$("#chapterFormName").textbox({
			"required":true,
			"width":300,
	});
	//音频大小
	$("#chapterFormSize").textbox({
			"required":true,
			"width":300,
			validType:"mobile['count']"
	});
	//音频路径
	$("#chapterFormSrc").filebox({
		"required":true,
		"width":300,
		"buttonText":"图片路径",
		"buttonIcon":"icon-add",
	});









	//保存按钮
	$("#chapterFormSaveBuuton").linkbutton({
			"iconCls":"icon-table_save",
			onClick:function(){
				$("#chapterForm").form("submit",{
					"url":"${pageContext.request.contextPath}/ad/insertC.do",
					 onSubmit:function(){
						var valid=$(this).form("validate");
						console.log(valid);
						if(valid){
							return valid;
						}
							return valid;
						},
					success : function(){
					$("#actbInsertChapterDialog").dialog("close");
							$.messager.show({
								"title":"保存成功",
								"msg":"新数据已入库"
							});
							$("#actb").treegrid("load");
							//$(".r").remove();
							//queryAll();
					}
				});
			}
		});

	//重置按钮
	$("#chapterFormResetBuuton").linkbutton({
			onClick:function(){
				$("#chapterForm").form("reset");
			}
		});
</script>


<form method="post" id="chapterForm" align="center" enctype="multipart/form-data">
	
	<div>专辑id  :<input id="chapterFormAlbumId" name="albumId"/></div>  
	<div>音频名称:<input id="chapterFormName" name="name"/></div>
	<div>音频大小:<input id="chapterFormSize" name="size"/></div>
	<div>音频路径:<input id="chapterFormSrc"  name="file1"/></div>
	<div><a id="chapterFormSaveBuuton">保存</a><a id="chapterFormResetBuuton">重置</a></div>
</form>