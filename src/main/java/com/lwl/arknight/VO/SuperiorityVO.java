package com.lwl.arknight.VO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.lwl.arknight.entity.Superiority;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author whl
 * @since 2021-12-02
 */
@Component
@Data
public class SuperiorityVO implements Serializable {
    private List<Superiority> superiorityList;

}
