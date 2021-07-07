
		$(function() {
			$(".knob").knob(
					{
						/*change : function (value) {
						 //console.log("change : " + value);
						 },
						 release : function (value) {
						 console.log("release : " + value);
						 },
						 cancel : function () {
						 console.log("cancel : " + this.value);
						 },*/
						draw : function() {

							// "tron" case
							if (this.$.data('skin') == 'tron') {

								var a = this.angle(this.cv) // Angle
								, sa = this.startAngle // Previous start angle
								, sat = this.startAngle // Start angle
								, ea // Previous end angle
								, eat = sat + a // End angle
								, r = true;

								this.g.lineWidth = this.lineWidth;

								this.o.cursor && (sat = eat - 0.3)
										&& (eat = eat + 0.3);

								if (this.o.displayPrevious) {
									ea = this.startAngle
											+ this.angle(this.value);
									this.o.cursor && (sa = ea - 0.3)
											&& (ea = ea + 0.3);
									this.g.beginPath();
									this.g.strokeStyle = this.previousColor;
									this.g.arc(this.xy, this.xy, this.radius
											- this.lineWidth, sa, ea, false);
									this.g.stroke();
								}

								this.g.beginPath();
								this.g.strokeStyle = r ? this.o.fgColor
										: this.fgColor;
								this.g.arc(this.xy, this.xy, this.radius
										- this.lineWidth, sat, eat, false);
								this.g.stroke();

								this.g.lineWidth = 2;
								this.g.beginPath();
								this.g.strokeStyle = this.o.fgColor;
								this.g.arc(this.xy, this.xy, this.radius
										- this.lineWidth + 1 + this.lineWidth
										* 2 / 3, 0, 2 * Math.PI, false);
								this.g.stroke();

								return false;
							}
						}
					});
			/*向上向下滚动*/
			$("#scrollDiv").Scroll({
				line : 1,
				speed : 500,
				timer : 3000,
				up : "but_up",
				down : "but_down"
			});
			/* 点击显示隐藏  */
			$(".dnSelChart").mouseover(function() {
				$(this).find('ul').show();
			}).mouseout(function() {
				$(this).find('ul').hide();
			})
			/*加载数据及块元素*/
			$("#selChartList li a")
					.click(function() {
								$(this).parents('ul').hide();
								var checkText = $(this).text();
								var checkValue = $(this).attr("dataValue");
								console.log(checkValue);
								var str = "<div class='col-lg-3 col-xs-12 connectedSortable ui-sortable boxx' id='"+checkValue+"c'><div class='dash-unit box' dataId='"+checkValue+"c'><div class='box-header' id='"+checkValue+"'><h3>"
										+ checkText
										+ "</h3><div class='box-tools pull-right'><button class='btn btn-box-tool' data-widget='remove'><i class='fa fa-times'></i></button></div></div><div class='box-body'><div id='"+checkValue+"a' style='width: 100%; height: 255px;'></div></div></div></div>";
								var dd = document.getElementById(checkValue);
								if (dd == null) {
									$("#listBox").append(str);
									dnSortable();
									eval("initCharts"+checkValue+"a")();
								}
								/* $("#listBox").append(str);
								dnSortable(); */
							})

		})
		dnSortable();
		function dnSortable() {
			$(".connectedSortable").sortable({
				placeholder : "sort-highlight",
				connectWith : ".connectedSortable",
				handle : ".box-header, .nav-tabs",
				forcePlaceholderSize : true,
				update: function( event, ui ) {
					var el=ui.item[0].attributes.dataid.nodeValue;
					console.log(el);
					var wr = document.getElementById(el);
					wr.remove();
				},
				zIndex : 999999
			});
			$(".connectedSortable .dash-unit").css("cursor", "move");
		}
