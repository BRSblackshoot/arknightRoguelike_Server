package com.lwl.arknight.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwl.arknight.entity.Disadvantaged;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author whl
 * @since 2021-12-02
 */
public interface DisadvantagedMapper extends BaseMapper<Disadvantaged> {
    int getAllDisadvantagedCount();

    Disadvantaged getDisadvantaged(int number);
}
