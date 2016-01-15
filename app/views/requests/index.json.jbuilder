json.array!(@requests) do |request|
  json.extract! request, :id, :nombre, :telefono, :movil, :producto, :npro, :direccion, :email, :tiposoli
  json.url request_url(request, format: :json)
end
