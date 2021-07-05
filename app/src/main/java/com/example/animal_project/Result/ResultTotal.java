package com.example.animal_project.Result;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.animal_project.QuestionTemplateViewModel;
import com.example.animal_project.R;
import com.example.animal_project.Result_View;

public class ResultTotal extends Fragment {
    private QuestionTemplateViewModel viewModel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.result_total, container, false);
        viewModel = new ViewModelProvider(getActivity()).get(QuestionTemplateViewModel.class);

        View progressBarView = view.findViewById(R.id.result_progressbar_total);
        TextView progressBarTv = progressBarView.findViewById(R.id.progress_tv);
        ProgressBar progressBar = progressBarView.findViewById(R.id.circular_determinative_pb);
        viewModel.setProgressBar(viewModel.getProtocolFourScore(),progressBar,progressBarTv);
        return view;
    }
}
