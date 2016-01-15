class Request < ActiveRecord::Base
	#validacion numero
	validates :telefono , numericality: {message: "Telefono no es un numero"}
	validates :movil , numericality: {message: "Movil no es un numero"}
	validates :npro , numericality: {message: "Npro no es un numero"}
	#validacion formato mail
	validates :email, format: { with: /\A([^@\s]+)@((?:[-a-z0-9]+\.)+[a-z]{2,})\Z/i,
message: 'Email formato no valido' }
	#validacion campo vacio
	validates :nombre, presence: {message: "Nombre esta vacio"}
	validates :producto, presence: {message: "Producto esta vacio"}
	validates :direccion, presence: {message: "Direccion esta vacio"}
	validates :telefono, presence: {message: "Telefono esta vacio"}
	validates :movil, presence: {message: "Movil esta vacio"}
	validates :npro, presence: {message: "Npro esta vacio"}
	validates :email, presence: {message: "Email esta vacio"}
	
end
