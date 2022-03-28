package com.lwl.arknight.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lwl.arknight.VO.DisadvantagedVO;
import com.lwl.arknight.entity.Disadvantaged;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whl
 * @since 2021-12-02
 */
public interface IDisadvantagedService extends IService<Disadvantaged> {
    /**
     * 返回roll到劣势效果
     */
    DisadvantagedVO disadvantafed();

    /**
     * 返回roll到额外两项劣势效果
     */
    DisadvantagedVO disadvantafedAgain(List<Disadvantaged> value);
}
