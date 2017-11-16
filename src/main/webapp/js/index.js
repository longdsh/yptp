/**
 * 
 */
$(function(){
	$.ajax({
		type : "post",
		url : getRootPath() + "/teacher/showAll",
		success : function(result) {
			//alert(result.extend);
			f5Teacher(result);
		}
	});
});

function f5Teacher(result){
	//extend
	//$("#showAll").empty();
	var teachers = result.extend.teachers;
	$.each(teachers, function(index, item) {
		var tr = $("<tr></tr>");
		var td = $("<td></td>").append(item.name);
		tr.append(td).appendTo($("#showAll"));
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