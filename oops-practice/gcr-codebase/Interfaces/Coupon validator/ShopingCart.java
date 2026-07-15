package Interface;

public class ShopingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {
        return true ;

    }
}
