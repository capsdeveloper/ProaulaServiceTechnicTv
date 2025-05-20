package ServicesTechnicTves.Model.Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final List<Tecnico> tecnicos = new ArrayList<>();
    private static final List<Cliente> clientes = new ArrayList<>();
    private static final List<Dispositivo> dispositivos = new ArrayList<>();
    private static final List<Mantenimiento> mantenimiento = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** SISTEMA DE REPARACIONES ***");
            System.out.println("1. Gestor de Tecnicos");
            System.out.println("2. Gestor de Clientes");
            System.out.println("3. Gestor de Dispositivos");
            System.out.println("4. Gestor de Mantenimiento");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> menuTecnicos(scanner);
                case 2 -> menuClientes(scanner);
                case 3 -> menuDispositivos(scanner);
                case 4 -> menuMantenimiento(scanner);
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opcion no valida, por favor intente nuevamente.");
            }
        } while (opcion != 5);
    }

    private static void menuTecnicos(Scanner scanner) {
        System.out.println("\n--- GESTOR DE TECNICOS ---");
        System.out.println("1. Agregar Tecnico");
        System.out.println("2. Consultar Tecnico");
        System.out.println("3. Listar Tecnicos");
        System.out.println("4. Eliminar Tecnico");
        System.out.print("Seleccione una opcion: ");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese apellido: ");
                String apellido = scanner.nextLine();
                System.out.print("Ingrese identificacion: ");
                String identificacion = scanner.nextLine();
                System.out.print("Ingrese especialidad: ");
                String especialidad = scanner.nextLine();
                tecnicos.add(new Tecnico(nombre, apellido, identificacion, especialidad));
                System.out.println("Técnico agregado exitosamente.");
            }
            case 2 -> {
                System.out.print("Ingrese identificacion del tecnico: ");
                String id = scanner.nextLine();
                Tecnico tecnico = tecnicos.stream()
                        .filter(t -> t.getIdentificacion().equals(id))
                        .findFirst()
                        .orElse(null);
                System.out.println(tecnico != null ? tecnico : "Tecnico no encontrado.");
            }
            case 3 -> {
                System.out.println("Listado de tecnicos:");
                tecnicos.forEach(System.out::println);
            }
            case 4 -> {
                System.out.print("Ingrese identificacion del tecnico a eliminar: ");
                String idEliminar = scanner.nextLine();
                boolean eliminado = tecnicos.removeIf(t -> t.getIdentificacion().equals(idEliminar));
                System.out.println(eliminado ? "Técnico eliminado exitosamente." : "Tecnico no encontrado.");
            }
            default -> System.out.println("Opcion no valida.");
        }
    }

    private static void menuClientes(Scanner scanner) {
        System.out.println("\n--- GESTOR DE CLIENTES ---");
        System.out.println("1. Agregar Cliente");
        System.out.println("2. Consultar Cliente");
        System.out.println("3. Listar Clientes");
        System.out.println("4. Eliminar Cliente");
        System.out.print("Seleccione una opcion: ");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese apellido: ");
                String apellido = scanner.nextLine();
                System.out.print("Ingrese identificacion: ");
                String identificacion = scanner.nextLine();
                System.out.print("Ingrese email: ");
                String email = scanner.nextLine();
                System.out.print("Ingrese direccion: ");
                String direccion = scanner.nextLine();
                clientes.add(new Cliente(nombre, apellido, identificacion, email, direccion));
                System.out.println("Cliente agregado exitosamente.");
            }
            case 2 -> {
                System.out.print("Ingrese identificacion del cliente: ");
                String id = scanner.nextLine();
                Cliente cliente = clientes.stream()
                        .filter(c -> c.getIdentificacion().equals(id))
                        .findFirst()
                        .orElse(null);
                System.out.println(cliente != null ? cliente : "Cliente no encontrado.");
            }
            case 3 -> {
                System.out.println("Listado de clientes:");
                clientes.forEach(System.out::println);
            }
            case 4 -> {
                System.out.print("Ingrese identificacion del cliente a eliminar: ");
                String idEliminar = scanner.nextLine();
                boolean eliminado = clientes.removeIf(c -> c.getIdentificacion().equals(idEliminar));
                System.out.println(eliminado ? "Cliente eliminado exitosamente." : "Cliente no encontrado.");
            }
            default -> System.out.println("Opcion no valida.");
        }
    }

    private static void menuDispositivos(Scanner scanner) {
        System.out.println("\n--- GESTOR DE DISPOSITIVOS ---");
        System.out.println("1. Agregar Dispositivo");
        System.out.println("2. Consultar Dispositivo");
        System.out.println("3. Listar Dispositivos");
        System.out.println("4. Eliminar Dispositivo");
        System.out.print("Seleccione una opcion: ");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese tipo: ");
                String tipo = scanner.nextLine();
                System.out.print("Ingrese codigo: ");
                String codigo = scanner.nextLine();
                System.out.print("Ingrese descripcion: ");
                String descripcion = scanner.nextLine();
                System.out.print("Ingrese identificacion del propietario: ");
                String idPropietario = scanner.nextLine();
                Cliente propietario = clientes.stream()
                        .filter(c -> c.getIdentificacion().equals(idPropietario))
                        .findFirst()
                        .orElse(null);
                if (propietario != null) {
                    dispositivos.add(new Dispositivo(tipo, codigo, descripcion, propietario));
                    System.out.println("Dispositivo agregado exitosamente.");
                } else {
                    System.out.println("Propietario no encontrado.");
                }
            }
            case 2 -> {
                System.out.print("Ingrese codigo del dispositivo: ");
                String codigoConsulta = scanner.nextLine();
                Dispositivo dispositivo = dispositivos.stream()
                        .filter(d -> d.getCodigo().equals(codigoConsulta))
                        .findFirst()
                        .orElse(null);
                System.out.println(dispositivo != null ? dispositivo : "Dispositivo no encontrado.");
            }
            case 3 -> {
                System.out.println("Listado de dispositivos:");
                dispositivos.forEach(System.out::println);
            }
            case 4 -> {
                System.out.print("Ingrese código del dispositivo a eliminar: ");
                String codigoEliminar = scanner.nextLine();
                boolean eliminado = dispositivos.removeIf(d -> d.getCodigo().equals(codigoEliminar));
                System.out.println(eliminado ? "Dispositivo eliminado exitosamente." : "Dispositivo no encontrado.");
            }
            default -> System.out.println("Opcion no valida.");
        }
    }

    private static void menuMantenimiento(Scanner scanner) {
    System.out.println("\n--- GESTOR DE MANTENIMIENTO ---");
    System.out.println("1. Agregar Mantenimiento");
    System.out.println("2. Listar Mantenimientos");
    System.out.println("3. Consultar Mantenimiento por Codigo");
    System.out.println("4. Salir");
    System.out.print("Seleccione una opcion: ");

    int opcion = scanner.nextInt();
    scanner.nextLine();

    switch (opcion) {
        case 1 -> {
            System.out.print("Ingrese codigo: ");
            String codigo = scanner.nextLine();
            System.out.print("Ingrese fecha: ");
            String fecha = scanner.nextLine();
            System.out.print("Ingrese codigo del dispositivo: ");
            String codigoDispositivo = scanner.nextLine();
            System.out.print("Ingrese identificacion del tecnico: ");
            String idTecnico = scanner.nextLine();
            System.out.print("Ingrese diagnostico: ");
            String diagnostico = scanner.nextLine();
            System.out.print("Ingrese descripcion: ");
            String descripcion = scanner.nextLine();
            System.out.print("Ingrese precio: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese meses de garantia: ");
            int garantia = scanner.nextInt();

            Dispositivo dispositivo = dispositivos.stream()
                    .filter(d -> d.getCodigo().equals(codigoDispositivo))
                    .findFirst()
                    .orElse(null);
            Tecnico tecnico = tecnicos.stream()
                    .filter(t -> t.getIdentificacion().equals(idTecnico))
                    .findFirst()
                    .orElse(null);

            if (dispositivo != null && tecnico != null) {
                mantenimiento.add(new Mantenimiento(codigo, fecha, dispositivo, tecnico, diagnostico, descripcion, precio, garantia));
                System.out.println("Mantenimiento agregado exitosamente.");
            } else {
                System.out.println("Error: Dispositivo o Técnico no encontrado.");
            }
        }
        case 2 -> mantenimiento.forEach(System.out::println);
        case 3 -> {
            System.out.print("Ingrese código del mantenimiento: ");
            String codigoConsulta = scanner.nextLine();
            Mantenimiento encontrado = mantenimiento.stream()
                    .filter(m -> m.getCodigo().equals(codigoConsulta))
                    .findFirst()
                    .orElse(null);
            System.out.println(encontrado != null ? encontrado : "Mantenimiento no encontrado.");
        }
        case 4 -> System.out.println("Regresando al menu principal...");
        default -> System.out.println("Opcion no valida.");
    }
}

}
