package com.tcv.homework5.service;

import com.tcv.homework5.dto.ProductDTO;
import com.tcv.homework5.mapper.ProductMapper;
import com.tcv.homework5.model.Product;
import com.tcv.homework5.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    public List<ProductDTO> getProducts() {
        return productRepository.findAll().stream()
                .map(productMapper::toProductDTO)
                .collect(Collectors.toList());
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public ProductDTO getProductById(Integer id) {
        return productMapper.toProductDTO(productRepository.findById(id).get());
    }

    public List<Product> getProductsNameSorted() {
        Sort sortASC = Sort.by(Sort.Direction.ASC, "name");
        return productRepository.findAll(sortASC);
    }

}
