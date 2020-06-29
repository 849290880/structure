package com.hai.demo.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.hai.demo.entity.Cat;
import com.hai.demo.service.CatService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：hai
 * @date ：Created in 2020/6/30 1:45 上午
 */
@RestController
@AllArgsConstructor
public class DemoController {

    private final CatService catService;

    @GetMapping("/list")
    public ResponseEntity<List<Cat>> list(){
        return ResponseEntity.ok(catService.list());
    }


}
