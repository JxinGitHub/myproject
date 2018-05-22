package xyz.eazyfree.domain;

import lombok.Data;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/16.12:37
 */
@Data
public class City {

    /**
     * 城市编号
     */
    private Long id;

    /**
     * 省份编号
     */
    private Long provinceId;


    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 描述
     */
    private String description;


}
