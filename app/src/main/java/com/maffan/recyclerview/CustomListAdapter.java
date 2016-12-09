package com.maffan.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomListAdapter extends BaseAdapter {

    private final Context context;
    private final Book[] books;

    public CustomListAdapter(Context context,Book[] books){
        this.context = context;
        this.books = books;
    }

    @Override
    public int getCount() {
        return books.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Book book = books[position];

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.custom_list, null);
        }

        final ImageView cover = (ImageView)convertView.findViewById(R.id.cover);
        final TextView title = (TextView)convertView.findViewById(R.id.title);


        cover.setImageResource(book.getImageResource());
        title.setText(book.getName());

        return convertView;

    }
}
