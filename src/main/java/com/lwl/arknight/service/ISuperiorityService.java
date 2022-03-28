package com.lwl.arknight.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lwl.arknight.VO.SuperiorityVO;
import com.lwl.arknight.entity.Superiority;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whl
 * @since 2021-12-02
 */
public interface ISuperiorityService extends IService<Superiority> {
    /**
     * 返回roll到优势效果
     */
    SuperiorityVO superiority();

    /**
     * 返回roll到的额外两项优势效果
     * @param value
     * @return
     */
    SuperiorityVO superiorityAgain(List<Superiority> value);

    /**
     * 返回roll到的额外两项优势效果
     * @param value
     * @return
     */
    SuperiorityVO superiorityAgain2(List<Superiority> value);

}
