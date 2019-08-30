package com.amy.sell.utils;

import com.amy.sell.constant.PageConst;
import org.springframework.ui.ModelMap;


public class PageUtil {

    /**
     *
     * @author Yuzhuting
     * @date 2018/5/22 12:11
     * @param map, count, size
     * @return void
    **/         
    public static void addPageInfo(ModelMap map, int count, int size, int pageSize, int page){
        map.put(PageConst.COUNT, count);
        map.put(PageConst.MAX_PAGE, count/10);
        map.put(PageConst.NOW_BEGIN, size==0 ? size : pageSize * (page - 1 ) + 1);
        map.put(PageConst.NOW_END, pageSize * (page - 1 ) + size);
    }
}
