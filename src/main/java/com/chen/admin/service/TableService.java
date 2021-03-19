package com.chen.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.admin.bean.DynamicTable;

import java.util.List;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/3/18/03/18  16:40
 */
public interface TableService extends IService<DynamicTable> {
    /**
     * 保存多个表数据
     * @param dynamicTables 表数据集合
     */
    public void saveTables(List<DynamicTable> dynamicTables);
}
