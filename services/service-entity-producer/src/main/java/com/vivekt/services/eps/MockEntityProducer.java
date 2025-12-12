package com.vivekt.services.eps;

import com.vivekt.services.eps.domain.EPSOrder;
import org.springframework.stereotype.Service;

import static com.vivekt.services.eps.domain.EPSOrder.*;

@Service
public class MockEntityProducer implements EntityProducer{

    @Override
    public void start() {

        for(int i=0; i<10; i++){
            EPSOrder order = createDummyOrder();
            System.out.println("Order produced.. "  + order);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

  private EPSOrder createDummyOrder(){
    EPSOrder epsOrder = new EPSOrder("ord-" + System.currentTimeMillis());    //EPSOrder.builder().build();


      return epsOrder;
  }
}
