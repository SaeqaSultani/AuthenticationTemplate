package com.asoodaowar.ezTemplate.fragments.sign_in_up_sixth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.asoodaowar.ezTemplate.R;

public class SignInSixthFragment extends Fragment {

    public SignInSixthFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sign_in_sixth, container, false);
        return view;
    }
}
