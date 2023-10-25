public class Coffee {
    private String name;
    private int strong;
    private int cost;

    public String getName() {
        return name;
    }
    public int getStrong() {
        return strong;
    }
    public int getCost(){
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setStrong(int strong){
        this.strong = strong;
    }
    public void setCost(int cost){
        this.cost = cost;
    }

    public void doDrink(){
        System.out.println("Осторожно, грорячо!");
    }

}
