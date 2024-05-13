package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.ButieDao;
import com.entity.ButieEntity;
import com.service.ButieService;
import com.entity.view.ButieView;

/**
 * 离职退休费用 服务实现类
 * @author 
 * @since 2021-03-06
 */
@Service("butieService")
@Transactional
public class ButieServiceImpl extends ServiceImpl<ButieDao, ButieEntity> implements ButieService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ButieView> page =new Query<ButieView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
