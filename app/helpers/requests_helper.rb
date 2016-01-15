module RequestsHelper
    def estados(esta)
        if esta == 0
            "<span class='label label-info'>Registrado </span>".html_safe
        elsif esta == 1
            "<span class='label label-primary'>Asignado</span>".html_safe
        elsif esta == 2
            "<span class='label label-success'>Aceptado</span>".html_safe
        elsif esta == 3
            "<span class='label label-warning'>Rechazado</span>".html_safe
        end
            
    end
    def tipo(t)
        if t == 1
            "<p>Crear cuenta</p>".html_safe
        elsif t == 2
            "<p>Cambiar contraseña</p>".html_safe
        end
    
    end
    

    
   
end
