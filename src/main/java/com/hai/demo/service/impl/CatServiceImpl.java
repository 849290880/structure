package com.hai.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hai.demo.entity.Cat;
import com.hai.demo.mapper.CatMapper;
import com.hai.demo.service.CatService;
import org.springframework.stereotype.Service;

/**
 * @author ：hai
 * @date ：Created in 2020/6/30 1:50 上午
 */
@Service
public class CatServiceImpl extends ServiceImpl<CatMapper, Cat> implements CatService {



}
