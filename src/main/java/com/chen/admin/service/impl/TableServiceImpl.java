package com.chen.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.admin.bean.DynamicTable;
import com.chen.admin.mapper.TableMapper;
import com.chen.admin.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/3/18/03/18  16:40
 */
@Service
public class TableServiceImpl extends ServiceImpl<TableMapper,DynamicTable>implements TableService {

    @Autowired
    TableMapper tableMapper;

    @Override
    public void saveTables(List<DynamicTable> dynamicTables){
        for (DynamicTable dynamicTable : dynamicTables) {
                tableMapper.insert(dynamicTable);
        }
    }
}
