package br.com.seniorsolution.adapter;

public class ControlePontoAdapter extends ControlePonto {

		private ControlePontoNovo novo;
		
		public ControlePontoAdapter() {
			this.novo = new ControlePontoNovo();
		}
		
		@Override
		public void registrarEntrada(Funcionario f) {
			this.novo.registrar(f, true);
		}
		
		@Override
		public void registrarSaida(Funcionario f) {
			this.novo.registrar(f, false);
		}
}
