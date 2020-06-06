/**
 * @author：anlzou
 * @Date：Created in21:40 2020/6/6
 * @Github：https://github.com/anlzou
 * @Description：
 */
package com.anlzou.dao.impl;

import com.anlzou.dao.CbcDao;

public class CbcDaoImpl implements CbcDao {
    @Override
    public void zhuangMoney() {
        System.out.println("CbcDaoImpl.....zhuangMoney()...转账成功");
    }

    @Override
    public void selectMoney() {
        System.out.println("CbcDaoImpl.....selectMoney()...您的账户余额为1000万");
    }

    @Override
    public Float selectQian() {
        System.out.println("CbcDaoImpl.....selectQian()...您的账户余额为200万");
        return 200F;
    }

    @Override
    public void invest() {
        System.out.println("CbcDaoImpl.....invest()...恭喜您，投资失败");
    }

    @Override
    public void chongZhi() {
        System.out.println("CbcDaoImpl.....chongZhi....恭喜您，花费充错了");
    }
}
