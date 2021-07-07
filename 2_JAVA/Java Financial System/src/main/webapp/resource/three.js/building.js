var container, stats;
var camera, scene, renderer, controls;
var cameraOrtho, sceneOrtho;
var plane;
var targetRotation = 0;
var targetRotationOnMouseDown = 0;
var mouseX = 0;
var mouseXOnMouseDown = 0;
var widthPercent = 1; // 场景占窗口宽度比例
var heightPercent = 1; // 场景占窗口高度比例
var windowHalfX = window.innerWidth / 2;
var windowHalfY = window.innerHeight / 2;
var canvasWidth = window.innerWidth * widthPercent; // 场景宽度
var canvasHeight = window.innerHeight * heightPercent; // 场景高度
var unitNum = 4; // 单元数量
var totalFloor = 15; // 总楼层
var floorHeight = 30; // 每层高
var floorBet = 3; // 层间隔高度
var cubeX = 200; // 楼栋长
var cubeZ = cubeX * unitNum; // 楼栋宽
var unitRoomNum = 4; // 一梯几户
var colRow = unitRoomStructure(unitRoomNum);
var hxRow = colRow[0]; // 户型行数
var hxColumn = colRow[1]; // 户型列数
var unitRoomIndex = 1; // 单元房间号索引
var unitZ = cubeZ / unitNum; // 单元长度
var unitX = cubeX; // 单元宽度
var evX = unitX / hxRow; // 户型网格的长度
var evZ = unitZ / hxColumn; // 户型网格的宽度
var liftX = 40; // 电梯间长
var liftZ = 60; // 电梯间宽
var topCubeX = 60;
var topCubeZ = 60;
var topCubeY = 40;
var buildminx = -(cubeX / 2);
var buildmaxx = cubeX / 2;
var buildminz = -cubeZ / 2;
var buildmaxz = cubeZ / 2;
var buildHeight = totalFloor * (floorHeight + floorBet);
var projector, mouse = {
	x : 0,
	y : 0
}, INTERSECTED;
var sprite1;
var canvas1, context1, texture1;

var FLOOR = "floor"; // 楼层类型
var UNIT = "unit"; // 单元类型
var GROUND = "ground";
var currentOutFloor; // 当前弹出的楼层
var outPositionX = cubeX + 100; // 弹出楼层的X坐标值
var houseTypes = []; // 户型名称
var flag = false; // 户型网格是否有位移
var typeGrids = []; // 户型背景块

var CHART = "chart" // 柱状图类型
var zhuEnable = false; // 是否显示家庭成员数量
var zwidth = 12; // 柱状图的长、宽
var zOriginalHeight = 10; // 柱状图的初始高度
var zhus = []; // 柱状图形
var text3Ds = []; // 三D文字
var fontSize3D = 10; // 3D文字大小

var peopleColor = 0xFF522A;
var incomeColor = 0x00B0F0;
var costColor = 0xfb00f2;
var orderNumColor = 0xf3eb0d;
var orderbookColor = 0x080D5E;

var incomeEnable = false; // 是否显示月收入
var costEnable = false; // 是否显示支出
var orderNumEnable = false; // 是否显示订单量
var orderbookEnable = false; // 是否显示订单额

var incomeZhu = []; // 收入柱状图
var costZhu = []; // 支出柱状图
var orderNumZhu = []; // 订单量柱状图
var orderbookZhu = []; // 订单额

var incomeText = [];
var costText = [];
var orderNumText = [];
var orderbookText = [];

var dis = liftZ / 2 + (unitZ / 2 - liftZ / 2) / 2; // 电梯间窗户到房间窗户距离
var textureFloor;

init();
animate();

function init() {
	// container = document.createElement('div');
	container = document.getElementById("container");
	document.body.appendChild(container);

	// SCENE
	scene = new THREE.Scene();
	scene.fog = new THREE.Fog(0xD8E7FF, 1000, 10000);

	// CAMERA
	camera = new THREE.PerspectiveCamera(70, canvasWidth / canvasHeight, 1,
			5000);
	camera.position.set(1000, 500, 0);
	// alert(scene.position.x+" "+scene.position.y+" "+scene.position.z);
	// var center = new THREE.Vector3(scene.position.x, scene.position.y+1000,
	// scene.position.z);
	// camera.lookAt(new THREE.Vector3(0, -1000, 0));

	// LIGHTS
	/*
	 * var light = new THREE.PointLight(0xffffff); light.position.set(0, 1000,
	 * 0); scene.add(light);
	 */
	var light = new THREE.DirectionalLight(0xffffff, 0.3);
	light.position.set(300, 300, 0);
	light.castShadow = true;
	scene.add(light);

	var hemiLight = new THREE.HemisphereLight(0xffffff, 0xffffff, 0.9);
	/*
	 * hemiLight.color.setHSL(0.6, 1, 0.75); hemiLight.groundColor.setHSL(0.1,
	 * 0.8, 0.7);
	 */
	hemiLight.position.y = 2000;
	// hemiLight.castShadow = true;
	scene.add(hemiLight);

	// ground
	var textureGroud = THREE.ImageUtils
			.loadTexture("../photo/80lb-Felt-Granite.jpg");

	var groundMaterial = new THREE.MeshPhongMaterial({
		map : textureGroud,
		side : THREE.DoubleSide,
	});
	/*
	 * textureGroud.wrapS = textureGroud.wrapT = THREE.RepeatWrapping;
	 * textureGroud.repeat.set(10,10);
	 */
	var groundGeometry = new THREE.PlaneGeometry(1000, 1000);
	var ground = new THREE.Mesh(groundGeometry, groundMaterial);
	ground.position.y = -0.5;
	ground.rotation.x = Math.PI / 2;
	ground.type = GROUND;
	scene.add(ground);

	// material
	// building
	// var textureFloor = new THREE.Texture( generateTexture() );
	textureFloor = THREE.ImageUtils
			.loadTexture("../photo/80lb-Felt-Granite.jpg");
	for (var i = 1; i <= totalFloor; i++) {
		var geometry = new THREE.CubeGeometry(cubeX, floorHeight, cubeZ);
		var geometry1 = new THREE.CubeGeometry(cubeX, floorBet, cubeZ);

		var cube = new THREE.Mesh(geometry, new THREE.MeshPhongMaterial({
			// color : 0x141414,
			// color : 0x194D5B,
			map : textureFloor,
			// color : 0xC3BED4,
			side : THREE.DoubleSide,
			shading : THREE.SmoothShading,
		// vertexColors: THREE.FaceColors
		}));
		cube.position.y = (i - 1) * (floorHeight + floorBet) + floorHeight / 2;
		cube.material.side = THREE.DoubleSide;
		cube.name = i + "层";
		cube.type = FLOOR;
		scene.add(cube);

		var cube1 = new THREE.Mesh(geometry1, new THREE.MeshPhongMaterial({
			// color : 0x808080,
			color : 0x7B7687,
			// color : 0xC3BED4,
			side : THREE.DoubleSide,
			shading : THREE.SmoothShading,
		// vertexColors: THREE.FaceColors
		}));
		cube1.position.y = (i - 1) * (floorHeight + floorBet)
				+ (floorHeight + floorBet / 2);
		cube1.material.side = THREE.DoubleSide;
		scene.add(cube1);
	}

	// 单元
	for (var i = 1; i <= unitNum; i++) {
		var geometry = new THREE.CubeGeometry(liftX, buildHeight, liftZ);
		var unitLift = new THREE.Mesh(geometry, new THREE.MeshPhongMaterial({
			map : textureFloor,
			// color : 0xC3BED4,
			side : THREE.DoubleSide,
			shading : THREE.SmoothShading,
		}));
		unitLift.position.x = buildmaxx + liftX / 2;
		unitLift.position.y = buildHeight / 2;
		unitLift.position.z = buildmaxz - (i - 1) * unitZ - unitZ / 2;
		unitLift.material.side = THREE.DoubleSide;
		unitLift.name = i + "单元";
		unitLift.type = UNIT;
		scene.add(unitLift);
	}

	// 楼顶小方块
	for (var i = 1; i <= unitNum; i++) {
		var geometry = new THREE.CubeGeometry(topCubeX, topCubeY, topCubeZ);
		var topCube = new THREE.Mesh(geometry, new THREE.MeshPhongMaterial({
			map : textureFloor,
			// color : 0xC3BED4,
			side : THREE.DoubleSide,
			shading : THREE.SmoothShading,
		}));
		topCube.position.x = 0;
		topCube.position.y = buildHeight + topCubeY / 2;
		topCube.position.z = buildmaxz - (i - 1) * unitX - unitX / 2;
		topCube.material.side = THREE.DoubleSide;
		topCube.name = i + "单元";
		scene.add(topCube);
	}

	/*
	 * var geometry1 = new THREE.BoxGeometry(200, 200, 200); var cube1 = new
	 * THREE.Mesh(geometry1, new THREE.MeshBasicMaterial({ color : 0xff0000,
	 * wireframe: true, })); cube1.position.y = 0; //cube1.material.side =
	 * THREE.DoubleSide; scene.add(cube1);
	 */

	/*
	 * var texture = new THREE.TextureLoader().load( 'src/textures/crate.gif' );
	 * var geometry = new THREE.BoxBufferGeometry( 200, 200, 200 ); var material =
	 * new THREE.MeshBasicMaterial( { map: texture } ); var mesh = new
	 * THREE.Mesh( geometry, material ); scene.add( mesh );
	 */

	// RENDERER
	if (Detector.webgl) {
		renderer = new THREE.WebGLRenderer({
			antialias : true
		});
	} else {
		renderer = new THREE.CanvasRenderer();
	}
	// renderer.setClearColor(0xD8E7FF);
	renderer.setClearColor(0x293f60);
	// renderer.setPixelRatio(window.devicePixelRatio);
	renderer.setSize(canvasWidth, canvasHeight);
	// renderer.autoClear = false;
	container.appendChild(renderer.domElement);

	// CONTROLS
	controls = new THREE.OrbitControls(camera, renderer.domElement);
	// controls.target.set(0, 1000, 0);
	// controls.update();
	// controls.pan(new THREE.Vector3(0, -20, 0));
	controls.addEventListener('change', render);
	controls.initPosition(0, 30, 0);
	// controls.pan(new THREE.Vector3(0, -100, 0));

	// STATS
	stats = new Stats();
	stats.domElement.style.position = 'absolute';
	stats.domElement.style.bottom = '0px';
	stats.domElement.style.zIndex = 100;
	container.appendChild(stats.domElement);

	// initialize object to perform world/screen calculations
	projector = new THREE.Projector();

	// 正面和侧面窗户
	// create a canvas element
	var canvasWindow = document.createElement('canvas');
	canvasWindow.width = 176;
	canvasWindow.height = 134;
	var cxtWindow = canvasWindow.getContext("2d");
	var imgWindow = new Image();
	imgWindow.src = "../photo/window001.jpg";
	if (imgWindow.complete) {
		cxtWindow.drawImage(imgWindow, 0, 0, 176, 134, 0, 0, 176, 134);
		drawWindows(canvasWindow);
	} else {
		imgWindow.onload = function() {
			cxtWindow.drawImage(imgWindow, 0, 0, 176, 134, 0, 0, 176, 134);
			drawWindows(canvasWindow);
		};
		imgWindow.onerror = function() {
			window.alert('窗户加载失败，请重试');
		};
	}

	// 楼栋背面窗户
	var canvasBack = document.createElement("canvas");
	canvasBack.width = 32;
	canvasBack.height = 23;
	var cxtBack = canvasBack.getContext("2d");
	var imgBack = new Image();
	imgBack.src = "../photo/window3.jpg";
	if (imgBack.complete) {
		cxtBack.drawImage(imgBack, 0, 0, 32, 23, 0, 0, 32, 23);
		drawBackWindows(canvasBack);
	} else {
		imgBack.onload = function() {
			cxtBack.drawImage(imgBack, 0, 0, 32, 23, 0, 0, 32, 23);
			drawBackWindows(canvasBack);
		}
		imgBack.onerror = function() {
			window.alert("窗户加载失败，请重试");
		}
	}

	// 单元门
	var canvasDoor = document.createElement('canvas');
	canvasDoor.width = 535;
	canvasDoor.height = 636;
	var cxtDoor = canvasDoor.getContext("2d");
	var imgDoor = new Image();
	imgDoor.src = "../photo/unit_door4.jpg";
	if (imgDoor.complete) {
		cxtDoor.drawImage(imgDoor, 0, 0, 535, 636, 0, 0, 535, 636);
		drawDoors(canvasDoor);
	} else {
		imgDoor.onload = function() {
			cxtDoor.drawImage(imgDoor, 0, 0, 535, 636, 0, 0, 535, 636);
			drawDoors(canvasDoor);
		};
		imgDoor.onerror = function() {
			window.alert('单元门加载失败，请重试');
		};
	}

	// 户型网格
	unit: for (var u = 1; u <= unitNum; u++) { // 单元
		var unit = new Object();
		unit.x = 0;
		unit.z = buildmaxz - (u - 1) * unitZ + unitZ / 2;
		unit.y = 0;
		unit.minx = -unitX / 2;
		unit.maxx = unitX / 2;
		unit.minz = buildmaxz - u * unitZ;
		unit.maxz = buildmaxz - (u - 1) * unitZ;
		row: for (var i = 1; i <= hxRow; i++) { // 行
			column: for (var j = 1; j <= hxColumn; j++) { // 列
				var geo = new THREE.PlaneGeometry(unitX / hxRow - 4, unitZ
						/ hxColumn - 4);
				var plane = new THREE.Mesh(geo, new THREE.MeshBasicMaterial({
					color : 0xD6D0CE,
				// color : 0xABD1DC,
				}));

				plane.rotation.x = -90 * Math.PI / 180;
				var x = unit.maxx - (i - 1) * evX - evX / 2;
				var z = unit.maxz - (j - 1) * evZ - evZ / 2;
				plane.position.set(x, 0, z);
				plane.outX = x + outPositionX;
				unitRoomIndex = (i - 1) * hxColumn + j;
				scene.add(plane);
				typeGrids.push(plane);

				if (unitRoomIndex > unitRoomNum) {
					continue column;
				}
				plane.name = u + "-10" + unitRoomIndex;

				// 户型文字标签
				// create a canvas element
				var canvas2 = document.createElement('canvas');
				canvas2.height = 30;
				canvas2.width = 130;
				var context2 = canvas2.getContext('2d');
				context2.font = "500 38px normal";
				context2.fillStyle = "rgba(0,0,0,0.95)";
				context2.fillText(plane.name, 0, 30);

				// canvas contents will be used for a texture
				var texture2 = new THREE.Texture(canvas2);
				texture2.needsUpdate = true;

				var material2 = new THREE.MeshBasicMaterial({
					map : texture2,
					// side : THREE.DoubleSide,
					color : 0xffffff,
				});
				material2.transparent = true;
				var textGeo = new THREE.PlaneGeometry(40, 15);
				var textPlane = new THREE.Mesh(textGeo, material2);
				textPlane.rotation.z = 90 * Math.PI / 180;
				textPlane.rotation.x = -90 * Math.PI / 180;
				textPlane.position.set(x, 0, z);
				textPlane.outX = x + outPositionX;
				textPlane.name = plane.name;
				textPlane.familyNumber = Math.ceil(Math.random() * 8); // 随机家庭成员数量
				var income = 1 + Math.random() * 4;
				textPlane.income = income.toFixed(1) + "";
				var cost = income * (0.2 + Math.random() * 0.4);
				textPlane.cost = cost.toFixed(1) + "";
				var orderNum = Math.floor(Math.random() * 6);
				textPlane.orderNum = orderNum + "";
				var orderbook = Math.random() * 0.2 * cost;
				orderbook = orderbook > 0 ? orderbook.toFixed(1) : 0;
				textPlane.orderbook = orderbook + "";
				textPlane.context = context2;
				textPlane.texture = texture2;
				scene.add(textPlane);
				houseTypes.push(textPlane);
			}
		}
	}

	// create a canvas element
	canvas1 = document.createElement('canvas');
	context1 = canvas1.getContext('2d');
	context1.font = "Bold 20px Arial";
	context1.fillStyle = "rgba(0,0,0,0.95)";
	context1.fillText('Hello, world!', 0, 20);

	// canvas contents will be used for a texture
	texture1 = new THREE.Texture(canvas1);
	texture1.needsUpdate = true;

	// //////////////////////////////////////
	var spriteMaterial = new THREE.SpriteMaterial({
		map : texture1,
		useScreenCoordinates : true,
		alignment : THREE.SpriteAlignment.topLeft
	});

	sprite1 = new THREE.Sprite(spriteMaterial);
	sprite1.scale.set(200, 100, 1.0);
	sprite1.position.set(50, 50, 0);
	scene.add(sprite1);

	/*
	 * var light = new THREE.Color(0xffffff); var shadow = new
	 * THREE.Color(0x303050);
	 */

	// when the mouse moves, call the given function
	document.addEventListener('mousemove', onDocumentMouseMove, false);
	document.addEventListener('mousedown', onDocumentMouseDown, false);
	window.addEventListener('resize', onWindowResize, false);
	// document.addEventListener('touchstart', onDocumentTouchStart, false);
}

// 绘制窗口
function drawWindows(canvasWindow) {
	// canvas contents will be used for a texture
	var textureWindow = new THREE.Texture(canvasWindow);
	textureWindow.needsUpdate = true;

	var materialWindow = new THREE.MeshBasicMaterial({
		map : textureWindow,
		// side : THREE.DoubleSide,
		color : 0xffffff,
	});
	materialWindow.transparent = true;
	for (var f = 1; f <= totalFloor; f++) {
		for (var u = 1; u <= unitNum; u++) {
			var imgGeo = new THREE.PlaneGeometry(24, 20);
			var imgPlane = new THREE.Mesh(imgGeo, materialWindow);
			imgPlane.rotation.y = Math.PI / 2;
			/*
			 * imgPlane.rotation.z = 90 * Math.PI / 180; imgPlane.rotation.x =
			 * -90 * Math.PI / 180;
			 */
			var x = buildmaxx + liftX + 1;
			var y = (f - 1) * (floorHeight + floorBet) + floorHeight / 2;
			var z = buildmaxz - (u - 1) * unitZ - unitZ / 2;
			imgPlane.position.set(x, y, z);
			if (f != 1) {
				scene.add(imgPlane);
			}
			// x轴正方向left(电梯间左侧窗户)
			var imgLeft = new THREE.PlaneGeometry(24, 20);
			var imgPlaneLeft = new THREE.Mesh(imgLeft, materialWindow);
			x = buildmaxx + 1;
			z = buildmaxz - (u - 1) * unitZ - unitZ / 2 + dis;
			imgPlaneLeft.position.set(x, y, z);
			imgPlaneLeft.rotation.y = Math.PI / 2;
			scene.add(imgPlaneLeft);
			// x轴正方向right(电梯间右侧窗户)
			var imgRight = new THREE.PlaneGeometry(24, 20);
			var imgPlaneRight = new THREE.Mesh(imgRight, materialWindow);
			x = buildmaxx + 1;
			z = buildmaxz - (u - 1) * unitZ - unitZ / 2 - dis;
			imgPlaneRight.position.set(x, y, z);
			imgPlaneRight.rotation.y = Math.PI / 2;
			scene.add(imgPlaneRight);
		}
	}

	// 楼栋侧面窗户
	for (var f = 1; f <= totalFloor; f++) {
		// 楼栋左侧left(楼栋左侧窗户)
		var imgLeft = new THREE.PlaneGeometry(24, 20);
		var imgPlaneLeft = new THREE.Mesh(imgLeft, materialWindow);
		var x = 0;
		var y = (f - 1) * (floorHeight + floorBet) + floorHeight / 2;
		var z = buildmaxz + 1;
		imgPlaneLeft.position.set(x, y, z);
		// imgPlaneLeft.rotation.z = -Math.PI / 2;
		scene.add(imgPlaneLeft);
		// 楼栋右侧right(楼栋右侧窗户)
		var imgRight = new THREE.PlaneGeometry(24, 20);
		var imgPlaneRight = new THREE.Mesh(imgRight, materialWindow);
		z = buildminz - 1;
		imgPlaneRight.position.set(x, y, z);
		imgPlaneRight.rotation.x = Math.PI;
		scene.add(imgPlaneRight);
	}
}

// 楼栋背面窗户
function drawBackWindows(canvasBack) {
	var textureBack = new THREE.Texture(canvasBack);
	textureBack.needsUpdate = true;

	var materialBack = new THREE.MeshBasicMaterial({
		map : textureBack,
		// side : THREE.DoubleSide,
		color : 0xffffff,
	});
	materialBack.transparent = true;
	var backWindowNum = 2 * unitNum;
	var backWindowDis = cubeZ / backWindowNum;
	for (var f = 1; f <= totalFloor; f++) {
		for (var w = 1; w <= backWindowNum; w++) {
			var imgbBack = new THREE.PlaneGeometry(35, 25);
			var imgPlaneBack = new THREE.Mesh(imgbBack, materialBack);
			x = buildminx - 1;
			y = (f - 1) * (floorHeight + floorBet) + floorHeight / 2;
			z = buildmaxz - (w - 1) * backWindowDis - backWindowDis / 2;
			imgPlaneBack.position.set(x, y, z);
			imgPlaneBack.rotation.y = -Math.PI / 2;
			scene.add(imgPlaneBack);
		}
	}
}

// 绘制单元门
function drawDoors(canvasDoor) {
	var textureDoor = new THREE.Texture(canvasDoor);
	textureDoor.needsUpdate = true;

	var materialDoor = new THREE.MeshBasicMaterial({
		map : textureDoor,
		color : 0xffffff,
	});
	for (var u = 1; u <= unitNum; u++) {
		var imgDoor = new THREE.PlaneGeometry(25, 25);
		var imgPlaneDoor = new THREE.Mesh(imgDoor, materialDoor);
		imgPlaneDoor.rotation.y = Math.PI / 2;
		var x = buildmaxx + liftX + 1;
		var y = floorHeight / 2 - 2;
		var z = buildmaxz - (u - 1) * unitZ - unitZ / 2;
		imgPlaneDoor.position.set(x, y, z);
		imgPlaneDoor.rotation.y = Math.PI / 2;
		scene.add(imgPlaneDoor);

		// 单元牌
		// create a canvas element
		var unitName = getUnitName(u);
		var canvas2 = document.createElement('canvas');
		canvas2.height = 15;
		canvas2.width = 30;
		var context2 = canvas2.getContext('2d');
		context2.font = "bold 500 30px normal";
		context2.fillStyle = "rgba(0,0,0,1)";
		context2.fillText(unitName, 0, 10);

		// canvas contents will be used for a texture
		var texture2 = new THREE.Texture(canvas2);
		texture2.needsUpdate = true;

		var material2 = new THREE.MeshBasicMaterial({
			map : texture2,
			// side : THREE.DoubleSide,
			color : 0xffffff,
		});
		material2.transparent = true;
		var textGeo = new THREE.PlaneGeometry(30, 15);
		var textPlane = new THREE.Mesh(textGeo, material2);
		textPlane.rotation.y = Math.PI / 2;
		y = floorHeight + floorBet / 2;
		textPlane.position.set(x, y, z);
		scene.add(textPlane);
	}
}

// 场景随窗口大小动态变化
function onWindowResize() {
	canvasWidth = window.innerWidth * widthPercent; // 场景宽度
	canvasHeight = window.innerHeight * heightPercent; // 场景高度
	camera.aspect = canvasWidth / canvasHeight;
	camera.updateProjectionMatrix();
	renderer.setSize(canvasWidth, canvasHeight);
}

function onDocumentMouseMove(event) {
	// the following line would stop any other event handler from firing
	// (such as the mouse's TrackballControls)
	// event.preventDefault();

	// update sprite position
	// sprite1.position.set(500, 100, 100);
	sprite1.position.set(event.clientX, event.clientY - 20, 100);
	/*
	 * console.error('THREE.WebGLRenderer', 'event.clientX:' + event.clientX + '
	 * event.clientY:' + event.clientY);
	 */
	// update the mouse variable
	// sprite1.position.set(event.clientX-windowHalfX,event.clientY-windowHalfY,0);
	mouse.x = (event.clientX / canvasWidth) * 2 - 1;
	mouse.y = -(event.clientY / canvasHeight) * 2 + 1;
	// sprite1.position.set(mouse.x,mouse.y,0);
}

function onDocumentTouchStart(event) {
	event.preventDefault();
	event.clientX = event.touches[0].clientX;
	event.clientY = event.touches[0].clientY;
	onDocumentMouseDown(event);
}

function onDocumentMouseDown(event) {
	// the following line would stop any other event handler from firing
	// (such as the mouse's TrackballControls)
	event.preventDefault();

	console.log("Click.");

	// update the mouse variable
	/*
	 * mouse.x = (event.clientX / window.innerWidth) * 2 - 1; mouse.y =
	 * -(event.clientY / window.innerHeight) * 2 + 1;
	 */

	// find intersections
	// create a Ray with origin at the mouse position
	// and direction into the scene (camera direction)
	var vector = new THREE.Vector3(mouse.x, mouse.y, 1);
	projector.unprojectVector(vector, camera);
	var ray = new THREE.Raycaster(camera.position, vector.sub(camera.position)
			.normalize());

	// create an array containing all objects in the scene with which the ray
	// intersects
	var intersects = ray.intersectObjects(scene.children);

	// if there is one (or more) intersections
	if (intersects.length > 0) {
		console.log("Hit @ " + toString(intersects[0].point));
		// change the color of the closest face.
		intersects[0].face.color.setRGB(0.8 * Math.random() + 0.2, 0, 0);
		intersects[0].object.geometry.colorsNeedUpdate = true;
		var object = intersects[0].object;
		var name = object.name;
		var type = object.type;
		if (type == null) {
			if (name != '' && name != 'undefined' && name != null) {
				setHouseTypePhoto(name);
			}
		} else if (type == FLOOR) { // 点击的是楼层

			if (currentOutFloor != null) {
				if (currentOutFloor.id == object.id) {
					/*
					 * floorBack(currentOutFloor); currentOutFloor = null;
					 */
				} else {
					floorBack(currentOutFloor, object);
					currentOutFloor = object;
					floorOut(object);
				}
			} else {
				currentOutFloor = object;
				floorOut(object);
			}

			currentOutFloor = object;
		} else if (type == CHART) { // 点击的是柱状图
			familyInfoShow(object);
		}
	}
}

// 楼层弹出
function floorOut(floor) {
	var now = new Date();
	floor.startMoveTime = now; // 楼层开始弹出时间
	new TWEEN.Tween(floor.position).to({
		x : outPositionX,
		y : floor.position.y,
		z : floor.position.z
	}, 1000).easing(TWEEN.Easing.Exponential.InOut).start().onComplete(
			function() {
				zhuShow(floor);
				incomeShow(floor);
				costShow(floor);
				orderNumShow(floor);
				orderbookShow(floor);
			});
	houseTypeMove();
	alphaCubeShow(floor);
}

// 楼层回位
function floorBack(floor, object) {
	new TWEEN.Tween(floor.position).to({
		x : 0,
		y : floor.position.y,
		z : floor.position.z
	}, 1000).easing(TWEEN.Easing.Exponential.InOut).start();
	if (object == null) {
		currentOutFloor = null;
		houseTypeBack();
	}
	zhuDisappear(zhus, text3Ds, 'people');
	zhuDisappear(incomeZhu, incomeText, 'income');
	zhuDisappear(costZhu, costText, 'cost');
	zhuDisappear(orderNumZhu, orderNumText, 'orderNum');
	zhuDisappear(orderbookZhu, orderbookText, 'orderbook');
}

var alphaCube; // 当前透明楼层
// 楼层弹出后在原处放置一透明楼层，避免窗户悬空
function alphaCubeShow(floor) {
	if (alphaCube != null) {
		scene.remove(alphaCube);
	}
	var geometry = new THREE.CubeGeometry(cubeX, floorHeight, cubeZ);
	alphaCube = new THREE.Mesh(geometry, new THREE.MeshPhongMaterial({
		map : textureFloor,
		side : THREE.DoubleSide,
		opacity : 0.3,
		transparent : true,
		shading : THREE.SmoothShading,
	}));
	alphaCube.position.set(0, floor.position.y, 0);
	alphaCube.material.side = THREE.DoubleSide;
	// alphaCube.name = i + "层";
	// alphaCube.type = FLOOR;
	scene.add(alphaCube);
}

// 删除透明楼层
function alphaCubeHide() {
	if (alphaCube != null) {
		scene.remove(alphaCube);
	}
}

// 户型网格移动
function houseTypeMove() {
	/*
	 * var offsetX = 0; if (houseTypes[0].position.x > (cubeX / 2 + 100)) {
	 * //弹出的状态 flag = true; }
	 */

	for (index in typeGrids) {
		/*
		 * if (flag) { //户型网格有位移则X坐标值不再增加 offsetX = typeGrids[index].position.x; }
		 * else { offsetX = typeGrids[index].position.x + cubeX + 100; }
		 */
		new TWEEN.Tween(typeGrids[index].position).to({
			x : typeGrids[index].outX,
			y : currentOutFloor.position.y + floorHeight / 2 + 1,
			z : typeGrids[index].position.z
		}, 1000).easing(TWEEN.Easing.Exponential.InOut).start();
	}
	for (index in houseTypes) {
		new TWEEN.Tween(houseTypes[index].position).to({
			x : houseTypes[index].outX,
			y : currentOutFloor.position.y + floorHeight / 2 + 2,
			z : houseTypes[index].position.z
		}, 1000).easing(TWEEN.Easing.Exponential.InOut).start();
	}
	houseTypeTextChange();
}

// 户型网格回位
function houseTypeBack() {
	for (index in houseTypes) {
		new TWEEN.Tween(houseTypes[index].position).to({
			x : typeGrids[index].outX - outPositionX,
			// y : totalFloor * (floorHeight + floorBet) + 2,
			y : 0,
			z : houseTypes[index].position.z
		}, 1000).easing(TWEEN.Easing.Exponential.InOut).start();
	}

	for (index in typeGrids) {
		new TWEEN.Tween(typeGrids[index].position).to({
			x : typeGrids[index].outX - outPositionX,
			// y : totalFloor * (floorHeight + floorBet) + 1,
			y : 0,
			z : typeGrids[index].position.z
		}, 1000).easing(TWEEN.Easing.Exponential.InOut).start();
	}

	houseTypeTextChange();
}

// 户型文字标签随楼层更改
function houseTypeTextChange() {
	var floor = "1";
	if (currentOutFloor != null) {
		floor = currentOutFloor.name.substring(0,
				currentOutFloor.name.length - 1);
		flag = true;
	} else {
		flag = false;
	}
	for (index in houseTypes) {
		var nam = houseTypes[index].name;
		houseTypes[index].name = nam.substring(0, 2) + floor
				+ nam.substring(nam.length - 2);
		houseTypes[index].context.clearRect(0, 0, 300, 300);
		houseTypes[index].context.fillText(houseTypes[index].name, 0, 30);
		houseTypes[index].texture.needsUpdate = true;
	}
	for (index in typeGrids) {
		var nam = typeGrids[index].name;
		if (nam == '' || nam == null || nam == undefined) {
			break;
		}
		typeGrids[index].name = nam.substring(0, 2) + floor
				+ nam.substring(nam.length - 2);
	}
}

// 添加柱状图
function zhuShow(floor) {
	if (zhuEnable == false) {
		return;
	}
	if (currentOutFloor == null)
		return;
	if (currentOutFloor.name != floor.name) { // 快速切换楼层时避免多次加载
		return;
	}
	var now = new Date();
	if ((now.getTime() - floor.startMoveTime.getTime()) < 1000) { // 快速切换楼层时避免柱形图多次加载
		return;
	}
	if (zhus.length == 0) {
		for (index in houseTypes) {
			var ht = houseTypes[index];
			var geometry = new THREE.CubeGeometry(zwidth, zOriginalHeight,
					zwidth);
			var cube = new THREE.Mesh(geometry, new THREE.MeshPhongMaterial({
				color : peopleColor,
				opacity : 0.5,
				transparent : true,
			// side : THREE.DoubleSide,
			}));
			cube.position.set(ht.position.x - (evX / 2 - zwidth / 2) + zwidth
					/ 2, ht.position.y + zOriginalHeight / 2, ht.position.z
					- (evZ / 2 - zwidth / 2) + zwidth / 2);
			cube.material.side = THREE.DoubleSide;
			cube.name = ht.familyNumber;
			cube.familyNumber = ht.familyNumber;
			cube.type = CHART;
			cube.zhuType = 'people';
			cube.roomName = ht.name; // 房间号
			cube.value = ht.familyNumber;
			scene.add(cube);
			zhus.push(cube);
		}
	} else {
		for (index in zhus) {
			var zhu = zhus[index];
			zhu.position.set(zhu.position.x, currentOutFloor.position.y
					+ floorHeight / 2 + 2, zhu.position.z);
		}
	}
	zhuMove(floor, zhus, 'people');
}

// 柱状图移动,动画
function zhuMove(floor, zhus, type) {
	for (index in zhus) {
		var offSetY = zhus[index].position.y - zOriginalHeight / 2
				+ (zhus[index].value * zOriginalHeight) / 2;
		var scaleTween = new TWEEN.Tween(zhus[index].scale);
		scaleTween.to({
			x : 1,
			y : zhus[index].value == 0 ? 0.01 : zhus[index].value,
			z : 1
		}, 1000).easing(TWEEN.Easing.Exponential.InOut).start();
		zhus[index].scaleTween = scaleTween;
		var positionTween = new TWEEN.Tween(zhus[index].position);
		positionTween.to({
			x : zhus[index].position.x,
			y : offSetY,
			z : zhus[index].position.z,
		}, 1000).easing(TWEEN.Easing.Exponential.InOut).start();
		zhus[index].positionTween = positionTween;
	}
	setTimeout(function() {
		text3DShow(floor, type);
	}, 1000);
}

// 柱状图消失
function zhuDisappear(paramZhus, text3D, type) {
	for (var i = 0; i < paramZhus.length; i++) {
		new TWEEN.Tween(paramZhus[i].scale).to({
			x : 1,
			y : 0.01,
			z : 1
		}, 500).easing(TWEEN.Easing.Exponential.InOut).start();
	}
	setTimeout(function() {
		removeAllZhu(paramZhus, type);
	}, 500);
	text3DDisappear(text3D, type);
}

// 删除所有柱状图
function removeAllZhu(paramZhus, type) {
	for (var i = 0; i < paramZhus.length; i++) {
		scene.remove(paramZhus[i]);
	}
	if (type == 'all') {
		zhus = [];
		incomeZhu = [];
		costZhu = [];
		orderNumZhu = [];
		orderbookZhu = [];
	} else if (type == 'people') {
		zhus = [];
	} else if (type == 'income') {
		incomeZhu = [];
	} else if (type == 'cost') {
		costZhu = [];
	} else if (type == 'orderNum') {
		orderNumZhu = [];
	} else if (type == 'orderbook') {
		orderbookZhu = [];
	}
	if (currentOutFloor != null) { // checkBox快速切换Bug
		if (zhuEnable == true && type == 'people') {
			zhuShow(currentOutFloor);
		}
		if (incomeEnable == true && type == 'income') {
			incomeShow(currentOutFloor);
		}
		if (costEnable == true && type == 'cost') {
			costShow(currentOutFloor);
		}
		if (orderNumEnable == true && type == 'orderNum') {
			orderNumShow(currentOutFloor);
		}
		if (orderbookEnable == true && type == 'orderbook') {
			orderbookShow(currentOutFloor);
		}
	}
}

// 显示收入
function incomeShow(floor) {
	if (incomeEnable == false) {
		return;
	}
	if (currentOutFloor == null)
		return;
	if (currentOutFloor.name != floor.name) { // 快速切换楼层时避免多次加载
		return;
	}
	var now = new Date();
	if ((now.getTime() - floor.startMoveTime.getTime()) < 1000) { // 快速切换楼层时避免柱形图多次加载
		return;
	}
	if (incomeZhu.length == 0) {
		for (index in houseTypes) {
			var ht = houseTypes[index];
			var geometry = new THREE.CubeGeometry(zwidth, zOriginalHeight,
					zwidth);
			var cube = new THREE.Mesh(geometry, new THREE.MeshPhongMaterial({
				color : incomeColor,
				opacity : 0.5,
				transparent : true,
			}));
			cube.position.set(ht.position.x - (evX / 2 - zwidth / 2) + zwidth
					/ 2, ht.position.y + zOriginalHeight / 2, ht.position.z
					- (evZ / 2 - zwidth) + zwidth + 4);
			cube.material.side = THREE.DoubleSide;
			cube.name = ht.income;
			cube.familyNumber = ht.familyNumber;
			cube.type = CHART;
			cube.zhuType = 'income';
			cube.roomName = ht.name; // 房间号
			cube.value = ht.income;
			scene.add(cube);
			incomeZhu.push(cube);
		}
	} else {
		for (index in incomeZhu) {
			var zhu = incomeZhu[index];
			zhu.position.set(zhu.position.x, currentOutFloor.position.y
					+ floorHeight / 2 + 2, zhu.position.z);
		}
	}
	zhuMove(floor, incomeZhu, 'income');

}

// 隐藏收入
function incomeHide() {
	zhuDisappear(incomeZhu, incomeText, 'income');
}

// 显示支出
function costShow(floor) {
	if (costEnable == false) {
		return;
	}
	if (currentOutFloor == null)
		return;
	if (currentOutFloor.name != floor.name) { // 快速切换楼层时避免多次加载
		return;
	}
	var now = new Date();
	if ((now.getTime() - floor.startMoveTime.getTime()) < 1000) { // 快速切换楼层时避免柱形图多次加载
		return;
	}
	if (costZhu.length == 0) {
		for (index in houseTypes) {
			var ht = houseTypes[index];
			var geometry = new THREE.CubeGeometry(zwidth, zOriginalHeight,
					zwidth);
			var cube = new THREE.Mesh(geometry, new THREE.MeshPhongMaterial({
				color : costColor,
				opacity : 0.5,
				transparent : true,
			}));
			cube.position.set(ht.position.x - (evX / 2 - zwidth / 2) + zwidth
					/ 2, ht.position.y + zOriginalHeight / 2, ht.position.z
					- (evZ / 2 - zwidth) + (zwidth + 4) * 2);
			cube.material.side = THREE.DoubleSide;
			cube.name = ht.cost;
			cube.type = CHART;
			cube.familyNumber = ht.familyNumber;
			cube.zhuType = 'cost';
			cube.roomName = ht.name; // 房间号
			cube.value = ht.cost;
			scene.add(cube);
			costZhu.push(cube);
		}
	} else {
		for (index in costZhu) {
			var zhu = costZhu[index];
			zhu.position.set(zhu.position.x, currentOutFloor.position.y
					+ floorHeight / 2 + 2, zhu.position.z);
		}
	}
	zhuMove(floor, costZhu, 'cost');
}

// 隐藏支出
function costHide() {
	zhuDisappear(costZhu, costText, 'cost');
}

// 显示订单量
function orderNumShow(floor) {
	if (orderNumEnable == false) {
		return;
	}
	if (currentOutFloor == null)
		return;
	if (currentOutFloor.name != floor.name) { // 快速切换楼层时避免多次加载
		return;
	}
	var now = new Date();
	if ((now.getTime() - floor.startMoveTime.getTime()) < 1000) { // 快速切换楼层时避免柱形图多次加载
		return;
	}
	if (orderNumZhu.length == 0) {
		for (index in houseTypes) {
			var ht = houseTypes[index];
			var geometry = new THREE.CubeGeometry(zwidth, zOriginalHeight,
					zwidth);
			var cube = new THREE.Mesh(geometry, new THREE.MeshPhongMaterial({
				color : orderNumColor,
				opacity : 0.5,
				transparent : true,
			}));
			cube.position.set(ht.position.x - (evX / 2 - zwidth / 2) + zwidth
					/ 2, ht.position.y + zOriginalHeight / 2, ht.position.z
					- (evZ / 2 - zwidth) + (zwidth + 4) * 3);
			cube.material.side = THREE.DoubleSide;
			cube.name = ht.orderNum;
			cube.familyNumber = ht.familyNumber;
			cube.type = CHART;
			cube.zhuType = 'orderNum';
			cube.roomName = ht.name; // 房间号
			cube.value = ht.orderNum;
			scene.add(cube);
			orderNumZhu.push(cube);
		}
	} else {
		for (index in orderNumZhu) {
			var zhu = orderNumZhu[index];
			zhu.position.set(zhu.position.x, currentOutFloor.position.y
					+ floorHeight / 2 + 2, zhu.position.z);
		}
	}
	zhuMove(floor, orderNumZhu, 'orderNum');
}

// 隐藏订单量
function orderNumHide() {
	zhuDisappear(orderNumZhu, orderNumText, 'orderNum');
}

// 显示订单金额
function orderbookShow(floor) {
	if (orderbookEnable == false) {
		return;
	}
	if (currentOutFloor == null)
		return;
	if (currentOutFloor.name != floor.name) { // 快速切换楼层时避免多次加载
		return;
	}
	var now = new Date();
	if ((now.getTime() - floor.startMoveTime.getTime()) < 1000) { // 快速切换楼层时避免柱形图多次加载
		return;
	}
	if (orderbookZhu.length == 0) {
		for (index in houseTypes) {
			var ht = houseTypes[index];
			var geometry = new THREE.CubeGeometry(zwidth, zOriginalHeight,
					zwidth);
			var cube = new THREE.Mesh(geometry, new THREE.MeshPhongMaterial({
				color : orderbookColor,
				opacity : 0.5,
				transparent : true,
			}));
			cube.position.set(ht.position.x - (evX / 2 - zwidth / 2) + zwidth
					/ 2, ht.position.y + zOriginalHeight / 2, ht.position.z
					- (evZ / 2 - zwidth) + (zwidth + 4) * 4);
			cube.material.side = THREE.DoubleSide;
			cube.name = ht.orderbook;
			cube.familyNumber = ht.familyNumber;
			cube.type = CHART;
			cube.zhuType = 'orderbook';
			cube.roomName = ht.name; // 房间号
			cube.value = ht.orderbook;
			scene.add(cube);
			orderbookZhu.push(cube);
		}
	} else {
		for (index in orderbookZhu) {
			var zhu = orderbookZhu[index];
			zhu.position.set(zhu.position.x, currentOutFloor.position.y
					+ floorHeight / 2 + 2, zhu.position.z);
		}
	}
	zhuMove(floor, orderbookZhu, 'orderbook');
}

// 隐藏订单金额
function orderbookHide() {
	zhuDisappear(orderbookZhu, orderbookText, 'orderbook');
}

// 2D文字渲染
function text2DShow() {
	for (index in zhus) {
		var textOffY = zhus[index].position.y
				+ (zhus[index].familyNumber * zOriginalHeight) / 2;
		var canvas2 = document.createElement('canvas');
		canvas2.height = 30;
		canvas2.width = 30;
		var context2 = canvas2.getContext('2d');
		context2.font = "500 38px normal";
		context2.fillStyle = "rgba(255,82,42,0.95)";
		context2.fillText(zhus[index].familyNumber, 0, 30);

		// canvas contents will be used for a texture
		var texture2 = new THREE.Texture(canvas2);
		texture2.needsUpdate = true;

		var material2 = new THREE.MeshBasicMaterial({
			map : texture2,
			// side : THREE.DoubleSide,
			color : 0xffffff,
		});
		material2.transparent = true;
		var textGeo = new THREE.PlaneGeometry(40, 15);
		var textPlane = new THREE.Mesh(textGeo, material2);
		// textPlane.rotation.x = -90 * Math.PI / 180;
		textPlane.position.set(zhus[index].position.x, textOffY,
				zhus[index].position.z);
		textPlane.context = context2;
		textPlane.texture = texture2;
		scene.add(textPlane);
	}
}

// 一次显示一个数字
function textSingleShow(floor, zhu, type) {
	if (type == 'people' && zhuEnable == false) {
		return;
	} else if (type == 'income' && incomeEnable == false) {
		return;
	} else if (type == 'cost' && costEnable == false) {
		return;
	} else if (type == 'orderNum' && orderNumEnable == false) {
		return;
	} else if (type == 'orderbook' && orderbookEnable == false) {
		return;
	}
	if (currentOutFloor.name != floor.name) // 快速切换楼层时避免多次加载
		return;

	var textOffY = zhu.position.y + (zhu.value * zOriginalHeight) / 2 + 2;
	var materialFront = new THREE.MeshBasicMaterial({
		// color : 0xff0000
		color : 0xffffff,
	});
	var materialSide = new THREE.MeshBasicMaterial({
		color : 0x000088
	});
	var materialArray = [ materialFront, materialSide ];
	var textGeom = new THREE.TextGeometry(zhu.value, {
		size : fontSize3D,
		height : 1,
		curveSegments : 1,
		font : "helvetiker",
		weight : "bold",
		style : "normal",
		bevelThickness : 1,
		bevelSize : 1,
		bevelEnabled : true,
		material : 0,
		extrudeMaterial : 1
	});
	// font: helvetiker, gentilis, droid sans, droid serif, optimer
	// weight: normal, bold

	var textMaterial = new THREE.MeshFaceMaterial(materialArray);
	var textMesh = new THREE.Mesh(textGeom, textMaterial);

	textGeom.computeBoundingBox();
	var textWidth = textGeom.boundingBox.max.x - textGeom.boundingBox.min.x;

	var z = zhu.position.z + textWidth / 2;
	textMesh.position.set(zhu.position.x, textOffY, z);

	textMesh.rotation.y = Math.PI / 2;
	textMesh.contentType = "text3D";
	scene.add(textMesh);
	if (type == 'people') {
		text3Ds.push(textMesh);
	} else if (type == 'income') {
		incomeText.push(textMesh);
	} else if (type == 'cost') {
		costText.push(textMesh);
	} else if (type == 'orderNum') {
		orderNumText.push(textMesh);
	} else if (type == 'orderbook') {
		orderbookText.push(textMesh);
	}
}

// 3D文字(整个楼层)
function text3DShow(floor, type) {
	var paramZhu = null;
	var paramText = null;
	if (type == 'people' && zhuEnable == false) {
		return;
	} else if (type == 'income' && incomeEnable == false) {
		return;
	} else if (type == 'cost' && costEnable == false) {
		return;
	} else if (type == 'orderNum' && orderNumEnable == false) {
		return;
	} else if (type == 'orderbook' && orderbookEnable == false) {
		return;
	}
	if (currentOutFloor.name != floor.name) // 快速切换楼层时避免多次加载
		return;

	if (type == 'people') {
		paramZhu = zhus;
		paramText = text3Ds;
	} else if (type == 'income') {
		paramZhu = incomeZhu;
		paramText = incomeText;
	} else if (type == 'cost') {
		paramZhu = costZhu;
		paramText = costText;
	} else if (type == 'orderNum') {
		paramZhu = orderNumZhu;
		paramText = orderNumText;
	} else if (type == 'orderbook') {
		paramZhu = orderbookZhu;
		paramText = orderbookText;
	}
	// 添加文字前先清除已经存在的文字
	if (paramText.length > 0) {
		for (var i = 0; i < paramText.length; i++) {
			scene.remove(paramText[i]);
		}
	}
	// add 3D text
	for (index in paramZhu) {
		var textOffY = paramZhu[index].position.y
				+ (paramZhu[index].value * zOriginalHeight) / 2 + 2;
		var materialFront = new THREE.MeshBasicMaterial({
			// color : 0xff0000
			color : 0xffffff,
		});
		var materialSide = new THREE.MeshBasicMaterial({
			color : 0x000088
		});
		var materialArray = [ materialFront, materialSide ];
		var textGeom = new THREE.TextGeometry(paramZhu[index].value, {
			size : fontSize3D,
			height : 1,
			curveSegments : 1,
			font : "helvetiker",
			weight : "bold",
			style : "normal",
			bevelThickness : 1,
			bevelSize : 1,
			bevelEnabled : true,
			material : 0,
			extrudeMaterial : 1
		});
		// font: helvetiker, gentilis, droid sans, droid serif, optimer
		// weight: normal, bold

		var textMaterial = new THREE.MeshFaceMaterial(materialArray);
		var textMesh = new THREE.Mesh(textGeom, textMaterial);

		textGeom.computeBoundingBox();
		var textWidth = textGeom.boundingBox.max.x - textGeom.boundingBox.min.x;

		var z = paramZhu[index].position.z + textWidth / 2;
		textMesh.position.set(paramZhu[index].position.x, textOffY, z);

		textMesh.rotation.y = Math.PI / 2;
		textMesh.contentType = "text3D";
		scene.add(textMesh);
		if (type == 'people') {
			text3Ds.push(textMesh);
		} else if (type == 'income') {
			incomeText.push(textMesh);
		} else if (type == 'cost') {
			costText.push(textMesh);
		} else if (type == 'orderNum') {
			orderNumText.push(textMesh);
		} else if (type == 'orderbook') {
			orderbookText.push(textMesh);
		}
	}
}

// 3D文字消失
function text3DDisappear(text3D, type) {
	for (index in text3D) {
		scene.remove(text3D[index]);
	}
	if (type == 'people') {
		text3Ds = [];
	} else if (type == 'income') {
		incomeText = [];
	} else if (type == 'cost') {
		costText = [];
	} else if (type == 'orderNum') {
		orderNumText = [];
	} else if (type == 'orderbook') {
		orderbookText = [];
	}
}

//
function animate() {
	requestAnimationFrame(animate);
	/*
	 * stats.begin(); render(); stats.end();
	 */
	// controls.update();
	render();
	update();
}

function update() {

	// create a Ray with origin at the mouse position
	// and direction into the scene (camera direction)
	var vector = new THREE.Vector3(mouse.x, mouse.y, 1);
	projector.unprojectVector(vector, camera);
	var ray = new THREE.Raycaster(camera.position, vector.sub(camera.position)
			.normalize());

	// create an array containing all objects in the scene with which the ray
	// intersects
	var intersects = ray.intersectObjects(scene.children);

	// INTERSECTED = the object in the scene currently closest to the camera
	// and intersected by the Ray projected from the mouse position

	// if there is one (or more) intersections
	if (intersects.length > 0) {
		if (intersects[0].object.contentType == 'text3D')
			return;
		// if the closest object intersected is not the currently stored
		// intersection object
		if (intersects[0].object != INTERSECTED) {
			// restore previous intersection object (if it exists) to its
			// original color
			if (INTERSECTED) {
				INTERSECTED.material.color.setHex(INTERSECTED.currentHex);
			}
			// store reference to closest object as current intersection object
			INTERSECTED = intersects[0].object;
			// store color of closest object (for later restoration)
			INTERSECTED.currentHex = INTERSECTED.material.color.getHex();
			// set a new color for closest object
			if (intersects[0].object.type != GROUND) {
				INTERSECTED.material.color.setHex(0x80B3FF);
			}

			// update text, if it has a "name" field.
			if (intersects[0].object.name) {
				context1.clearRect(0, 0, 640, 480);
				var message = intersects[0].object.name;
				var metrics = context1.measureText(message);
				var width = metrics.width;
				context1.fillStyle = "rgba(0,0,0,0.95)"; // black border
				context1.fillRect(0, 0, width + 8, 20 + 8);
				context1.fillStyle = "rgba(255,255,255,0.95)"; // white filler
				context1.fillRect(2, 2, width + 4, 20 + 4);
				context1.fillStyle = "rgba(0,0,0,1)"; // text color
				context1.fillText(message, 4, 20);
				texture1.needsUpdate = true;
			} else {
				context1.clearRect(0, 0, 300, 300);
				texture1.needsUpdate = true;
			}
		}
	} else // there are no intersections
	{
		// restore previous intersection object (if it exists) to its original
		// color
		if (INTERSECTED)
			INTERSECTED.material.color.setHex(INTERSECTED.currentHex);
		// remove previous intersection object reference
		// by setting current intersection object to "nothing"
		INTERSECTED = null;
		context1.clearRect(0, 0, 300, 300);
		texture1.needsUpdate = true;
	}

	controls.update();
	stats.update();

}

function render() {
	// plane.rotation.y = cube.rotation.y += (targetRotation - cube.rotation.y)
	// * 0.05;
	TWEEN.update(); // 动画更新
	renderer.clear();
	renderer.render(scene, camera);
}