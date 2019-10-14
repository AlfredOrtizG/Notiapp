package com.teambaa.notiapp.ui.crear_nota;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CrearNotaViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public CrearNotaViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is crear_nota fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}