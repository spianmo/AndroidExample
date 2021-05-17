package com.kirshi.advance.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kirshi.advance.R;
import com.kirshi.advance.databinding.ItemSmsBinding;
import com.kirshi.advance.pojo.SmsMessage;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * @author Finger
 */
public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder> {
    private final List<SmsMessage> list;
    private final Context mContext;


    public MessageAdapter(List<SmsMessage> list, Context context) {
        this.mContext = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MessageAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemSmsBinding v = ItemSmsBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.v.messName.setText(list.get(position).getName());
        holder.v.messNum.setText(list.get(position).getPhoneNumber());
        holder.v.messTime.setText(list.get(position).getDate());
        holder.v.messContent.setText(list.get(position).getSmsBody());

        Picasso.get().load("http://api.btstu.cn/sjtx/api.php?lx=" + (list.get(position).getType() == SmsMessage.Type.send ? "b1" : "a1") + "&r=" + list.get(position).getPhoneNumber())
                .error(R.drawable.ic_message_24dp)
                .into(holder.v.messImg);


        switch (list.get(position).getType()) {
            case received:
                holder.v.messType.setImageResource(R.drawable.ic_call_received_black_24dp);
                break;
            case send:
                holder.v.messType.setImageResource(R.drawable.ic_call_made_black_24dp);
                break;
        }
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public void refresh() {
        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ItemSmsBinding v;

        public ViewHolder(ItemSmsBinding binding) {
            super(binding.getRoot());
            v = binding;
        }
    }
}

