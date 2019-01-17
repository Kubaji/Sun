<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<script type="text/javascript">
    var ids = "";
    $(function(){
        $('#cutb').datagrid({
            title:'用户信息',
            fit:true,
            remoteSort:false,
            singleSelect:true,
            nowrap:false,
            fitColumns:true,
            url:'${pageContext.request.contextPath}/user/queryAll.do',
            columns:[[
                {field:'userId',title:'用户ID',width:1,hidden:true},
                {field:'name',title:'用户名称',align:'center',width:3,sortable:true},
                {field:'password',title:'用户密码',align:'center',width:3,sortable:true},
                {field:'dharmaName',title:'用户法名',align:'center',width:3,sortable:true},
                {field:'sign',title:'个性签名',align:'center',width:5,sortable:true},
                {field:'gender',title:'性别',align:'center',width:1,sortable:true,
                    formatter:function(value,row,index){
                        if(value==1){return "男";}
                        else{return "女"; }
                    },
                },
                {field:'status',title:'状态',width:2,align:'center',sortable:true,
                    styler:function(value,row,index){
                        if(value==1){
                            return 'color:green;font-weight:bold;';
                        }else{
                            return 'color:red;font-weight:bold;';
                        }
                    },
                    formatter:function(value,row,index){
                        if(value==1){
                            return "<a class='k'></a>";
                        }else{
                            return "<a class='g'></a>";
                        }
                    },
                },
                {field:'province',title:'省',align:'center',width:1,sortable:true},
                {field:'city',title:'市',align:'center',width:1,sortable:true},
                {field:'phone',title:'手机号',align:'center',width:5,sortable:true},
                {field:'registDate',title:'注册时间',width:2,sortable:true}
            ]],
            view: detailview,
            detailFormatter: function(rowIndex, rowData){
                return '<table><tr>' +
                    '<td rowspan=2 style="border:0"><img src="${pageContext.request.contextPath}/images/' + rowData.head + '.png" style="height:50px;"></td>' +
                    '<td style="border:0">' +
                    '<p>注册时间: ' + rowData.registDate + '</p>' +
                    '<p>法名: ' + rowData.dharmaName + '</p>' +
                    '</td>' +
                    '</tr></table>';
            },
            onLoadSuccess:function(data){
                $(".k").linkbutton({
                    "plain":true,
                    "text":"<spn style='color:green'>活跃</spn>"
                });
                $(".g").linkbutton({
                    "plain":true,
                    "text":"<spn style='color:red'>冻结</spn>"
                });
            }
        });
        //一键导出
        $('#cutbDownSaven').linkbutton({
            "text":"一键导出",
            "plain":true,
            "iconCls":"icon-redo",
            onClick:function(){
                location.href="${pageContext.request.contextPath}/user/download.do";
            }
        });
    });

</script>

<a id="cutbDownSaven"></a>
<table id="cutb"></table>