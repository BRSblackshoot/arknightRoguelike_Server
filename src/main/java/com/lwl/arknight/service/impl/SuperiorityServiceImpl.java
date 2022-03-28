package com.lwl.arknight.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwl.arknight.VO.SuperiorityVO;
import com.lwl.arknight.common.utils.Randoms;
import com.lwl.arknight.entity.Superiority;
import com.lwl.arknight.mapper.SuperiorityMapper;
import com.lwl.arknight.service.ISuperiorityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-12-02
 */
@Service
@RequiredArgsConstructor
public class SuperiorityServiceImpl extends ServiceImpl<SuperiorityMapper, Superiority> implements ISuperiorityService {
    private final SuperiorityMapper superiorityMapper;

    @Override
    public SuperiorityVO superiority() {
        int number = superiorityMapper.getAllSuperiorityCount();
        if (number > 3) {
            List<Integer> integers = Randoms.genUniqueRandomVal(1, number, 3);
            List<Superiority> list = new ArrayList<>();
            integers.stream().forEach(n ->
                    {
                        Superiority superiority = superiorityMapper.getSuperiority(n);
                        list.add(superiority);
                    }
            );
            SuperiorityVO superiorityVO = new SuperiorityVO();
            superiorityVO.setSuperiorityList(list);
            return superiorityVO;
        } else {
            return null;
        }
    }

    @Override
    public SuperiorityVO superiorityAgain(List<Superiority> value) {
        //拆解前端拿到的优势列表
        List<Integer> chooselist=new ArrayList<>();
        value.stream().forEach(s -> chooselist.add(s.getId()));
        //调用方法获得新的优势
        int number = superiorityMapper.getAllSuperiorityCount();
        if (number > 3) {
            List<Integer> integers = Randoms.genUniqueRandomVal(1, number, 2,chooselist);
            List<Superiority> list = new ArrayList<>();
            integers.stream().forEach(n ->
                    {
                        Superiority superiority = superiorityMapper.getSuperiority(n);
                        list.add(superiority);
                    }
            );
            SuperiorityVO superiorityVO = new SuperiorityVO();
            superiorityVO.setSuperiorityList(list);
            return superiorityVO;
        } else {
            return null;
        }
    }

    @Override
    public SuperiorityVO superiorityAgain2(List<Superiority> value) {
        //拆解前端拿到的优势列表
        List<Integer> chooselist=new ArrayList<>();
        value.stream().forEach(s -> chooselist.add(s.getId()));
        //调用方法获得新的优势
        int number = superiorityMapper.getAllSuperiorityCount();
        if (number > 3) {
            List<Integer> integers = Randoms.genUniqueRandomVal(1, number, 1,chooselist);
            List<Superiority> list = new ArrayList<>();
            integers.stream().forEach(n ->
                    {
                        Superiority superiority = superiorityMapper.getSuperiority(n);
                        list.add(superiority);
                    }
            );
            SuperiorityVO superiorityVO = new SuperiorityVO();
            superiorityVO.setSuperiorityList(list);
            return superiorityVO;
        } else {
            return null;
        }
    }
}
