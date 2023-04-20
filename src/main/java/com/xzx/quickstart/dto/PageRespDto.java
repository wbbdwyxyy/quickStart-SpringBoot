package com.xzx.quickstart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author xzx
 * @date 2023/4/20
 */
@Data
@AllArgsConstructor
public class PageRespDto<T> {

    private List<T> records;

    private long total;
}
