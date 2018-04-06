package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * Created by power on 2018/4/6.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categroyName, Integer parentId);

    ServerResponse updateCategroyName(Integer categoryId,String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse selectCategoryAndChildrenById(Integer categoryId);
}
