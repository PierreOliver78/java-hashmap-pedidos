package com.pierre.hashmappedido.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import com.pierre.hashmappedido.model.Pedido;


public class TestePedido {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("admin");
		String senha = JOptionPane.showInputDialog("admin");

		if (login.equals("admin") && senha.equals("admin")) {
			JOptionPane.showMessageDialog(null, "Acesso Liberado");
			
			Pedido pedido01 = new Pedido("Marcos", "ENTREGUE", 150.53, 1012);
			Pedido pedido02 = new Pedido("Luana", "ENVIADO", 301.98, 1023);
			Pedido pedido03 = new Pedido("Pierre", "PENDENTE", 56.50, 1005);
			Pedido pedido04 = new Pedido("Bernardo", "ENVIADO", 100.00, 1016);
			Pedido pedido05 = new Pedido("Cida", "ENVIADO", 201.60, 1021);
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

			HashMap<String, List<Pedido>> statusPedido = new HashMap<>();

			statusPedido.put("ENVIADO", new ArrayList<>());
			statusPedido.put("PENDENTE", new ArrayList<>());
			statusPedido.put("ENTREGUE", new ArrayList<>());

			for (Pedido pedido : pedidos) {
				statusPedido.get(pedido.getStatus()).add(pedido);
			}

			for (String status : statusPedido.keySet()) {
				System.out.println("******** " + status + " ********");

				for (Pedido pedido : statusPedido.get(status)) {
					System.out.println("Nome: " + pedido.getCliente() + " | Pedido: " + pedido.getNumeroPedido()
							+ " | Valor: R$ " + pedido.getValor());
				}
				System.out.println();
			}

		}
	}

}
