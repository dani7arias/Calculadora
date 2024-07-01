package Mundo;

public class Matriz {
    private String colConstrains;
    private String rowConstrains;

    public Matriz(){
        colConstrains = """
                10[center][center][center][center][center][center][center][center][center][center]10
                """;

        rowConstrains = """
                10[center]10[center]10[center]10[center]10[center]10[center]10
                """;
    }

    public String getColConstrains() {
        return colConstrains;
    }

    public void setColConstrains(String colConstrains) {
        this.colConstrains = colConstrains;
    }

    public String getRowConstrains() {
        return rowConstrains;
    }

    public void setRowConstrains(String rowConstrains) {
        this.rowConstrains = rowConstrains;
    }
}
