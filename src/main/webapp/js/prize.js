/**
 * 
 */
$(function() {
	showAllPrize();
})

function showAllPrize() {
	$.ajax({
		type : "post",
		url : getRootPath() + "/prize/showAll",
		success : function(result) {
			// alert(result.extend);
			f5Prize(result);
		}
	});
}

function f5Prize(result) {
	$("#showAllPrize").empty();
	var money = result.extend.money;
	var prizes = result.extend.prizes;
	var tr = $("<tr></tr>");
	var tdMoney = $("<td></td>").append("剩余金额:" + money);
	tr.append(tdMoney).appendTo($("#showAllPrize"));

	var tr = $("<tr></tr>").addClass("bg-primary");
	var tdPrizeName = $("<td></td>").append("商品");
	var tdAddDown = $("<td></td>").append("增加减少");
	var tdBuyNum = $("<td></td>").append("已购数量");
	var tdPrizeNum = $("<td></td>").append("剩余数量");
	var tdPrice = $("<td></td>").append("单价");
	tr.append(tdPrizeName).append(tdAddDown).append(tdBuyNum)
			.append(tdPrizeNum).append(tdPrice).appendTo($("#showAllPrize"));

	$.each(prizes, function(index, item) {
		var tr = $("<tr></tr>");
		var tdPrizeName = $("<td></td>").append(item.name);

		var addBtn = $("<button></button>").addClass("btn btn-success").text("添加").css('font-size',35);
		addBtn.click(function(){
			addPrize(item.name);
		})
		var downBtn = $("<button></button>").addClass("btn btn-danger").text("减少").css('font-size',35);

		downBtn.click(function(){
			downPrize(item.name);
		})
		var tdAddDown = $("<td></td>").append(addBtn).append("----").append(downBtn);
		var tdBuyNum = $("<td></td>").append(item.con.buyNum);
		var tdPrizeNum = $("<td></td>").append(item.number);
		var tdPrice = $("<td></td>").append(item.price);
		tr.append(tdPrizeName).append(tdAddDown).append(tdBuyNum)
				.append(tdPrizeNum).append(tdPrice).appendTo($("#showAllPrize"));
	})
}

function addPrize(name){
	$.ajax({
		type : "post",
		url : getRootPath() + "/prize/addOrDown",
		data : {"name":name,"type":1},
		success : function(result) {
			// alert(result.extend);
			//f5Prize(result);
			if(result.code==100){
				showAllPrize();
			}else{
				alert(result.extend.msg);
			}
		}
	});
}

function downPrize(name){
	$.ajax({
		type : "post",
		url : getRootPath() + "/prize/addOrDown",
		data:{"name":name,"type":0},
		success : function(result) {
			// alert(result.extend);
			//f5Prize(result);
			if(result.code==100){
				showAllPrize();
			}else{
				alert(result.extend.msg);
			}
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
