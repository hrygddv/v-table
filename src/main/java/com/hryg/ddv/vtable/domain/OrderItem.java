package com.hryg.ddv.vtable.domain;

/**
 * 点菜单项
 *
 * @author hryg
 * Created on 2018-10-09
 */
public class OrderItem {
    private Integer id;
    private Order order;
    private Dish dish;
    private Integer grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
