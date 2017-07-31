package com.codingblocks.interfragmentcommunication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by the-dagger on 25/06/17.
 */

public class FragmentA extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_a, container, false);



        final EditText editText = v.findViewById(R.id.editTextFragmentA);
        Button button = v.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = editText.getText().toString();
                Communicator communicator = (Communicator) getActivity();
                communicator.changeText(string);
            }
        });


        return v;
    }
}
