package ztml.dev.ngokhacbac.recyclerviewmanytypeitem.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ztml.dev.ngokhacbac.recyclerviewmanytypeitem.R;
import ztml.dev.ngokhacbac.recyclerviewmanytypeitem.presenter.BookPresenter;

public class FragmentShowBook extends Fragment implements MainView {
    private RecyclerView mRvBooks;
    private BookPresenter mBookPresenter;
    private BookAdaper mBookAdaper;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_showbook, container, false);
        mRvBooks = view.findViewById(R.id.rvBookInfor);
        mBookPresenter = new BookPresenter(this);
        mBookPresenter.loadData();
        mRvBooks.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Log.i("TAG", event.getAction() + "  -- ");
                return false;
            }
        });
        return view;
    }

    @Override
    public void displayBooks(final List<Object> bookInfors) {
        mBookAdaper = new BookAdaper(bookInfors);
        mRvBooks.setAdapter(mBookAdaper);
        mRvBooks.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        mRvBooks.scrollToPosition(4);
        mBookAdaper.setOnItemClickListenner(new BookAdaper.OnItemClickListenner() {
            @Override
            public void onItemClick(View itemView, int position) {
                Log.i("TAG", position + "");
                bookInfors.remove(position);
                bookInfors.remove(position);
                mBookAdaper.notifyItemRangeRemoved(position, 2);

            }
        });
    }
}
