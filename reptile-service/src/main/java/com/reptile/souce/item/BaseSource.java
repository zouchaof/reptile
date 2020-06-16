package com.reptile.souce.item;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 资源基础
 */
@Data
public class BaseSource implements Serializable {

    /**
     * 资源弱锁任务id,以及预计时间
     */
    private Map<Integer, Integer> taskTimeMap;
//    private List<Integer> sourceLock;

    /**
     * 资源强锁任务id，其他线程不能使用
     */
    private Integer highLockId;

    private int status;

    private Integer z_floor;//楼层-z轴高度

    private Integer x_index;//第几格-x轴坐标

}
