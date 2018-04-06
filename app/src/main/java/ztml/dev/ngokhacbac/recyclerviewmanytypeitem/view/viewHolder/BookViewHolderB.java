package ztml.dev.ngokhacbac.recyclerviewmanytypeitem.view.viewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ztml.dev.ngokhacbac.recyclerviewmanytypeitem.R;

public class BookViewHolderB extends RecyclerView.ViewHolder {
    private TextView mTextDescription;

    public BookViewHolderB(View itemView) {
        super(itemView);
        mTextDescription = itemView.findViewById(R.id.text_description);
    }

    public TextView getmTextDescription() {
        return mTextDescription;
    }

    public void setmTextDescription(TextView mTextDescription) {
        this.mTextDescription = mTextDescription;
    }
}
