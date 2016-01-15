class IndexController < ApplicationController
  #before_action :authenticate_user!
  def index
if current_user == nil
    redirect_to new_user_session_url
end    
  end
  def tablerocomando
    
  end
  def organigrama
    
  end
  def misrequests
    @requests = Request.all
    
  end
end
