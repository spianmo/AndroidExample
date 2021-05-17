package com.kirshi.advance.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.kirshi.advance.adapter.MessageAdapter;
import com.kirshi.advance.databinding.FragmentNotificationBinding;
import com.kirshi.advance.pojo.SmsMessage;
import com.kirshi.framework.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Finger
 */
public class NotificationFragment extends BaseFragment<FragmentNotificationBinding> {

    MessageAdapter adapter;
    List<SmsMessage> smsList = new ArrayList<>();
    LinearLayoutManager layoutManager;

    @Override
    public void inCreateView() {
        for (int i = 0; i < 5; i++) {
            smsList.add(SmsMessage.random(mContext));
        }
        adapter = new MessageAdapter(smsList, mContext);
        layoutManager = new LinearLayoutManager(mContext);
        v.listSms.setLayoutManager(layoutManager);
        v.listSms.setAdapter(adapter);
    }

    public void addSmsItem() {
        smsList.add(SmsMessage.random(mContext));
        adapter.refresh();
    }
}