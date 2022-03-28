package com.lwl.arknight.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwl.arknight.entity.Checkpoint;
import com.lwl.arknight.mapper.CheckpointMapper;
import com.lwl.arknight.service.ICheckpointService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-12-02
 */
@Service
@RequiredArgsConstructor
public class CheckpointServiceImpl extends ServiceImpl<CheckpointMapper, Checkpoint> implements ICheckpointService {
    private final CheckpointMapper checkpointMapper;

    /**
     * 返回具体的关卡
     * @return
     */
    @Override
    public Checkpoint Checkpoint() {
        int allCheckPointCount = checkpointMapper.getAllCheckPointCount();
        if (allCheckPointCount>0){
            Random random = new Random();
            //获取关卡
            int number = random.nextInt(allCheckPointCount)+1;
            Checkpoint checkPoint = checkpointMapper.getCheckPoint(number);
            return checkPoint;
        }
        return null;
    }
}
