package com.github.makewheels.testspringbootmongo;

import com.alibaba.fastjson.JSON;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("book")
public class BookController {
    @Resource
    private MongoTemplate mongoTemplate;

    @RequestMapping("add")
    @ResponseBody
    public String add() {
        Book book = new Book();
        book.setNumber(123);
        book.setDigital(45.567);
        book.setCreateTime(new Date());
        book.setName(UUID.randomUUID().toString());
        return JSON.toJSONString(book);
    }

    @RequestMapping("query")
    public String query(@RequestParam String name) {
        Criteria criteria = Criteria.where("name").is(name);
        Query query = new Query(criteria);
        List<Book> books = mongoTemplate.find(query, Book.class);
        return JSON.toJSONString(books);
    }

}
