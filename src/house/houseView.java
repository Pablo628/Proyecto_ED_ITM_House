package house;
import controller.HouseTree;
import controller.HouseController;
import java.util.Scanner;
import model.House;

public class HouseView {
    static Scanner sc = new Scanner(System.in);
    static HouseController objhouseController = new HouseController();

    public static void main(String[] args) {
        byte opc;
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    //Agregar casa
                    addHouseView();
                    break;
                case 2:
                    //Buscar casa
                    searchHouseView();
                    break;
                case 3:
                    //Actualizar casa
                    updateHouseView();
                    break;
                case 4:
                    //Eliminar casa
                    deleteHouseView();
                    break;
            }
            
        } while (opc != 5);
    }

    private static byte menu() {
        System.out.println("|---Menu---|");
        System.out.println("1. Agregar casa");
        System.out.println("2. Buscar casa");
        System.out.println("3. Actualizar casa");
        System.out.println("4. Eliminar casa");
        System.out.println("5. Salir");
        System.out.println("-----------");
        
        byte opcMena;
        do {

            System.out.print("Seleccione una opción: ");
            opcMena = sc.nextByte();
            
        } while (opcMena < 1 || opcMena > 5);
        return opcMena;
    }

    private static void addHouseView() {
        System.out.println("---Agregar casa---");
        System.out.print("ID propiedad: ");
        int idProperty = sc.nextInt();
        System.out.print("Ubicación: ");
        sc.nextLine();
        String ubication = sc.nextLine();
        System.out.println("Direccion: ");
        String address = sc.nextLine();
        System.out.print("Metros cuadrados: ");
        int squareMeters = sc.nextInt();
        System.out.print("Número de habitaciones: ");
        byte rooms = sc.nextByte();
        House newHouse = new House( idProperty, ubication, address, squareMeters, rooms);
        
        if (objhouseController.addHouse(newHouse)) {
            System.out.println("Casa agregada exitosamente.");
        } else {
            System.out.println("Error al agregar la casa.");
        }
    }

    private static void searchHouseView() {
        
    }
    private static void updateHouseView() {
        
    }
    private static void deleteHouseView() {
        
    }
}
