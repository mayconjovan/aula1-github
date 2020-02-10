package application;

import entities.Pedidos;
import entities.enums.OrderStatus;
import java.util.Date;


public class Enumeracao {
    public static void main(String[] args) {
        Pedidos p = new Pedidos(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(p);
        
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        
        System.out.println(os1);
        System.out.println(os2);
        
    }

}
