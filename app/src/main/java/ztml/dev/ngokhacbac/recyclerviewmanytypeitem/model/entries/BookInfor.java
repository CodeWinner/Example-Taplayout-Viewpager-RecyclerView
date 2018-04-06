package ztml.dev.ngokhacbac.recyclerviewmanytypeitem.model.entries;

import android.media.Image;

public class BookInfor {
    private String mBookName;
    private float mBookCost;
    private int mBookImage;

    public BookInfor(String mBookName, float mBookCost, int mBookImage) {
        this.mBookName = mBookName;
        this.mBookCost = mBookCost;
        this.mBookImage = mBookImage;
    }

    public BookInfor(String mBookName, float mBookCost) {
        this.mBookName = mBookName;
        this.mBookCost = mBookCost;
    }

    public int getmBookImage() {
        return mBookImage;
    }

    public void setmBookImage(int mBookImage) {
        this.mBookImage = mBookImage;
    }

    public String getmBookName() {
        return mBookName;
    }

    public void setmBookName(String mBookName) {
        this.mBookName = mBookName;
    }

    public float getmBookCost() {
        return mBookCost;
    }

    public void setmBookCost(float mBookCost) {
        this.mBookCost = mBookCost;
    }
}
