public class Soda {
    private String name;
    private int gasQuantity;
    private int cost;

    public String getName() {
        return name;
    }
    public int getGasQuantity() {
        return gasQuantity;
    }
    public int getCost(){
        return cost;
    }

    public void setName(String type) {
        this.name = name;
    }
    public void setGasQuantity(int strong){
        this.gasQuantity = gasQuantity;
    }
    public void setCost(int cost){
        this.cost = cost;
    }

    public void doDrink(){
        System.out.println("Осторожно, очень сладко!");
    }
}
