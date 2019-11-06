package com.example.fragmentdata29072019;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidFragment extends Fragment {
    View view;
    TextView txtAndroid;
    EditText edtAndroid;
    Button btnAndroid;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_android, container, false);
        Bundle bundle = getArguments();
        String chuoi = bundle.getString("chuoi");
        Toast.makeText(getContext(), chuoi, Toast.LENGTH_SHORT).show();
        txtAndroid = view.findViewById(R.id.textviewAndroid);
        edtAndroid = view.findViewById(R.id.edittextAndroid);
        btnAndroid = view.findViewById(R.id.buttonAndroid);
        return view;
    }

}
