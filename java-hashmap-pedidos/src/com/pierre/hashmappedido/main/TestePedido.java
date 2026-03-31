package com.pierre.hashmappedido.main;

import java.util.ArrayList;
import java.util.List;

import com.pierre.hashmappedido.model.Pedido;

public class TestePedido {
	
	public static void main(String[] args) {
		
		Pedido pedido01 = new Pedido("Marcos", "ENTREGRE", 150.53, 1012);
		Pedido pedido02 = new Pedido("Luana", "ENVIADO", 301.98, 1023);
		Pedido pedido03 = new Pedido("Pierre", "PENDENTE", 56.50, 1005);
		Pedido pedido04 = new Pedido("Bernardo", "ENVIADO", 100.00, 1016);
		Pedido pedido05 = new Pedido("Cida", "ENVIADO", 201.60, 021);
		Pedido pedido06 = new Pedido("Rogerio", "ENTREGUE", 360.20, 1022);
		Pedido pedido07 = new Pedido("Paulo", "PENDENTE", 111.35, 1017);
		Pedido pedido08 = new Pedido("Inês", "ENVIADO", 78.00, 1008);
		Pedido pedido09 = new Pedido("Juliana", "ENVIADO", 182.38, 1014);
		
		List<Pedido> pedidos = new ArrayList<Pedido>();
		
		pedidos.add(pedido01);
		pedidos.add(pedido02);
		pedidos.add(pedido03);
		pedidos.add(pedido04);
		pedidos.add(pedido05);
		pedidos.add(pedido06);
		pedidos.add(pedido07);
		pedidos.add(pedido08);
		pedidos.add(pedido09);
		
		
		
	}

}
