package ac1;

import java.awt.*;
import java.util.Scanner;

public class MainTelefono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TelefonoMovil telefono = new TelefonoMovil("674725056");
        boolean salir = false;

        Menu();

        while (!salir) {
            System.out.print("Elige una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                case 1:
                    telefono.printContacts();
                    break;
                case 2:
                    System.out.print("Nombre del nuevo contacto: ");
                    String name = scanner.nextLine();
                    System.out.print("Numero de telefono: ");
                    String phone = scanner.nextLine();
                    Contacto nuevo = Contacto.createContact(name, phone);
                    if (telefono.addNewContact(nuevo)) {
                        System.out.println("Contacto anadido correctamente.");
                    } else {
                        System.out.println("Error: el contacto ya existe.");
                    }
                    break;
                case 3:
                    System.out.print("Nombre del contacto a actualizar: ");
                    String oldName = scanner.nextLine();
                    Contacto viejo = telefono.queryContact(oldName);
                    if (viejo == null) {
                        System.out.println("Error: el contacto no existe.");
                    } else {
                        System.out.print("Nuevo nombre: ");
                        String newName = scanner.nextLine();
                        System.out.print("Nuevo numero: ");
                        String newPhone = scanner.nextLine();
                        Contacto nuevoC = Contacto.createContact(newName, newPhone);
                        if (telefono.updateContact(viejo, nuevoC)) {
                            System.out.println("Contacto actualizado correctamente.");
                        } else {
                            System.out.println("Error: no se pudo actualizar.");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    Contacto aEliminar = telefono.queryContact(nombreEliminar);
                    if (aEliminar == null) {
                        System.out.println("El contacto no existe.");
                    } else if (telefono.removeContact(aEliminar)) {
                        System.out.println("Contacto eliminado correctamente.");
                    } else {
                        System.out.println("Error al eliminar el contacto.");
                    }
                    break;
                case 5:
                    System.out.print("Nombre del contacto a buscar: ");
                    String buscar = scanner.nextLine();
                    Contacto encontrado = telefono.queryContact(buscar);
                    if (encontrado != null) {
                        System.out.println("Contacto encontrado: " + encontrado.getName() + " -> " + encontrado.getPhoneNumber());
                    } else {
                        System.out.println("El contacto no existe.");
                    }
                    break;
                case 6:
                    Menu();
                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
            }
        }

        scanner.close();
    }

    public static void Menu(){
        System.out.println(" -- MENU-- ");
        System.out.println("0. Salir");
        System.out.println("1. Imprimir Contactos");
        System.out.println("2. Agregar Contacto");
        System.out.println("3. Actualizar Contacto");
        System.out.println("4. Eliminar Contacto");
        System.out.println("5. Buscar Contacto");
        System.out.println("6. Volver a la lista");
    }
}
