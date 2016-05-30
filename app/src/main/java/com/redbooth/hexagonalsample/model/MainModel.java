package com.redbooth.hexagonalsample.model;

import android.content.Context;

import com.redbooth.hexagonalsample.presenter.MainPresenter;

public interface MainModel {
    public void setPresenter(MainPresenter presenter);
    public void startLoadingData(Context context);
}
