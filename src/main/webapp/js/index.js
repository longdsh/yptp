/**
 * 
 */
$(function() {
	$('#tell').modal('show');
	$.ajax({
		type : "post",
		url : getRootPath() + "/teacher/showAll",
		success : function(result) {
			// alert(result.extend);
			f5Teacher(result);
		}
	});
});

function f5Teacher(result) {
	// extend
	$("#showAll").empty();
	var teachers = result.extend.teachers;
	var tr = $("<tr></tr>").addClass("bg-primary");
	var tdName = $("<td></td>").append("姓名");
	var tdIsBuy = $("<td></td>").append("是否购买");
	tr.append(tdName).append(tdIsBuy).appendTo($("#showAll"));
	$.each(teachers, function(index, item) {
		var tr = $("<tr></tr>");
		var tdName = $("<td></td>").append(item.name);
		tdName.click(function(){
			$('#userInfo').modal('show');
		});
		if(item.con.isBuy==1){
			var tdIsBuy = $("<td></td>").append("已选择奖品");
		}else{
			var tdIsBuy = $("<td></td>").append("未选择奖品");
		}
		
		tr.append(tdName).append(tdIsBuy).appendTo($("#showAll"));

	});

}



function upUserExcel(){
	alert("上传中---稍等下一个弹出框 点确定上传")

	$("#upTeacher").ajaxSubmit({
		type: "POST",
		url:getRootPath()+"/importExport/upUserExcel",
		dataType: "json",
	    success: function(data){
	    	if(data.code==100){
	    		alert("上传完成")
	    	}else{
	    		alert("上传失败 后缀需为xls");
	    	}
	     	
		}
	});
}



function upPrizeExcel(){
	alert("上传中---稍等下一个弹出框 点确定上传")

	$("#upPrize").ajaxSubmit({
		type: "POST",
		url:getRootPath()+"/importExport/upPrizeExcel",
		dataType: "json",
	    success: function(data){
	    	if(data.code==100){
	    		alert("上传完成")
	    	}else{
	    		alert("上传失败 后缀需为xls");
	    	}
	     	
		}
	});
}


function findTeacher(){
	$.ajax({
		type : "post",
		url : getRootPath() + "/teacher/findTeacher",
		data:$("#userInfo form").serialize(),
		success : function(result) {
			// alert(result.extend);
			//f5Teacher(result);
			if(result.code==100){
				//alert("存在");
			    window.location.href=getRootPath()+"/shop.html";
				//window.open(getRootPath()+"/shop.html");
			}else{
				alert("工号或姓名输入错误");
			}
		}
	});
}

function downUser(){
	$.ajax({
		type : "post",
		url : getRootPath() + "/importExport/downUser",
		success : function(result) {
			window.location.href=getRootPath()+"/user/user.xls";
		}
	});
}

function downPrize(){
	$.ajax({
		type : "post",
		url : getRootPath() + "/importExport/downPrize",
		success : function(result) {
			window.location.href=getRootPath()+"/user/prize.xls";
		}
	});
}

// 得到绝对路径
function getRootPath() {
	// 获取当前网址，如： http://localhost:9527/zdss-web/login/login.do
	var curWwwPath = window.document.location.href;
	// console.log("当前网址：" + curWwwPath);

	// 获取主机地址之后的目录，如：zdss-web/login/login.do
	var pathName = window.document.location.pathname;
	// console.log("当前路径：" + pathName);

	var pos = curWwwPath.indexOf(pathName);
	// console.log("路径位置：" + pos);

	// 获取主机地址，如： http://localhost:9527
	var localhostPath = curWwwPath.substring(0, pos);
	console.log("当前主机地址：" + localhostPath);

	// 获取带"/"的项目名，如：/zdss-web
	var projectName = pathName
			.substring(0, pathName.substr(1).indexOf('/') + 1);
	console.log("当前项目名称：" + projectName);
	console.log(localhostPath + projectName);
	return localhostPath + projectName;
}