class Buyer{
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;
    
    void buy(Product p){    
        if(p.price > money){ // enough 필요한 만큼의
            System.out.printf("You don't have enough money to buy a %s. %n",p);
        }
        else{
            this.money -= p.price;
            add(p);
        }
    }
    void add(Product p){
        if(i >= cart.length){
            Product[] newcart = new Product[6];
            for(int j=0; j< cart.length; j++){
                newcart[j] = cart[j];
            } 
            cart = newcart;
        }
        cart[i] = p;
        i++;

    }
    void summary(){
        int result = 0;
        System.out.print("purchased item : "); // purchased: 구매한
        for(int j=0; j<cart.length; j++){
            System.out.printf("%s, ",cart[j]);
            result += cart[j].price;
        }
        System.out.println();
        System.out.printf("amount used : %d %n",result); // anount 총액
        System.out.printf("remaining amount : %d %n", money); // remaining 남은
    }   
}
class Product{
    int price;

    Product(int price){
        this.price = price;
    }
}
class Tv extends Product{
    Tv(){super(100);}
    public String toString(){return "Tv";}
}
class Computer extends Product{
    Computer(){super(200);}
    public String toString(){return "Computer";}
}
class Audio extends Product{
    Audio(){super(50);}
    public String toString(){return "Audio";}
}
public class Exercise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();

    }
}

