$(document).ready(function() {
	iniciar();
	
	
});
var usuario = document.getElementById("user");
var password = document.getElementById("password");

function iniciar() {
	$('#iniciar')
			.click(
					function() {
						location.href = "index.html?#ajax/tablerocomando.html";
					});
}