package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.ButieEntity;

import com.service.ButieService;
import com.entity.view.ButieView;
import com.service.YonghuService;
import com.entity.YonghuEntity;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 离职退休费用
 * 后端接口
 * @author
 * @email
 * @date 2021-03-06
*/
@RestController
@Controller
@RequestMapping("/butie")
public class ButieController {
    private static final Logger logger = LoggerFactory.getLogger(ButieController.class);

    @Autowired
    private ButieService butieService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;


    //级联表service
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        PageUtils page = butieService.queryPage(params);

        //字典表数据转换
        List<ButieView> list =(List<ButieView>)page.getList();
        for(ButieView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ButieEntity butie = butieService.selectById(id);
        if(butie !=null){
            //entity转view
            ButieView view = new ButieView();
            BeanUtils.copyProperties( butie , view );//把实体数据重构到view中

            //级联表
            YonghuEntity yonghu = yonghuService.selectById(butie.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ButieEntity butie, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,butie:{}",this.getClass().getName(),butie.toString());
        Wrapper<ButieEntity> queryWrapper = new EntityWrapper<ButieEntity>()
            .eq("yonghu_id", butie.getYonghuId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ButieEntity butieEntity = butieService.selectOne(queryWrapper);
        if(butieEntity==null){
            butie.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      butie.set
        //  }
            butieService.insert(butie);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ButieEntity butie, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,butie:{}",this.getClass().getName(),butie.toString());
        //根据字段查询是否有相同数据
        Wrapper<ButieEntity> queryWrapper = new EntityWrapper<ButieEntity>()
            .notIn("id",butie.getId())
            .eq("yonghu_id", butie.getYonghuId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ButieEntity butieEntity = butieService.selectOne(queryWrapper);
        if(butieEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      butie.set
            //  }
            butieService.updateById(butie);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        butieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


}
