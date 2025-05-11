/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaonline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author win 10
 */
public class GestorPedidos {
    private ArrayList<Cliente> clientes;
    private LinkedList<Pedido> pedidos;
    private HashMap<String, Pedido> mapaPedidos;

    public GestorPedidos() {
        clientes = new ArrayList<>();
        pedidos = new LinkedList<>();
        mapaPedidos = new HashMap<>();
    }
    
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
        mapaPedidos.put(pedido.getCliente().getNombre().toLowerCase(), pedido);
    }
    
    public void mostrarPedidos(){
        for (Pedido p: pedidos){
            System.out.println(p.MostrarDatosPedido());
        }
    }
    
    public Pedido buscarPedidoPorCliente(String nombre){
        return mapaPedidos.get(nombre.toLowerCase());
    }
    
}
