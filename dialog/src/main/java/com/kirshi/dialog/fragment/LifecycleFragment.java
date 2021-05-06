package com.kirshi.dialog.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kirshi.dialog.MainActivity;
import com.kirshi.dialog.R;
import com.kirshi.dialog.adapter.LogAdapter;
import com.kirshi.dialog.adapter.LogBean;
import com.kirshi.dialog.base.BaseFragment;
import com.kirshi.dialog.databinding.FragmentLifecycleBinding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Finger
 */
public class LifecycleFragment extends BaseFragment<FragmentLifecycleBinding> {

    public static final String TAG = LifecycleFragment.class.getSimpleName();
    private final LogAdapter mLogAdapter = new LogAdapter();
    LinearLayoutManager manager;
    private OnActionCallback listener;
    private FetchLogThread mFetchLogThread;

    public void setActionCallback(OnActionCallback listener) {
        this.listener = listener;
    }

    @Override
    public void inCreateView() {
        Log.d(TAG, "onCreateView");
        v.btnFilter.setImageDrawable(getResources().getDrawable(MainActivity.isFilter ? R.drawable.ic_yellow : R.drawable.ic_green));
        manager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, true);
        v.sendList.setLayoutManager(manager);
        v.sendList.setAdapter(mLogAdapter);
        v.btnClear.setOnClickListener(view -> {
            clearLog();
        });
        v.btnFilter.setOnClickListener(view -> {
            mFetchLogThread = new FetchLogThread(!MainActivity.isFilter);
            mFetchLogThread.start();
            MainActivity.isFilter = !MainActivity.isFilter;
            v.btnFilter.setImageDrawable(getResources().getDrawable(MainActivity.isFilter ? R.drawable.ic_yellow : R.drawable.ic_green));
        });
        v.btnClose.setOnClickListener(view -> {
            listener.onExit();
        });
        mFetchLogThread = new FetchLogThread(MainActivity.isFilter);
        mFetchLogThread.start();
    }


    @Override
    public void onInflate(Activity activity, AttributeSet attrs,
                          Bundle savedInstanceState) {
        Log.d(TAG, "onInflate");
        super.onInflate(activity, attrs, savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        Log.d(TAG, "onAttach");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.d(TAG, "onViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.d(TAG, "onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG, "onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG, "onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG, "onStop");

        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(TAG, "onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(TAG, "onDetach");
        super.onDetach();
    }

    public void fetchLogItem(String log) {
        LogBean logBean = new LogBean(System.currentTimeMillis(), log);
        mLogAdapter.getDataList().add(0, logBean);
        runOnUI(() -> {
            mLogAdapter.notifyDataSetChanged();
            if (v != null) v.sendList.smoothScrollToPosition(0);
        });
    }

    public void clearLog() {
        mLogAdapter.getDataList().clear();
        runOnUI(() -> {
            mLogAdapter.notifyDataSetChanged();
            if (v != null) v.sendList.smoothScrollToPosition(0);
        });
    }

    class FetchLogThread extends Thread {
        Process mLogcatProc = null;
        BufferedReader reader = null;

        FetchLogThread(boolean filter) {
            try {
                Runtime.getRuntime().exec(new String[]{"logcat", "-c"});
                mLogcatProc = Runtime.getRuntime().exec(new String[]{"logcat", "-v raw,tag", (filter ? TAG + ":D *:S" : "")});
            } catch (IOException e) {
                e.printStackTrace();
            }
            reader = new BufferedReader(new InputStreamReader(mLogcatProc.getInputStream()));
        }

        @Override
        public void run() {
            String line;
            try {
                while ((line = reader.readLine()) != null) {
                    fetchLogItem(line);
                    Runtime.getRuntime().exec(new String[]{"logcat", "-c"});
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public interface OnActionCallback {
        void onExit();
    }
}