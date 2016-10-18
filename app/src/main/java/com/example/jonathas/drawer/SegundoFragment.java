package com.example.jonathas.drawer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jonathas on 18/10/2016.
 */

public class SegundoFragment extends Fragment {
    View minhaView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        minhaView = inflater.inflate(R.layout.segundo_layout, container, false);
        return minhaView;
    }
}
