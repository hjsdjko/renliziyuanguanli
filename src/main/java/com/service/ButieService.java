package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ButieEntity;
import java.util.Map;

/**
 * 离职退休费用 服务类
 * @author 
 * @since 2021-03-06
 */
public interface ButieService extends IService<ButieEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);

}