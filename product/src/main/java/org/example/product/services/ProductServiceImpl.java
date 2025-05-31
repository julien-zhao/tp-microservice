package org.example.product.services;

import lombok.RequiredArgsConstructor;
import org.example.product.dtos.ProductDto;
import org.example.product.models.Product;
import org.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductDto getProduct(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produit non trouvé avec id : " + id));

        return ProductDto.builder()
                .productid(product.getProductid())
                .name(product.getName())
                .weight(product.getWeight())
                .serviceAddress(product.getServiceAddress())
                .build();
    }


    @Override
    public ProductDto saveProduct(ProductDto dto) {
        Product entity = Product.builder()
                .name(dto.getName())
                .weight(dto.getWeight())
                .serviceAddress(dto.getServiceAddress())
                .build();

        Product saved = productRepository.save(entity);

        return ProductDto.builder()
                .productid(saved.getProductid())
                .name(saved.getName())
                .weight(saved.getWeight())
                .serviceAddress(saved.getServiceAddress())
                .build();
    }

}