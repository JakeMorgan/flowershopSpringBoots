package com.accenture.webService;

import com.accenture.be.access.FlowerAccessService;
import com.accenture.be.entity.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.accenture.webService.FlowersStockService")
@Service
public class FlowersStockServiceImpl implements FlowersStockService{
    @Autowired
    private FlowerAccessService flowerAccessService;
    @Override
    public void increaseFlowersStockSize(int count) {
        List<Flower> flowerList = flowerAccessService.getFlowers();
        for(Flower flower : flowerList){
            flower.setQuantity(flower.getQuantity() + count);
            flowerAccessService.update(flower);
        }
    }
}
