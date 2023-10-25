public class Tea {
    private String type;
    private int strong;
    private int cost;

    public String getType() {
        return type;
    }
    public int getStrong() {
        return strong;
    }
    public int getCost(){
        return cost;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setStrong(int strong){
        this.strong = strong;
    }
    public void setCost(int cost){
        this.cost = cost;
    }

    public void doDrink(){
        System.out.println("Осторожно, горячо!");
    }
}
