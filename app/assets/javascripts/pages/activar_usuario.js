$("#remoteModal").load('ajax/modal-content/motivo_escalamiento.html').dialog({
        autoOpen: false,
        resizable: true,
        height: 400,
        width: 400,
        modal: true
    });
	
	$("#remoteModal2").load('ajax/modal-content/motivo_rechazo.html').dialog({
        autoOpen: false,
        resizable: true,
        height: 500,
        width: 500,
        modal: true
    });
$('#escalar').click(function() {
		
		$('#remoteModal').dialog('open');
		
	});
	
	$('#rechazar').click(function() {
		
		$('#remoteModal2').dialog('open');
		
	});