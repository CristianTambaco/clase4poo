public class vehiculos {

    //atributo de la clase vehiculos
    String modelo;
    int anio;
    String color;

    //metodo constructor con 3 atributos
    public vehiculos(String modelo, int anio, String color){
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }


    public vehiculos(String modelo){
        this.modelo = modelo;
    }






    //metodo vacío, no devuelve nada
    public void imprimir(){
        System.out.println("El modelo es: "+ modelo +
                ", el anio del vehículo es "+ anio +
                ", el color del vehículo es " + color);//2 atributos más

    }

    public void imprimirm(){
        System.out.println("El modelo es: "+ modelo);

    }



    //vehiculo del metodo constructor, aqui es donde se crean los objetos
    public static void main(String[] args) {
        vehiculos auto1=new vehiculos("Toyota", 2024, "negro"); //consumiendo de la clase
        vehiculos auto2=new vehiculos("chevrolet", 2012, "plateado");
        auto1.imprimir();
        auto2.imprimir();


    }
}



