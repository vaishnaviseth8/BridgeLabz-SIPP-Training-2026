package Interface;

public interface CouponValidator {

    boolean validateCoupon(String code);
    static boolean isLengthValid(String code){
        return true;
    }

}
