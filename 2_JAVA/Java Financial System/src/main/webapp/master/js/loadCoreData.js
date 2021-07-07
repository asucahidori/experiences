// 加 载核心数据

function getCoreData(data, name){
	//$("#coreDateName").html(name + "核心数据");
	$.ajax({
		       async: false,
			   type: "POST",
			   url: basePath+"/CIDM/map/mapOfChinaCoreData",
			   data: data,
			   success: function(msg){
				 if(msg != null){
					   /**
					 	* key: income 			人均收入
					 	* 	   expend        	人均支出 
					 	* 	   customerNumber   国安社区用户
					 	* 	   storeNumber	        国安门店数
					 	* 	   comsumeLevel 	消费等级
					 	* 	   leadNum	   		潜力用户
					 	* 	   proportion		国安社区用户/潜力用户的比例	
					 		   nuclearFamily    核心家庭
					 	***/
					 	var type =data.split("=");
					 	if(4==type[type.length-1]){
					 		if(msg.income!=null && msg.income!="undefined" && msg.income!=""){
					 			$("#pincome").html((msg.income/10000).toFixed(2) + "万/平米");//人均收入
					 		}else{
					 			$("#pincome").html("0万/平米");//人均收入
					 		}
					 		if(msg.expend!=null && msg.expend!="undefined" && msg.expend!=""){
					 			$("#expend").html((msg.expend/10000).toFixed(2) + "/㎡/天");//人均支出
					 		}else{
					 			$("#expend").html( "0/㎡/天");//人均支出
					 		}
						 	
					 	}
					 	/*else if(6==type[type.length-1]){
					 		if(msg.income!=null && msg.income!="undefined" && msg.income!=""){
					 			$("#income").html((msg.income/10000).toFixed(2) + "万/平米");//住宅房价
					 		}else{
					 			$("#income").html("0万/平米");//住宅房价
					 		}
					 		if(msg.expend!=null && msg.expend!="undefined" && msg.expend!=""){
					 			$("#expend").html(msg.expend + "%");//写字楼租金
					 		}else{
					 			$("#expend").html("0%");//写字楼租金
					 		}
						 	
					 	}*/
					 	
					 	else{
					 		if(msg.income!=null && msg.income!="undefined" && msg.income!=""){
					 			$("#pincome").html((msg.income/10000).toFixed(2) + "万/年");//人均收入
					 		}else{
					 			$("#pincome").html( "0万/年");//人均收入
					 		}
					 		if(msg.expend!=null && msg.expend!="undefined" && msg.expend!=""){
					 			$("#expend").html((msg.expend/10000).toFixed(2) + "万/年");//人均支出
					 		}else{
					 			$("#expend").html("0万/年");//人均支出
					 		}
					 	}
					 	//后台传回来的是“null”串
					 	var comsumeLevel = ("null"==msg.comsumeLevel) ? "0" : msg.comsumeLevel;
					 	$("#comsumeLevel").html( comsumeLevel + "级");//消费等级
					 	if(msg.storeNumber!=null && msg.storeNumber!="undefined" && msg.storeNumber!=""){
					 		$("#storeNumber").attr("value",msg.storeNumber);
					 		//$("#storeNumber").value(msg.storeNumber);//国安社区
					 	}else{
					 		$("#storeNumber").attr("value",'0');//国安社区
					 	}
					 	var countUser = (msg.customerNumber/10000).toFixed(2) + "万/" + (msg.leadNum/10000).toFixed(2) + "万";//国安社区用户/潜力用户
					 	$("#countUser").html(countUser);////国安社区用户/潜力用户
					 	/*if(msg.proportion!=null && msg.proportion!="undefined" && msg.proportion!=""){
					 		$("#proportion").html(msg.proportion + "%");	//国安社区用户/潜力用户的比例	
					 	}else{
					 		$("#proportion").html( "0%");	//国安社区用户/潜力用户的比例	
					 	}*/
					 	//$("#proportionShow").html(msg.proportion + "%");//国安社区用户/潜力用户的比例
					 	
					 	if(msg.nuclearFamily!=null && msg.nuclearFamily!="undefined" && msg.nuclearFamily!=""){
					 		$("#nuclearFamily").html(Math.floor(msg.nuclearFamily));
					 	}else{
					 		$("#nuclearFamily").html("0");
					 	}
					 	
					 	if(msg.customerNumber!=null && msg.customerNumber!="undefined" && msg.customerNumber!=""){
					 		$("#customerNumber").attr("value",msg.customerNumber);
					 		$("#sumCustomer").html((msg.customerNumber/10000).toFixed(2));
					 		//$("#storeNumber").value(msg.storeNumber);//国安社区
					 	}else{
					 		$("#customerNumber").attr("value",'0');//国安社区
					 		$("#sumCustomer").html("0");
					 	}
					 	
					 	if(msg.ordersum!=null && msg.ordersum!="undefined" && msg.ordersum!=""){
					 		$("#ordersum").attr("value",msg.ordersum);
					 		$("#sumPrice").html((msg.ordersum/10000).toFixed(2));
					 		//$("#storeNumber").value(msg.storeNumber);//国安社区
					 	}else{
					 		$("#ordersum").attr("value",'0');//国安社区
					 		$("#sumPrice").html("0");
					 	}
					 	
					 	//document.getElementById("proportionShow").style.width = msg.proportion + "%";//设置红线的长度
				 }
			   }
		});
}
