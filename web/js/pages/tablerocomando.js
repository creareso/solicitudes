$(document).ready(function() {
	pageSetUp();
	
	
});

function pageSetUp(){
	
	var Pendientes = document.getElementById("Pendientes");
	var p5 = (1 / 25) * 100;
	Pendientes.style = 'width:' + p5 + '%';
	Pendientes.innerHTML = p5 + "%";
	
	var Atendidos = document.getElementById("Atendidos");
	var p4 = (10 / 25) * 100;
	Atendidos.style = 'width:' + p4 + '%';
	Atendidos.innerHTML = p4 + "%";
	
	var Usuarios = document.getElementById("Usuarios");
	var p3 = (3 / 5) * 100;
	Usuarios.style = 'width:' + p3 + '%';
	Usuarios.innerHTML = p3 + "%";
	
	var dcalve = document.getElementById("dcalve");
	var p2 = (4 / 5) * 100;
	dcalve.style = 'width:' + p2 + '%';
	dcalve.innerHTML = p2 + "%";
	
	var rec = document.getElementById("rechazados");
	var p1 = (20 / 32) * 100;
	rec.style = 'width:' + p1 + '%';
	rec.innerHTML = p1 + "%";
	
	var pro = document.getElementById("progress");
	var p = (10 / 25) * 100;
	pro.style = 'width:' + p + '%';
	pro.innerHTML = p + "%";
}