package  com.asoodaowar.ezTemplate.fragments.sign_in_up_ninth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.asoodaowar.ezTemplate.R;

public class SignUpNinthFragment extends Fragment {

    public SignUpNinthFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sign_up_ninth, container, false);
        return view;
    }
}
