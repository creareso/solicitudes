Rails.application.routes.draw do
  devise_for :users, :controllers => { :omniauth_callbacks => "users/omniauth_callbacks" }
  resources :requests
  resources :pruebas
  get 'index/index'
  get 'index/tablerocomando'
  get 'index/organigrama'
  get 'index/misrequests'#, :path => 'requests?user_id=request_id&estado=asignada'
    get 'index/aceptados'
      get 'index/rechazados'
  
 
 resources :requests do
   match 'reclamar', :action => 'reclamar', :controller => 'requests', :via => [:get]
   match 'aceptar', :action => 'aceptar', :controller => 'requests', :via => [:get]
   match 'rechazar', :action => 'rechazar', :controller => 'requests', :via => [:get]
  #match 'reclamar_request' => 'request#reclamar', :via => [:get], :as => 'reclamar_request'
  #match 'gallery_:id' => 'gallery#show', :via => [:get], :as => 'gallery_show'
end
  namespace :api, defaults: {format: 'json'} do
    namespace :v1 do
      resources :requests
      match 'request/crear', :action => 'crear', :via => [:get], :controller => "requests", :as => :crearto
      match 'request/contra', :action => 'contra', :via => [:get], :controller => "requests", :as => :mcontra
      match 'request/registrados', :action => 'registrado', :via => [:get], :controller => "requests", :as => :registrados
      match 'request/misrequests', :action => 'mirequest', :via => [:get], :controller => "requests", :as => :misrequests
      match 'request/create', :action => 'create', :via => [:get], :controller => "requests", :as => :create
    #  match 'request/err', :action => 'err', :via => [:get], :controller => "requests", :as => :errores
    end
  end

  devise_scope :user do
    get '/users/sign_out' => 'devise/sessions#destroy'
  end

  # The priority is based upon order of creation: first created -> highest priority.
  # See how all your routes lay out with "rake routes".

  # You can have the root of your site routed with "root"
   root 'index#index'

  # Example of regular route:
  #   get 'products/:id' => 'catalog#view'

  # Example of named route that can be invoked with purchase_url(id: product.id)
  #   get 'products/:id/purchase' => 'catalog#purchase', as: :purchase

  # Example resource route (maps HTTP verbs to controller actions automatically):
  #   resources :products

  # Example resource route with options:
  #   resources :products do
  #     member do
  #       get 'short'
  #       post 'toggle'
  #     end
  #
  #     collection do
  #       get 'sold'
  #     end
  #   end

  # Example resource route with sub-resources:
  #   resources :products do
  #     resources :comments, :sales
  #     resource :seller
  #   end

  # Example resource route with more complex sub-resources:
  #   resources :products do
  #     resources :comments
  #     resources :sales do
  #       get 'recent', on: :collection
  #     end
  #   end

  # Example resource route with concerns:
  #   concern :toggleable do
  #     post 'toggle'
  #   end
  #   resources :posts, concerns: :toggleable
  #   resources :photos, concerns: :toggleable

  # Example resource route within a namespace:
  #   namespace :admin do
  #     # Directs /admin/products/* to Admin::ProductsController
  #     # (app/controllers/admin/products_controller.rb)
  #     resources :products
  #   end
end
