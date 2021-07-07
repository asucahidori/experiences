/**
 * 建筑物计算工具
 */

// 单元户型分布格局,传入参数roomNum(一梯几户)
function unitRoomStructure(roomNum) {
	var colRow = [];
	switch (roomNum) {
	case 1:
		colRow.push(1);
		colRow.push(1);
		break;
	case 2:
		colRow.push(1);
		colRow.push(2);
		break;
	case 3:
		colRow.push(2);
		colRow.push(2);
		break;
	case 4:
		colRow.push(2);
		colRow.push(2);
		break;
	case 5:
		colRow.push(3);
		colRow.push(2);
		break;
	case 6:
		colRow.push(3);
		colRow.push(2);
		break;
	case 7:
		colRow.push(3);
		colRow.push(3);
		break;
	case 8:
		colRow.push(3);
		colRow.push(3);
		break;
	case 9:
		colRow.push(3);
		colRow.push(3);
		break;
	case 10:
		colRow.push(4);
		colRow.push(3);
		break;
	case 11:
		colRow.push(4);
		colRow.push(3);
		break;
	}
	return colRow;
}

function getUnitName(unitIndex) {
	var unitName = "";
	switch (unitIndex) {
	case 1:
		unitName = "一单元";
		break;
	case 2:
		unitName = "二单元";
		break;
	case 3:
		unitName = "三单元";
		break;
	case 4:
		unitName = "四单元";
		break;
	case 5:
		unitName = "五单元";
		break;
	case 6:
		unitName = "六单元";
		break;
	case 7:
		unitName = "七单元";
		break;
	case 8:
		unitName = "八单元";
		break;
	case 9:
		unitName = "九单元";
		break;
	case 10:
		unitName = "十单元";
		break;
	}
	return unitName;
}