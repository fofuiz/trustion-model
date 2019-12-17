package br.com.accesstage.trustion.ascartoes.model.enums;

public enum TipoConciliacaoEnum {

    NSU_OPCIONAL("NSU Opcional", 1),
    NSU_OBRIGATORIO("NSU Obrigatório", 0),
    MULTI_ID("Multi ID", 2),
    AUTORIZACAO_OPCIONAL("Autorização Opcional", 3);

    private final String label;
    private final Integer value;

    private TipoConciliacaoEnum(String label, Integer value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public Integer getValue() {
        return value;
    }
}
