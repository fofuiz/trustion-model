package br.com.accesstage.trustion.ascartoes.model.enums;

public enum TipoArquivoRemessaEnum {

    LAYOUT_2014("Layout 014", 0),
    LAYOUT_2015("Layout 015", 1),
    LAYOUT_NOVO("Layout Novo", 2);

    private final String label;
    private final Integer value;

    private TipoArquivoRemessaEnum(String label, Integer value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return this.label;
    }

    public Integer getValue() {
        return value;
    }
}
