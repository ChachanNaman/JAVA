enum laptop{
    macbook(2000), victus, playstation(1290), thinkpad(1600);

    private int prices;

    private laptop(){
        prices = 700;
    }
    private laptop(int prices) {
        this.prices = prices;
        System.out.println("in laptop" + this.name());
    }


    public int getPrices() {
        return prices;
    }
    
    public void setPrices(int prices) {
        this.prices = prices;
    }
    
}

public class EnumClass2 {
    public static void main(String[] args) {

        for(laptop lap : laptop.values()){
            System.out.println(lap + " : " + lap.getPrices());
        } 
    }
}
