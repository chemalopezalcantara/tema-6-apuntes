import java.util.Scanner;

public class empleado {
    private String nombre;
    private String apellido;
    private int edad;

    public empleado(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //instanciamos el objeto
        int numeroObjetos;
        System.out.println("introduce el numero de objetos que deseas crear");
        numeroObjetos = sc.nextInt();
        if (numeroObjetos<=50){
            System.out.println("felicidades el numero de objetos es menos de 50 por lo que podra funcionar");
            empleado empleados[] = new empleado[numeroObjetos];
            empleados[0]= new empleado("victor", "navarro", 20);

            for (int i = 0; i< empleados.length; i++){
                empleados[i]=new empleado("defecto","defecto",30);
            }
            for (int j = 0; j< empleados.length; j++){
                System.out.println(empleados[j].getDatos());

            }


        }else {
            System.out.println("el numero de objetos es mayour de 50, esto no se puede");
        }







        /*empleado arraydeObjetos[]=new empleado[3]; //declaramos un array de tipo empleado con el nombre array de objetos con 3 posiciones
        arraydeObjetos[0]=new empleado("victor", "navarro", 20);
        arraydeObjetos[1]=new empleado("jesus", "sanchez", 20);
        arraydeObjetos[2]=new empleado("mercedes", "mota", 20);

        //recorremos el array para ver todos los datos

        for (int i = 0; i< arraydeObjetos.length; i++){
            System.out.println(arraydeObjetos[i].getDatos());
        }
        */

    } //final del main

    //metodo para obtener todos los datos de los objetos

    public String getDatos(){
        return "los datos son: " + nombre + apellido + edad;
    }
}
