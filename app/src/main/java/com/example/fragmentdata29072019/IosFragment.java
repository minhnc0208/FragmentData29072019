package com.example.fragmentdata29072019;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class IosFragment extends Fragment {
    View view;
    TextView txtAndroid;
    EditText edtAndroid;
    Button btnAndroid;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        txtAndroid = view.findViewById(R.id.textviewIos);
        edtAndroid = view.findViewById(R.id.edittextIos);
        btnAndroid = view.findViewById(R.id.buttonIos);
        view = inflater.inflate(R.layout.fragment_ios, container, false);
        return view;
    }

}
