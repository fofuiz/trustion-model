package br.com.accesstage.trustion.model.enums;

public enum TipoVideoEnum {

	ABERTURA(1, "Abertura"),
	DECLARACAO(2, "Declaracao"),
	CONFERENCIA(3, "Conferencia");

	private final int codTipo;
	private final String label;

	private TipoVideoEnum(int codTipo, String label) {
		this.codTipo = codTipo;
		this.label = label;
	}

	public int getCodTipo() {
		return this.codTipo;
	}

	public String getLabel() {
		return label;
	}

}
