package com.chen.admin.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.admin.bean.DynamicTable;
import com.chen.admin.service.TableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/2/25/02/25  11:01
 */
@Controller
@Slf4j
public class TableController {

    @Autowired
    TableService tableService;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping("basic_table")
    public String basicTable(){
        return "datatables/basic_table";
    }
    @GetMapping("dynamic_table")
    public String dynamicTable(@RequestParam(value = "pn",defaultValue = "1") Integer pn,  Model model){

        Page<DynamicTable> dynamicTablePage = new Page<>(pn,2);
        Page<DynamicTable> page = tableService.page(dynamicTablePage,null);
        /*List<DynamicTable> dynamicTables = tableService.list();
        model.addAttribute("dynamicTables",dynamicTables);*/

        model.addAttribute("dynamicTablePage",page);
        return "datatables/dynamic_table";
    }
    @GetMapping("editable_table")
    public String editableTable(){
        return "datatables/editable_table";
    }
    @GetMapping("pricing_table")
    public String pricingTable(){
        return "datatables/pricing_table";
    }
    @GetMapping("responsive_table")
    public String responsiveTable(){
        return "datatables/responsive_table";
    }

}
