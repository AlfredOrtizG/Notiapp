package com.teambaa.notiapp.ui.crear_nota;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.teambaa.notiapp.R;

public class CrearNotaFragment extends Fragment
{

    private CrearNotaViewModel crearNotaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        crearNotaViewModel =
                ViewModelProviders.of(this).get(CrearNotaViewModel.class);
        View root = inflater.inflate(R.layout.crear_nota, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        crearNotaViewModel.getText().observe(this, new Observer<String>()
        {
            @Override
            public void onChanged(@Nullable String s)
            {
                textView.setText(s);
            }
        });
        return root;
    }
}