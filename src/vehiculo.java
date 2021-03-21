public class vehiculo {
    //atributos del vehiculo
    private String marca;
    private String descripcion;
    private int ano;
    private String prueba;
    //vamos a crear una variable estatica con la finalidad de incrementarse con las nuevas instanciaciiones
    static int cantidadInstancias = 1;



    //constructores
    public vehiculo(){
    this.marca = marca;
    this.descripcion = descripcion;
    this.ano = ano;
    cantidadInstancias++;
    }
    /*

    public vehiculo(String marca, String descripcion, int ano, String prueba){
        this.marca = marca;
        this.descripcion = descripcion;
        this.ano = ano;
        this.prueba = prueba;
        cantidadInstancias++;
    }//final de constructor
    */
    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //metodo para inticar el numero de instancias u objetos creados
    public static int getContadorInstancias(){
        return cantidadInstancias;
    }
    //se declara como static para distanciarlo de la dependencia de crear un objeto
}
