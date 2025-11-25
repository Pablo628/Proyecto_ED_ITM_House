package house;
import controller.HouseTree;
import controller.HouseController;
import java.util.Scanner;
import model.House;

public class houseView {
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
        try {

            if (objhouseController.addHouse(newHouse)) {
                System.out.println("Casa agregada exitosamente.");
            } else {
                System.out.println("Error al agregar la casa.");
            } 

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void searchHouseView() {
        try {
            System.out.println("---Buscar casa---");
            System.out.print("ID de la casa a buscar: ");
            int idProperty = sc.nextInt();
            House foundHouse = objhouseController.searchHouse(idProperty);
            if (foundHouse != null) {
                System.out.println("Casa encontrada:");
                System.out.println("ID Propiedad: " + foundHouse.getIdProperty());
                System.out.println("Ubicación: " + foundHouse.getUbication());
                System.out.println("Dirección: " + foundHouse.getAddress());
                System.out.println("Metros Cuadrados: " + foundHouse.getSquareMeters());
                System.out.println("Número de Habitaciones: " + foundHouse.getRooms());
            } else {
                System.out.println("Casa no encontrada.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    private static void updateHouseView() {
        try {
            System.out.println("---Actualizar casa---");
            System.out.print("ID de referencia de la casa: ");
            int idProperty = sc.nextInt();
            if (objhouseController.searchHouse(idProperty) != null) {
                System.out.println("Ingrese los nuevos datos de la casa:");
                System.out.print("Nueva ubicación: ");
                sc.nextLine();
                String newUbication = sc.nextLine();
                System.out.println("Nueva direccion: ");
                String newAddress = sc.nextLine();
                System.out.print("Nuevos metros cuadrados: ");
                int newSquareMeters = sc.nextInt();
                System.out.print("Nuevo número de habitaciones: ");
                byte newRooms = sc.nextByte();
                House updatedHouse = new House(idProperty, newUbication, newAddress, newSquareMeters, newRooms);
                if (objhouseController.updateHouse(idProperty, updatedHouse)) {
                    System.out.println("Casa actualizada exitosamente.");
                } else {
                    System.out.println("Error al actualizar la casa.");
                }
            } else {
                System.out.println("Casa no encontrada.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
        
    private static void deleteHouseView() {
        try {
            System.out.println("---Eliminar casa---");
            System.out.print("ID de la casa a eliminar: ");
            int idProperty = sc.nextInt();
            if (objhouseController.deleteHouse(idProperty)) {
                System.out.println("Casa eliminada exitosamente.");
            } else {
                System.out.println("Casa no encontrada.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
