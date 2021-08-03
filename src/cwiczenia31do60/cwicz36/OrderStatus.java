package cwiczenia31do60.cwicz36;

public enum OrderStatus {
    NEW("- Nowe"),
    PAID("- Opłacone"),
    SHIPPED("- Wysłane"),
    DELIVERED("- Dostarczone"),
    CANCELLED("- Anulowano");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
