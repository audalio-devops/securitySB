package com.ajrdevops.securitysb.product;

import java.util.List;

public interface IProductService {
    List<Product> listAll();
    Product create (Product product);
    Product update (Product product);
    void delete(Long id);
}
