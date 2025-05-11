package tiendaonline;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorPedidos gestor = new GestorPedidos();

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = sc.nextLine();

        System.out.print("Ingrese el teléfono del cliente: ");
        String telefono = sc.nextLine();

        Cliente cliente1 = new Cliente(nombre, direccion, telefono);
        cliente1.registrarCliente(nombre);
        cliente1.registrarCliente(nombre, telefono, direccion);
        gestor.agregarCliente(cliente1);

        int cantidadDetalles = 0;
        
        while (true) {
            try {
                System.out.print("Ingrese el número de detalles del pedido: ");
                cantidadDetalles = Integer.parseInt(sc.nextLine());

                if (cantidadDetalles <= 0) {
                    System.out.println("Debes ingresar un número mayor que cero.");
                    continue;
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                System.out.println("Error. Ingresa un número válido para la cantidad de detalles.");
                System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            }
        }

        List<String> detalles = new ArrayList<>();
        for (int i = 0; i < cantidadDetalles; i++) {
            System.out.print("Ingrese detalle " + (i + 1) + ": ");
            detalles.add(sc.nextLine());
        }

        Pedido pedido1 = new Pedido("1", new Date(), cliente1, detalles);
        gestor.agregarPedido(pedido1);

        System.out.println("\nLista de pedidos:");
        gestor.mostrarPedidos();

        System.out.print("\nIngrese el nombre del cliente para buscar el pedido: ");
        String nombreBuscado = sc.nextLine();
        Pedido resultado = gestor.buscarPedidoPorCliente(nombreBuscado);

        if (resultado != null) {
            System.err.println("-------------------------------------------------------------------------");
            System.out.println("Pedido encontrado para " + nombreBuscado + ":");
            System.out.println(resultado.MostrarDatosPedido());
        } else {
            System.out.println("No se encontró pedido para el cliente " + nombreBuscado);
        }
    }
}
