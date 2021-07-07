var familyMembers = [ "张三", "李四", "张五", "张六", "李景辉", "李宁", "李晓旭", "李根" ];
document.write('<script src="../resource/three.js/building.js"><\/script>');
function setHouseTypePhoto(name) {
	$("#divFamilyInfo").hide();
	$("#personAttr").hide();
	var imgListRight = parseInt($(".imgList").css("right"));
	if (imgListRight != 0) {
		$(".imgList").css("right", "0");
		window.widthPercent = 0.7;
		onWindowResize();
	}
	if (name.indexOf('01') > 0) {
		$("#houseTypeImg").attr('src', '../photo/A.jpg');
		$("#imgName").text('呼家楼10号楼户型图A户型');
	} else if (name.indexOf('02') > 0) {
		$("#houseTypeImg").attr('src', '../photo/B.jpg');
		$("#imgName").text('呼家楼10号楼户型图B户型');
	} else if (name.indexOf('03') > 0) {
		$("#houseTypeImg").attr('src', '../photo/C.jpg');
		$("#imgName").text('呼家楼10号楼户型图C户型');
	} else if (name.indexOf('04') > 0) {
		$("#houseTypeImg").attr('src', '../photo/D.jpg');
		$("#imgName").text('呼家楼10号楼户型图D户型');
	}
	$("#divHousePhoto").show();
}

// 家庭成员数量点击事件
function familyNumberCheckBox() {
	if ($("#familyNumberCheckBox").prop("checked")) {
		zhuEnable = true;
		if (currentOutFloor != null) {
			zhuShow(currentOutFloor);
		}
	} else {
		zhuEnable = false;
		zhuDisappear(zhus, text3Ds, 'people');
	}
}

// 显示家庭信息
function familyInfoShow(obj) {
	var imgListRight = parseInt($(".imgList").css("right"));
	if (imgListRight != 0) {
		$(".imgList").css("right", "0");
		window.widthPercent = 0.7;
		onWindowResize();
	}
	$("#divHousePhoto").hide(); // 隐藏户型图
	$("#roomName").text(obj.roomName);
	var fms = ""; // 家庭成员
	for (var i = 0; i < obj.familyNumber; i++) {
		fms += familyMembers[i] + ",";
	}
	$("#familyMember").text(fms.substring(0, fms.length - 1));
	$("#ownerName").html("<a href='javascript:;'>" + familyMembers[0] + "</a>");

	$("#divFamilyInfo").show();
	var zhuType = obj.zhuType;
	hideAll();
	if (zhuType == 'income') {
		$("#houseIncome").show();
		var income1 = obj.value * 0.6;
		var income2 = obj.value * 0.4;
		$("#income1").text(income1.toFixed(1) + '万');
		$("#income2").text(income2.toFixed(1) + '万');
		$("#incomeTotal").text(obj.value + '万');
	} else if (zhuType == 'cost') {
		$("#houseSpend").show();
		var costChildrenEdu = obj.value * 0.3;
		var costLife = obj.value * 0.4;
		var costElse = obj.value * 0.3;
		$("#costLife").text(costLife.toFixed(1) + '万');
		$("#costChildrenEdu").text(costChildrenEdu.toFixed(1) + '万');
		$("#costElse").text(costElse.toFixed(1) + '万');
		$("#costTotal").text(obj.value + '万');
	} else if (zhuType == 'orderNum') {
		$("#ComOrder").show();
		var orderZongzi = Math.round(obj.value * 0.5);
		var orderApple = Math.round(obj.value * 0.3);
		var orderEgg = Math.round(obj.value * 0.2);
		if (obj.value == 3) {
			orderZongzi = 1;
		}
		if (obj.value == 5) {
			orderZongzi = 2;
		}
		$("#trZongzi").show();
		$("#trApple").show();
		$("#trEgg").show();
		$("#orderZongzi").text(orderZongzi + '件');
		$("#orderApple").text(orderApple + '件');
		$("#orderEgg").text(orderEgg + '件');
		$("#orderTotal").text(obj.value + '件');
		if (obj.value == 0) {
			$("#trZongzi").hide();
			$("#trApple").hide();
			$("#trEgg").hide();
		}
	} else if (zhuType == 'orderbook') {
		$("#orderbook").show();
		var orderbookTotal = obj.value * 10000;
		var orderbook1 = obj.value * 10000 * 0.3;
		var orderbook2 = obj.value * 10000 * 0.4;
		var orderbook3 = obj.value * 10000 * 0.3;
		$("#orderbook1").text(orderbook1 + '元');
		$("#orderbook2").text(orderbook2 + '元');
		$("#orderbook3").text(orderbook3 + '元');
		$("#orderbookTime1").show();
		$("#orderbookTime2").show();
		$("#orderbookTime3").show();
		$("#orderbook1").show();
		$("#orderbook2").show();
		$("#orderbook3").show();
		$("#orderbookTotal").text(orderbookTotal + '元');
		if (obj.value == 0) {
			$("#orderbookTime1").hide();
			$("#orderbookTime2").hide();
			$("#orderbookTime3").hide();
			$("#orderbook1").hide();
			$("#orderbook2").hide();
			$("#orderbook3").hide();
		}
	}
}

function hideAll() {
	$("#houseIncome").hide();
	$("#houseSpend").hide();
	$("#ComOrder").hide();
	$("#orderbook").hide();
}

// 重置楼层
function infoButtonClick() {
	if (currentOutFloor != null) {
		floorBack(currentOutFloor, null);
		alphaCubeHide();
	}
}

// 家庭收入
function incomeCheckBox() {
	if ($("#incomeCheckBox").prop("checked")) {
		incomeEnable = true;
		if (currentOutFloor != null) {
			incomeShow(currentOutFloor);
		}
	} else {
		incomeEnable = false;
		incomeHide();
	}
}

// 家庭支出
function costCheckBox() {
	if ($("#costCheckBox").prop("checked")) {
		costEnable = true;
		if (currentOutFloor != null) {
			costShow(currentOutFloor);
		}
	} else {
		costEnable = false;
		costHide();
	}
}

// 订单量
function orderNumCheckBox() {
	if ($("#orderNumCheckBox").prop("checked")) {
		orderNumEnable = true;
		if (currentOutFloor != null) {
			orderNumShow(currentOutFloor);
		}
	} else {
		orderNumEnable = false;
		orderNumHide();
	}
}

// 订单额
function orderbookCheckBox() {
	if ($("#orderbookCheckBox").prop("checked")) {
		orderbookEnable = true;
		if (currentOutFloor != null) {
			orderbookShow(currentOutFloor);
		}
	} else {
		orderbookEnable = false;
		orderbookHide();
	}
}

$(function() {
	$("#familyNumberCheckBox").attr("checked", false);

	$("#communityName").text('呼家楼');
	$("#communityAddress").text('北京市朝阳区向军南里二巷5号 ');
	$("#buildingName").text('10号楼');
	$("#houseTypeImg").click(function() {
		$(".mask").show();
		$(".wrap").css("visibility", "visible");
		$(".imgList").css("right", "-30.1%");
		window.widthPercent = 1;
		onWindowResize();

	});

	$(".close-btn").click(
			function() {
				$(this).parent(".wrap").css("visibility", "hidden").siblings(
						".mask").hide();
				window.widthPercent = 1;
				onWindowResize();
				// init();
				document.addEventListener('mousedown', onDocumentMouseDown,
						false);
			});
	$(".showHideBut").click(function() {
		var imgListRight = parseInt($(".imgList").css("right"));
		if (imgListRight != 0) {
			$(".imgList").css("right", "0");
			window.widthPercent = 0.7;
			onWindowResize();
		} else {
			$(".imgList").css("right", "-30.1%");
			window.widthPercent = 1;
			onWindowResize();
		}
	})
	$("#ownerName").click(function() {
		/*
		 * $("#familyMember").parent().parent().hide();
		 * $("#familyStatus").parent().parent().hide();
		 */
		$("#personAttr").toggle();
	});
});