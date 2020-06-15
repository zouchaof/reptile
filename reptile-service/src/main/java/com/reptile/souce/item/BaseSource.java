package com.reptile.souce.item;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 资源基础
 */
@Data
public class BaseSource implements Serializable {

    /**
     * 资源弱锁任务id
     */
    private List<Integer> sourceLock;

    /**
     * 资源强锁任务id，其他线程不能使用
     */
    private Integer highLockId;

}
