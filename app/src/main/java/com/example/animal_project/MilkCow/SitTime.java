package com.example.animal_project.MilkCow;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.animal_project.QuestionTemplateViewModel;
import com.example.animal_project.R;


public class SitTime extends Fragment {
    private QuestionTemplateViewModel viewModel;

    private View view;
    private int sitCount;
    private EditText[] sitTimeAnswer;
    float sitTimeAvg = 0;
    private boolean isTouched;
    int sitTimeScore;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        isTouched = false;
        viewModel = new ViewModelProvider(getActivity()).get(QuestionTemplateViewModel.class);


        view = inflater.inflate(R.layout.fragment_sit_time, container, false);

        TextView sit_time_ratio = view.findViewById(R.id.sit_time_ratio);
        TextView sit_time_score = view.findViewById(R.id.sit_time_score);

        if(
                (((QuestionTemplateViewModel.SitTimeQuestion)viewModel.SitTimeQuestion).getSitTimeAvg()) != -1
        ) {
            sit_time_ratio.setText(String.valueOf(
                    ((QuestionTemplateViewModel.SitTimeQuestion)viewModel.SitTimeQuestion).getSitTimeAvg()
            ));
        }
        if(
                (((QuestionTemplateViewModel.SitTimeQuestion)viewModel.SitTimeQuestion).getScore()) != -1
        ) {
            sit_time_score.setText(String.valueOf(
                    ((QuestionTemplateViewModel.SitTimeQuestion)viewModel.SitTimeQuestion).getScore()
            ));
        }

        View question_1 = view.findViewById(R.id.sit_time_question_1);
        View question_2 = view.findViewById(R.id.sit_time_question_2);
        View question_3 = view.findViewById(R.id.sit_time_question_3);
        View question_4 = view.findViewById(R.id.sit_time_question_4);
        View question_5 = view.findViewById(R.id.sit_time_question_5);
        View question_6 = view.findViewById(R.id.sit_time_question_6);
        View question_7 = view.findViewById(R.id.sit_time_question_7);
        View question_8 = view.findViewById(R.id.sit_time_question_8);
        View question_9 = view.findViewById(R.id.sit_time_question_9);
        View question_10 = view.findViewById(R.id.sit_time_question_10);
        View question_11 = view.findViewById(R.id.sit_time_question_11);
        View question_12 = view.findViewById(R.id.sit_time_question_12);
        View question_13 = view.findViewById(R.id.sit_time_question_13);
        View question_14 = view.findViewById(R.id.sit_time_question_14);
        View question_15 = view.findViewById(R.id.sit_time_question_15);
        View question_16 = view.findViewById(R.id.sit_time_question_16);
        View question_17 = view.findViewById(R.id.sit_time_question_17);
        View question_18 = view.findViewById(R.id.sit_time_question_18);
        View question_19 = view.findViewById(R.id.sit_time_question_19);
        View question_20 = view.findViewById(R.id.sit_time_question_20);
        View question_21 = view.findViewById(R.id.sit_time_question_21);
        View question_22 = view.findViewById(R.id.sit_time_question_22);
        View question_23 = view.findViewById(R.id.sit_time_question_23);
        View question_24 = view.findViewById(R.id.sit_time_question_24);
        View question_25 = view.findViewById(R.id.sit_time_question_25);
        View question_26 = view.findViewById(R.id.sit_time_question_26);
        View question_27 = view.findViewById(R.id.sit_time_question_27);
        View question_28 = view.findViewById(R.id.sit_time_question_28);
        View question_29 = view.findViewById(R.id.sit_time_question_29);
        View question_30 = view.findViewById(R.id.sit_time_question_30);
        View question_31 = view.findViewById(R.id.sit_time_question_31);
        View question_32 = view.findViewById(R.id.sit_time_question_32);
        View question_33 = view.findViewById(R.id.sit_time_question_33);
        View question_34 = view.findViewById(R.id.sit_time_question_34);
        View question_35 = view.findViewById(R.id.sit_time_question_35);
        View question_36 = view.findViewById(R.id.sit_time_question_36);
        View question_37 = view.findViewById(R.id.sit_time_question_37);
        View question_38 = view.findViewById(R.id.sit_time_question_38);
        View question_39 = view.findViewById(R.id.sit_time_question_39);
        View question_40 = view.findViewById(R.id.sit_time_question_40);
        View question_41 = view.findViewById(R.id.sit_time_question_41);
        View question_42 = view.findViewById(R.id.sit_time_question_42);
        View question_43 = view.findViewById(R.id.sit_time_question_43);
        View question_44 = view.findViewById(R.id.sit_time_question_44);
        View question_45 = view.findViewById(R.id.sit_time_question_45);
        View question_46 = view.findViewById(R.id.sit_time_question_46);
        View question_47 = view.findViewById(R.id.sit_time_question_47);
        View question_48 = view.findViewById(R.id.sit_time_question_48);
        View question_49 = view.findViewById(R.id.sit_time_question_49);
        View question_50 = view.findViewById(R.id.sit_time_question_50);

        View[] questionViewArr = {
                question_1, question_2, question_3, question_4, question_5
                , question_6, question_7, question_8, question_9, question_10
                , question_11, question_12, question_13, question_14, question_15
                , question_16, question_17, question_18, question_19, question_20
                , question_21, question_22, question_23, question_24, question_25
                , question_26, question_27, question_28, question_29, question_30
                , question_31, question_32, question_33, question_34, question_35
                , question_36, question_37, question_38, question_39, question_40,
                question_41, question_42, question_43, question_44, question_45
                , question_46, question_47, question_48, question_49, question_50};


        Spinner numSpinner = view.findViewById(R.id.sit_time_spinner);
        ArrayAdapter spinnerAdapter = ArrayAdapter.createFromResource(getActivity().getApplicationContext(), R.array.sit_collision_num, android.R.layout.simple_dropdown_item_1line);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        numSpinner.setAdapter(spinnerAdapter);
        numSpinner.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                isTouched = true;
                return false;
            }
        });

        final int[] selectedItemIndex = new int[1];
        numSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // 선택된 데이터 값
                String selectedItem = parent.getSelectedItem().toString();
                // 선택된 데이터 위치( 0 부터 )
                selectedItemIndex[0] = position;

                if(selectedItemIndex[0] == 0){
                    showQuestionView(questionViewArr,0);
                }
                if(selectedItemIndex[0] != 0){
                    sitCount = selectedItemIndex[0] + 5;

                    sitTimeAnswer = makeEditText(questionViewArr, sitCount, R.id.sit_time_duration);
                    showQuestionView(questionViewArr, sitCount);
                    if(isTouched){
                        for(int i = 0 ; i< sitCount ; i++){
                            ((QuestionTemplateViewModel.SitTimeQuestion)viewModel.SitTimeQuestion).setSitTime(String.valueOf(-1),i);
                            sitTimeAnswer[i].setText("");
                        }

                    }
                    ((QuestionTemplateViewModel.SitTimeQuestion)viewModel.SitTimeQuestion).setSitCount(sitCount);
                    for(int i = 0 ; i < sitCount; i++){
                        int finalI = i;
                        sitTimeAnswer[i].addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {
                                if(TextUtils.isEmpty(sitTimeAnswer[finalI].getText().toString())){
                                    sit_time_ratio.setText((finalI + 1) + "번 앉기 동작 문항을 완료하세요.");
                                    sit_time_score.setText((finalI + 1) + "번 앉기 동작 문항을 완료하세요.");
                                    ((QuestionTemplateViewModel.SitTimeQuestion)viewModel.SitTimeQuestion).setSitTime(String.valueOf(-1),finalI);
                                } else{
                                    ((QuestionTemplateViewModel.SitTimeQuestion)viewModel.SitTimeQuestion).setSitTime(sitTimeAnswer[finalI].getText().toString(),finalI);
                                    sitTimeAvg = 0;
                                    int[] sitTimeArr = ((QuestionTemplateViewModel.SitTimeQuestion)viewModel.SitTimeQuestion).getSitTime();
                                    for(int j = 0 ; j < sitCount ; j++){
                                        sitTimeAvg += sitTimeArr[j];
                                    }

                                    sitTimeAvg = sitTimeAvg / (float)sitCount;
                                    sitTimeAvg = (float) viewModel.cutDecimal(sitTimeAvg);
                                    sit_time_ratio.setText(String.valueOf(sitTimeAvg));
                                    sit_time_score.setText(String.valueOf(calculatorSitTimeScore(sitTimeAvg)));

                                    ((QuestionTemplateViewModel.SitTimeQuestion)viewModel.SitTimeQuestion).setSitTimeAvg(sitTimeAvg);
                                    ((QuestionTemplateViewModel.SitTimeQuestion)viewModel.SitTimeQuestion).setScore(calculatorSitTimeScore(sitTimeAvg));
                                    for(int j = 0 ; j < sitCount ; j++){
                                        int[] sitTime = ((QuestionTemplateViewModel.SitTimeQuestion)viewModel.SitTimeQuestion).getSitTime();

                                        if(sitTime[j] == -1){
                                            sit_time_ratio.setText((j + 1) + "번 앉기 동작 문항을 완료하세요.");
                                            sit_time_score.setText((j + 1) + "번 앉기 동작 문항을 완료하세요.");
                                            ((QuestionTemplateViewModel.SitTimeQuestion)viewModel.SitTimeQuestion).setScore(-1);
                                        }
                                    }
                                }





                            }
                        });

                    }

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });







        return view;
    }
    public void showQuestionView(View[] QuestionViewArr, int sit_num) {
        TextView[] tvArr = new TextView[50];
        if(sit_num == 0){
            for(int i = 0 ; i < 50 ; i++){
                QuestionViewArr[i].setVisibility(View.GONE);
            }

        }else{
            for (int i = 0; i < 50; i++) {
                tvArr[i] = QuestionViewArr[i].findViewById(R.id.sit_time_tv);
                QuestionViewArr[i].setVisibility(View.GONE);
                tvArr[i].setText(String.valueOf(i + 1));
            }
            for (int i = 0; i < sit_num ; i++) {
                QuestionViewArr[i].setVisibility(View.VISIBLE);
            }
        }

    }
    public EditText[] makeEditText(View[] QuestionViewArr, int dongSize, int id){
        EditText[] newEditText = new EditText[dongSize];
        int[] sitTime = ((QuestionTemplateViewModel.SitTimeQuestion)viewModel.SitTimeQuestion).getSitTime();
        for(int i = 0 ; i < dongSize ; i++){
            newEditText[i] = QuestionViewArr[i].findViewById(id);
            if(sitTime[i] != -1){
                newEditText[i].setText(
                        String.valueOf(sitTime[i])
                );
            }
        }
        return newEditText;
    }
    public int calculatorSitTimeScore(float sitTime) {
        int sitTimeScore = 0;
        if(sitTime <= 5.2){
            sitTimeScore = 100;
        }
        else if(sitTime < 6.4){
            sitTimeScore = 70;
        } else {
            sitTimeScore = 40;
        }
        return sitTimeScore;
    }
}
