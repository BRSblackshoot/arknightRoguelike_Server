package com.lwl.arknight.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwl.arknight.VO.DisadvantagedVO;
import com.lwl.arknight.common.utils.Randoms;
import com.lwl.arknight.entity.Disadvantaged;
import com.lwl.arknight.mapper.DisadvantagedMapper;
import com.lwl.arknight.service.IDisadvantagedService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
public class DisadvantagedServiceImpl extends ServiceImpl<DisadvantagedMapper, Disadvantaged> implements IDisadvantagedService {

    private final DisadvantagedMapper disadvantagedMapper;

    @Override
    public DisadvantagedVO disadvantafed() {
        int number = disadvantagedMapper.getAllDisadvantagedCount();
        if (number > 3) {
            List<Integer> integers = Randoms.genUniqueRandomVal(1, number, 3);
            List<Disadvantaged> list = new ArrayList<>();
            integers.stream().forEach(n ->
                    {
                        Disadvantaged superiority = disadvantagedMapper.getDisadvantaged(n);
                        list.add(superiority);
                    }
            );
            DisadvantagedVO disadvantagedVO = new DisadvantagedVO();
            disadvantagedVO.setDisadvantagedList(list);
            return disadvantagedVO;
        } else {
            return null;
        }
    }

    @Override
    public DisadvantagedVO disadvantafedAgain(List<Disadvantaged> value) {
        List<Integer> chooselist = new ArrayList<>();
        value.stream().forEach(d ->chooselist.add(d.getId()));

        int number = disadvantagedMapper.getAllDisadvantagedCount();
        if (number > 3) {
            List<Integer> integers = Randoms.genUniqueRandomVal(1, number, 2,chooselist);
            List<Disadvantaged> list = new ArrayList<>();
            integers.stream().forEach(n ->
                    {
                        Disadvantaged superiority = disadvantagedMapper.getDisadvantaged(n);
                        list.add(superiority);
                    }
            );
            DisadvantagedVO disadvantagedVO = new DisadvantagedVO();
            disadvantagedVO.setDisadvantagedList(list);
            return disadvantagedVO;
        } else {
            return null;
        }
    }
}
