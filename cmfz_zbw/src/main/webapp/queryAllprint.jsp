<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <script type="text/javascript">
    var ids;
    $(function () {
        $("#t12").datagrid({
            title:'轮播图展示',
            fitColumns:true,
            url:'${pageContext.request.contextPath}/carousel/CarouselList.do',
            toolbar: [{
                text:"添加轮播图",
                iconCls: 'icon-add',
                handler: function(){
                    $('#addprintbox').dialog({
                        title: '添加轮播图',
                        width: 400,
                        height: 200,
                        closed: false,
                        cache: false,
                        href: '${pageContext.request.contextPath}/addprintboxs.jsp',
                        modal: true
                    });
                }
            },'-',{
                text:"删除轮播图",
                iconCls: 'icon-edit',
                onClick:function () {
                    ids = $("#t12").datagrid("getSelected").chapterid;
                    $.messager.confirm(
                        "删除提示！",
                        "请问您是否永久删除当前选中的数据行？",
                        function (rs) {
                            if(rs){
                                $.post("${pageContext.request.contextPath}/carousel/CarousDelete.do?carouselid="+ids,function (result) {
                                    $("#t12").datagrid("load");
                                    $.messager.show({
                                       title:"系统提示",
                                        msg:"数据删除成功！",
                                    });
                                });
                            }
                        }
                    )
                }
            },'-',{
                text:"修改轮播图",
                iconCls: 'icon-cut',
                onClick: function(){
                    ids = $("#t12").datagrid("getSelected").chapterid;
                    $('#updprintbox').dialog({
                        title: '修改轮播图',
                        width: 400,
                        height: 200,
                        closed: false,
                        cache: false,
                        href: '${pageContext.request.contextPath}/updprintboxs.jsp',
                        modal: true
                    });
                }
            }],
            columns:[[
                {field:'name',title:'name',width:80,sortable:true},
                {field:'imgpath',title:'img_path',width:80,align:'center',sortable:true},
                {field:'description',title:'description',width:80,align:'center',sortable:true},
                {field:'status',title:'status',width:80,align:'center',sortable:true},
                {field:'uploaddate',title:'upload_date',width:100,align:'center'}
            ]],
            view: detailview,
            detailFormatter: function(rowIndex, rowData){
                return '<table><tr>' +
                    '<td style="border:0"><img src="../img/'+rowData.imgpath+'" style="height:50px;"/></td>' +
                    '<td style="border:0">' +
                    '<p>名称: ' + rowData.description + '</p>' +
                    '<p>数量: ' + rowData.status + '</p>' +
                    '</td>' +
                    '</tr></table>';
            }
        });
    });
    </script>
<div id="addprintbox"></div>
<a id="delprintbox"></a>
<div id="updprintbox"></div>
<table id="t12"></table>

