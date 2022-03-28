package com.lwl.arknight.controller;

import com.lwl.arknight.VO.DisadvantagedVO;
import com.lwl.arknight.VO.SuperiorityVO;
import com.lwl.arknight.common.http.AxiosResult;
import com.lwl.arknight.entity.Checkpoint;
import com.lwl.arknight.entity.Disadvantaged;
import com.lwl.arknight.entity.Superiority;
import com.lwl.arknight.service.ICheckpointService;
import com.lwl.arknight.service.IDisadvantagedService;
import com.lwl.arknight.service.ISuperiorityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("arknight")
@RequiredArgsConstructor
public class Roll {
    private final ICheckpointService iCheckpointService;
    private final ISuperiorityService iSuperiorityService;
    private final IDisadvantagedService iDisadvantagedService;

    @GetMapping("checkpoint")
    public AxiosResult<Checkpoint> checkpoint() {
        Checkpoint checkpoint = iCheckpointService.Checkpoint();
        if (checkpoint != null) {
            return AxiosResult.success(checkpoint);
        } else {
            return AxiosResult.error();
        }
    }

    @GetMapping("superiority")
    public AxiosResult<SuperiorityVO> superiority() {
        SuperiorityVO superiority = iSuperiorityService.superiority();
        if (superiority != null) {
            return AxiosResult.success(superiority);
        } else {
            return AxiosResult.error();
        }
    }

    @GetMapping("disadvantaged")
    public AxiosResult<DisadvantagedVO> disadvantaged() {
        DisadvantagedVO disadvantafed = iDisadvantagedService.disadvantafed();
        if (disadvantafed != null) {
            return AxiosResult.success(disadvantafed);
        } else {
            return AxiosResult.error();
        }
    }

    @PostMapping("superiorityAgain")
    public AxiosResult<SuperiorityVO> superiorityAgain(@RequestBody List<Superiority> value) {
        SuperiorityVO superiority = iSuperiorityService.superiorityAgain(value);
        if (superiority != null) {
            return AxiosResult.success(superiority);
        } else {
            return AxiosResult.error();
        }
    }

    @PostMapping("superiorityAgain2")
    public AxiosResult<SuperiorityVO> superiorityAgain2(@RequestBody List<Superiority> value) {
        SuperiorityVO superiority = iSuperiorityService.superiorityAgain2(value);
        if (superiority != null) {
            return AxiosResult.success(superiority);
        } else {
            return AxiosResult.error();
        }
    }

    @PostMapping("disadvantagedAgain")
    public AxiosResult<DisadvantagedVO> disadvantagedAgain(@RequestBody List<Disadvantaged> value) {
        DisadvantagedVO disadvantafed = iDisadvantagedService.disadvantafedAgain(value);
        if (disadvantafed != null) {
            return AxiosResult.success(disadvantafed);
        } else {
            return AxiosResult.error();
        }
    }

    @GetMapping("test")
    public String test(){
        return "hallo world";
    }

}
