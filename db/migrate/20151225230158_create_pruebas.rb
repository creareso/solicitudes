class CreatePruebas < ActiveRecord::Migration
  def change
    create_table :pruebas do |t|
      t.string :nombre
      t.string :edad

      t.timestamps null: false
    end
  end
end
