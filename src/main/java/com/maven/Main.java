package com.maven;

import java.time.LocalDate;
import org.mapstruct.factory.Mappers;

import br.dto.UserDTO;
import br.mapper.UserMapper;
import br.model.UserModel;

public class Main {


    private final static UserMapper mapper = Mappers.getMapper(UserMapper.class);

    public static void main(String[] args) {
        var model = new UserModel();
        model.setCode(1);
        model.setUserName("james");
        model.setBirthday(LocalDate.now().minusYears(30));
        System.out.println(mapper.toDTO(model));


       var dto = new UserDTO();
       dto.setId(2);
       dto.setName("maria");
       dto.setBirthday(LocalDate.now().minusYears(30));
       System.out.println(mapper.toModel(dto));
    }
}