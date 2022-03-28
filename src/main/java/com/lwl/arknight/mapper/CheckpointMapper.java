package com.lwl.arknight.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwl.arknight.entity.Checkpoint;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author whl
 * @since 2021-12-02
 */
public interface CheckpointMapper extends BaseMapper<Checkpoint> {
    int getAllCheckPointCount();

    Checkpoint getCheckPoint(int number);

}
