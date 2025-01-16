package com.example.demo.mapper;

import com.example.demo.dto.CommentDTO;
import com.example.demo.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    @Mapping(target = "user.id", source = "userId" )
    @Mapping(target = "product", ignore = true)
    @Mapping(target = "score", source = "score")
    Comment toEntity(CommentDTO commentDTO);

    @Mapping(target = "userId", source = "user.id" )
    @Mapping(target = "score", source = "score")
    CommentDTO toDTO(Comment comment);

}
