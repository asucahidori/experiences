$(document).ready(function(){
	function G(s){
		return document.getElementById(s);
	}
	
	function getStyle(obj, attr){
		if(obj.currentStyle){
			return obj.currentStyle[attr];
		}else{
			return getComputedStyle(obj,false)[attr];
		}
	}
	
	function Animate(obj,json){
		if(obj.timer){
			clearInterval(obj.timer);
		}
		obj.timer=setInterval(function(){
			for(var attr in json){
				var iCur=parseInt(getStyle(obj,attr));
				iCur=iCur?iCur:0;
				var iSpeed=(json[attr]-iCur)/5;
				iSpeed=iSpeed>0?Math.ceil(iSpeed):Math.floor(iSpeed);
				obj.style[attr]=iCur+iSpeed+"px";
				if(iCur==json[attr]){
					clearInterval(obj.timer);
				}
			}
		},50);
	}
	
	//大范围获取
	var oPicArea=G("picarea");
	var oBigArea=G("bigpicarea");
	var oSmallArea=G("smallpicarea");
	var oThumbs=G("thumbs");
	//获取4个按钮
	var oBigPrev=G("big-play-prev");
	var oBigNext=G("big-play-next");
	
	var oSmPrev=G("play_prev");
	var oSmNext=G("play_next");
	
	var oPicLi=oBigArea.getElementsByTagName("li");
	var oListLi=oThumbs.getElementsByTagName("li");
	var len1=oPicLi.length;
	var len2=oListLi.length;
	
	var oPicUl=oBigArea.getElementsByTagName("ul")[0];
	var oListUl=oThumbs.getElementsByTagName("ul")[0];
	var w1=oPicLi[0].offsetWidth;  //offsetWidth:在clientWidth的基础上加上左右边框
	var w2=oListLi[0].offsetWidth;
	
	oPicUl.style.width=w1*len1+"px";
	oListUl.style.width=w2*len2+"px";
	
	
	var index=0;
	var num=6;
	var num2=Math.ceil(num/2);
	
	function Change(){
		Animate(oPicUl,{left:-index*w1});
		if(index<num2){  //索引数小于 中间数3
			Animate(oListUl,{left:0});			
		}else if(index+num2<len2){
			Animate(oListUl,{left:-(index-num2+1)*w2});
		}else{
			Animate(oListUl,{left:-(len2-num)*w2});
		}
		for(var i=0;i<len2;i++){
			oListLi[i].className="";
			if(i==index){
				oListLi[i].className="current";
			}
			
		}
	}
	
	
	oBigNext.onclick=oSmNext.onclick=function(){
		document.removeEventListener('mousedown', onDocumentMouseDown, false);
		
		index++;
		index=index==len2?0:index;
		Change();
	}
	oBigPrev.onmouseover = oBigNext.onmouseover = oSmPrev.onmouseover = oSmNext.onmouseover = function(){
		clearInterval(timer);
	}
	oBigPrev.onmouseout=oBigNext.onmouseout=oSmPrev.onmouseout = oSmNext.onmouseout=function(){
		timer=setInterval(autoPlay,4000);
	}
	
	oBigPrev.onclick=oSmPrev.onclick=function(){
		document.removeEventListener('mousedown', onDocumentMouseDown, false);
		index--;
		index=index==-1?len2-1:index;
		Change();
	}
	var timer=null;
	timer=setInterval(autoPlay,5000);
	function autoPlay(){
		index++;
		index= index==len2?0:index;
		Change();
	}
	for(var i=0;i<len2;i++){
		oListLi[i].index=i;
		oListLi[i].onclick=function(){
			index=this.index;
			Change();
		}
	}
	function start(){
		if(timer==null){
			timer=setInterval(autoPlay,5000);
		}
	}
	function stop(){
		if(timer){
			clearInterval(timer);
		}
	}
	
});


















;