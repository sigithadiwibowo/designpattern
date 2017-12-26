package com.sigit.pattern.stuctural.facade.stock;


import java.util.Objects;

public class StockRepoImpl implements StockRepo {
    @Override
    public boolean isReady(String productId) {
        return !Objects.equals(productId, "1");
    }
}
