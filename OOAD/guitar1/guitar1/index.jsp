<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<style type="text/css">
	.content{
		text-align:center;
	}
	.line{
		padding: 10px 0;
	}
	.result{
		text-align:center;
	}
	
	table,table tr th, table tr td {
		border:1px solid #0094ff;
	}
	table {
		width: 50%;
		margin:auto;
		min-height: 25px;
		line-height: 25px;
		text-align: center;
		border-collapse: collapse;
	}  
</style>
<script>
	function search(){
		
		var modelNode = document.getElementById("model");
		var modelIndex = modelNode.selectedIndex;
		var model = "";
		if(modelIndex > 0){
			model = modelNode.options[modelIndex].text;			
		}
		
		var typeNode = document.getElementById("type");
		var typeIndex = typeNode.selectedIndex;
		var type = "";
		if(typeIndex > 0){			
			type = typeNode.options[typeIndex].text;
		}
		
		var backNode = document.getElementById("backWood");
		var backIndex = backNode.selectedIndex;
		var back = "";
		if(backIndex > 0){			
			back = backNode.options[backIndex].text;
		}
		
		var topNode = document.getElementById("topWood");
		var topIndex = topNode.selectedIndex;
		var top = "";
		if(topIndex > 0){			
			top = topNode.options[topIndex].text;
		}
		
		var xmlhttp = new XMLHttpRequest();
		//ajax的回掉
		xmlhttp.onreadystatechange = function(){
			if(xmlhttp.readyState == 4 ) {       //完全得到服务器的响应  
				if(xmlhttp.status == 200) {      //没有异常  
					
					var text = xmlhttp.responseText;//响应的参数
					var json  = JSON.parse(text);//把字符串解析为json
					
					var len = json.length;
					var tab = document.getElementById("tab");//获取table的Node
					
					//每次查询时把table初始化
					tab.innerHTML="<tr><th>model</th><th>type</th><th>backWood</th><th>topWood</th></tr>";
					//循环把查询结果插入table
					for(var i = 0;i < len;i++){
						//创建tr节点
						var newTr = document.createElement("tr");
						
						//创建四个td节点
						var newTd1 = document.createElement("td"); 
						var newTd2 = document.createElement("td"); 
						var newTd3 = document.createElement("td"); 
						var newTd4 = document.createElement("td"); 
						
						//为td节点赋值
						newTd1.innerHTML = json[i].model;
						newTd2.innerHTML = json[i].type;
						newTd3.innerHTML = json[i].backWood;
						newTd4.innerHTML = json[i].topWood;
						//把td节点加入导tr内
						
						newTr.appendChild(newTd1);
						newTr.appendChild(newTd2);
						newTr.appendChild(newTd3);
						newTr.appendChild(newTd4);
						
						//把tr节点放入在table
						tab.appendChild(newTr);
					}				
				}  
			}  
		}
		//打开ajax请求
		xmlhttp.open("GET","search.do?model="+model+"&type="+type+"&backWood="+back+"&topWood="+top,true);
		//发送请求
		xmlhttp.send();
	}
</script>
</head>
<body>
<div class="content">
	<div class="line">
		品&emsp;&emsp;牌:
		<select id = "model">
			<option>请选择</option>
			<option>吉普森</option>
			<option>芬达</option>
		</select>
	</div>
	<div class="line">
		类&emsp;&emsp;型:
		<select id = "type">
			<option>请选择</option>
			<option>四弦</option>
			<option>八弦</option>
		</select>
	</div>
	<div class="line">
		后背材质:
		<select id="backWood">
			<option>请选择</option>
			<option>枫木</option>
			<option>柚木</option>
		</select>
	</div>
	<div class="line">
		上部材质:
		<select id="topWood">
			<option>请选择</option>
			<option>枫木</option>
			<option>柚木</option>
		</select>
	</div>
	<div class="line">
		<button onclick="search()">查询</button>
	</div>
</div>

<div class="result">
	<table id = "tab">
		<tr>
			<th>model</th>
			<th>type</th>
			<th>backWood</th>
			<th>topWood</th>
		</tr>
	</table>
</div>

</body>
</html>