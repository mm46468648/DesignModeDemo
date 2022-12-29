package com.example.model.FactoryMethod.Sample.idcard;
import com.example.model.FactoryMethod.Sample.framework.Factory;
import com.example.model.FactoryMethod.Sample.framework.Product;

import java.util.*;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
    public List getOwners() {
        return owners;
    }
}
