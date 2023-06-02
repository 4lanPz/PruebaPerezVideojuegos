import java.util.Scanner;
public class MenuVideojuegos {
    public static void main(String[] args){
        Videojuegos Juego1 = new Videojuegos("Apex Legends", "PC/PS/XBOX", 2018, "EA",0, "FPS");
        Videojuegos Juego2 = new Videojuegos("Dead by Daylight", "PC/PS/XBOX", 2016, "BeHaviour",30,"Horror");
        Videojuegos Juego3 = new Videojuegos("Left 4 dead", "PC/XBOX", 2002, "Valve",15,"Shooter/Horror/COOP");
        Videojuegos Juego4 = new Videojuegos("Resident Evil 4 Remake", "PC/PS/XBOX", 2023, "Capcom",40,"Shooter/Horror");
        Videojuegos Juego5 = new Videojuegos("Silent Hill", "PSX", 1997, "Team Silent",5,"Horror");
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
