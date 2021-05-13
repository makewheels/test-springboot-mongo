package com.github.makewheels.testspringbootmongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Book {
    @Id
    private String id;
    private String name;
    private Integer number;
    private Double digital;
    private Date createTime;
    private Boolean isEnable;
}

