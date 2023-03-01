package org.FicherosObjetos;

public class Trabajador extends Persona {
    private String cargo;


    public Trabajador(String nombre, int edad, String cargo){
        super(nombre, edad);
        this.cargo = cargo;
    }


    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString(){
        return super.toString() +" Cargo: "+ this.cargo;
    }
}
