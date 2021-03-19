package com.chen.admin.controller;

import com.chen.admin.bean.DynamicTable;
import com.chen.admin.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/2/25/02/25  11:01
 */
@Controller
public class TableController {

    @Autowired
    TableService tableService;

    @GetMapping("basic_table")
    public String basicTable(){
        return "datatables/basic_table";
    }
    @GetMapping("dynamic_table")
    public String dynamicTable(Model model){
        List<DynamicTable> dynamicTables = tableService.list();
        model.addAttribute("dynamicTables",dynamicTables);
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
