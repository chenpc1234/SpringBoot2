package com.chen.admin.mapper;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.admin.bean.DynamicTable;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/3/18/03/18  16:32
 */
@TableName("Dynamic_Table")
public interface TableMapper extends BaseMapper<DynamicTable> {

}
