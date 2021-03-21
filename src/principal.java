import java.util.Scanner;

public class principal {

    public static void main(String[]args){

        //menu
        int opcion;
        Scanner sc = new Scanner(System.in);
        vehiculo coche = new vehiculo();

        do {

            System.out.println("1.Crear vehiculo");
            System.out.println("2.Listar vehiculo");
            System.out.println("3. dime cuantos objetos se han crado");
            System.out.println("");
            System.out.println("5. Salir");
            System.out.println("introduce la opción:");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("has escogido la opcion de crear vehiculo: ");
                    System.out.println("introduce la marca del vehiculo: ");
                    String marca = sc.nextLine();
                    coche.setMarca(marca);
                    sc.nextLine();
                    System.out.println("introduce la descripcion del vehiculo: ");
                    String descripcion = sc.nextLine();
                    coche.setDescripcion(descripcion);
                    System.out.println("introduce el año del vehiculo: ");
                    int ano = sc.nextInt();
                    coche.setAno(ano);

                    break;

                case 2:
                    System.out.println("estas son las caracteristicas del vehiculo: ");

                    System.out.println("marca" + coche.getMarca());
                    System.out.println("descripcion: " + coche.getDescripcion());
                    System.out.println("año: " + coche.getAno());

                    break;

                case 3:
                    System.out.println("el numero de objetos que se han creado es:");
                    System.out.println(vehiculo.getContadorInstancias());

                    break;

                case 4:
                    break;

                default:
                    System.out.println("no has escogido ninguna opción correcta");
            }
        }while(opcion!=5);


    }
}
