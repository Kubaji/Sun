<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<script type="text/javascript">
	var ids = "";
	$(function(){

        var myChart = echarts.init(document.getElementById('user2'));
        var option = {
            title: {
                text: '2018用户注册表'
            },
            tooltip: {},
            legend: {
                data:['男','女']
            },
            xAxis: {
                data: ['一月','三月','五月','七月','九月','十一月']
            },
            yAxis: {},
            series: [{
                name: '男',
                type: 'bar',
                data: [5,10,15,20,25,30]
            },{
                name: '女',
                type: 'bar',
                data: [5,10,15,20,25,30]
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);

	});
</script>

<div id="user2" style="width: 600px;height:400px;"></div>