package com.reptile.souce.item;

import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * 表示抓手
 */
@Data
public class ZhuaShou extends MoveSource{

    private Set<Integer> z_floorSet;//占据楼层

    private Integer x_index;//第几格-x轴坐标

}
