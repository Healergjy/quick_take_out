package com.gjy.quick.dto;

import com.gjy.quick.entity.Setmeal;
import com.gjy.quick.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
