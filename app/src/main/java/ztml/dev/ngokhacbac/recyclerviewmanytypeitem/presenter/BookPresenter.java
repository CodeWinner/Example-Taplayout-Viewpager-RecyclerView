package ztml.dev.ngokhacbac.recyclerviewmanytypeitem.presenter;

import java.util.List;

import ztml.dev.ngokhacbac.recyclerviewmanytypeitem.model.entries.BookInerator;
import ztml.dev.ngokhacbac.recyclerviewmanytypeitem.model.entries.BookInfor;
import ztml.dev.ngokhacbac.recyclerviewmanytypeitem.model.entries.LoadBookListenner;
import ztml.dev.ngokhacbac.recyclerviewmanytypeitem.view.MainView;

public class BookPresenter implements LoadBookListenner {
    private MainView mMainView;
    private BookInerator mBookInerator;

    public BookPresenter(MainView mMainView) {
        mBookInerator = new BookInerator(this);
        this.mMainView = mMainView;
    }

    public void loadData() {
        mBookInerator.createBook();
    }

    @Override
    public void loadBookSuccess(List<Object> bookInfors) {
        mMainView.displayBooks(bookInfors);
    }

    @Override
    public void loadBookFail(String messErorr) {

    }
}
