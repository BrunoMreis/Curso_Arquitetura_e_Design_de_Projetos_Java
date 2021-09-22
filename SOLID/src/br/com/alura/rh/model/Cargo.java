package br.com.alura.rh.model;

public enum Cargo {

	ASSISTENTE {
		@Override
		public Cargo promove() {
			return ANALISTA;
			
		}
	},
	ANALISTA {
		@Override
		public Cargo promove() {
			return ESPECIALISTA;
		}
	},
	ESPECIALISTA {
		@Override
		public Cargo promove() {
			return GERENTE;
		}
	},
	GERENTE {
		@Override
		public Cargo promove() {
			return GERENTE;
		}
	};

	public abstract Cargo promove();

}
