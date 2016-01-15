/**
 * 
 */
/*
 * Autor William Alarcon
 * Fecha 2014-08-13
 * Descripci��n Obtener un objeto JSON de recursos y los agrega en un combo box
 * 
 **/
function getResourcesSelect(service, url, selectId, data) {
	if (typeof data === "undefined") {
		data = {};
	}
	$.getJSON("/" + service + url, data, function(response) {
		//console.log('Init Load resourceId '+selectId+' url: '+service + url);
		if (response.codigo==="000"){
			//console.log('response getresource: '+response);
			$.each(response.datos, function(key, dato) {
				$('#' + selectId).append('<option value="' + dato['id'] + '">' + dato['nombre'] + '</option>');
		});
		//console.log('End Load');	
		}else{
			$('#' + selectId).append('<option value="Error"> No Hay DATOS . </option>');
		}
	});
}
function clearForm(idForm) {
	$(idForm)[0].reset();
}

function clearFormButton() {
	$('.clear-form').click(function(event) {
		event.preventDefault();
		var formId = '#' + $(this).parents('form').attr('id');
		clearForm(formId);

	});
}






/*
 * Autor William Alarcon
 * Fecha 2014-05-14
 * Argumentos id del HTMl a borrar
 * Descripción Función para limpiar HTML
 * 
 **/

function clearHTML(clear) {
	$(clear).html('');
}
/*
 * Autor William Alarcon
 * Fecha 2014-07-14
 * Argumentos username es el nombre de usuario , picture es la ruta de la imagen de usuario
 * Descripción Función para cambiar el nombre de usuario e imagen del mismo
 * 
 **/
function  changeUser(username, picture) {
	$('.login-info span').html('<a href="javascript:void(0);" id="show-shortcut"><img src="' + picture + '" alt="me" class="online"><span>' + username + '</span><i class="fa fa-angle-down"></i> </a> ');

}

/*
 * Autor William Alarcon
 * Fecha 2014-07-14 
 * Descripción Función para recargar la pagina
 * 
 **/
function loadPages() {
	window.location.reload();
}


