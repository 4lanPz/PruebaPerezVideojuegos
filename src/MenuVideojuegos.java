import java.util.Scanner;
public class MenuVideojuegos {
    //eb esta clase se va a realizar el codigo de crear las instancias y llamar a la funcion para imprimir los datos que se agregen
    public static void main(String[] args){
        //se crea las instancias de los juegos indicando los juegos y sus atributos
        Videojuegos Juego1 = new Videojuegos("Apex Legends", "PC/PS/XBOX", 2018, "EA",0, "FPS");
        Videojuegos Juego2 = new Videojuegos("Dead by Daylight", "PC/PS/XBOX", 2016, "BeHaviour",30,"Horror");
        Videojuegos Juego3 = new Videojuegos("Left 4 dead", "PC/XBOX", 2002, "Valve",15,"Shooter/Horror/COOP");
        Videojuegos Juego4 = new Videojuegos("Resident Evil 4 Remake", "PC/PS/XBOX", 2023, "Capcom",40,"Shooter/Horror");
        Videojuegos Juego5 = new Videojuegos("Silent Hill", "PSX", 1997, "Team Silent",5,"Horror");
        //se imprime los datos agregados anteriormente mas un espacio que separa cada valor para que no este unido
        System.out.println("");
        Juego1.imprimirDatos();
        System.out.println("");
        Juego2.imprimirDatos();
        System.out.println("");
        Juego3.imprimirDatos();
        System.out.println("");
        Juego4.imprimirDatos();
        System.out.println("");
        Juego5.imprimirDatos();
        //PEREZ ALAN
}
}
