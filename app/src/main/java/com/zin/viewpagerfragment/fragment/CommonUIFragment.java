package com.zin.viewpagerfragment.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zin.viewpagerfragment.MainActivity;
import com.zin.viewpagerfragment.R;

public class CommonUIFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_selection_common,
				container, false);

		TextView tv_tabName = (TextView) rootView.findViewById(R.id.tv_tabName);
		Bundle bundle = getArguments();
		tv_tabName.setText(bundle.getString(MainActivity.ARGUMENTS_NAME, ""));
		
		return rootView;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

}
