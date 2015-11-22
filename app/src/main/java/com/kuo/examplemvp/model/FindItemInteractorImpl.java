package com.kuo.examplemvp.model;

import com.kuo.examplemvp.OnFindItemListener;

import java.util.ArrayList;

/**
 * Created by User on 2015/11/22.
 */
public class FindItemInteractorImpl implements FindItemInteractor {

    @Override
    public void onFind(OnFindItemListener onFindItemListener) {
        onFindItemListener.onFindItem(findIntegers());
    }

    private ArrayList<Integer> findIntegers() {

        ArrayList<Integer> integers = new ArrayList<>();

        for(int i = 0 ; i < 10 ; i++) {
            integers.add(i);
        }

        return integers;
    }
}
