package com.hryg.ddv.vtable.domain;

/**
 * 菜品标签
 *
 * @author hryg
 * Created on 2018-10-09
 */
public class DishTag {
    private Integer id;
    private Dish dish;
    private Tag tag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
