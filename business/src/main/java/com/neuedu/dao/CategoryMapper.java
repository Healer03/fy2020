package com.neuedu.dao;

import com.neuedu.pojo.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_category
     *
     * @mbg.generated
     */
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_category
     *
     * @mbg.generated
     */
    Category selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_category
     *
     * @mbg.generated
     */
    List<Category> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Category record);

    //查询平级子类别
    List<Category> getSubCategorysById(@Param("categoryId") Integer categoryId);
}