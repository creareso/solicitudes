class ApplicationController < ActionController::Base
  # Prevent CSRF attacks by raising an exception.
  # For APIs, you may want to use :null_session instead.
  protect_from_forgery with: :exception
  
   before_filter :configure_permitted_parameters, if: :devise_controller?

  def redirect_if_not_signed_in
    if !current_user
      redirect_to "/users/sign_in" unless current_user
      flash[:alert] = "Please register or sign in"
    end
    $userid = current_user.id 
  end

   
  
protected

  def configure_permitted_parameters
    devise_parameter_sanitizer.for(:sign_in) { |u| u.permit(:email, :password, :remember_me) }
    devise_parameter_sanitizer.for(:sign_up) { |u| u.permit(:nombre,:telefono,:movil,:producto,:npro,:direccion,:password,:email, :password_confirmation) }
    devise_parameter_sanitizer.for(:account_update) { |u| u.permit(:telefono,:movil,:producto,:npro,:direccion, :email, :password, :password_confirmation, :current_password) }
  end
  
end

