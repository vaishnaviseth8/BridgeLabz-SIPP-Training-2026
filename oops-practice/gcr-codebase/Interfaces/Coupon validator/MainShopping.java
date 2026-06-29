package Interface;

public class MainShoping {
    public static void main(String[] args) {
        String[] coupons={"ABC","XYZ","EFG","LMN","QRS"};
        ShopingCart cart=new ShopingCart();

        for( String s:coupons){
            if(cart.validateCoupon(s)){
                System.out.println(s+" "+"valid coupon");
            }
            else{
                System.out.println(s+"invalid coupon");
            }
        }

    }
}