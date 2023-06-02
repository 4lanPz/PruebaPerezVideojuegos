public class Videojuegos {
    String nombre;
    String plataforma;
    int salida;
    String creador;
    int precio;
    String genero;

    public Videojuegos(String nombre, String plataforma, int salida, String creador, int precio, String genero) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.salida = salida;
        this.creador = creador;
        this.precio = precio;
        this.genero = genero;
    }

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

    public void imprimirDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Plataforma: "+this.plataforma);
        System.out.println("Fecha salida: "+this.salida);
        System.out.println("Creador: "+ this.creador);
        System.out.println("Precio: $"+this.precio);
        System.out.println("Genero: "+this.genero);
    }
}
