package com.teambaa.notiapp.ui.modificar_nota;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ModificarNotaViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public ModificarNotaViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is modificar_nota fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}