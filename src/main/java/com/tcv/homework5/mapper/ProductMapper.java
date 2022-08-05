package com.tcv.homework5.mapper;

import com.tcv.homework5.dto.ProductDTO;
import com.tcv.homework5.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toProductDTO(Product product);
}
