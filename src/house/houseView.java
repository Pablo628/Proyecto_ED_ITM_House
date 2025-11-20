package house;
import controller.HouseTree;
import java.util.Scanner;

public class HouseView {
    static Scanner sc = new Scanner(System.in);
    static HouseTree objhouseTree = new HouseTree();

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
            
        } while (opc > 5);
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
        
    }

    private static void searchHouseView() {
        
    }
    private static void updateHouseView() {
        
    }
    private static void deleteHouseView() {
        
    }
}
