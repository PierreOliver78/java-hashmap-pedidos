package com.pierre.hashmappedido.model;

public class Pedido {

		private String cliente;
		private String status;
		private double valor;
		private int numeroPedido;
		
		public Pedido (String cliente, String status, double valor, int numeroPedido) {
			
			this.cliente = cliente;
			this.status = status;
			this.valor = valor;
			this.numeroPedido = numeroPedido;
			
			
		}

		public String getCliente() {
			return cliente;
		}

		public void setCliente(String cliente) {
			this.cliente = cliente;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public int getNumeroPedido() {
			return numeroPedido;
		}

		public void setNumeroPedido(int numeroPedido) {
			this.numeroPedido = numeroPedido;
		}
		
	
	

}
