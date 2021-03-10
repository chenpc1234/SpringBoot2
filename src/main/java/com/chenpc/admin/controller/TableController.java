package com.chenpc.admin.controller;

import com.chenpc.admin.Bean.DynamicTable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/2/25/02/25  11:01
 */
@Controller
public class TableController {
    @GetMapping("basic_table")
    public String basicTable(){

        return "datatables/basic_table";
    }
    @GetMapping("dynamic_table")
    public String dynamicTable(Model model){
        List<DynamicTable> dynamicTables = new ArrayList<>();
        dynamicTables.add(new DynamicTable("Trident","Internet Explorer 4.0","Win 95+","4","X"));
        dynamicTables.add(new DynamicTable("Tasman","Internet Explorer 4.5","Nintendo DS","5","A"));
        dynamicTables.add(new DynamicTable("Misc","Dillo 0.8","Win 95+","8","X"));
        dynamicTables.add(new DynamicTable("Misc","Links","Nintendo DS","4","U"));
        dynamicTables.add(new DynamicTable("Misc","Lynx","Win 95+","12","A"));
        dynamicTables.add(new DynamicTable("Other browsers","All others","Win 95+","3","H"));
        dynamicTables.add(new DynamicTable("Presto","Nintendo DS browser","Mac OS 8-9","20","H"));
        for (DynamicTable dynamicTable : dynamicTables) {
            System.out.println(dynamicTable.getRenderingEngine());
        }
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
