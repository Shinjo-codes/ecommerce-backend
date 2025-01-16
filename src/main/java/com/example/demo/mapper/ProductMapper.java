package com.example.demo.mapper;

import com.example.demo.dto.CommentDTO;
import com.example.demo.dto.ProductDTO;
import com.example.demo.model.Comment;
import com.example.demo.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "image", source = "image")
    Product toEntity(ProductDTO productDTO);

    @Mapping(target = "image", source = "image")
    ProductDTO toDTO(Product product);

    @Mapping(target = "user.id", source = "userId" )
    @Mapping(target = "product", ignore = true)
    @Mapping(target = "score", source = "score")
    Comment toEntity(CommentDTO commentDTO);

    @Mapping(target = "userId", source = "user.id" )
    @Mapping(target = "score", source = "score")
    CommentDTO toDTO(Comment comment);
}
