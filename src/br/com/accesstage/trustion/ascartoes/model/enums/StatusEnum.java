package br.com.accesstage.trustion.ascartoes.model.enums;

public enum StatusEnum {

    ATIVO(1, "Ativo"),
    INATIVO(0, "Inativo");

    private final int codStatus;
    private final String label;

    private StatusEnum(int codStatus, String label) {
        this.codStatus = codStatus;
        this.label = label;
    }

    public static int findByBool(Boolean ativo) {
        return ativo ? StatusEnum.ATIVO.getCodStatus() : StatusEnum.INATIVO.getCodStatus();
    }

    public int getCodStatus() {
        return this.codStatus;
    }

    public String getLabel() {
        return label;
    }
}
