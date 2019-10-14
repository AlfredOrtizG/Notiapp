package com.teambaa.notiapp.ui.mis_notas;

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

public class MisNotasFragment extends Fragment
{

    private MisNotasViewModel misNotasViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        misNotasViewModel =
                ViewModelProviders.of(this).get(MisNotasViewModel.class);
        View root = inflater.inflate(R.layout.mis_notas, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        misNotasViewModel.getText().observe(this, new Observer<String>()
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