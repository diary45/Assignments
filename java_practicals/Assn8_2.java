import java.util.function.Predicate;

public class Assn8_2 {
    public static void main(String[] args) {
        Predicate<order> statuscheck=(order)->(order.orderStatus.equals("ACCEPTED") ||order.orderStatus.equals("COMPLLETED"));
        Predicate<order> pricecheck=(order)->(order.price>10000);
        order order1=new order(9000,"pending");
        boolean res=statuscheck.and(pricecheck).test(order1);
        if(res)
            System.out.println(order1 +" is accpted");
        else
            System.out.println(order1+" is rejected");



    }

}


class order {
    int price;
    String orderStatus;

    public order(int price, String orderStatus) {
        this.price = price;
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "order{" +
                "price=" + price +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
