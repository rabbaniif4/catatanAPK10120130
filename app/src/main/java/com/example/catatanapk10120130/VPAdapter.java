package com.example.catatanapk10120130;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
/*
NIM : 10120130
NAMA: MUHAMMAD RABBANI A
KELAS : IF-4
 */
public class VPAdapter extends FragmentStateAdapter {
    ArrayList<Fragment> arr;
    public VPAdapter(@NonNull FragmentActivity fragmentActivity, ArrayList<Fragment> arr) {
        super(fragmentActivity);
        this.arr = arr;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return arr.get(position);
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }
}