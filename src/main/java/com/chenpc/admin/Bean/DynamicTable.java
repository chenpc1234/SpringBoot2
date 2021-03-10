package com.chenpc.admin.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/3/1/03/01  15:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DynamicTable {
    private String renderingEngine;
    private String browser;
    private String platform;
    private String engineVersion;
    private String cssGrade;
}
