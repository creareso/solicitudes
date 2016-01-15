json.array!(@pruebas) do |prueba|
  json.extract! prueba, :id, :nombre, :edad
  json.url prueba_url(prueba, format: :json)
end
