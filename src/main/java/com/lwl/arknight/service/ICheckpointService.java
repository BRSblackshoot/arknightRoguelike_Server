package com.lwl.arknight.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lwl.arknight.entity.Checkpoint;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whl
 * @since 2021-12-02
 */
public interface ICheckpointService extends IService<Checkpoint> {
    /**
     * 返回roll到的关卡
     */
    Checkpoint Checkpoint();
}
