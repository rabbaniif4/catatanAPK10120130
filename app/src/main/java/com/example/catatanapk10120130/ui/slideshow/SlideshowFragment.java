package com.example.catatanapk10120130.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.catatanapk10120130.R;
import com.example.catatanapk10120130.databinding.FragmentSlideshowBinding;
/*
NIM : 10120130
NAMA: MUHAMMAD RABBANI A
KELAS : IF-4
 */
public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_slideshow, container, false);
    }
}