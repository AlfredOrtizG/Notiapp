package com.teambaa.notiapp.ui.modificar_nota;

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

public class ModificarNotaFragment extends Fragment
{

    private ModificarNotaViewModel modificarNotaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        modificarNotaViewModel =
                ViewModelProviders.of(this).get(ModificarNotaViewModel.class);
        View root = inflater.inflate(R.layout.modificar_nota, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        modificarNotaViewModel.getText().observe(this, new Observer<String>()
        {
            @Override
            public void onChanged(@Nullable String s)
            {
                textView.setText(s);
            }
        });
//        Bundle bundle = this.getArguments();
//        if (bundle != null)
//        {
//            int id = Integer.parseInt(bundle.get("id").toString());
//            System.out.println(id);
//        }
        return root;
    }
}