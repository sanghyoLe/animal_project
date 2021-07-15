package com.example.animal_project.Freestall;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.animal_project.Input_userinfo;
import com.example.animal_project.MilkCowViewModel;
import com.example.animal_project.QuestionTemplate;
import com.example.animal_project.QuestionTemplateViewModel;
import com.example.animal_project.R;
import com.example.animal_project.Result_View;


public class FreestallOutGenitals extends Fragment {
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_freestall_out_genitals, container, false);
        MilkCowViewModel viewModel = new ViewModelProvider(getActivity()).get(MilkCowViewModel.class);
        QuestionTemplateViewModel viewModel2 = new ViewModelProvider(getActivity()).get(QuestionTemplateViewModel.class);
        TextView ratio_number = (TextView) view.findViewById(R.id.ratio_number);
        EditText outgenitals_location_a1 = (EditText) view.findViewById(R.id.outgenitals_location_a1);
        EditText outgenitals_a1 = (EditText) view.findViewById(R.id.outgenitals_a1);
        TextView outgenitals_ratio_1 = (TextView) view.findViewById(R.id.outgenitals_ratio_1);

        ratio_number.setText(String.valueOf(viewModel2.getSampleCowSize())); //표본 두수 표시
        outgenitals_a1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(TextUtils.isEmpty(outgenitals_a1.getText().toString())){
                    outgenitals_ratio_1.setText("값을 입력하세요");
                    viewModel.setOutGenitalsRatio(-1);
                } else if(viewModel2.getRatio(outgenitals_a1) > 100) {
                    viewModel.setOutGenitalsRatio(-1);
                    outgenitals_ratio_1.setText("표본 규모보다 큰 값 입력 불가");
                } else {
                    viewModel.setOutGenitalsRatio(viewModel2.getRatio(outgenitals_a1));
                    outgenitals_ratio_1.setText(String.valueOf(viewModel2.getRatio(outgenitals_a1)));
                }
            }
        });
        return view;
    }
}