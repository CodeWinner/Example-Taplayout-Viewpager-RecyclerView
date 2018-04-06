package ztml.dev.ngokhacbac.recyclerviewmanytypeitem.view;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ztml.dev.ngokhacbac.recyclerviewmanytypeitem.R;
import ztml.dev.ngokhacbac.recyclerviewmanytypeitem.model.entries.BookInfor;
import ztml.dev.ngokhacbac.recyclerviewmanytypeitem.view.viewHolder.BookViewHolderB;

public class BookAdaper extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Object> mBookInfors;
    private final int TYPE_BOOKINFOR = 1, TYPE_DESCRIPTION = 0;
    private static OnItemClickListenner mOnItemClickListenner;

    public BookAdaper() {
    }

    public BookAdaper(List<Object> mBookInfors) {
        this.mBookInfors = mBookInfors;
    }

    public interface OnItemClickListenner {
        void onItemClick(View itemView, int position);
    }

    public void setOnItemClickListenner(OnItemClickListenner mOnItemClickListenner) {
        this.mOnItemClickListenner = mOnItemClickListenner;
    }

    @Override
    public int getItemViewType(int position) {
        int type = (mBookInfors.get(position) instanceof BookInfor) ? TYPE_BOOKINFOR : TYPE_DESCRIPTION;
        return type;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        switch (viewType) {
            case TYPE_DESCRIPTION:
                View imageBook = inflater.inflate(R.layout.layout_holder_b, parent, false);
                viewHolder = new BookViewHolderB(imageBook);
                break;
            case TYPE_BOOKINFOR:
                View inforBook = inflater.inflate(R.layout.layout_holder_a, parent, false);
                viewHolder = new BookViewHolderA(inforBook);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case TYPE_BOOKINFOR:
                BookViewHolderA bookViewHolderA = (BookViewHolderA) holder;
                BookInfor bookInfor = (BookInfor) mBookInfors.get(position);
                bookViewHolderA.getmBookName().setText(bookInfor.getmBookName());
                bookViewHolderA.getmBookCost().setText(bookInfor.getmBookCost() + " VNĐ");
                bookViewHolderA.getmBookImage().setImageResource(bookInfor.getmBookImage());
                break;
            case TYPE_DESCRIPTION:
                BookViewHolderB bookViewHolderB = (BookViewHolderB) holder;
                String descrition = (String) mBookInfors.get(position);
                bookViewHolderB.getmTextDescription().setText(descrition);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mBookInfors.size();
    }

    public class BookViewHolderA extends RecyclerView.ViewHolder {
        private TextView mBookName;
        private TextView mBookCost;
        private ImageView mBookImage;
        private Button mButton;
        public BookViewHolderA(final View itemView) {
            super(itemView);
            mBookName = itemView.findViewById(R.id.text_book_name);
            mBookCost = itemView.findViewById(R.id.text_cost);
            mBookImage = itemView.findViewById(R.id.image_book);
            mButton = itemView.findViewById(R.id.button_buy);
            mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i("TAG", "123");
                    mOnItemClickListenner.onItemClick(itemView, getLayoutPosition());
                }
            });
        }

        public Button getmButton() {
            return mButton;
        }

        public void setmButton(Button mButton) {
            this.mButton = mButton;
        }

        public ImageView getmBookImage() {
            return mBookImage;
        }

        public void setmBookImage(ImageView mBookImage) {
            this.mBookImage = mBookImage;
        }

        public TextView getmBookName() {
            return mBookName;
        }

        public void setmBookName(TextView mBookName) {
            this.mBookName = mBookName;
        }

        public TextView getmBookCost() {
            return mBookCost;
        }

        public void setmBookCost(TextView mBookCost) {
            this.mBookCost = mBookCost;
        }
    }

}

