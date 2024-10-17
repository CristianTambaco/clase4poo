
//clase llama al los objetos
public class llamarClase {


    public static void main(String[] args) {
        vehiculos auto1 = new vehiculos("Toyota", 2024, "negro"); //consumiendo de la clase
        vehiculos auto2 = new vehiculos("chevrolet", 2012, "plateado");
        vehiculos auto3 = new vehiculos("Ferrari");
        vehiculos auto4 = new vehiculos("Ford", 2019,"gris", "bien","grande" );



        auto1.imprimir();
        auto2.imprimir();
        auto3.imprimirm();
        auto4.imprimir5();
    }


}
