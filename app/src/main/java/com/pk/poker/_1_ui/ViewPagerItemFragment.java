package com.pk.poker._1_ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pk.poker.R;
import com.pk.poker.base.BaseFragment;

/**
 * Created by liuxiao on 2017/7/4.
 */

public class ViewPagerItemFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.lx_blank, null, false);
    }
}
