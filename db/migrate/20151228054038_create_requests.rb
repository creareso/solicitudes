class CreateRequests < ActiveRecord::Migration
  def change
    create_table :requests do |t|
      t.string :nombre
      t.string :telefono
      t.string :movil
      t.string :producto
      t.integer :npro
      t.string :direccion
      t.string :email
      t.integer :estado
      t.integer :idus
      t.integer :tiposoli

      t.timestamps null: false
    end
  end
end
