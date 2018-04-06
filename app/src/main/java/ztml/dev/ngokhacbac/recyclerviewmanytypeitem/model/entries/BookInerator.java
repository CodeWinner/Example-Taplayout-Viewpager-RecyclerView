package ztml.dev.ngokhacbac.recyclerviewmanytypeitem.model.entries;

import java.util.ArrayList;
import java.util.List;

import ztml.dev.ngokhacbac.recyclerviewmanytypeitem.R;

public class BookInerator {
    private LoadBookListenner mLoadBookListenner;

    public BookInerator(LoadBookListenner mLoadBookListenner) {
        this.mLoadBookListenner = mLoadBookListenner;
    }

    public void createBook() {
        String t = "Thám tử lừng danh Conan, còn được biết đến dưới tên tiếng Nhật Meitantei Konan (名探偵コナン, Danh Thám trinh Conan) hay Detective Conan, là một bộ truyện tranh trinh thám Nhật Bản của tác giả Aoyama Gōshō. Mở đầu câu truyện, cậu học sinh trung học 17 tuổi Shinichi Kudo bị biến thành cậu bé ...";
        List<Object> bookInfors = new ArrayList<>();
        bookInfors.add(new BookInfor("Co Nan", 20000, R.drawable.conan));
        bookInfors.add(t+1);
        bookInfors.add(new BookInfor("Cưới tôi anh xứng sao", 30000, R.drawable.cuoitoi_anh_xungsao));
        bookInfors.add(t+2);
        bookInfors.add(new BookInfor("Dế mèn phưu lưu ký", 20000, R.drawable.demen));
        bookInfors.add(t+3);
        bookInfors.add(new BookInfor("Doraemon", 25000, R.drawable.doreamon));
        bookInfors.add(t+4);
        bookInfors.add(new BookInfor("Dragon Ball", 15000, R.drawable.dragonball));
        bookInfors.add(t+5);
        bookInfors.add(new BookInfor("Miko", 20000, R.drawable.miko));
        bookInfors.add(t+6);
        bookInfors.add(new BookInfor("Sự tích bánh trưng bánh dày ", 50000, R.drawable.sutichbanhtrungbanhday));
        bookInfors.add(t+7);
        bookInfors.add(new BookInfor("Tắt đèn", 40000, R.drawable.tat_den));
        bookInfors.add(t+8);
        bookInfors.add(new BookInfor("Thám tử kimdaichi", 30000, R.drawable.thamtu_kindaichi));
        bookInfors.add(t+9);
        bookInfors.add(new BookInfor("Tim Tim", 20000, R.drawable.timtim));
        bookInfors.add(t+10);
        mLoadBookListenner.loadBookSuccess(bookInfors);
    }
}
