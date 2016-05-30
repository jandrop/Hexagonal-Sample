package com.redbooth.hexagonalsample.presenter;

import com.redbooth.hexagonalsample.model.MainCursorModel;
import com.redbooth.hexagonalsample.model.MainModel;
import com.redbooth.hexagonalsample.view.MainView;

public class PresenterFactory {
    public static MainPresenter getMainPresenter(MainView view) {
        MainModel model = new MainCursorModel();
        return MainPresenter.newInstance(view, model);
    }
}
