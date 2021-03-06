package com.grirms.crm.work_module.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.grirms.crm.R;

/**
 * Created by Administrator on 2019\4\24 0024.
 */

public class WorkFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_work, container, false);
        bindID(view);
        return view;
    }

    private void bindID(View view) {
        TextView tv_name = view.findViewById(R.id.tv_name);
        tv_name.setText(this.getClass().getSimpleName());
    }
}
