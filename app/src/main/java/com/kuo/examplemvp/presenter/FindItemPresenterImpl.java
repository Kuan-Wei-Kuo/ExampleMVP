package com.kuo.examplemvp.presenter;

import com.kuo.examplemvp.FindItemView;
import com.kuo.examplemvp.OnFindItemListener;
import com.kuo.examplemvp.model.FindItemInteractor;
import com.kuo.examplemvp.model.FindItemInteractorImpl;

import java.util.ArrayList;

/**
 * Created by User on 2015/11/22.
 */
public class FindItemPresenterImpl implements FindItemPresenter, OnFindItemListener {

    private FindItemView findItemView;
    private FindItemInteractor findItemInteractor;

    public FindItemPresenterImpl(FindItemView findItemView) {
        this.findItemView = findItemView;
        findItemInteractor = new FindItemInteractorImpl();
    }

    @Override
    public void onStartFind() {
        findItemInteractor.onFind(this);
    }

    @Override
    public void onFindItem(ArrayList<Integer> integers) {
        findItemView.setItem(integers);
    }


}
