<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<script type="text/javascript">
    var ids = "";
    $(function(){
        $("#actb").treegrid({
            title:'专辑列表',
            fit:true,
            remoteSort:false,
            singleSelect:true,
            nowrap:false,
            fitColumns:true,
            url:'${pageContext.request.contextPath}/ad/queryAllAlbum.do',
            idField:'id',
            treeField:'name',
            columns:[[
                {field:'id',title:'ID',align:'center',hidden:true},
                {field:'name',title:'名称',align:'center',width:5,sortable:true},
                {field:'src',title:'下载路径',align:'center',width:5,sortable:true},
                {field:'size',title:'章节大小',align:'center',width:5,sortable:true},
            ]]
        });
        //专辑详情按钮
        $("#actbQueryByButton").linkbutton({
            "text":"专辑详情",
            "plain":true,
            "iconCls":"icon-lightbulb",
            onClick:function(){
                ids=$("#actb").treegrid("getSelected");
                if(ids!=null&&ids.size==null){
                    $("#actbQueryByDialog").dialog("open");
                }else{
                    alert("请选择专辑");
                }
            }
        });
        //专辑详情窗口
        $('#actbQueryByDialog').dialog({
            "title":"专辑详情",
            "width":400,
            "height":300,
            "collapsible":true,
            "minimizable":true,
            "maximizable":true,
            "closable":true,
            "modal":true,
            "closed":true,
            "cache":false,
            "href":"${pageContext.request.contextPath}/album.jsp"
        });
        //添加专辑按钮
        $('#actbInsertAlbumSaven').linkbutton({
            "text":"添加专辑",
            "plain":true,
            "iconCls":"icon-add",
            onClick:function(){
                $('#actbInsertAlbumDialog').dialog("open");
            }
        });

        //添加专辑窗口
        $('#actbInsertAlbumDialog').dialog({
            "title":"添加专辑",
            "width":400,
            "height":400,
            "collapsible":true,
            "minimizable":true,
            "maximizable":true,
            "closable":true,
            "modal":true,
            "closed":true,
            "cache":false,
            "href":"${pageContext.request.contextPath}/actbInsertAlbum.jsp"
        });

        //添加音频按钮
        $('#actbInsertChapterSaven').linkbutton({
            "text":"添加音频",
            "plain":true,
            "iconCls":"icon-add",
            onClick:function(){
                ids=$("#actb").treegrid("getSelected");
                if(ids.id!=null&&ids.size==null){
                    $('#actbInsertChapterDialog').dialog("open");
                }else{
                    alert("请选择专辑");
                }
            }
        });

        //添加音频窗口
        $('#actbInsertChapterDialog').dialog({
            "title":"添加音频",
            "width":400,
            "height":400,
            "collapsible":true,
            "minimizable":true,
            "maximizable":true,
            "closable":true,
            "modal":true,
            "closed":true,
            "cache":false,
            "href":"${pageContext.request.contextPath}/actbInsertChapter.jsp",

        });
        $('#actbDownButton').linkbutton({
            "text":"资源下载",
            "plain":true,
            "iconCls":"icon-down",
            onClick:function(){
                ids=$("#actb").treegrid("getSelected");
                if(ids.id!=null&&ids.size!=null){
                    location.href="${pageContext.request.contextPath}/ad/down.do?src="+ids.src;
                }else{
                    alert("请选择音频");
                }
            }
        });
    });
</script>

<a id="actbQueryByButton"></a>
<a id="actbInsertAlbumSaven"></a>
<a id="actbInsertChapterSaven"></a>
<a id="actbDownButton"></a>
<div id="actbInsertChapterDialog"></div>
<div id="actbInsertAlbumDialog"></div>
<div id="actbQueryByDialog"></div>
<table id="actb"></table>