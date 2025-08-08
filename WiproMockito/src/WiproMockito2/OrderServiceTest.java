package WiproMockito2;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class OrderServiceTest {

    @Test
    public void testPlaceOrder_CallsProcessPaymentOnce() {
      
        PaymentService paymentServiceMock = mock(PaymentService.class);
        OrderService orderService = new OrderService(paymentServiceMock);

       
        orderService.placeOrder();

        
        verify(paymentServiceMock, times(1)).processPayment();
    }
}
