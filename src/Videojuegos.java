public class Videojuegos {
    //Se crea los atributos
    String nombre;
    String plataforma;
    int salida;
    String creador;
    int precio;
    String genero;
 //se crea el constructor dando click derecho y constructor para idicar los punteros de donde se guarda los valores
    public Videojuegos(String nombre, String plataforma, int salida, String creador, int precio, String genero) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.salida = salida;
        this.creador = creador;
        this.precio = precio;
        this.genero = genero;
    }
    //se crea los getters y setters dando click derecho y setters y getters en donde se va a enviar y recibir datos
    //esto se crea automaticamente al dar click derecho y setters and getters
    //esto con los atributos anteriormente assignados
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    //se crea la funcion para imprimir datos en la cual tambien se agregaron palabras concatenadas con el valor a imprimir, indicando que es cada cosa
    public void imprimirDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Plataforma: "+this.plataforma);
        System.out.println("Fecha salida: "+this.salida);
        System.out.println("Creador: "+ this.creador);
        System.out.println("Precio: $"+this.precio);
        System.out.println("Genero: "+this.genero);
    }
}
