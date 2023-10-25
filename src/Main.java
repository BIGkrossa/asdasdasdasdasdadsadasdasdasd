public class Main {
    public static void main(String[] args) {
        Coffee americano = new Coffee();
        americano.setName("Американо");
        americano.setStrong(10);
        americano.setCost(100);
        americano.doDrink();

        Tea black = new Tea();
        black.setType("Black");
        black.setStrong(6);
        black.setCost(70);
        black.doDrink();

        Soda cola = new Soda();
        cola.setName("Кола");
        cola.setGasQuantity(8);
        cola.setCost(50);
        cola.doDrink();



    }
}