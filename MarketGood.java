public class MarketGood {
    private String name;//상품이름
    private int retailPrice;//출시가격
    private int discountRate;//할인률(단위 : %)

    public MarketGood (String name, int retailPrice, int discountRate) {

        this.name = name;
        this.retailPrice = retailPrice;

        if (discountRate < 0 || discountRate > 100) {
            this.discountRate = 0;
        } else {
            this.discountRate = discountRate;
        }
    }

    public MarketGood(String name, int retailPrice) {
        this(name, retailPrice, 0);
    }

    public String getName(){
        return name;
    }

    public int getRetailPrice(){
        return retailPrice;
    }

    public void setDiscountRate(int newDiscountRate){
        discountRate = newDiscountRate;
    }

    public int getDiscountRate(){
        return discountRate;
    }

    public int getDiscountedPrice() {
        return (retailPrice * (100 - discountRate))/100;
    }
}