package ztml.dev.ngokhacbac.recyclerviewmanytypeitem.model.entries;

import java.util.List;

public interface LoadBookListenner {
    public void loadBookSuccess(List<Object> bookInfors);
    void loadBookFail(String messErorr);
}
