class Prueba < ActiveRecord::Base
     validates :nombre, presence: true
     validates :edad, presence: true
end
