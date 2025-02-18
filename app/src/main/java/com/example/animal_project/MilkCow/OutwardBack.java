package com.example.animal_project.MilkCow;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.animal_project.QuestionTemplateViewModel;
import com.example.animal_project.R;


public class OutwardBack extends Fragment {
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_outward_back, container, false);

        QuestionTemplateViewModel viewModel = new ViewModelProvider(getActivity()).get(QuestionTemplateViewModel.class);
        MilkCowScoreCalculator mc = new MilkCowScoreCalculator();

        EditText outwardBackEd = (EditText) view.findViewById(R.id.outward_back_ed);
        TextView outwardBackRatioTv = (TextView) view.findViewById(R.id.outward_back_ratio_tv);
        TextView outwardBackScoreTv = (TextView) view.findViewById(R.id.outward_back_reg_score_tv);


        outwardBackEd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(TextUtils.isEmpty(outwardBackEd.getText().toString())){
                    ((QuestionTemplateViewModel.Question) viewModel.OutwardBack).setNumberOfCow(-1);
                    ((QuestionTemplateViewModel.Question) viewModel.OutwardBack).setScore(-1);
                    ((QuestionTemplateViewModel.Question) viewModel.OutwardBack).setRatio(-1);
                    outwardBackRatioTv.setText("값을 입력해주세요");
                    outwardBackScoreTv.setText("-1");
                } else if (viewModel.getSampleCowSize() < Integer.parseInt(outwardBackEd.getText().toString())) {
                    ((QuestionTemplateViewModel.Question) viewModel.OutwardBack).setNumberOfCow(-1);
                    ((QuestionTemplateViewModel.Question) viewModel.OutwardBack).setScore(-1);
                    ((QuestionTemplateViewModel.Question) viewModel.OutwardBack).setRatio(-1);
                    outwardBackRatioTv.setText("총 두수보다 큰 값을 입력할 수 없습니다.");
                    outwardBackScoreTv.setText("-1");
                } else {
                    int appearanceQ2Score = 0;
                    float ratio = Float.parseFloat(outwardBackEd.getText().toString()) / viewModel.getSampleCowSize();
                    ratio = ratio * 100;
                    ratio = viewModel.cutDecimal(ratio);
                    outwardBackRatioTv.setText(String.valueOf(ratio));
                    appearanceQ2Score = mc.calculatorAppearanceQ2Score(ratio);
                    outwardBackScoreTv.setText(String.valueOf(appearanceQ2Score));
                    ((QuestionTemplateViewModel.Question) viewModel.OutwardBack).setNumberOfCow(Integer.parseInt(outwardBackEd.getText().toString()));
                    ((QuestionTemplateViewModel.Question) viewModel.OutwardBack).setScore(appearanceQ2Score);
                    ((QuestionTemplateViewModel.Question) viewModel.OutwardBack).setRatio(ratio);
                }
            }
        });
        return view;
    }
}