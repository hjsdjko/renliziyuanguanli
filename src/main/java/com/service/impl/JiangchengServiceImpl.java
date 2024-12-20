package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.JiangchengDao;
import com.entity.JiangchengEntity;
import com.service.JiangchengService;
import com.entity.view.JiangchengView;

/**
 * 奖惩 服务实现类
 * @author 
 * @since 2021-03-06
 */
@Service("jiangchengService")
@Transactional
public class JiangchengServiceImpl extends ServiceImpl<JiangchengDao, JiangchengEntity> implements JiangchengService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<JiangchengView> page =new Query<JiangchengView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
